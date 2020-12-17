package Selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import SeleniumPages.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static components.DriverProvider.getWebDriverInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class SeleniumTest {

    SeleniumHomePage seleniumHomePage = new SeleniumHomePage();
    SeleniumLoginPage seleniumLoginpage = new SeleniumLoginPage();
    SeleniumAcountCreationFormPage seleniumAcountCreationFormPage = new SeleniumAcountCreationFormPage();
    SeleniumMyAccountPage seleniumMyAccountPage = new SeleniumMyAccountPage();
    SeleniumWomanCategoryProducts seleniumWomanCategoryProducts = new SeleniumWomanCategoryProducts();
    SeleniumProductQuickView seleniumProductQuickView = new SeleniumProductQuickView();
    SeleniumShoppingCartSummaryPage seleniumShoppingCartSummaryPage = new SeleniumShoppingCartSummaryPage();

    @BeforeEach
    void beforeEach() {
        //Open website in browser:
        getWebDriverInstance().get("http://automationpractice.com/index.php");
        getWebDriverInstance().manage().window().maximize();
    }

    @AfterEach
    void afterEach() {
        getWebDriverInstance().quit();
    }

    @Test
    @DisplayName("Verify if two products selected by new registered user are correctly added to shopping cart")
    void VerifyIfTwoProductsSelectedByNewUserAreCorrectlyAddedToShoppingCart() throws InterruptedException {

        // Lombok builder for NewUser :
        var user = SeleniumNewUserLombok.builder().build();

        //On "Home" page click "SignIn" button:
        seleniumHomePage.clickSignInButton();

        //On "Login" page in "CreateAnAccount" section, use DateTimeFormatter in email address:
        seleniumLoginpage.fillCreateAnAccountEmail(String.format("%s@aa.com", LocalDateTime.now().
                format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"))));
        // Click "Create An Account" button:
        seleniumLoginpage.clickCreateAnAccountButton();

        // On "AccountCreationForm" page fill out all mandatory fields:
        seleniumAcountCreationFormPage.fillForm(user);
        seleniumAcountCreationFormPage.fillDropdowns("11", "2", "1965", "Alabama");
        // Click "Register" button:
        seleniumAcountCreationFormPage.clickRegisterButton();

        // On "MyAccount" page click "Woman" header:
        seleniumMyAccountPage.clickWomanHeader();

        //On "WomanCategoryProducts" page mouse over to "Blouse" product:
        seleniumWomanCategoryProducts.moveToElement("Blouse");
        // Click "QuickView" button:
        seleniumWomanCategoryProducts.clickQuickViewButton();

        //In product "iFrame" add 2nd product by clicking on "QuantityPlus" button:
        seleniumProductQuickView.clickQuantityPlusButton();
        // Click "AddToCart" button:
        seleniumProductQuickView.clickAddToCartButton();
        // In "ProductSuccessfullyAdded" window displayed, click "ProceedToCheckout" button:
        seleniumProductQuickView.clickProceedToCheckout();

        // In "ShoppingCartSummary" page verify added product name, quantity and total price value;
        switchToDefContext();
        assertThat(seleniumShoppingCartSummaryPage.getProductName(), is("Blouse"));
        assertThat(seleniumShoppingCartSummaryPage.getProductQuantity(), is("2"));
        assertThat(seleniumShoppingCartSummaryPage.getTotalPrice(), is("$58.24"));

    }

    // Hamcrest method for AssertThat:
    private void switchToDefContext() {
        getWebDriverInstance().switchTo().defaultContent();
    }
}