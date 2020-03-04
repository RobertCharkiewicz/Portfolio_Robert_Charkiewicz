package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;

public class SeleniumShoppingCartSummaryPage {

    // elements with locators:
    @FindBy(xpath = ".//p[@class='product-name']//a[text()='Blouse']")
    private WebElement productName;

    @FindBy(css = ".cart_quantity_input")
    private WebElement productQuantity;

    @FindBy(xpath = "//td[@id='total_price_container']//span[@id='total_price']")
    private WebElement totalPrice;

    // constructor for this page:
    public SeleniumShoppingCartSummaryPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods to use on this page:
    public String getProductName() {
        return productName.getText();
    }

    public String getProductQuantity() {
        return productQuantity.getAttribute("value");
    }

    public String getTotalPrice() {
        return totalPrice.getText();
    }
}