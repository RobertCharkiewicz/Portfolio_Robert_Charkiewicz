package components;

import org.openqa.selenium.By;

public class DarkNaviBar {

    private By contactUs = By.xpath("//a[@title='Contact Us']");
    private By signIn = By.cssSelector(".login");

    public By getContactUs() {
        return contactUs;
    }

    public By getSignIn() {
        return signIn;
    }

}