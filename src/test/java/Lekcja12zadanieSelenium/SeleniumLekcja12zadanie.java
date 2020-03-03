package Lekcja12zadanieSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class SeleniumLekcja12zadanie {

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
    @DisplayName("Verify if two products selected by NewUser are correctly added to shopping cart")
    void VeifyIfTwoProductsSelectedByNewUserAreCorrectlyAddedToShoppingCart() throws InterruptedException {

        // Lombok builder for NewUser :
        var user = SeleniumNewUserLombok.builder().build();

        //On "Home" page click "SignIn" button:
        SeleniumHomePage.clickSignInButton();

        //On "Login" page in "CreateAnAccount" section, use DateTimeFormatter in email address:
        SeleniumLoginPage.fillCreateAnAccountEmail(String.format("%s@aa.com", LocalDateTime.now().
                format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmSS"))));
        // Click "Create An Account" button:
        SeleniumLoginPage.clickCreateAnAccountButton();

        // On "AccountCreationForm" page fill out all mandatory fields:
        SeleniumAcountCreationFormPage.fillForm(user);
        SeleniumAcountCreationFormPage.fillDropdowns("11", "2", "1965", "Alabama");
        // Click "Register" button:
        SeleniumAcountCreationFormPage.clickRegisterButton();

        // On "MyAccount" page click "Woman" header:
        SeleniumMyAccountPage.clickWomanHeader();

        //On "WomanCategoryProducts" page move to product:
        SeleniumWomanCategoryProducts.moveToElement("Blouse");
        // Click "QuickView" button:
        SeleniumWomanCategoryProducts.clickQuickViewButton();

        //In product "iFrame" add 2nd product by clicking on "QuantityPlus" button:
        SeleniumProductQuickView.clickQuantityPlusButton();
        // Click "AddToCart" button:
        SeleniumProductQuickView.clickAddToCartButton();
        // In "ProductSuccessfullyAdded" window displayed, click "ProceedToCheckout" button:
        SeleniumProductQuickView.clickProceedToCheckout();

        // In "ShoppingCartSummary" page verify added product name, quantity and total price value;
        switchToDefContext();
        assertThat(SeleniumShoppingCartSummaryPage.getProductName(), is("Blouse"));
        assertThat(SeleniumShoppingCartSummaryPage.getProductQuantity(), is("2"));
        assertThat(SeleniumShoppingCartSummaryPage.getTotalPrice(), is("$58.24"));

    }

    // Hamcrest method for AssertThat:
    private void switchToDefContext() {
        getWebDriverInstance().switchTo().defaultContent();
    }
}