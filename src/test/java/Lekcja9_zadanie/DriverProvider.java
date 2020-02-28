package Lekcja9_zadanie;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class DriverProvider {

    // Singleton:
    public static WebDriver driver = null;

    public static WebDriver getWebDriverInstance() {
        if (driver == null) {
            getWebDriver();
        }
        return driver;
    }

    ;

    // Find Element method:
    public static WebElement findElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(presenceOfElementLocated(locator));
        // Java Script -> scroll to element:
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) getWebDriverInstance()).executeScript("arguments[0].scrollIntoView();", element);
        return element;
    }

    // Factory:
    public static WebDriver getWebDriver() {

        switch (getProperties().getProperty("driverType")) {
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", getProperties().getProperty("chromePath"));
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                System.setProperty("webdriver.gecko.driver", getProperties().getProperty("firefoxPath"));
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", getProperties().getProperty("chromePath"));
                driver = new ChromeDriver();
        }
        return driver;
    }

    private static Properties getProperties() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = DriverProvider.class.getResourceAsStream("/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    // Java Script -> end of execution check (jQuery):
    private static void isjQueryLoaded() {
        new WebDriverWait(getWebDriverInstance(), 30).until((ExpectedCondition<Boolean>) d -> {
            JavascriptExecutor js = (JavascriptExecutor) getWebDriverInstance();
            return (Boolean) js.executeScript("return !!window.jQuery && window.jQuery.active == 0");
        });
    }
}