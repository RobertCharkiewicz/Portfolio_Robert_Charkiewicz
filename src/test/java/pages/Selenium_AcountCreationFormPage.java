package pages;

import Lekcja12_zadanie_Selenium.Selenium_NewUser_Lombok;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import static Lekcja9_zadanie.DriverProvider.getWebDriverInstance;

public class Selenium_AcountCreationFormPage {

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
    public Selenium_AcountCreationFormPage() {
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

    public static void fillForm(Selenium_NewUser_Lombok selenium_newUser_lombok) {
        passwordTextBox.sendKeys(selenium_newUser_lombok.getPasswd());
        firstNameRegistrationTextBox.sendKeys(selenium_newUser_lombok.getName());
        lastNameRegistrationTextBox.sendKeys(selenium_newUser_lombok.getLastName());
        firstNameAddressTextBox.sendKeys(selenium_newUser_lombok.getName());
        lastNameAddressTextBox.sendKeys(selenium_newUser_lombok.getLastName());
        addressTextBox.sendKeys(selenium_newUser_lombok.getAddress());
        cityTextBox.sendKeys(selenium_newUser_lombok.getCity());
        postCodeTextBox.sendKeys(selenium_newUser_lombok.getPostCode());
        mobilePhoneTextBox.sendKeys(selenium_newUser_lombok.getMobileNo());
        aliasAddressTextBox.sendKeys(selenium_newUser_lombok.getAddressAlias());
    }

    public static void clickRegisterButton() {
        registerButton.click();
    }
}