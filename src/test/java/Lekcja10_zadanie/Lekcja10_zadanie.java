package Lekcja10_zadanie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pages.Zadanie10_HomePage;
import pages.Zadanie10_ProductSuccessfullyAddedWindow;
import pages.Zadanie10_ShoppingCartSummaryPage;

import static Lekcja9_zadanie.DriverProvider.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Lekcja10_zadanie {

    Zadanie10_HomePage zadanie10_HomePage = new Zadanie10_HomePage();
    Zadanie10_ProductSuccessfullyAddedWindow zadanie10_ProductSuccessfullyAddedWindow = new Zadanie10_ProductSuccessfullyAddedWindow();
    Zadanie10_ShoppingCartSummaryPage zadanie10_ShoppingCartSummaryPage = new Zadanie10_ShoppingCartSummaryPage();

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
    @DisplayName("Verify if product added in Bestsellers section is visible in shopping cart")
    void VeifyIfAddedBestellersProductIsVissibleInMyShoppingCart() throws InterruptedException {

        // Verify if "Home Page" is displayed:
        assertTrue(zadanie10_HomePage.isHomePageVisible());

        // Go to "Bestsellers" section on "Home Page":
        zadanie10_HomePage.clickOnBestsellers();
        assertTrue(zadanie10_HomePage.isBestsellersSectionDisplayed());

        //Mouse over & select product in "Bestsellers" section:
        zadanie10_HomePage.mouseOverAndSelectProduct();

        // In "Product Box" click "Add to cart" button:
        zadanie10_HomePage.clickOnAddToCartButton();

        // Verify if "Product successfully added" window is displayed:
        assertTrue(zadanie10_ProductSuccessfullyAddedWindow.isProductSuccessfullyAddedWindowVisible());

        // In "Product successfully added" window click "Proceed to checkout" button:
        zadanie10_ProductSuccessfullyAddedWindow.clickOnProceedToCheckoutButton();

        // in "Shopping Cart Summary" page open drop down "Cart view":
        zadanie10_ShoppingCartSummaryPage.clickOnviewMyShoppingCart();

        //verify if added product name is visible:
        zadanie10_ShoppingCartSummaryPage.isProductInMyShoppingCartVisible();
    }
}