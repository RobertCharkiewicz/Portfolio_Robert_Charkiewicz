package Lekcja12_zadanie_Selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static Lekcja9_zadanie.DriverProvider.getWebDriverInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class Selenium_Lekcja12_zadanie {

    Selenium_HomePage selenium_homePage = new Selenium_HomePage();
    Selenium_Login_Page selenium_login_page = new Selenium_Login_Page();
    Selenium_AcountCreationFormPage selenium__acountCreationFormPage = new Selenium_AcountCreationFormPage();
    Selenium_MyAccountPage selenium_myAccountPage = new Selenium_MyAccountPage();
    Selenium_WomanCategoryProducts selenium_womanCategoryProducts = new Selenium_WomanCategoryProducts();
    Selenium_ProductQuickView selenium_productQuickView = new Selenium_ProductQuickView();
    Selenium_ShoppingCartSummaryPage selenium_shoppingCartSummaryPage = new Selenium_ShoppingCartSummaryPage();

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
        var user = Selenium_NewUser_Lombok.builder().build();

        //On "Home" page click "SignIn" button:
        Selenium_HomePage.clickSignInButton();

        //On "Login" page in "CreateAnAccount" section, use DateTimeFormatter in email address:
        Selenium_Login_Page.fillCreateAnAccountEmail(String.format("%s@aa.com", LocalDateTime.now().
                format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmSS"))));
        // Click "Create An Account" button:
        Selenium_Login_Page.clickCreateAnAccountlButton();

        // On "AccountCreationForm" page fill out all mandatory fields:
        Selenium_AcountCreationFormPage.fillForm(user);
        Selenium_AcountCreationFormPage.fillDropdowns("11", "2", "1965", "Alabama");
        // Click "Register" button:
        Selenium_AcountCreationFormPage.clickRegisterButton();

        // On "MyAccount" page click "Woman" header:
        Selenium_MyAccountPage.clickWomanHeader();

        //On "WomanCategoryProducts" page move to product:
        Selenium_WomanCategoryProducts.moveToElement("Blouse");
        // Click "QuickView" button:
        Selenium_WomanCategoryProducts.clickQuickViewButton();

        //In product "iFrame" add 2nd product by clicking on "QuantityPlus" button:
        Selenium_ProductQuickView.clickQuantityPlusButton();
        // Click "AddToCart" button:
        Selenium_ProductQuickView.clickAddToCartButton();
        // In "ProductSuccessfullyAdded" window displayed, click "ProceedToCheckout" button:
        Selenium_ProductQuickView.clickProceedToCheckout();

        // In "ShoppingCartSummary" page verify added product name, quantity and total price value;
        switchToDefContext();
        assertThat(Selenium_ShoppingCartSummaryPage.getProductName(), is("Blouse"));
        assertThat(Selenium_ShoppingCartSummaryPage.getProductQuantity(), is("2"));
        assertThat(Selenium_ShoppingCartSummaryPage.getTotalPrice(), is("$58.24"));

    }

    // Hamcrest method for AssertThat:
    private void switchToDefContext() {
        getWebDriverInstance().switchTo().defaultContent();
    }
}