package Lekcja8_zadanie;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Registration {
    WebDriver driver;

    @BeforeEach
    void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "/Users/osx/Desktop/Selenium/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Go to Create An Account page")
    void verifyIfClickOnSignInButtonRedirectsToCreateAnAccountPage() {

        // sign in:
        WebElement loginButton = driver.findElement(By.cssSelector(".login"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        assertTrue(driver.findElement(By.id("email_create")).isDisplayed());
        driver.quit();
    }

    @Test
    @DisplayName("Go to Account Creation Form page")
    void verifyIfClickOnCreateAnAccountButtonRedirectsToAccountCreationFormPage() {

        // sign in:
        WebElement loginButton = driver.findElement(By.cssSelector(".login"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);

        // create an account -->> change email KEYtoSEND before each test run !!!:
        driver.findElement(By.id("email_create")).sendKeys("abc3@pl.com");
        WebElement submitCreateAnAccountButton = driver.findElement(By.id("SubmitCreate"));
        submitCreateAnAccountButton.click();
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        assertTrue(driver.findElement(By.id("account-creation_form")).isDisplayed());
        driver.quit();
    }

    @Test
    @DisplayName("Go to My Account page")
    void verifyIfClickOnRegisterButtonRedirectsToMyAccountPage() {

        // sign in:
        WebElement loginButton = driver.findElement(By.cssSelector(".login"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);

        // create an account -->> change email KEYtoSEND before each test run !!!:
        driver.findElement(By.id("email_create")).sendKeys("xyz3@pl.pl");
        WebElement submitCreateAnAccountButton = driver.findElement(By.id("SubmitCreate"));
        submitCreateAnAccountButton.click();
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        assertTrue(driver.findElement(By.id("account-creation_form")).isDisplayed());

        // fill out all mandatory fields:
        driver.findElement(By.id("customer_firstname")).sendKeys("customer firstname");
        driver.findElement(By.id("customer_lastname")).sendKeys("customer lastname");
        driver.findElement(By.id("passwd")).sendKeys("ABC1xyz!");
        driver.findElement(By.id("address1")).sendKeys("address1");
        driver.findElement(By.id("address2")).sendKeys("address2");
        driver.findElement(By.id("city")).sendKeys("city");
        Select dropdown = new Select(driver.findElement(By.id("id_state")));
        dropdown.selectByValue("1"); //Alabama
        driver.findElement(By.id("postcode")).sendKeys("12345");
        driver.findElement(By.id("phone_mobile")).sendKeys("123456789");

        // register & confirm registration:
        WebElement submitAccountButton = driver.findElement(By.id("submitAccount"));
        submitAccountButton.click();
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        assertTrue(driver.findElement(By.className("info-account")).isDisplayed());

        driver.quit();
    }
}





