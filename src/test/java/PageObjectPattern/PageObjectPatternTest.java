package PageObjectPattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import PageObjectPatternPages.HomePage;
import PageObjectPatternPages.ShoppingCartSummaryPage;

import static components.DriverProvider.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PageObjectPatternTest {

    HomePage HomePage = new HomePage();
    HomePage.ProductSuccessfullyAddedWindow ProductSuccessfullyAddedWindow = new HomePage.ProductSuccessfullyAddedWindow();
    ShoppingCartSummaryPage ShoppingCartSummaryPage = new ShoppingCartSummaryPage();

    @BeforeEach
    void beforeEach() {
        getWebDriverInstance().get("http://automationpractice.com/index.php");
        getWebDriverInstance().manage().window().maximize();
    }

    @AfterEach
    void afterEach() {
        getWebDriverInstance().quit();
    }

    @Test
    @DisplayName("Verify if 'Blouse' product added in 'Bestsellers' section is visible in shopping cart")
    void VerifyIfAddedBestellersProductIsVissibleInMyShoppingCart() throws InterruptedException {

        // Verify if "Home Page" is displayed:
        assertTrue(HomePage.isHomePageVisible());

        // Go to "Bestsellers" section on "Home Page":
        HomePage.clickOnBestsellers();
        assertTrue(HomePage.isBestsellersSectionDisplayed());

        //Mouse over & select "Blouse" product in "Bestsellers" section:
        HomePage.mouseOverAndSelectProduct();

        // In "Product Box" click "Add to cart" button:
        HomePage.clickOnAddToCartButton();

        // Verify if "Product successfully added" window is displayed:
        assertTrue(ProductSuccessfullyAddedWindow.isProductSuccessfullyAddedWindowVisible());

        // In "Product successfully added" window click "Proceed to checkout" button:
        ProductSuccessfullyAddedWindow.clickOnProceedToCheckoutButton();

        // in "Shopping Cart Summary" page open drop down "Cart view":
        ShoppingCartSummaryPage.clickOnviewMyShoppingCart();

        //verify if added product name is visible:
        ShoppingCartSummaryPage.isProductInMyShoppingCartVisible();
    }
}