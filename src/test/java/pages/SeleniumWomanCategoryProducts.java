package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;

public class SeleniumWomanCategoryProducts {

    public static final String PRODUCT_NAME = "//ul[@class='product_list grid row']//a[@title='%s']";

    // elements with locators:
    @FindBy(partialLinkText = "Quick view")
    private static WebElement quickViewButton;

    // constructor for this page:
    public SeleniumWomanCategoryProducts() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 30), this);
    }

    // methods to use on this page:
    public static void moveToElement(String elementName) {
        String locator = String.format(PRODUCT_NAME, elementName);
        WebElement product = getWebDriverInstance().findElement(By.xpath(locator));
        new Actions(getWebDriverInstance())
                .moveToElement(product)
                .perform();
    }

    public static void clickQuickViewButton() {
        quickViewButton.click();
    }
}