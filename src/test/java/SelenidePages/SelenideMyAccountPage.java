package SelenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideMyAccountPage {

    // elements with locators:
    private final static SelenideElement WOMANHEADER = $(By.xpath(".//ul[@class='sf-menu clearfix menu-content " +
            "sf-js-enabled sf-arrows']//a[@title='Women']"));

    // methods to use on this page:
    public void clickWomanHeader() {
        WOMANHEADER.should(Condition.visible).click();
    }
}