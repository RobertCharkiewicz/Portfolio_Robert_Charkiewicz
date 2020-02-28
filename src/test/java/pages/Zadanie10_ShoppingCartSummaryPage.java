package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9_zadanie.DriverProvider.getWebDriverInstance;

public class Zadanie10_ShoppingCartSummaryPage {

    @FindBy(css = ".shopping_cart a[title='View my shopping cart']")
    private WebElement viewMyShoppingCart;

    @FindBy(css = "div.cart_block_list a[title='Blouse'].cart_block_product_name")
    private WebElement addedProduct;

    public Zadanie10_ShoppingCartSummaryPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    public void clickOnviewMyShoppingCart() {
        viewMyShoppingCart.click();
    }

    public boolean isProductInMyShoppingCartVisible() {
        return addedProduct.isEnabled();
    }
}

