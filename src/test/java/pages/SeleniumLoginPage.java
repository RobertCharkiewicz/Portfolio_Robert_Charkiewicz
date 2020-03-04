package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;

public class SeleniumLoginPage {

    // CREATE AN ACCOUNT section elements:
    @FindBy(id = "email_create")
    private WebElement createAnAccountEmail;
    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;

    // constructor for this page:
    public SeleniumLoginPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods for CREATE AN ACCOUNT section:
    public void fillCreateAnAccountEmail(String email) {
        createAnAccountEmail.sendKeys(email);
    }

    public void clickCreateAnAccountButton() {
        createAnAccountButton.click();
    }
}