package PageObjectPatternPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static components.DriverProvider.getWebDriverInstance;

public class ShoppingCartSummaryPage {

    // elements with locators:
    @FindBy(css = ".shopping_cart a[title='View my shopping cart']")
    private WebElement viewMyShoppingCart;

    @FindBy(css = "div.cart_block_list a[title='Blouse'].cart_block_product_name")
    private WebElement addedProduct;

    // constructor for this page:
    public ShoppingCartSummaryPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods to use on this page:
    public void clickOnviewMyShoppingCart() {
        viewMyShoppingCart.click();
    }

    public boolean isProductInMyShoppingCartVisible() {
        return addedProduct.isEnabled();
    }
}

