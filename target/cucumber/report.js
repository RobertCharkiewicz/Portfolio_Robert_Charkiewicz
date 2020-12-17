$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:cucumberTests/cucumber.feature");
formatter.feature({
  "name": "Automation in practice tests - User can register and add products to shopping cart",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Page is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinitions.pageIsLoaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sign In button is displayed on HOME PAGE",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.sigInButtonIsVisible()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if two products selected by new registered user are correctly added to shopping cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks SignIn button on HOME PAGE",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefinitions.userClicksSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills email address box in CREATE AN ACCOUNT section on LOGIN PAGE with email@abc.com",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.userFillsEmailAddressBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Create An Account button on LOGIN PAGE",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.userClicksCreateAnAccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills out all mandatory fields on ACCOUNT CREATION FORM PAGE",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.userFillsOutAllMandatoryFields(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d87.0.4280.88)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MacBook-Pro-Mac.local\u0027, ip: \u0027192.168.0.2\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u002713.0.5.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: /var/folders/7z/zdtxh4gs7b7...}, goog:chromeOptions: {debuggerAddress: localhost:54757}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 626154e0e35f3d95918e0c5e029be12e\n*** Element info: {Using\u003did, value\u003dfirstname}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator.access$001(AjaxElementLocator.java:39)\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator$SlowLoadingElement.isLoaded(AjaxElementLocator.java:165)\n\tat org.openqa.selenium.support.ui.SlowLoadableComponent.get(SlowLoadableComponent.java:61)\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator.findElement(AjaxElementLocator.java:95)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\n\tat SeleniumPages.SeleniumAcountCreationFormPage.setFirstName(SeleniumAcountCreationFormPage.java:83)\n\tat StepsDefinitions.userFillsOutAllMandatoryFields(StepsDefinitions.java:54)\n\tat ✽.User fills out all mandatory fields on ACCOUNT CREATION FORM PAGE(classpath:cucumberTests/cucumber.feature:11)\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks Register button on ACCOUNT CREATION FORM PAGE",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.userClicksRegisterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks Woman header on MY ACCOUNT PAGE",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.userClicksWomanHeaderOnMYACCOUNTPAGE()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User mouse over to product on WOMAN CATEGORY PRODUCTS PAGE",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.userMouseOverToProductOnWOMANCATEGORYPRODUCTSPAGE()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks QuickView button on WOMAN CATEGORY PRODUCTS PAGE",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User add second product by clicking on QuantityPlus button in PRODUCT IFRAME",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.userAddSecondProductByClickingOnQuantityPlusButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks AddToCart button in PRODUCT IFRAME",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.userClicksAddToCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks ProceedToCheckout button in PRODUCT SUCCESSFULLY ADDED WINDOW displayed",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.userClicksProceedToCheckoutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Check if product name is \"Blouse\", quantity is \"2\" and total price value is \"$58.24\" in SHOPPING CART SUMMARY PAGE",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinitions.verifyAddedProductNameQuantityAndTotalPriceValue(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page is closed",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.pageIsClosed()"
});
formatter.result({
  "status": "skipped"
});
});