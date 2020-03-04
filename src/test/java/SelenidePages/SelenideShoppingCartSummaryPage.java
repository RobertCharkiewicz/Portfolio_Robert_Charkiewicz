package SelenidePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideShoppingCartSummaryPage {

    // elements with locators:
    private final static SelenideElement PRODUCTNAME = $(By.xpath(".//p[@class='product-name']//a[text()='Blouse']"));
    private final static SelenideElement PRODUCTQUANTITY = $(By.cssSelector(".cart_quantity_input"));
    private final static SelenideElement TOTALPRICE = $(By.xpath("//td[@id='total_price_container']" +
            "//span[@id='total_price']"));

    // methods to use on this page:
    public String getProductName() {
        return PRODUCTNAME.getText();
    }

    public String getProductQuantity() {
        return PRODUCTQUANTITY.getAttribute("value");
    }

    public String getTotalPrice() {
        return TOTALPRICE.getText();
    }
}