package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.DPAddPatients;

import java.io.IOException;

public class AddPatient {

    AndroidDriver driver;
    BaseTest basetest;
    DPAddPatients dpAddPatients;

    public AddPatient() {
        this.driver =BackGround.getDriver();
        dpAddPatients = new DPAddPatients(driver);
    }
    @Then("^click on menu section$")
    public void clickOnMenuSection() throws InterruptedException  {
        dpAddPatients.clickMenuSection();
        Thread.sleep(10000);
    }

    @Then("^click on mypatients$")
    public void clickOnMypatients() throws InterruptedException {
        dpAddPatients.clickPatients();
        Thread.sleep(7000);
    }

    @Then("^click on add patient button$")
    public void clickOnAddPatientButton() throws InterruptedException  {
        dpAddPatients.clickOnAddPatients();
        Thread.sleep(7000);
    }

    @Then("^enter the patient details$")
    public void enterThePatientDetails() throws Throwable {
        dpAddPatients.enterprofiledetils();
    }

    @Then("^click on the add button$")
    public void clickOnTheAddButton() throws InterruptedException {
        Thread.sleep(6000);
        dpAddPatients.clickAddButton();
    }

    @Then("^enter the details$")
    public void enterTheDetails(DataTable table) throws Throwable {
        dpAddPatients.enterMobileNumber();
    }

    @Then("^enter patient details$")
    public void enterPatientDetails(DataTable table) throws Throwable {
         dpAddPatients.enterNameDetails();

    }

    @Then("^enter the email field details$")
    public void enterTheEmailFieldDetails(DataTable table) throws Throwable {
        dpAddPatients.enterEmailDetails();
    }

    @Then("^enter the email details$")
    public void enterTheEmailDetails(DataTable table) throws Throwable {
          dpAddPatients.enterInvalidEmail();

    }

    @Then("^enter the mobile number details$")
    public void enterTheMobileNumberDetails(DataTable table) throws Throwable {
        dpAddPatients.enterInvalidMobileNumber();

    }

    @Then("^enter the name details$")
    public void enterTheNameDetails(DataTable table) throws Throwable {
         dpAddPatients.enterInvalidName();

    }

    @Then("^enter the mobile details$")
    public void enterTheMobileDetails(DataTable table) throws Throwable {
        dpAddPatients.enterInvalidNumber();
    }

    @Then("^user will get the warning mesage$")
    public void userWillGetTheWarningMesage() throws IOException {
       dpAddPatients.verifyMobileNum();
    }

    @Then("^user will see the warning message$")
    public void userWillSeeTheWarningMessage() throws IOException {
        dpAddPatients.verifyName();
    }

    @Then("^user should get the error message$")
    public void userShouldGetTheErrorMessage() throws IOException {
        dpAddPatients.verifyEmail();

    }

    @Then("^app will through a error message\\.$")
    public void appWillThroughAErrorMessage() throws IOException {
        dpAddPatients.invalidEmailId();
    }

    @Then("^user will get the error message\\.$")
    public void userWillGetTheErrorMessage() {
        WebElement errorLabel = driver.findElement(By.xpath("//android.widget.TextView[@text='Please enter 10 digit mobile number']"));
        Assert.assertTrue(errorLabel.isDisplayed());
    }

    @Then("^user will get the error message for name field\\.$")
    public void userWillGetTheErrorMessageForNameField() throws IOException {
       dpAddPatients.errorMessageForNameField();
    }

    @Then("^application should through a error message$")
    public void applicationShouldThroughAErrorMessage() throws IOException {
       dpAddPatients.errorMessageForMobileNumber();
    }

    @Then("^check the error message$")
    public void checkTheErrorMessage() throws IOException {
        dpAddPatients.withoutEnterPatientDetails();
    }

    @Then("^user will get the patient already exist message$")
    public void userWillGetThePatientAlreadyExistMessage() throws IOException {
       dpAddPatients.userAlreadyExistingMessage();
    }

    @Then("^User enter data in the fields$")
    public void userEnterDataInTheFields() throws IOException {
        dpAddPatients.enterlogindetails();
    }

    @Then("^click on patient in recent consultations$")
    public void clickOnPatientInRecentConsultations() throws InterruptedException {
        dpAddPatients.clickOnAddPatientsProfile();
    }

    @Then("^check the appointment details$")
    public void checkTheAppointmentDetails() {

    }

    @Then("^click on appointment details$")
    public void clickOnAppointmentDetails() {
        dpAddPatients.clickOnAppointmentdetails();
    }

    @Then("^check the user appointment details$")
    public void checkTheUserAppointmentDetails() {
        dpAddPatients.checkAppointmentRelatedDetails();
    }

    @Then("^click on view more$")
    public void clickOnViewMore() {
        dpAddPatients.clickOnviewmore();
    }

    @Then("^click on reports and records$")
    public void clickOnReportsAndRecords() {
        dpAddPatients.clickOnReportsAndRecords();
    }

    @Then("^click on overview$")
    public void clickOnOverview() throws InterruptedException {
        dpAddPatients.clickOnOverView();
    }

    @Then("^check the basic info details$")
    public void checkTheBasicInfoDetails() {
        dpAddPatients.checkBasicInfoDetails();
    }

    @Then("^check the patient basic info details$")
    public void checkThePatientBasicInfoDetails() {
        dpAddPatients.checkBasicInfoDetails();
    }
}

