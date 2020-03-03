package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9_zadanie.DriverProvider.getWebDriverInstance;

public class Selenium_Login_Page {

//    // ALREADY REGISTERD section elements:
//    @FindBy(id = "email")
//    private WebElement email;
//    @FindBy(id = "passwd")
//    private WebElement password;
//    @FindBy(id = "SubmitLogin")
//    private WebElement signInButton;

    // CREATE AN ACCOUNT section elements:
    @FindBy(id = "email_create")
    private static WebElement createAnAccountEmail;
    @FindBy(id = "SubmitCreate")
    private static WebElement CreateAnAccountButton;

    // constructor for this page:
    public Selenium_Login_Page() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    //methods for ALREADY REGISTERD section:
//    public void fillRegisteredUserCredentials(String email, String password) {
//        email.sendKeys(email);
//        password.sendKeys(password);
//    }
//
//    public void clickSignInButton() {
//        signInButton.click();
//    }

    // methods for CREATE AN ACCOUNT section:
    public static void fillCreateAnAccountEmail(String email) {
        createAnAccountEmail.sendKeys(email);
    }

    public static void clickCreateAnAccountlButton() {
        CreateAnAccountButton.click();
    }
}