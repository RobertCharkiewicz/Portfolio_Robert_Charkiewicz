package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9_zadanie.DriverProvider.getWebDriverInstance;

public class Zadanie10_HomePage {

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
    public Zadanie10_HomePage() {
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
}
