package SeleniumPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static components.DriverProvider.getWebDriverInstance;

public class SeleniumHomePage {

    // elements with locators:
    @FindBy(css = ".login")
    private WebElement signInButton;

    // constructor for this page:
    public SeleniumHomePage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods to use on this page:

    public boolean isSignInButtonDisplayed() {
        return signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}