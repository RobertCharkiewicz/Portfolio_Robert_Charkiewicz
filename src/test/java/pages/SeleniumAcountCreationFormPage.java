package pages;

import Lekcja12zadanieSelenium.SeleniumNewUserLombok;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;

public class SeleniumAcountCreationFormPage {

    // elements with locators:
    @FindBy(id = "id_gender2")
    private static WebElement femaleCheckbox;
    @FindBy(id = "customer_firstname")
    private static WebElement firstNameRegistrationTextBox;
    @FindBy(id = "customer_lastname")
    private static WebElement lastNameRegistrationTextBox;
    @FindBy(xpath = "//div[@class='account_creation']//input[@id='passwd']")
    private static WebElement passwordTextBox;
    @FindBy(id = "days")
    private static WebElement dropdownDays;
    @FindBy(id = "months")
    private static WebElement dropdownMonths;
    @FindBy(id = "years")
    private static WebElement dropdownYears;
    @FindBy(id = "firstname")
    private static WebElement firstNameAddressTextBox;
    @FindBy(id = "lastname")
    private static WebElement lastNameAddressTextBox;
    @FindBy(id = "address1")
    private static WebElement addressTextBox;
    @FindBy(id = "city")
    private static WebElement cityTextBox;
    @FindBy(id = "id_state")
    private static WebElement dropdownState;
    @FindBy(id = "postcode")
    private static WebElement postCodeTextBox;
    @FindBy(id = "id_country")
    private static WebElement dropdownCountry;
    @FindBy(id = "phone_mobile")
    private static WebElement mobilePhoneTextBox;
    @FindBy(id = "alias")
    private static WebElement aliasAddressTextBox;
    @FindBy(id = "submitAccount")
    private static WebElement registerButton;


    // constructor for this page:
    public SeleniumAcountCreationFormPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods to use on this page:
    public void fillPasswordTextBox(String password) {
        passwordTextBox.sendKeys(password);
    }

    public static void fillDropdowns(String day, String month, String year, String state) {
        new Select(dropdownDays).selectByValue(day);
        new Select(dropdownMonths).selectByValue(month);
        new Select(dropdownYears).selectByValue(year);
        new Select(dropdownState).selectByVisibleText(state);
    }

    public static void fillForm(SeleniumNewUserLombok seleniumNewUserLombok) {
        passwordTextBox.sendKeys(seleniumNewUserLombok.getPasswd());
        firstNameRegistrationTextBox.sendKeys(seleniumNewUserLombok.getName());
        lastNameRegistrationTextBox.sendKeys(seleniumNewUserLombok.getLastName());
        firstNameAddressTextBox.sendKeys(seleniumNewUserLombok.getName());
        lastNameAddressTextBox.sendKeys(seleniumNewUserLombok.getLastName());
        addressTextBox.sendKeys(seleniumNewUserLombok.getAddress());
        cityTextBox.sendKeys(seleniumNewUserLombok.getCity());
        postCodeTextBox.sendKeys(seleniumNewUserLombok.getPostCode());
        mobilePhoneTextBox.sendKeys(seleniumNewUserLombok.getMobileNo());
        aliasAddressTextBox.sendKeys(seleniumNewUserLombok.getAddressAlias());
    }

    public static void clickRegisterButton() {
        registerButton.click();
    }
}