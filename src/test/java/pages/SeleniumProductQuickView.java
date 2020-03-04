package pages;

import Lekcja9zadanie.DriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class SeleniumProductQuickView {

    // elements with locators:
    @FindBy(css = ".fancybox-iframe")
    private WebElement iFrame;

    @FindBy(css = ".icon-plus")
    private WebElement quantityPlusButton;

    @FindBy(id = "add_to_cart")
    private WebElement addToCartButton;

    @FindBy(partialLinkText = "Proceed to checkout")
    private WebElement proceedToCheckoutButton;

    private WebDriverWait wait;

    // constructor for this page:
    public SeleniumProductQuickView() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 30), this);
    }

    // methods to use on this page:
    public void clickQuantityPlusButton() {
        wait = new WebDriverWait(DriverProvider.getWebDriverInstance(), 20);
        wait.until(visibilityOfElementLocated(By.cssSelector(".fancybox-iframe")));
        getWebDriverInstance().switchTo().frame(iFrame);
        wait.until(visibilityOfElementLocated(By.cssSelector(".icon-plus")));
        quantityPlusButton.click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}