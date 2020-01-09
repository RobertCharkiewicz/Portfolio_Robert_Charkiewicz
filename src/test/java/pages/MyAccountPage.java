package pages;

import org.openqa.selenium.By;

public class MyAccountPage {

    private By myAccountPage = By.className("info-account");


    public By getMyAccountPage() {
        return myAccountPage;
    }
}