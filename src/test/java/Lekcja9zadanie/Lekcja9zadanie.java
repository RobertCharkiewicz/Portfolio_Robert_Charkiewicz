package Lekcja9zadanie;

import components.DarkNaviBar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AccountCreationFormPage;
import pages.CreateAnAccountPage;
import pages.MyAccountPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Lekcja9zadanie {

    WebDriver driver;
    DarkNaviBar darkNaviBar = new DarkNaviBar();
    CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
    AccountCreationFormPage accountCreationFormPage = new AccountCreationFormPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    long timeOutSec = 10L;

    @BeforeEach
        // PLEASE NOTE ! Before each test run, change email KEYtoSEND in every "create an account" step.
    void beforeEach() {
        driver = DriverProvider.getWebDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @AfterEach
    void afterEach() {
        driver.quit();
    }

    @Test
    @DisplayName("Go to Create An Account page")
    void verifyIfClickOnSignInButtonRedirectsToCreateAnAccountPage() {

        // sign in:
        WebElement loginButton = driver.findElement(darkNaviBar.getSignIn());
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, timeOutSec);
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAnAccountPage.getPasswd()));
    }

    @Test
    @DisplayName("Go to Account Creation Form page")
    void verifyIfClickOnCreateAnAccountButtonRedirectsToAccountCreationFormPage() {

        // sign in:
        WebElement loginButton = driver.findElement(darkNaviBar.getSignIn());
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, timeOutSec);
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAnAccountPage.getPasswd()));

        // create an account -->> change here email KEYtoSEND before each test run !:
        driver.findElement(createAnAccountPage.getCreateEmail()).sendKeys("abc9@pl.com");
        WebElement submitCreateAnAccountButton = driver.findElement(createAnAccountPage.getSubmitCreate());
        submitCreateAnAccountButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreationFormPage.getAccountCreationForm()));
        assertTrue(driver.findElement(accountCreationFormPage.getAccountCreationForm()).isDisplayed());
    }

    @Test
    @DisplayName("Go to My Account page")
    void verifyIfClickOnRegisterButtonRedirectsToMyAccountPage() {

        // sign in:
        WebElement loginButton = driver.findElement(darkNaviBar.getSignIn());
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, timeOutSec);
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAnAccountPage.getPasswd()));

        // create an account -->> change here email KEYtoSEND before each test run !:
        driver.findElement(createAnAccountPage.getCreateEmail()).sendKeys("abc9@pl.com");
        WebElement submitCreateAnAccountButton = driver.findElement(createAnAccountPage.getSubmitCreate());
        submitCreateAnAccountButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreationFormPage.getAccountCreationForm()));
        assertTrue(driver.findElement(accountCreationFormPage.getAccountCreationForm()).isDisplayed());

        // fill out all mandatory fields:
        driver.findElement(accountCreationFormPage.getCustomerFirstname()).sendKeys("customer firstname");
        driver.findElement(accountCreationFormPage.getCustomerLastname()).sendKeys("customer lastname");
        driver.findElement(accountCreationFormPage.getPasswd()).sendKeys("ABC1xyz!");
        driver.findElement(accountCreationFormPage.getAddress1()).sendKeys("address1");
        driver.findElement(accountCreationFormPage.getAddress2()).sendKeys("address2");
        driver.findElement(accountCreationFormPage.getCity()).sendKeys("city");
        Select dropdown = new Select(driver.findElement(accountCreationFormPage.getIdState()));
        dropdown.selectByValue("1"); //Alabama
        driver.findElement(accountCreationFormPage.getPostcode()).sendKeys("12345");
        driver.findElement(accountCreationFormPage.getPhoneMobile()).sendKeys("123456789");

        // register & confirm registration:
        WebElement submitAccountButton = driver.findElement(accountCreationFormPage.getSubmitAccount());
        submitAccountButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountPage.getMyAccountPage()));
        assertTrue(driver.findElement(myAccountPage.getMyAccountPage()).isDisplayed());
    }

}