package pages;

import org.openqa.selenium.By;

public class CreateAnAccountPage {

    private By email = By.id("email2");
    private By passwd = By.id("passwd");
    private By submit = By.id("SubmitLogin");
    private By createEmail = By.id("email_create");
    private By submitCreate = By.id("SubmitCreate");
    private By errorBox = By.cssSelector(".pages-heading");

    public By getEmail() {
        return email;
    }

    public By getPasswd() {
        return passwd;
    }

    public By getSubmit() {
        return submit;
    }

    public By getCreateEmail() {
        return createEmail;
    }

    public By getSubmitCreate() {
        return submitCreate;
    }

    public By getErrorBox() {
        return errorBox;
    }
}