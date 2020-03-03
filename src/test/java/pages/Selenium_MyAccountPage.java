package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Lekcja9_zadanie.DriverProvider.getWebDriverInstance;

public class Selenium_MyAccountPage {

    // elements with locators:
    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//a[@title='Women']")
    private static WebElement womenHeader;

    // constructor for this page:
    public Selenium_MyAccountPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods to use on this page:
    public static void clickWomanHeader() {
        womenHeader.click();
    }

}