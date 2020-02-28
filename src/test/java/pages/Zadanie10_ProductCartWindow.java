package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9_zadanie.DriverProvider.getWebDriverInstance;

public class Zadanie10_ProductCartWindow {

    @FindBy(xpath = "//i[@class='icon-ok']")
    private WebElement productCartWindowIconOK;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    private WebElement viewMyShoppingCart;

// "//ul[@id='blockbestsellers']//a[@title='Printed Chiffon Dress'][@class='product-name']"

    public Zadanie10_ProductCartWindow() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(),
                10), this);
    }

    public boolean isProductCartWindowDisplayed() {
        return productCartWindowIconOK.isEnabled();
    }

    public void clickOnviewMyShoppingCart() {
        viewMyShoppingCart.click();
    }
}