package Selenide;

import SelenidePages.*;
import Selenium.SeleniumNewUserLombok;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.MatcherAssert.assertThat;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.core.Is.is;

class SelenideTest {

    SelenideHomePage selenideHomePage = new SelenideHomePage();
    SelenideLoginPage selenideLoginPage = new SelenideLoginPage();
    SelenideAcountCreationFormPage selenideAcountCreationFormPage = new SelenideAcountCreationFormPage();
    SelenideMyAccountPage selenideMyAccountPage = new SelenideMyAccountPage();
    SelenideWomanCategoryProducts selenideWomanCategoryProducts = new SelenideWomanCategoryProducts();
    SelenideProductQuickView selenideProductQuickView = new SelenideProductQuickView();
    SelenideShoppingCartSummaryPage selenideShoppingCartSummaryPage = new SelenideShoppingCartSummaryPage();

    @BeforeEach
    void beforeEach() {
        //Open website in browser:
        open("http://automationpractice.com/index.php");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterEach
    void afterEach() {
        WebDriverRunner.getWebDriver().quit();
    }

    @Test
    @DisplayName("Verify if two products selected by new registered user are correctly added to shopping cart")
    void VeifyIfTwoProductsSelectedByNewUserAreCorrectlyAddedToShoppingCart() {

        // Lombok builder for NewUser :
        var user = SeleniumNewUserLombok.builder().build();

        //On "Home" page click "SignIn" button:
        selenideHomePage.clickSignInButton();

        //On "Login" page in "CreateAnAccount" section, use DateTimeFormatter in email address:
        selenideLoginPage.fillCreateAnAccountEmail(String.format("%s@aa.com", LocalDateTime.now().
                format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmSS"))));
        // Click "Create An Account" button:
        selenideLoginPage.clickCreateAnAccountButton();

        // On "AccountCreationForm" page fill out all mandatory fields:
        selenideAcountCreationFormPage.fillForm(user);
        selenideAcountCreationFormPage.fillDropdowns("11", "2", "1965", "Alabama");
        // Click "Register" button:
        selenideAcountCreationFormPage.clickRegisterButton();

        // On "MyAccount" page click "Woman" header:
        selenideMyAccountPage.clickWomanHeader();

        //On "WomanCategoryProducts" page move to product:
        selenideWomanCategoryProducts.moveToElement("Blouse");
        // Click "QuickView" button:
        selenideWomanCategoryProducts.clickQuickViewButton();

        //In product "iFrame" add 2nd product by clicking on "QuantityPlus" button:
        selenideProductQuickView.clickQuantityPlusButton();
        // Click "AddToCart" button:
        selenideProductQuickView.clickAddToCartButton();
        // In "ProductSuccessfullyAdded" window displayed, click "ProceedToCheckout" button:
        selenideProductQuickView.clickProceedToCheckout();

        // In "ShoppingCartSummary" page verify added product name, quantity and total price value;
        switchToDefContext();
        assertThat(selenideShoppingCartSummaryPage.getProductName(), is("Blouse"));
        assertThat(selenideShoppingCartSummaryPage.getProductQuantity(), is("2"));
        assertThat(selenideShoppingCartSummaryPage.getTotalPrice(), is("$58.24"));

    }

    // Hamcrest method for AssertThat:
    private void switchToDefContext() {
        WebDriverRunner.getWebDriver().switchTo().defaultContent();
    }
}
