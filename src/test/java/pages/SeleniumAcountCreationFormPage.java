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
    private WebElement femaleCheckbox;
    @FindBy(id = "customer_firstname")
    private WebElement firstNameRegistrationTextBox;
    @FindBy(id = "customer_lastname")
    private WebElement lastNameRegistrationTextBox;
    @FindBy(xpath = "//div[@class='account_creation']//input[@id='passwd']")
    private WebElement passwordTextBox;
    @FindBy(id = "days")
    private WebElement dropdownDays;
    @FindBy(id = "months")
    private WebElement dropdownMonths;
    @FindBy(id = "years")
    private WebElement dropdownYears;
    @FindBy(id = "firstname")
    private WebElement firstNameAddressTextBox;
    @FindBy(id = "lastname")
    private WebElement lastNameAddressTextBox;
    @FindBy(id = "address1")
    private WebElement addressTextBox;
    @FindBy(id = "city")
    private WebElement cityTextBox;
    @FindBy(id = "id_state")
    private WebElement dropdownState;
    @FindBy(id = "postcode")
    private WebElement postCodeTextBox;
    @FindBy(id = "id_country")
    private WebElement dropdownCountry;
    @FindBy(id = "phone_mobile")
    private WebElement mobilePhoneTextBox;
    @FindBy(id = "alias")
    private WebElement aliasAddressTextBox;
    @FindBy(id = "submitAccount")
    private WebElement registerButton;


    // constructor for this page:
    public SeleniumAcountCreationFormPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getWebDriverInstance(), 10), this);
    }

    // methods to use on this page:
    public void fillPasswordTextBox(String password) {
        passwordTextBox.sendKeys(password);
    }

    public void fillDropdowns(String day, String month, String year, String state) {
        new Select(dropdownDays).selectByValue(day);
        new Select(dropdownMonths).selectByValue(month);
        new Select(dropdownYears).selectByValue(year);
        new Select(dropdownState).selectByVisibleText(state);
    }

    public void fillForm(SeleniumNewUserLombok seleniumNewUserLombok) {
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

    public void clickRegisterButton() {
        registerButton.click();
    }

}