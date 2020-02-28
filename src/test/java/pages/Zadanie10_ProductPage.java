package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9_zadanie.DriverProvider.getWebDriverInstance;

public class Zadanie10_ProductPage {

    @FindBy(xpath = "//p[@id='product_reference']")
    private WebElement productReference;

    @FindBy(xpath = "//p[@id='add_to_cart'][@class='buttons_bottom_block no-print']")
    private WebElement addToCartButton;

    public Zadanie10_ProductPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(),
                10), this);
    }

    public boolean isProductPageDisplayed() {
        return productReference.isEnabled();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }
}


