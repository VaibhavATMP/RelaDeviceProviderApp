package steps;

import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import page.DPRegistration;

import java.io.IOException;


public class ProviderRegistration {

    AndroidDriver driver;
    BaseTest basetest;
    DPRegistration dpRegistration;

    public ProviderRegistration() {
        this.driver =BackGround.getDriver();
        dpRegistration = new DPRegistration(driver);

    }


    @Then("^click on register here in login page screen$")
    public void clickOnRegisterHereInLoginPageScreen() throws InterruptedException {
        dpRegistration.clickregisterhere1();
        Thread.sleep(5000);

    }

    @Then("^User enters the data in fields$")
    public void userEntersTheDataInFields() throws IOException {
        dpRegistration.enteruserregisterdetails();

    }

    @Then("^User clicks on getotp button$")
    public void userClicksOnGetotpButton() throws InterruptedException {
        dpRegistration.clickgetotp();
        Thread.sleep(5000);
    }

    @Then("^User enters received otp$")
    public void userEntersReceivedOtp() throws InterruptedException {
        dpRegistration.enterotp();
        Thread.sleep(10000);
    }

    @Then("^Click on submit button$")
    public void clickOnSubmitButton() {
        dpRegistration.clicksubmit();
    }

    @Then("^Click on verify button$")
    public void clickOnVerifyButton() throws InterruptedException {
        dpRegistration.clicksubmit();
        Thread.sleep(50000);
    }

    //user registration details
    @Then("^User enter the data in fields$")
    public void userEnterTheDataInFields() throws Throwable {
        dpRegistration.enterregister();
        Thread.sleep(5000);
    }

    @Then("^user click on register button$")
    public void userClickOnRegisterButton() {
        dpRegistration.clickregister();
    }

    @Then("^user click on submit button$")
    public void userClickOnSubmitButton() {
        dpRegistration.clicksubmit();
    }

    @Then("^User enter the data in field$")
    public void userEnterTheDataInField() throws IOException, InterruptedException {
        dpRegistration.invalidemailformat();
    }


    @Then("^user will see the error message$")
    public void userWillSeeTheErrorMessage() throws IOException{
        dpRegistration.verifyemailformat();
    }

    @Then("^User enter the data in email field$")
    public void userEnterTheDataInEmailField() throws IOException {
        dpRegistration.emailformat();
    }

    @Then("^User enter the data in emailid field$")
    public void userEnterTheDataInEmailidField() throws IOException {
      dpRegistration.invalidemailerror();
    }

     @Then("^User enter the wrong emailid$")
    public void userEnterTheWrongEmailid() throws IOException {
      dpRegistration.wrongemailformat();
    }
    @Then("^User enter the data in emailid$")
    public void userEnterTheDataInEmailid() throws IOException {
       dpRegistration.incorrectemail();
    }

    @Then("^User enter the data in mobile field$")
    public void userEnterTheDataInMobileField() throws IOException {
      dpRegistration.invalidmobilenumber();
    }

    @Then("^App will through error message$")
    public void appWillThroughErrorMessage() throws IOException {
       dpRegistration.mobilefielderror();
    }

    @Then("^User enter the data in first name field$")
    public void userEnterTheDataInFirstNameField() throws IOException {
       dpRegistration.firstname();
    }

    @Then("^user will get error message for first name field$")
    public void userWillGetErrorMessageForFirstNameField() throws IOException {
       dpRegistration.firstnameerror();
    }

    @Then("^User enter the data in last name field$")
    public void userEnterTheDataInLastNameField() throws IOException {
      dpRegistration.lastname();
    }

    @Then("^user will get error message for the first name field$")
    public void userWillGetErrorMessageForTheFirstNameField() throws IOException {
     dpRegistration.lastnameerror();
    }

//    @Then("^User enter the data in the first name field$")
//    public void userEnterTheDataInTheFirstNameField() throws IOException {
//     dpRegistration.firstnamefield();
//    }
//
//    @Then("^user will get the error message for first name field$")
//    public void userWillGetTheErrorMessageForFirstNameField() throws IOException {
//      dpRegistration.invalidfirstname();
//    }
//
//    @Then("^User enter the data in lastname field$")
//    public void userEnterTheDataInLastnameField() throws IOException {
//      dpRegistration.lastnamefield();
//    }
//
//    @Then("^user will get error message for last name field$")
//    public void userWillGetErrorMessageForLastNameField() throws IOException {
//        dpRegistration.invalidlastname();
//    }

    @Then("^User enters the data in password fields$")
    public void userEntersTheDataInPasswordFields() throws IOException {
        dpRegistration.passwordmissmatch();
    }

    @Then("^user should get error message$")
    public void userShouldGetErrorMessage() throws IOException {
        dpRegistration.passworderrormessage();
    }

    @Then("^User enters the data in password field$")
    public void userEntersTheDataInPasswordField() throws IOException {
       dpRegistration.passwordvalidation();
    }

    @Then("^app will through the error message$")
    public void appWillThroughTheErrorMessage() throws IOException {
        dpRegistration.passwordvalidationerror();
    }

    @Then("^User enter the data in the first name field$")
    public void userEnterTheDataInTheFirstNameField() {
        
    }

    @Then("^user will get the error message for first name field$")
    public void userWillGetTheErrorMessageForFirstNameField() {
        
    }

    @Then("^User enter the data in lastname field$")
    public void userEnterTheDataInLastnameField() {
        
    }

    @Then("^user will get error message for last name field$")
    public void userWillGetErrorMessageForLastNameField() {
    }


}

