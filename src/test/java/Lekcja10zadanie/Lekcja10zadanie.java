package Lekcja10zadanie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pages.Zadanie10HomePage;
import pages.Zadanie10ProductSuccessfullyAddedWindow;
import pages.Zadanie10ShoppingCartSummaryPage;

import static Lekcja9zadanie.DriverProvider.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Lekcja10zadanie {

    Zadanie10HomePage zadanie10HomePage = new Zadanie10HomePage();
    Zadanie10ProductSuccessfullyAddedWindow zadanie10ProductSuccessfullyAddedWindow = new Zadanie10ProductSuccessfullyAddedWindow();
    Zadanie10ShoppingCartSummaryPage zadanie10ShoppingCartSummaryPage = new Zadanie10ShoppingCartSummaryPage();

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
        assertTrue(zadanie10HomePage.isHomePageVisible());

        // Go to "Bestsellers" section on "Home Page":
        zadanie10HomePage.clickOnBestsellers();
        assertTrue(zadanie10HomePage.isBestsellersSectionDisplayed());

        //Mouse over & select product in "Bestsellers" section:
        zadanie10HomePage.mouseOverAndSelectProduct();

        // In "Product Box" click "Add to cart" button:
        zadanie10HomePage.clickOnAddToCartButton();

        // Verify if "Product successfully added" window is displayed:
        assertTrue(zadanie10ProductSuccessfullyAddedWindow.isProductSuccessfullyAddedWindowVisible());

        // In "Product successfully added" window click "Proceed to checkout" button:
        zadanie10ProductSuccessfullyAddedWindow.clickOnProceedToCheckoutButton();

        // in "Shopping Cart Summary" page open drop down "Cart view":
        zadanie10ShoppingCartSummaryPage.clickOnviewMyShoppingCart();

        //verify if added product name is visible:
        zadanie10ShoppingCartSummaryPage.isProductInMyShoppingCartVisible();
    }
}