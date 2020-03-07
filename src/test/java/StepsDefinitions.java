import Lekcja9zadanie.DriverProvider;
import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import static Lekcja9zadanie.DriverProvider.getWebDriverInstance;
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
    public void sigInButtonIsVisibleOnHOMEPAGE() {
        seleniumHomePage.isSignInButtonDisplayed();
    }

    @And("User clicks SignIn button on HOME PAGE")
    public void userClicksSignInButtonOnHOMEPAGE() {
        seleniumHomePage.clickSignInButton();
    }

    @And("^User fills email address box in CREATE AN ACCOUNT section on LOGIN PAGE with (.*)$")
    public void userFillsEmailAddressBoxInCREATEANACCOUNTSectionOnLOGINPAGEWithAaaaaAaAa(String email) {
        seleniumLoginpage.fillCreateAnAccountEmail(email);
    }

    @And("User clicks Create An Account button on LOGIN PAGE")
    public void userClicksCreateAnAccountButtonOnLOGINPAGE() {
        seleniumLoginpage.clickCreateAnAccountButton();
    }

    @And("User fills out all mandatory fields on ACCOUNT CREATION FORM PAGE")
   public void userFillsOutAllMandatoryFieldsOnACCOUNTCREATIONFORMPAGE() {

//        var dataMap = dataTable.asLists();
//
//        seleniumAcountCreationFormPage.setName(dataMap.get(0).get(1));
//        seleniumAcountCreationFormPage.setLastName(dataMap.get(1).get(1));
//        seleniumAcountCreationFormPage.setPasswd(dataMap.get(2).get(1));
//        seleniumAcountCreationFormPage.setBirthDay(dataMap.get(3).get(1));
//        seleniumAcountCreationFormPage.setBirthMonth(dataMap.get(4).get(1));
//        seleniumAcountCreationFormPage.setBirthYear(dataMap.get(5).get(1));
//        seleniumAcountCreationFormPage.setAddress(dataMap.get(6).get(1));
//        seleniumAcountCreationFormPage.setCity(dataMap.get(7).get(1));
//        seleniumAcountCreationFormPage.setState(dataMap.get(8).get(1));
//        seleniumAcountCreationFormPage.setPostCode(dataMap.get(9).get(1));
//        seleniumAcountCreationFormPage.setMobileNo(dataMap.get(10).get(1));
//
//        seleniumAcountCreationFormPage.fillDropdowns(11,2,1965,"Alabama");
    }

    @And("User clicks Register button on ACCOUNT CREATION FORM PAGE")
    public void userClicksRegisterButtonOnACCOUNTCREATIONFORMPAGE() {
        seleniumAcountCreationFormPage.clickRegisterButton();
    }

    @And("User clicks Woman header on MY ACCOUNT PAGE")
    public void userClicksWomanHeaderOnMYACCOUNTPAGE() {
        seleniumMyAccountPage.clickWomanHeader();
    }

    @And("User clikcs QuickView button on WOMAN CATEGORY PRODUCTS PAGE")
    public void userClikcsQuickViewButtonOnWOMANCATEGORYPRODUCTSPAGE() {
        seleniumWomanCategoryProducts.moveToElement("Blouse");
        seleniumWomanCategoryProducts.clickQuickViewButton();
    }

    @And("User add second product by clicking on QuantityPlus button in PRODUCT IFRAME")
    public void userAddSecondProductByClickingOnQuantityPlusButtonInPRODUCTIFRAME() {
        seleniumProductQuickView.clickQuantityPlusButton();
    }

    @And("User clicks AddToCart button in PRODUCT IFRAME")
    public void userClicksAddToCartButtonInPRODUCTIFRAME() {
        seleniumProductQuickView.clickAddToCartButton();
    }

    @And("User clicks ProceedToCheckout button in PRODUCT SUCCESSFULLY ADDED WINDOW displayed")
    public void userClicksProceedToCheckoutButtonInPRODUCTSUCCESSFULLYADDEDWINDOWDisplayed() {
        seleniumProductQuickView.clickProceedToCheckout();
    }

    @Then("Verify added product name, quantity and total price value in SHOPPING CART SUMMARY PAGE")
    public void verifyAddedProductNameQuantityAndTotalPriceValueInSHOPPINGCARTSUMMARYPAGE() {
        seleniumShoppingCartSummaryPage.getProductName();
        seleniumShoppingCartSummaryPage.getProductName();
        seleniumShoppingCartSummaryPage.getTotalPrice();
    }

    private void switchToDefContext() {
        getWebDriverInstance().switchTo().defaultContent();
    }

    @And("Page is closed")
    public void pageIsClosed() {
        DriverProvider.getWebDriverInstance().quit();
    }
}