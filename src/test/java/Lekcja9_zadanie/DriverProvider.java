package Lekcja9_zadanie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DriverProvider {

    static WebDriver driver;

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
}