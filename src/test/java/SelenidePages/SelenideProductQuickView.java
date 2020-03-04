package SelenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class SelenideProductQuickView {

    // elements with locators:
    private final static SelenideElement IFRAME = $(By.cssSelector(".fancybox-iframe"));
    private final static SelenideElement QUANTITYPLUSTBUTTON = $(By.cssSelector(".icon-plus"));
    private final static SelenideElement ADDTOCARTBUTTON = $(By.id("add_to_cart"));
    private final static SelenideElement PROCEEDTOCHECKOUTBUTTON = $(By.partialLinkText("Proceed to checkout"));

    private WebDriverWait wait;

    // methods to use on this page:
    public void clickQuantityPlusButton() {
        wait = new WebDriverWait(WebDriverRunner.getWebDriver(), 20);
        wait.until(visibilityOfElementLocated(By.cssSelector(".fancybox-iframe")));
        WebDriverRunner.getWebDriver().switchTo().frame(IFRAME);
        wait.until(visibilityOfElementLocated(By.cssSelector(".icon-plus")));
        QUANTITYPLUSTBUTTON.click();
    }

    public void clickAddToCartButton() {
        ADDTOCARTBUTTON.should(Condition.visible).click();
    }

    public void clickProceedToCheckout() {
        PROCEEDTOCHECKOUTBUTTON.should(Condition.visible).click();
    }
}