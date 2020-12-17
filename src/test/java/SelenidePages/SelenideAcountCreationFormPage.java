package SelenidePages;

import Selenium.SeleniumNewUserLombok;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;

public class SelenideAcountCreationFormPage {

    // elements with locators:
    private final static SelenideElement FEMALECHECKBOX = $(By.id("id_gender2"));
    private final static SelenideElement FIRSTNAMEREGISTRATIONTEXTBOX = $(By.id("customer_firstname"));
    private final static SelenideElement LASTNAMEREGISTRATIONTEXTBOX = $(By.id("customer_lastname"));
    private final static SelenideElement PASSWORDTEXTBOX = $(By.xpath("//div[@class='account_creation']" +
            "//input[@id='passwd']"));
    private final static SelenideElement DROPDOWNDAYS = $(By.id("days"));
    private final static SelenideElement DROPDOWNMONTHS = $(By.id("months"));
    private final static SelenideElement DROPDOWNYEARS = $(By.id("years"));
    private final static SelenideElement FIRSTNAMEADDRESSTEXTBOX = $(By.id("firstname"));
    private final static SelenideElement LASTNAMEADDRESSTEXTBOX = $(By.id("lastname"));
    private final static SelenideElement ADDRESSTEXTBOX = $(By.id("address1"));
    private final static SelenideElement CITYTEXTBOX = $(By.id("city"));
    private final static SelenideElement DROPDOWNSTATE = $(By.id("id_state"));
    private final static SelenideElement POSTCODETEXTBOX = $(By.id("postcode"));
    private final static SelenideElement DROPDOWNCOUNTRY = $(By.id("id_country"));
    private final static SelenideElement MOBILEPHONETEXTBOX = $(By.id("phone_mobile"));
    private final static SelenideElement ALIASADDRESSTEXTBOX = $(By.id("alias"));
    private final static SelenideElement REGISTERTBUTTON = $(By.id("submitAccount"));

    // methods to use on this page:
    public void fillPasswordTextBox(String password) {
        PASSWORDTEXTBOX.sendKeys(password);
    }

    public void fillDropdowns(String day, String month, String year, String state) {
        new Select(DROPDOWNDAYS).selectByValue(day);
        new Select(DROPDOWNMONTHS).selectByValue(month);
        new Select(DROPDOWNYEARS).selectByValue(year);
        new Select(DROPDOWNSTATE).selectByVisibleText(state);
    }

    public void fillForm(SeleniumNewUserLombok seleniumNewUserLombok) {
        PASSWORDTEXTBOX.sendKeys(seleniumNewUserLombok.getPasswd());
        FIRSTNAMEREGISTRATIONTEXTBOX.sendKeys(seleniumNewUserLombok.getName());
        LASTNAMEREGISTRATIONTEXTBOX.sendKeys(seleniumNewUserLombok.getLastName());
        FIRSTNAMEADDRESSTEXTBOX.sendKeys(seleniumNewUserLombok.getName());
        LASTNAMEADDRESSTEXTBOX.sendKeys(seleniumNewUserLombok.getLastName());
        ADDRESSTEXTBOX.sendKeys(seleniumNewUserLombok.getAddress());
        CITYTEXTBOX.sendKeys(seleniumNewUserLombok.getCity());
        POSTCODETEXTBOX.sendKeys(seleniumNewUserLombok.getPostCode());
        MOBILEPHONETEXTBOX.sendKeys(seleniumNewUserLombok.getMobileNo());
        ALIASADDRESSTEXTBOX.sendKeys(seleniumNewUserLombok.getAddressAlias());
    }

    public void clickRegisterButton() {
        REGISTERTBUTTON.click();
    }
}