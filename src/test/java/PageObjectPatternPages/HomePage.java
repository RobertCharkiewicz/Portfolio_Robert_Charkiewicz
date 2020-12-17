package PageObjectPatternPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static components.DriverProvider.getWebDriverInstance;

public class HomePage {

    // elements with locators:
    @FindBy(className = "homefeatured")
    private WebElement popularSectionHeader;

    @FindBy(className = "blockbestsellers")
    private WebElement bestsellersSectionHeader;

    @FindBy(xpath = "//ul[@id='blockbestsellers']//div[@class='product-container']" +
            "[.//a[@title='Blouse']]//a[@title='Add to cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = ("//ul[@id='blockbestsellers']//div[@class='product-container']" +
            "[.//a[@title='Blouse']]//img"))
    private WebElement addedProduct;

    // constructor for this page:
    public HomePage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods to use on this page:
    public boolean isHomePageVisible() {
        return popularSectionHeader.isDisplayed();
    }

    public void clickOnBestsellers() {
        bestsellersSectionHeader.click();
    }

    public boolean isBestsellersSectionDisplayed() {
        return bestsellersSectionHeader.isEnabled();
    }

    public void mouseOverAndSelectProduct() {
        new Actions(getWebDriverInstance())
                .moveToElement(addedProduct)
                .perform();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public boolean isProductBoxDisplayed() {
        return addToCartButton.isEnabled();
    }

    // after product has been added to cart, this window pops up on Home Page:
    public static class ProductSuccessfullyAddedWindow {

        // elements with locators:
        @FindBy(css = ".layer_cart_cart a[title='Proceed to checkout']")
        private WebElement proceedToCheckoutButton;

        @FindBy(css = ".icon-ok")
        private WebElement iconOk;

        // constructor for this page:
        public ProductSuccessfullyAddedWindow() {
            PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(),
                    10), this);
        }

        // methods to use on this page:
        public void clickOnProceedToCheckoutButton() {
            proceedToCheckoutButton.click();
        }

        public boolean isProductSuccessfullyAddedWindowVisible() {
            return new WebDriverWait(getWebDriverInstance(), 10)
                    .until(ExpectedConditions.visibilityOf(iconOk))
                    .isDisplayed();
        }
    }

}
