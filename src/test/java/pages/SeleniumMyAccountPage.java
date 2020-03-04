package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;

public class SeleniumMyAccountPage {

    // elements with locators:
    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//a[@title='Women']")
    private WebElement womenHeader;

    // constructor for this page:
    public SeleniumMyAccountPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods to use on this page:
    public void clickWomanHeader() {
        womenHeader.click();
    }

}