package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Lekcja9_zadanie.DriverProvider.getWebDriverInstance;

public class Zadanie10_ProductSuccessfullyAddedWindow {

    @FindBy(css = ".layer_cart_cart a[title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = ".layer_cart_product i[class='icon-ok']")
    private WebElement iconOk;

    public Zadanie10_ProductSuccessfullyAddedWindow() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(),
                10), this);
    }

    public void clickOnProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
    }

    public boolean isProductSuccessfullyAddedWindowVisible() {
        return new WebDriverWait(getWebDriverInstance(), 10)
                .until(ExpectedConditions.visibilityOf(iconOk))
                .isDisplayed();
    }
}

