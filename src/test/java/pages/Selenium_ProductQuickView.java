package pages;

import Lekcja9_zadanie.DriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Lekcja9_zadanie.DriverProvider.getWebDriverInstance;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Selenium_ProductQuickView {

    // elements with locators:
    @FindBy(css = ".fancybox-iframe")
    private static WebElement iFrame;

    @FindBy(css = ".icon-plus")
    private static WebElement quantityPlusButton;

    @FindBy(id = "add_to_cart")
    private static WebElement addToCartButton;

    @FindBy(partialLinkText = "Proceed to checkout")
    private static WebElement proceedToCheckoutButton;

    // constructor for this page:
    public Selenium_ProductQuickView() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 30), this);
    }

    // methods to use on this page:
    private static WebDriverWait wait;

    public static void clickQuantityPlusButton() {
        wait = new WebDriverWait(DriverProvider.getWebDriverInstance(), 20);
        wait.until(visibilityOfElementLocated(By.cssSelector(".fancybox-iframe")));
        getWebDriverInstance().switchTo().frame(iFrame);
        wait.until(visibilityOfElementLocated(By.cssSelector(".icon-plus")));
        quantityPlusButton.click();
    }

    public static void clickAddToCartButton() {
        addToCartButton.click();
    }

    public static void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}