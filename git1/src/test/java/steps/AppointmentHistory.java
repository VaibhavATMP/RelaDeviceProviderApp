package steps;

import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import page.DPAppointmentHistory;

import java.io.IOException;

public class AppointmentHistory {


    AndroidDriver driver;
    BaseTest basetest;
    DPAppointmentHistory dpAppointmentHistory;

    public AppointmentHistory() {
        this.driver =BackGround.getDriver();
        dpAppointmentHistory = new DPAppointmentHistory(driver);
    }

    @Then("^User clicks on appointments history$")
    public void userClicksOnAppointmentsHistory() throws InterruptedException {
         dpAppointmentHistory.clickonapphistory();
//        driver.quit();
    }

    @Then("^User clicks on Patient Name in appointments$")
    public void userClicksOnPatientNameInAppointments() {
        dpAppointmentHistory.clickonpatientname();

    }

    @Then("^User clicks on today's appointment$")
    public void userClicksOnTodaySAppointment() {
        dpAppointmentHistory.Todayappointment();
    }

    @Then("^User is shown default message$")
    public void userIsShownDefaultMessage() throws IOException {
      dpAppointmentHistory.noappointments();
    }

    @Then("^click on filter icon$")
    public void clickOnFilterIcon() {
        dpAppointmentHistory.Filter();
    }

    @Then("^click on reschedule$")
    public void clickOnReschedule() throws InterruptedException {
        dpAppointmentHistory.clickreschedule();
        Thread.sleep(9000);
    }


    @Then("^click on cancel$")
    public void clickOnCancel() {
        dpAppointmentHistory.clickcancel();
    }

    @Then("^click on video icon$")
    public void clickOnVideoIcon() {
        dpAppointmentHistory.videoicon();
    }

    @Then("^click on completed appointments$")
    public void clickOnCompletedAppointments() {
        dpAppointmentHistory.completedappointments();
    }

    @Then("^click on prescription$")
    public void clickOnPrescription() {
        dpAppointmentHistory.checkprescription();
    }

    @Then("^click on select reschedule time$")
    public void clickOnSelectRescheduleTime() throws InterruptedException {
        dpAppointmentHistory.selectrescheduletime();
    }

    @Then("^enter the reason$")
    public void enterTheReason() throws IOException, InterruptedException {
        dpAppointmentHistory.reschedulereason();
    }

    @Then("^click on submit button$")
    public void clickOnSubmitButton() {
        dpAppointmentHistory.clickonsubmit();
    }

    @Then("^enter the cancel reason$")
    public void enterTheCancelReason() throws IOException {
        dpAppointmentHistory.cancelreason();
    }

    @Then("^select click on drop down and select the booked text$")
    public void selectClickOnDropDownAndSelectTheBookedText() throws InterruptedException {
       dpAppointmentHistory.filterbookedappointments("Pending");
    }
    @Then("^click on video consultation radio button$")
    public void clickOnVideoConsultationRadioButton() {
        dpAppointmentHistory.filtervideoconsultations();
    }

    @Then("^click on in-clinic radio button$")
    public void clickOnInClinicRadioButton() {
        dpAppointmentHistory.filterinclinicconsultation();
    }

    @Then("^click the drop down and select the clinic$")
    public void clickTheDropDownAndSelectTheClinic() throws InterruptedException {
        dpAppointmentHistory.filterappointmentswithclinic("Manogna");
    }

    @Then("^clicks on back arrow$")
    public void clickOnBackArrow1() throws InterruptedException {
        dpAppointmentHistory.clickbackarrow();
    }
}
