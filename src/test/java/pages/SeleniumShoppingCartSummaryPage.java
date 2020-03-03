package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;

public class SeleniumShoppingCartSummaryPage {

    // elements with locators:
    @FindBy(xpath = ".//p[@class='product-name']//a[text()='Blouse']")
    private static WebElement productName;

    @FindBy(css = ".cart_quantity_input")
    private static WebElement productQuantity;

    @FindBy(xpath = "//td[@id='total_price_container']//span[@id='total_price']")
    private static WebElement totalPrice;

    // constructor for this page:
    public SeleniumShoppingCartSummaryPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods to use on this page:
    public static String getProductName() {
        return productName.getText();
    }

    public static String getProductQuantity() {
        return productQuantity.getAttribute("value");
    }

    public static String getTotalPrice() {
        return totalPrice.getText();
    }
}