package SelenidePages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class SelenideWomanCategoryProducts {

    public static final String PRODUCT_NAME = "//ul[@class='product_list grid row']//a[@title='%s']";

    // elements with locators:
    private final static SelenideElement QUICKVIEWBUTTON = $(By.xpath(".//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[2]/span"));

    // methods to use on this page:
    public void moveToElement(String elementName) {
        String locator = String.format(PRODUCT_NAME, elementName);
        WebElement product = WebDriverRunner.getWebDriver().findElement(By.xpath(locator));
        new Actions(WebDriverRunner.getWebDriver())
                .moveToElement(product)
                .perform();
    }

    public void clickQuickViewButton() {
        QUICKVIEWBUTTON.waitUntil(appear, 10000).click();
    }
}