import components.DriverProvider;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import SeleniumPages.*;

import static components.DriverProvider.getWebDriverInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StepsDefinitions {

    SeleniumHomePage seleniumHomePage = new SeleniumHomePage();
    SeleniumLoginPage seleniumLoginpage = new SeleniumLoginPage();
    SeleniumAcountCreationFormPage seleniumAcountCreationFormPage = new SeleniumAcountCreationFormPage();
    SeleniumMyAccountPage seleniumMyAccountPage = new SeleniumMyAccountPage();
    SeleniumWomanCategoryProducts seleniumWomanCategoryProducts = new SeleniumWomanCategoryProducts();
    SeleniumProductQuickView seleniumProductQuickView = new SeleniumProductQuickView();
    SeleniumShoppingCartSummaryPage seleniumShoppingCartSummaryPage = new SeleniumShoppingCartSummaryPage();

    @Given("Page is loaded")
    public void pageIsLoaded() {
        DriverProvider.getWebDriverInstance().get("http://automationpractice.com/index.php");
        getWebDriverInstance().manage().window().maximize();
    }

    @And("Sign In button is displayed on HOME PAGE")
    public void sigInButtonIsVisible() {
        seleniumHomePage.isSignInButtonDisplayed();
    }

    @When("User clicks SignIn button on HOME PAGE")
    public void userClicksSignInButton() {
        seleniumHomePage.clickSignInButton();
    }

    @And("^User fills email address box in CREATE AN ACCOUNT section on LOGIN PAGE with (.*)$")
    public void userFillsEmailAddressBox(String email) {
        seleniumLoginpage.fillCreateAnAccountEmail(email);
    }

    @And("User clicks Create An Account button on LOGIN PAGE")
    public void userClicksCreateAnAccountButton() {
        seleniumLoginpage.clickCreateAnAccountButton();
    }

    @And("User fills out all mandatory fields on ACCOUNT CREATION FORM PAGE")
    public void userFillsOutAllMandatoryFields(DataTable dataTable) {

        var dataMap = dataTable.asLists();

        seleniumAcountCreationFormPage.setFirstName(dataMap.get(0).get(1));
        seleniumAcountCreationFormPage.setLastName(dataMap.get(1).get(1));
        seleniumAcountCreationFormPage.setPassword(dataMap.get(2).get(1));
        seleniumAcountCreationFormPage.setAddress(dataMap.get(6).get(1));
        seleniumAcountCreationFormPage.setCity(dataMap.get(7).get(1));
        seleniumAcountCreationFormPage.setPostCode(dataMap.get(9).get(1));
        seleniumAcountCreationFormPage.setMobileNo(dataMap.get(10).get(1));

        seleniumAcountCreationFormPage.fillDropdowns(
                dataMap.get(3).get(1),
                dataMap.get(4).get(1),
                dataMap.get(5).get(1),
                dataMap.get(8).get(1));
    }

    @And("User clicks Register button on ACCOUNT CREATION FORM PAGE")
    public void userClicksRegisterButton() {
        seleniumAcountCreationFormPage.clickRegisterButton();
    }

    @And("User clicks Woman header on MY ACCOUNT PAGE")
    public void userClicksWomanHeaderOnMYACCOUNTPAGE() {
        seleniumMyAccountPage.clickWomanHeader();
    }

    @And("User mouse over to product on WOMAN CATEGORY PRODUCTS PAGE")
    public void userMouseOverToProductOnWOMANCATEGORYPRODUCTSPAGE() {
        seleniumWomanCategoryProducts.moveToElement("Blouse");
    }

    @And("User clicks Quick View button on WOMAN CATEGORY PRODUCTS PAGE")
    public void userClicksQuickViewButtonOnWOMANCATEGORYPRODUCTSPAGE() {
        seleniumWomanCategoryProducts.clickQuickViewButton();

    }

    @And("User add second product by clicking on QuantityPlus button in PRODUCT IFRAME")
    public void userAddSecondProductByClickingOnQuantityPlusButton() {
        seleniumProductQuickView.clickQuantityPlusButton();
    }

    @And("User clicks AddToCart button in PRODUCT IFRAME")
    public void userClicksAddToCartButton() {
        seleniumProductQuickView.clickAddToCartButton();
    }

    @And("User clicks ProceedToCheckout button in PRODUCT SUCCESSFULLY ADDED WINDOW displayed")
    public void userClicksProceedToCheckoutButton() {
        seleniumProductQuickView.clickProceedToCheckout();
    }

    @Then("Check if product name is {string}, quantity is {string} and total price value is {string} " +
            "in SHOPPING CART SUMMARY PAGE")
    public void verifyAddedProductNameQuantityAndTotalPriceValue(String name, String quantity, String total) {
        switchToDefContext();
        assertThat(seleniumShoppingCartSummaryPage.getProductName(), is(name));
        assertThat(seleniumShoppingCartSummaryPage.getProductQuantity(), is(quantity));
        assertThat(seleniumShoppingCartSummaryPage.getTotalPrice(), is(total));
    }

    private void switchToDefContext() {
        getWebDriverInstance().switchTo().defaultContent();
    }

    @And("Page is closed")
    public void pageIsClosed() {
        DriverProvider.getWebDriverInstance().quit();
    }
}