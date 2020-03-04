package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;


// Page Object Pattern & Page Factory:
public class CreateAnAccountPageFindBy {

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement passwd;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;

    @FindBy(id = "email_create")
    private WebElement createEmail;

    @FindBy(id = "SubmitCreate")
    private WebElement submitCreate;

    @FindBy(css = ".pages-heading")
    private WebElement getErrorBox;

    public CreateAnAccountPageFindBy() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    public void createUser(String newUserEmail) {
        createEmail.sendKeys(newUserEmail);
        submitCreate.click();
    }

    public boolean isPageVisible() {
        return createEmail.isDisplayed();
    }
}