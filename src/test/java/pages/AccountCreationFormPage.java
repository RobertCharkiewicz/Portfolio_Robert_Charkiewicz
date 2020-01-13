package pages;

import org.openqa.selenium.By;

public class AccountCreationFormPage {

    private By accountCreationForm = By.id("account-creation_form");
    private By customerFirstname = By.id("customer_firstname");
    private By customerLastname = By.id("customer_lastname");
    private By passwd = By.id("passwd");
    private By address1 = By.id("address1");
    private By address2 = By.id("address2");
    private By city = By.id("city");
    private By idState = By.id("id_state");
    private By postcode = By.id("postcode");
    private By phoneMobile = By.id("phone_mobile");
    private By submitAccount = By.id("submitAccount");

    public By getAccountCreationForm() {
        return accountCreationForm;
    }

    public By getCustomerFirstname() {
        return customerFirstname;
    }

    public By getCustomerLastname() {
        return customerLastname;
    }

    public By getPasswd() {
        return passwd;
    }

    public By getAddress1() {
        return address1;
    }

    public By getAddress2() {
        return address2;
    }

    public By getCity() {
        return city;
    }

    public By getIdState() {
        return idState;
    }

    public By getPostcode() {
        return postcode;
    }

    public By getPhoneMobile() {
        return phoneMobile;
    }

    public By getSubmitAccount() {
        return submitAccount;
    }
}