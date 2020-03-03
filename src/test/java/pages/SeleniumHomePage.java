package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;

public class SeleniumHomePage {

    // elements with locators:
    @FindBy(css = ".login")
    private static WebElement signInButton;

    // constructor for this page:
    public SeleniumHomePage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods to use on this page:
    public static void clickSignInButton() {
        signInButton.click();
    }

}