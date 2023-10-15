package steps;

import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import page.SettingsPage;


public class Settings {

    AndroidDriver driver;
    BaseTest basetest;
    SettingsPage settingsPage;


    public Settings() throws InterruptedException {
        this.driver =BackGround.getDriver();
        settingsPage = new SettingsPage(driver);
    }


    @Then("^User clicks on menu$")
        public void userClicksOnMenu(){
            settingsPage.clickMenu();
       }

    @Then("^User clicks on settings$")
    public void userClicksOnSettings() throws InterruptedException {
        settingsPage.clickSettings();
    }

    @Then("^User clicks on accounts$")
    public void userClicksOnAccounts() throws InterruptedException {
        settingsPage.clickAccounts();
    }

    @Then("^User click on Add button$")
    public void userClickOnAddButton() throws InterruptedException {
        settingsPage.clickAdd();
    }

    @Then("^User click on Add button multiple times$")
    public void userClickOnAddButtonMultipleTimes() throws InterruptedException {
        settingsPage.clickAddMultipleTimes();
    }

    @Then("^User adds block date$")
    public void userAddsBlockDate() {
        settingsPage.addBlockDate();
    }


    @Then("^User removes block date$")
    public void userRemovesBlockDate() throws InterruptedException {
        settingsPage.removesBlockDate();
    }

    @Then("^User adds another block dates$")
    public void userAddsAnotherBlockDates() throws InterruptedException {
        settingsPage.addMulBlockDate();
    }

    @Then("^User adds block date with multiple time slots$")
    public void userAddsBlockDateWithMultipleTimeSlots() {
        settingsPage.blockDateWithMulTimeSlots();
    }

    @Then("^User deletes added time slot$")
    public void userDeletesAddedTimeSlot() throws InterruptedException {
        settingsPage.deleteTimeSlot();
    }

    @Then("^User edits added time slot$")
    public void userEditsAddedTimeSlot() throws InterruptedException {
        settingsPage.editTimeSlot();
    }

    @Then("^User makes chat settings$")
    public void userMakesChatSettings() throws InterruptedException {
        settingsPage.chatSettings();
    }

    @Then("^User sets appointment duration$")
    public void userSetsAppointmentDuration() throws InterruptedException {
        settingsPage.aptduration();
    }

    @Then("^User clicks on clinical$")
    public void userClicksOnClinical() {
        settingsPage.clickClinical();
    }

    @Then("^User sets number of follow up consultations for certain days$")
    public void userAddsNumberOfFollowUpConsultationsForCertainDays() throws InterruptedException {
        settingsPage.addFollowUps();
    }

    @Then("^User sets video consultation fee$")
    public void userSetsVideoConsultationFee() throws InterruptedException {
        settingsPage.setVideoConsultationFee();
    }

    @Then("^User sets walk in consultation fee$")
    public void userSetsWalkInConsultationFee() throws InterruptedException {
        settingsPage.setWalkInConsultationFee();
    }

    @Then("^User clicks on examination$")
    public void userClicksOnExamination() throws InterruptedException {
        settingsPage.clickExamination();
    }

    @Then("^User clicks on Assessments settings$")
    public void userClicksOnAssessmentsSettings() throws InterruptedException {
        settingsPage.clickAssessmentSettings();
    }

    @Then("^User makes assessment settings$")
    public void userMakesAssessmentSettings() throws InterruptedException {
        settingsPage.makeAssessmentSettings();
    }

    @Then("^User enables all assesments in assessment settings$")
    public void userEnablesAllAssesmentsInAssessmentSettings() {
        settingsPage.enableAssessments();
    }

    @Then("^User disables all assesments in assessment settings$")
    public void userDisablesAllAssesmentsInAssessmentSettings() {
        settingsPage.enableAssessments();
    }

    @Then("^User clicks on Prescription settings$")
    public void userClicksOnPrescriptionSettings() {
        settingsPage.clickPrescriptionSettings();
    }

    @Then("^User checks for the fields that are enabled and disabled$")
    public void userChecksForTheFieldsThatAreEnabledAndDisabled() {
        settingsPage.prescriptionFields();
    }

    @Then("^User makes changes for enabled fields$")
    public void userMakesChangesForEnabledFields() {
        settingsPage.settingsInPrescription();
    }

    @Then("^User clicks on Privacy policy in settings$")
    public void userClicksOnPrivacyPolicyInSettings() {
        settingsPage.privacyPolicy();
    }

    @Then("^User logs out of the application$")
    public void userLogsOutOfTheApplication() {
        settingsPage.logOut();
    }
}
