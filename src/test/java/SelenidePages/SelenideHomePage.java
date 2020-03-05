package SelenidePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class SelenideHomePage {

    // elements with locators:
    private final static SelenideElement SIGNINBUTTON = $(By.cssSelector(".login"));

    // methods to use on this page:
    public void clickSignInButton() {
        SIGNINBUTTON.waitUntil(appear, 10000).click();
    }
}