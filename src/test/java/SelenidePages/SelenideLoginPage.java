package SelenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

    public class SelenideLoginPage {

        // elements with locators:
        private final static SelenideElement CREATEANACCOUNTEMAIL = $(By.id("email_create"));
        private final static SelenideElement CREATEANACCOUNTBUTTON = $(By.id("SubmitCreate"));

        // methods to use on this page:
        public void fillCreateAnAccountEmail(String email) {
            CREATEANACCOUNTEMAIL.sendKeys(email);
        }

        public void clickCreateAnAccountButton() {
            CREATEANACCOUNTBUTTON.should(Condition.visible).click();
        }
    }