package steps;

import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import page.*;
import utils.UtilityClass;

import java.io.FileNotFoundException;
import java.io.IOException;

   
public class LoginSteps {
    AndroidDriver driver;
    BaseTest baseTest;
    LoginPage loginPage;
    UtilityClass util;
    BookAppointment bookAppointment;
    ForgotPassword forgotPassword;
    CustSuppFeedback custSuppFeedback;
    SettingsSchedule settingsSchedule;
    TemplatePage templatePage;
    PatientScreening patientScreening;
    DPAddPatients dpAddPatients;
    Payments payments;

    DPAppointmentHistory dpAppointmentHistory;

    public LoginSteps() throws InterruptedException, FileNotFoundException {
        this.driver =BackGround.getDriver();
        loginPage = new LoginPage(driver);
        bookAppointment = new BookAppointment(driver);
        forgotPassword = new ForgotPassword(driver);
        custSuppFeedback = new CustSuppFeedback(driver);
        settingsSchedule = new SettingsSchedule(driver);
        templatePage = new TemplatePage(driver);
        patientScreening = new PatientScreening(driver);
        dpAddPatients=new DPAddPatients(driver);
        payments=new Payments(driver);
    }

//    @Given("^User click on docisn to launch the app$")
//    public void userClickOnDocisnToLaunchTheApp() throws InterruptedException {
//        loginPage.clickOnDocisnApp();
//    }

//    @Then("^User enter valid Username and valid Password$")
//
//    public void userEnterValidUsernameAndValidPassword() throws IOException, InterruptedException {
//        loginPage.enterUsername();
//        loginPage.enterPassword();
//    }
   

    

//    @Then("^User click on login button$")
//    public void userClickOnLoginButton() throws InterruptedException {
//        loginPage.clickOnLogin();
//        Thread.sleep(6000);
//    }

    @Then("^User click on Menu Button$")
    public void userClickOnMenuButton() throws InterruptedException {
        loginPage.clickOnMenu();
    }

    @Then("^User click on Settings option in menu$")
    public void userClickOnSettingsOptionInMenu() {
        loginPage.clickOnSettingOptionInMenu();
    }

    @Then("^User click on Logout and logout successfully$")
    public void userClickOnLogoutAndLogoutSuccessfully() throws InterruptedException {
        loginPage.clickOnLogout();
    }

    @Then("^User click on BookAppointment$")
    public void userClickOnBokkAppointment() throws InterruptedException {
        bookAppointment.clickOnBookAppointmentDashboard();
    }

  
    @Then("^User fill all information$")
    public void UserFillAllInformation() throws IOException, InterruptedException {
        bookAppointment.enterMobileNoAndSelectName(UtilityClass.readDataFromPropertyFile("MobNumber"), "VaibhavHadpe");
    }

    

    @Then("^User click on skip payment and Book appointment successfully\\.$")
    public void UserClickOnSkipPaymentAndBookAppointmentSuccessful() throws InterruptedException {
        bookAppointment.clickOnSkipPayment();
    }

    @Then("^User click on proceed to pay and Book appointment Successfully\\.$")
    public void UserClickOnProceedToPayAndBookeAppointmentSuccessful() throws InterruptedException {
        bookAppointment.clickOnProceedToPay();

    }

    @Then("^User click on walkin type of appointment$")
    public void UserClickOnWalkinTypeOfAppointment() throws InterruptedException {
        bookAppointment.clickOnWalkinTypeOfAppointment();
    }

    @Then("^User click on hospital and switch between hospitals\\.$")
    public void userClickOnHospitalAndSwitchBetweenHospitals() throws InterruptedException {
        bookAppointment.clickOnHospitalAndSwitchAccordingly("Vaibhav Clinic ,Hyderabad");
    }

    @Then("^User click on hospital and switch to another hospitals\\.$")
    public void userClickOnHospitalAndSwitchToAnotherHospitals() throws InterruptedException {
        bookAppointment.clickOnHospitalAndSwitchAccordingly("Vaibhav Clinic ,Hyderabad");
    }

  
    @Then("^User reschedule the appointment\\.$")
    public void userRescheduleTheAppointment() throws InterruptedException {
        bookAppointment.rescheduleAppointment1();
        Thread.sleep(2000);
        bookAppointment.selectTimeSlotReschedule();
        Thread.sleep(2000);
        bookAppointment.enterRescheduleReason();
        Thread.sleep(2000);
        bookAppointment.ScrollAndSubmitBtnReschedule();
//        Thread.sleep(3000);
//        bookAppointment.clickOK();
//        Thread.sleep(8000);
    }



    @Then("^User click on ForgotPassword and land on forgot password page\\.$")
    public void userClickOnForgotPasswordAndLandOnForgotPasswordPage() {
        forgotPassword.verifyForgotPasswordClickable();
    }

    @Then("^User enter valid mobNo,OTP and click on submit\\.$")
    public void userEnterValidMobNoOTPAndClickOnSubmit() throws IOException, InterruptedException {
        forgotPassword.enterMobNoAndOTPAndClickOnSubmit();
    }

    @Then("^user entered same password in new password and confirm password fields\\.$")
    public void userEnteredSamePasswordInNewPasswordAndConfirmedPasswordFields() throws IOException, InterruptedException {
        forgotPassword.setNewPassword();
    }

    @Then("^User click on submit without filling mandatory fields\\.$")
    public void userClickOnSubmitWithoutFillingMandatoryFields() {
        forgotPassword.clickOnSubmitWithoutFillingMobNoAndOTP();
    }

    @Then("^User should get proper error messages for all mandatory fields\\.$")
    public void userShoudGetProperErrorMessagesForAllMandatoryFields() throws IOException {
        forgotPassword.verifyErrorMessagesForEmptyMobNoAndOTP();
    }

    @Then("^User click on submit without filling newPassword and ConfirmPassword fields\\.$")
    public void userClickOnSubmitWithoutFillingNewPasswordAndConfirmPasswordFields() {
        forgotPassword.clickOnSubmitWithoutFillingNewAndConfirmPassFields();
    }

    @Then("^User should get proper error messages for mandatory fields\\.$")
    public void userShoudGetProperErrorMessagesForMandatoryFields() throws IOException {
        forgotPassword.verifyErrorMsgsForEmptyNewAndConfirmPasswordFields();
    }

    @Then("^User cancel the appointment\\.$")
    public void userCancelTheAppointment() throws InterruptedException {
        bookAppointment.cancelAppointment();
    }

    @Then("^User initiate the appointment\\.$")
    public void userInitiateTheAppointment() throws InterruptedException {
        bookAppointment.iniitateAppointment();
    }

    @Then("^User complete the payment for appointment\\.$")
    public void userCompleteThePaymentForAppointment() throws InterruptedException {
        bookAppointment.completePayment();
    }

    @Then("^User click on notification and see all notifications\\.$")
    public void userClickOnNotificationAndSeeAllNotifications() throws InterruptedException {
        bookAppointment.clickAndSeeNotifications();
    }

    @Then("^User click on profile and land on profile page\\.$")
    public void userClickOnProfileAndLandOnProfilePage() throws InterruptedException {
        bookAppointment.viewProfile();
    }

    @Then("^user click on customerSupport and raise the complaint$")
    public void userClickOnCustomerSupportAndRaiseTheComplaint() throws InterruptedException {
        custSuppFeedback.enterdataAndSubmitCustomerSupport();
    }

    @Then("^user click on customerSupport and try to submit without entering mandatory fields\\.$")
    public void userClickOnCustomerSupportAndTryToSubmitWithoutEnteringMandatoryFields() throws InterruptedException {
        custSuppFeedback.veirfySubmitOnlyAfterEnteringMandatoryField();
    }

    @Then("^user click on customerSupport and verify Name,No,Email\\.$")
    public void userClickOnCustomerSupportAndVerifyNameNoEmail() throws InterruptedException, IOException {
        custSuppFeedback.verifyNameEmailAndMobNo();
    }

    @Then("^User click on feedback and see Total Ratings and Reviews\\.$")
    public void userClickOnFeedbackAndSeeFeedbacks() throws InterruptedException {
        custSuppFeedback.clickAndSeeFeedbacks();
    }

    @Then("^User click on feedback and see patients who had given feedback\\.$")
    public void userClickOnFeedbackAndSeePatientsWhoHadGivenFeedback() throws InterruptedException {
        custSuppFeedback.viewPatientDetails();
    }


    @Then("^User can apply filter Newest One First and Four Five Star\\.$")
    public void userCanApplyFilterNewestOneFirstAndFourFiveStar() throws InterruptedException {
        custSuppFeedback.applyFilterLatestAndFourFiveStar();
    }

    @Then("^User can apply filter Latest One First and Three Star Rating\\.$")
    public void userCanApplyFilterLatestOneFirstAndThreeStarRating() throws InterruptedException {
        custSuppFeedback.applyFilterLatestAndThreeStar();
    }

    @Then("^User can apply filter Latest One First and Zero-Two Star Rating\\.$")
    public void userCanApplyFilterLatestOneFirstAndZeroTwoStarRating() throws InterruptedException {
        custSuppFeedback.applyFilterNewestAndZeroToTwoStar();
    }

    @Then("^User can apply filter Oldest One First and All\\.$")
    public void userCanApplyFilterOldestOneFirstAndAll() throws InterruptedException {
        custSuppFeedback.applyFilterOldesttAndAll();
    }

    @Then("^User can apply filter Oldest One First and Four-Five Star Rating\\.$")
    public void userCanApplyFilterOldestOneFirstAndFourFiveStarRating() throws InterruptedException {
        custSuppFeedback.applyFilterOldesttAnd4_5StarRating();
    }

    @Then("^User can apply filter Oldest One First and Three Star Rating\\.$")
    public void userCanApplyFilterOldestOneFirstAndThreeStarRating() throws InterruptedException {
        custSuppFeedback.applyFilterOldesttAnd3StarRating();
    }

    @Then("^User can apply filter Oldest One First and Zero-Two Star Rating\\.$")
    public void userCanApplyFilterOldestOneFirstAndZeroTwoStarRating() throws InterruptedException {
        custSuppFeedback.applyFilterOldesttAnd0_2StarRating();
    }

    @Then("^User click on schedule$")
    public void userClickOnSchedule() {
        settingsSchedule.clickOnSchedule();
    }

    @Then("^User can see default schedule page\\.$")
    public void userCanSeeDefaultSchedulePage() {
        settingsSchedule.verifyUserLandedOnDefaultSchedulePage();
    }


    @Then("^User can set default schedule for Monday\\.$")
    public void userCanSetDefaultScheduleForMonday() throws InterruptedException {
        settingsSchedule.setDefaultScheduleForMonday();
    }

    @Then("^User can set default schedule for Tuesday\\.$")
    public void userCanSetDefaultScheduleForTuesday() throws InterruptedException {
        settingsSchedule.setDefaultScheduleForTuesday();
    }

    @Then("^User try to make shcedule for which timing is overlapping\\.$")
    public void userTryToMakeShceduleForWhichTimingIsOverlapping() throws InterruptedException {
        settingsSchedule.verifyOverlappingSchedule();
    }

    @Then("^User try to add shcedule without clinicName\\.$")
    public void userTryToAddShceduleWithoutClinicName() throws InterruptedException {
        settingsSchedule.scheduleWithoutClinic();
    }

    @Then("^User try to delete that minimum/atleast one schedule for day\\.$")
    public void userTryToDeleteThatMinimumAtleastOneScheduleForDay() throws InterruptedException {
        settingsSchedule.deleteAtleastOneScheduleMonday();
    }

    @Then("^User edit the existing schedule$")
    public void userEditTheExistingSchedule() throws InterruptedException {
        settingsSchedule.editDefaultSchedule();
    }

    @Then("^User delete the existing schedule$")
    public void userDeleteTheExistingSchedule() throws InterruptedException {
        settingsSchedule.deleteScheduleMoreThanOne();
    }


    @Then("^User click on Template option and land on Template page$")
    public void userClickOnTemplateOptionAndLandOnTemplatePage() throws InterruptedException {
        templatePage.clickOnTemplateAndLandOnTemplatepage();
    }

    @Then("^User can see bydefault show template radio button selected\\.$")
    public void userCanSeeBydefaultShowTemplateRadioButtonSelected() throws InterruptedException {
        templatePage.verifyBydefaultShowTemplateRadioButtonSelected();
    }

    @Then("^User can see allready created template list on click on Disease field\\.$")
    public void userCanSeeAllreadyCreatedTemplateListOnClickOnDiseaseField() throws InterruptedException {
        templatePage.showAllreadyCreatedTemplateList();
    }

  
    @Then("^User can see and edit template by filling all mandatory fields with valid data$")
    public void userCanSeeAndEditTemplateByFillingAllMandatoryFieldsWithValidData() throws InterruptedException {
        templatePage.editTemplate("Abc", "Other", "Any");
    }
    

    @Then("^User not able to see OR editTemplate without filling all mandatory fields\\.$")
    public void userNotAbleToSeeOREditTemplateWithoutFillingAllMandatoryFields() throws InterruptedException {
        templatePage.tryToEditWithoutFillingMandatoryField("Abc");
    }

    @Then("^User able to edit template by entering valid Gender and Age group combination\\.$")
    public void userAbleToEditTemplateByEnteringValidGenderAndAgeGroupCombination() throws InterruptedException {
        templatePage.enterValidGenderAndAgeGroupCombination("Abc", "Other", "Any");
    }

    @Then("^User can see by default No Templates message on landing on template page$")
    public void userCanSeeByDefaultNoTemplatesMessageOnLandingOnTemplatePage() throws IOException {
        templatePage.verifyDefaultMessage();
    }

    @Then("^User can click on create template and land on create template page\\.$")
    public void userCanClickOnCreateTemplateAndLandOnCreateTemplatePage() {
        templatePage.clickOnCreateTemplateAndNavigateToCreteTemplatePage();
    }

    @Then("^User not able to create empty template$")
    public void userNotAbleToCreateEmptyTemplate() throws InterruptedException {
        templatePage.emptyTemplate();
    }

    @Then("^User create template by adding only medicines$")
    public void userCreateTemplateByAddingOnlyMedicines() throws InterruptedException {
        templatePage.createTemplateAddOnlyMedicine();
    }

    @Then("^User can able to see Lab orders only by enabling toggle button\\.$")
    public void userCanAbleToSeeLabOrdersOnlyByEnablingToggleButton() throws InterruptedException {
        templatePage.enableLabOrderToggleButtonAndSee();
    }

    @Then("^User can create template by adding only any single Lab Order\\.$")
    public void userCanCreateTemplateByAddingOnlyAnySingleLabOrder() throws InterruptedException {
        templatePage.addClinicalInvestigation("ClinicalInvestigationTemplate", "AddClinicalInvestigation", "Other", "Any", "Clinical Investigations");
    }

    @Then("^User can create template by adding all Lab Orders\\.$")
    public void userCanCreateTemplateByAddingAllLabOrders() throws InterruptedException {
        templatePage.addAllLabOrderAndCreateTemplate("AllLabOrdersTest", "Test and Submit Report", "Male", "Any");
    }

    @Then("^User can create template by adding medicine and Lab Orders\\.$")
    public void userCanCreateTemplateByAddingMedicineAndLabOrders() throws InterruptedException {
        templatePage.createSampleTemplateHavingMedicineandTests("TemplateForTyphoid", "MedicinesAndLabOrders", "Male", "Any");
    }

    @Then("^User enters valid email and wrong password and clicks on login$")
    public void userEntersValidEmailAndWrongPasswordAndClicksOnLogin() throws IOException, InterruptedException {
        loginPage.validEmailWrongPassword();
    }

    @Then("^User enters invalid email and right password and clicks on login$")
    public void userEntersInvalidEmailAndRightPasswordAndClicksOnLogin() throws IOException, InterruptedException {
        loginPage.invalidEmail();
    }

    @Then("^User enters only email or only password and tries to click on login$")
    public void userEntersOnlyEmailOrOnlyPasswordAndTriesToClickOnLogin() throws IOException, InterruptedException {
        loginPage.onlyEmail();
        loginPage.onlyPassword();
    }

    @Then("^User enters unregistered user credentials$")
    public void userEntersUnregisteredUserCredentials() throws IOException, InterruptedException {
        loginPage.unregisteredUserLogin();
    }

    @Then("^User fill all information of family member$")
    public void userFillAllInformationOfFamilyMember() throws IOException, InterruptedException {
        bookAppointment.fillAllInformationOfFamilyMember();
    }

    @Then("^User select different clinics of doctor$")
    public void userSelectDifferentClinicsOfDoctor() throws InterruptedException {
        bookAppointment.selectDifferentClinicOfDoctor("Vaibhav Clinic");
    }

    @Then("^User fill information of patient and select different clinic$")
    public void userFillInformationOfPatientAndSelectDifferentClinic() throws IOException, InterruptedException {
        bookAppointment.fillInfoOfPatientAndSelectDifferentClinic();
    }

    @Then("^User fill all information for patient Others$")
    public void userFillAllInformationForPatientOthers() throws IOException, InterruptedException {
        bookAppointment.fillInformationForOtherPatient(UtilityClass.readDataFromPropertyFile("MobNumber"), "Vikas", "vikas99@gmail.com", "Male", "Friend", 27);
    }

    @Then("^User click on Disease field and delete Template$")
    public void userClickOnDiseaseFieldAndDeleteTemplate() throws InterruptedException {
        templatePage.userClickOnDiseaseFieldAndDeleteTemplate("Bone Marrow");
    }

    @Then("^User fill valid data and able to see template and delete template\\.$")
    public void userFillValidDataAndAbleToSeeTemplateAndDeleteTemplate() throws InterruptedException {
        templatePage.fillAllValidDataOfTemplateViewAndThenDelete("AllLabOrders", "Male", "Any");
    }

    @Then("^User can see listOf Template on click on DiseaseField in showTemplate$")
    public void userCanSeeListOfTemplateOnClickOnDiseaseFieldInShowTemplate() throws InterruptedException {
        templatePage.viewlistOfTemplateOnClickOnDiseaseField();
    }

    @Then("^User can edit template or Disease Name$")
    public void userCanEditTemplateOrDiseaseName() throws InterruptedException {
        templatePage.editTemplateNameAndVerify("Fever of unknown origin", "Other", "Any", "Fever with c");
    }

    @Then("^User can edit Line of Treatment$")
    public void userCanEditLineOfTreatment() throws InterruptedException {
        templatePage.editAndVerifyLineOfTreatmentInTemplate("Fever with chills", "Other", "Any", "New Line of Treatment");
    }

    @Then("^User try to reschedule without selecting time\\.$")
    public void userTryToRescheduleWithoutSelectingTime() throws InterruptedException {
        bookAppointment.rescheduleWithoutTime("Time slot is required");
    }

    @Then("^User try to reschedule without giving Reason\\.$")
    public void userTryToRescheduleWithoutGivingReason() throws InterruptedException {
        bookAppointment.rescheduleWithoutReason("Reason is required");
    }

    @Then("^User try to reschedule on future dates\\.$")
    public void userTryToRescheduleOnFutureDates() throws InterruptedException {
        bookAppointment.rescheduleOnFutureDate("31");
    }

    @Then("^User try to cancel the appointment without giving reason\\.$")
    public void userTryToCancelTheAppointmentWithoutGivingReason() throws InterruptedException {
        bookAppointment.cancelWithoutReason("Reason is required");
    }

    @Then("^User click on Dismiss to stop cancellation process\\.$")
    public void userClickOnDismissToStopCancellationProcess() throws InterruptedException {
        bookAppointment.dismissCancellationOfAppointment();
    }

    @Then("^User fill all information of unregistered member$")
    public void userFillAllInformationOfUnregisteredMember() throws IOException, InterruptedException {
        bookAppointment.fillInformationForUnregisteredPatient("8329090293", "Ram", "ram11@test.com", "Male", "Friend", 30);
    }

    @Then("^User click on skip payment and observe$")
    public void userClickOnSkipPaymentAndObserve() throws InterruptedException {
        bookAppointment.verifyAppointmentBookedOrNot();
    }

    @Then("^User select registered patient and see all information$")
    public void userSelectRegisteredPatientAndSeeAllInformation() throws IOException, InterruptedException {
        bookAppointment.verifyInfoPopulatingOnSelectingRegisteredMember("7972481656", "Vaibhav", "vaibhav.hadpe@archents.com", "Male", "Self", "26");
    }

    @Then("^User add symptomps while booking appointment$")
    public void userAddSymptompsWhileBookingAppointment() throws InterruptedException {
        bookAppointment.addSymptompsWhileBookingAppointment("A");
    }

    @Then("^User try to add duplicate symptomps while booking appointment$")
    public void userTryToAddDuplicateSymptompsWhileBookingAppointment() throws InterruptedException {
        bookAppointment.duplicateSymptompsBkApt("Abdominal", "Abdominal");
    }

    @Then("^User click on cancel and that appointmet should not get booked$")
    public void userClickOnCancelAndThatAppointmetShouldNotGetBooked() throws InterruptedException {
        bookAppointment.cancelBookAptProcess();
    }

    @Then("^User click on proceed to pay and see billRecieptDetails\\.$")
    public void userClickOnProceedToPayAndSeeBillRecieptDetails() throws InterruptedException {
        bookAppointment.verifyPatientDetailsOnBillRecipt("7972481656", "Vaibhav");
    }

    @Then("^User try to book appointment without filling mandatory fields$")
    public void userTryToBookAppointmentWithoutFillingMandatoryFields() throws InterruptedException {
        bookAppointment.verifyUserShouldNotBookedAptWithoutFillingMadatoryField(
                "Mobile number cannot be blank", "Name cannot be blank", "Gender cannot be blank", "Please select relationship");
    }


    @Then("^User click on Reschedule and land on Reschedule page$")
    public void userClickOnRescheduleAndLandOnReschedulePage() throws InterruptedException {
        bookAppointment.clickAndLandOnRescheduleAptPage();
    }

    @Then("^User try to reschedule apt in future week$")
    public void userTryToRescheduleAptInFutureWeek() throws InterruptedException {
        bookAppointment.rescheduleAptInFutureWeek("14");
    }

    @Then("^User try to reschedule apt on past dates$")
    public void userTryToRescheduleAptOnPastDates() throws InterruptedException {
        bookAppointment.tryToRescheduleOnPastDates("02");
    }

    @Then("^User verify patient details on reschedule page$")
    public void userVerifyPatientDetailsOnReschedulePage() throws InterruptedException {
        bookAppointment.verifyPateintDetailsOnReschedulePage();
    }

    @Then("^User verify for reschedule Apt tag Rescheduled should show$")
    public void userVerifyForRescheduleAptTagRescheduledShouldShow() {
        bookAppointment.verifyRescheduledTagForRescheduleApt();
    }

    @Then("^User click on cancel and navigate to cancel page$")
    public void userClickOnCancelAndNavigateToCancelPage() throws InterruptedException {
        bookAppointment.clickOnCancelAndNavigateToCancelPage();
    }

    @Then("^User click on HOPI and land on HOPI page$")
    public void userClickOnHOPIAndLandOnHOPIPage() throws InterruptedException {
        patientScreening.clickOnPatientScreeningFeatureAndVerifyPageTitle("HOPI", "Hopi And Complaints");
    }

    @Then("^User add single HOPI and save$")
    public void userAddSingleHOPIAndSave() throws InterruptedException {
  
        patientScreening.addSingleHOPI("Fev");
        patientScreening.clickOnSave();
    }

//    @Then("^User add singel HOPI and fill all details$")
//    public void userAddSingelHOPIAndFillAllDetails() throws InterruptedException {
//        patientScreening.addSingleHOPI("Fev");
//        patientScreening.addDetailsForHOPI();
//
//      patientScreening.addSingleHOPI("Fev");
//      patientScreening.clickOnSave();
//    }

    @Then("^User add single HOPI and fill all details$")
    public void userAddSingelHOPIAndFillAllDetails() throws InterruptedException {
        patientScreening.addSingleHOPI("Fev");
        patientScreening.addDetailsForHOPI("Fever","Gradual","Fever","Environmental Triggers","Otc Drugs",
                "Chills","Worse At Night","Low Grade");
        patientScreening.clickOnSave();
        patientScreening.clickOnOK();
        patientScreening.clickOnSave();

    }

    @Then("^User can add customized HOPI$")
    public void userCanAddCustomizedHOPI()
    {
      patientScreening.addCustomizedHOPI("Fever with chills");
    }

    @Then("^User can edit details of added HOPI$")
    public void userCanEditDetailsOfAddedHOPI() throws InterruptedException {
        patientScreening.editDetailsOfAddedHOPI("Fever","High Fever");
        patientScreening.clickOnSave();
        patientScreening.clickOnOK();
        patientScreening.clickOnSave();
    }

    @Then("^User can delete added HOPI$")
    public void userCanDeleteAddedHOPI() throws InterruptedException {
      patientScreening.deleteAddedHOPI();
    }

    @Then("^User should not able to add duplicate HOPI$")
    public void userShouldNotAbleToAddDuplicateHOPI() throws InterruptedException
    {
      patientScreening.tryToAddDuplicateHOPI("Fever");
    }

    @Then("^User can click and land on patient info page$")
    public void userCanClickAndLandOnPatientInfoPage() throws InterruptedException {
       patientScreening.clickAndLandOnPatientInfoPage();

    }

    @Then("^User verify patient iformation$")
    public void userVerifyPatientIformation() throws InterruptedException {
        patientScreening.verifyPatientInformationInPatientInfo();
    }

    @Then("^User can click on Lifeline and land on lifeline Page$")
    public void userCanClickOnLifelineAndLandOnLifelinePage() throws InterruptedException {
       patientScreening.clickAndLandOnLifelinePageInPatientInfo();
    }

    @Then("^User can apply different filters$")
    public void userCanApplyDifferentFilters() throws InterruptedException {
        patientScreening.applyDifferentLifelineFilter1("This Year","All Events");
    }

    @Then("^User can click on Reports and Records to see Reports and Records$")
    public void userCanClickOnReportsAndRecordsToSeeReportsAndRecords() throws InterruptedException {
        patientScreening.clickAndLandOnReportsAndRecords();
    }

    @Then("^User can click on Reports and Records and switch between different types of Reports$")
    public void userCanClickOnReportsAndRecordsAndSwitchBetweenDifferentTypesOfReports() throws InterruptedException {
        patientScreening.selectDifferentTypesOfReportsAndRecords("Lab Reports");
    }

    @Then("^User can click and land on vitals page$")
    public void userCanClickAndLandOnVitalsPage() throws InterruptedException {
        patientScreening.clickOnPatientScreeningFeatureAndVerifyPageTitle("Vitals","Vitals");
    }

    @Then("^User can add any one vital$")
    public void userCanAddAnyOneVital() throws InterruptedException {
        patientScreening.addVitals(2,99);
        patientScreening.saveVitals();
        patientScreening.clickOnOK();
    }

    @Then("^User can add all vitals$")
    public void userCanAddAllVitals() throws InterruptedException {
        patientScreening.addVitals(1,98);
        patientScreening.addVitals(2,98);
        patientScreening.addVitals(3,98);
        patientScreening.addVitals(4,198);
        patientScreening.addVitals(5,98);
        patientScreening.addVitals(6,98);
        patientScreening.addVitals(7,98);
        patientScreening.saveVitals();
    }

    @Then("^User can edit added vitals$")
    public void userCanEditAddedVitals() throws InterruptedException {
        patientScreening.addVitals(2,100);
        patientScreening.saveVitals();
        patientScreening.clickOnOK();
    }

    @Then("^User can see error messages for all vitals for wrong value$")
    public void userCanSeeErrorMessagesForAllVitalsForWrongValue() throws InterruptedException {
        patientScreening.addVitals(1,970);
        patientScreening.errorMessagesForVitals("Enter correct HeartRate");
    }

    @Then("^User able to see vitals history on click on vitals History$")
    public void userAbleToSeeVitalsHistoryOnClickOnVitalsHistory() throws InterruptedException {
        patientScreening.clickOnHistoryOfVitals();
    }

    @Then("^User able to see after clearing Body height,Boday weight also clear$")
    public void userAbleToSeeAfterClearingBodyHeightBodayWeightAlsoClear() throws InterruptedException {
        patientScreening.clearingHeightAndVerifyClearingWeight();
    }

    @Then("^User able to see after clearing BP systolic,BP Dystolic also clear$")
    public void userAbleToSeeAfterClearingBPSystolicBPDystolicAlsoClear() throws InterruptedException {
        patientScreening.clearingBPSystolicAndVerifyClearedBPdystolic();
    }

    @Then("^User can add wrong\\(out of Range\\) value of vitals but should not able to save$")
    public void userCanAddWrongOutOfRangeValueOfVitalsButShouldNotAbleToSave() throws InterruptedException {
        patientScreening.verifySaveBtnForWrongVitalValue();
    }

    @Then("^User can click and land on Assesment page$")
    public void userCanClickAndLandOnAssesmentPage() throws InterruptedException
    {
        patientScreening.clickOnPatientScreeningFeatureAndVerifyPageTitle("Assessment","Assessment");
    }

    @Then("^User click on Assesment settings and change the settings$")
    public void userClickOnAssesmentSettingsAndChangeTheSettings() throws InterruptedException {
        patientScreening.changeAndSaveAssesmentSettings(6);
    }

    @Then("^User click on Assesment settings$")
    public void userClickOnAssesmentSettings()
    {
        patientScreening.clickOnAssesmentSettings();
    }

    @Then("^User can add assesments details for Neuro$")
    public void userCanAddAssesmentsDetailsForNeuro() throws InterruptedException
    {
        patientScreening.addDetailsOfAssesment("Neuro","Confused","Perla","2mm","3mm","Flat");
        patientScreening.clickOnSave();
        Thread.sleep(3000);
        patientScreening.clickOnOK();
        Thread.sleep(3000);
        patientScreening.clickOnSave();
    }

    @Then("^User can edit assesments details for Neuro$")
    public void userCanEditAssesmentsDetailsForNeuro() throws InterruptedException {
        patientScreening.editDetailsOfAssesment("Neuro","Responsive To Voice");
    }

  
   
    @Then("^User can click and land on Overview page$")
    public void userCanClickAndLandOnOverviewPage() throws InterruptedException
    {
        patientScreening.clickOnPatientScreeningFeatureAndVerifyPageTitle("Overview","Add Overview");
    }

    @Then("^User can click on Drug Sensitivity and land on Drug Sensitivity Page$")
    public void userCanClickOnDrugSensitivityAndLandOnDrugSensitivityPage()
    {
        patientScreening.clickAndNavigateToDrugSensitivity();
    }

    @Then("^User can add drug in drug sensitivity$")
    public void userCanAddDrugInDrugSensitivity() throws InterruptedException {
        patientScreening.addDrugInDrugSensitivity("Biocalcin");
        patientScreening.clickOnSave();
        patientScreening.clickOnSave();
    }

    @Then("^User can edit drug in drug sensitivity$")
    public void userCanEditDrugInDrugSensitivity() throws InterruptedException {
        patientScreening.editDrugsInDrugSensitivity();
    }

    @Then("^User can delete drug in drug sensitivity$")
    public void userCanDeleteDrugInDrugSensitivity() throws InterruptedException {
        patientScreening.deleteDrugFromDrugSensitivity();
    }

    @Then("^User can click on Food Sensitivity and land on Food Sensitivity Page$")
    public void userCanClickOnFoodSensitivityAndLandOnFoodSensitivityPage()
    {
        patientScreening.clickAndNavigateToFoodSensitivityPage();
    }

    @Then("^User can add Food in Food Sensitivity$")
    public void userCanAddFoodInFoodSensitivity() throws InterruptedException {
        patientScreening.addFoodInFoodSensitivity();
    }

    @Then("^User can edit Food in Food Sensitivity$")
    public void userCanEditFoodInFoodSensitivity() throws InterruptedException {
        patientScreening.editFoodInFoodSensitivity();
    }

    @Then("^User can delete Food in Food Sensitivity$")
    public void userCanDeleteFoodInFoodSensitivity() throws InterruptedException {
        patientScreening.deleteFoodInFoodSensitivity();
    }

    @Then("^User can click on Environment Sensitivity and land on Environment Sensitivity Page$")
    public void userCanClickOnEnvironmentSensitivityAndLandOnEnvironmentSensitivityPage()
    {
        patientScreening.clickAndNavigateToEnvironmentSensitivity();
    }

    @Then("^User can add Environment condition in Environment Sensitivity$")
    public void userCanAddEnvironmentConditionInEnvironmentSensitivity() throws InterruptedException {
        patientScreening.addEnvironmentConditionInEnvSensitivity();
    }

    @Then("^User can edit Environment condition in Environment Sensitivity$")
    public void userCanEditEnvironmentConditionInEnvironmentSensitivity() throws InterruptedException {
        patientScreening.editEnvironmentConditionInEnvSensitivity();
    }

    @Then("^User can delete Environment condition in Environment Sensitivity$")
    public void userCanDeleteEnvironmentConditionInEnvironmentSensitivity() throws InterruptedException {
        patientScreening.deleteEnvironmentConditionInEnvSensitivity();
    }

    @Then("^User can click on Medication History and land on Medication History Page$")
    public void userCanClickOnMedicationHistoryAndLandOnMedicationHistoryPage()
    {
        patientScreening.clickAndNavigateToMedicationHistory();
    }

    @Then("^User can add medication in Medication History$")
    public void userCanAddMedicationInMedicationHistory() throws InterruptedException {
        patientScreening.addMedicationInMedicationHistory();
    }

    @Then("^User can edit medication in Medication History$")
    public void userCanEditMedicationInMedicationHistory() throws InterruptedException {
        patientScreening.editMedicationInMedicationHistory();
    }

    @Then("^User can delete medication in Medication History$")
    public void userCanDeleteMedicationInMedicationHistory() throws InterruptedException {
        patientScreening.deleteMedicationInMedicationHistory();
    }

    @Then("^User click and navigate to Past Medical Condition$")
    public void userClickAndNavigateToPastMedicalCondition() throws InterruptedException {
        patientScreening.clickAndNavigateToPastMedicalCondition();
    }

    @Then("^User add medical condition in Past Medical Condtion$")
    public void userAddMedicalConditionInPastMedicalCondtion() throws InterruptedException {
        patientScreening.addMedicalConditionInPastMedicalCondition();
    }

    @Then("^User edit medical condition in Past Medical Condtion$")
    public void userEditMedicalConditionInPastMedicalCondtion() throws InterruptedException {
        patientScreening.editMedicalConditionInPastMedicalCondition();
    }

    @Then("^User delete medical condition in Past Medical Condtion$")
    public void userDeleteMedicalConditionInPastMedicalCondtion() throws InterruptedException {
        patientScreening.deleteMedicalConditionInPastMedicalCondition();
    }

    @Then("^User click and navigate to Family History$")
    public void userClickAndNavigateToFamilyHistory() throws InterruptedException {
        patientScreening.clickAndNavigateToFamilyHistoy();
    }

    @Then("^User add family member in Family History$")
    public void userAddFamilyMemberInFamilyHistory() throws InterruptedException {
        patientScreening.addFamilyMemberInFamilyHistory("Daibetes","Father");
    }

    @Then("^User delete family member in Family History$")
    public void userDeleteFamilyMemberInFamilyHistory() throws InterruptedException {
        patientScreening.deleteFamilyMemberInFamilyHistory();
    }

    @Then("^User click and navigate to Past Surgical History$")
    public void userClickAndNavigateToPastSurgicalHistory() throws InterruptedException
    {
       patientScreening.clickAndNavigateToPastSurgicalHistory();
    }


    @Then("^User add Past Surgical History$")
    public void userAddPastSurgicalHistory() throws InterruptedException {
        patientScreening.addPastSurgicalHistory();
    }

    @Then("^User edit Past Surgical History$")
    public void userEditPastSurgicalHistory() throws InterruptedException {
        patientScreening.editPastSurgicalHistory();
    }

    @Then("^User delete Past Surgical History$")
    public void userDeletePastSurgicalHistory() throws InterruptedException {
        patientScreening.deletePastSurgicalHistory();
    }

    @Then("^User click and navigate to Problem List$")
    public void userClickAndNavigateToProblemList() throws InterruptedException {
        patientScreening.clickAndNavigateToProblemList();
    }

    @Then("^User add problems in Problem List$")
    public void userAddProblemsInProblemList() throws InterruptedException {
        patientScreening.addProblemList("Fear of bridges","Controlled");
    }

    @Then("^User edit problems in Problem List$")
    public void userEditProblemsInProblemList() throws InterruptedException
    {
        patientScreening.editProblemList("Inactive");
    }

    @Then("^User delete problems in Problem List$")
    public void userDeleteProblemsInProblemList() throws InterruptedException {
      patientScreening.deleteProblemList();
    }

    @Then("^User click on social History and navigate to Social History Page$")
    public void userClickOnSocialHistoryAndNavigateToSocialHistoryPage() throws InterruptedException {
        patientScreening.clickAndNavigateToSocialHistory();
    }

    @Then("^User edit Social History$")
    public void userEditSocialHistory() throws InterruptedException {
        patientScreening.editSocialHistory("Good");
    }

    @Then("^click on back arrow$")
    public void clickOnBackArrow() throws InterruptedException {
        patientScreening.clickOnBackArrow();
    }

    @Then("^User click on Prescribe$")
    public void userClickOnPrescribe() throws InterruptedException {
        Thread.sleep(5000);
        patientScreening.clickOnPatientScreeningFeatureAndVerifyPageTitle("Prescribe","Prescribe");
    }

    @Then("^User change prescription settings and save$")
    public void userChangePrescriptionSettingsAndSave() throws InterruptedException {
        Thread.sleep(5000);
        patientScreening.changeAndSavePrescriptionSettings(5,6);
    }

    @Then("^User select and add medicine in prescription$")
    public void userSelectAndAddMedicineInPrescription() throws InterruptedException {
        patientScreening.addMedicineInPrescription("Calchil","Buccal","1-1-0","4","Allow Twice");
        patientScreening.clickOnSave();
    }

    @Then("^User add medicine through template in prescription$")
    public void userAddMedicineThroughTemplateInPrescription() throws InterruptedException {
        patientScreening.addMedicineInPrescriptionUsingTemplate("Acupuncture","Other","Any");
    }

    @Then("^User add medicine through Prescription History$")
    public void userAddMedicineThroughPrescriptionHistory() throws InterruptedException {
        patientScreening.addMedicineThroughPrescriptionHistoryInPrescription();
    }

    @Then("^User add medicine as a favourite medicine$")
    public void userAddMedicineAsAFavouriteMedicine() throws InterruptedException {
        patientScreening.addMedicineAsAFavouriteMedicine("Auxitrol Softgel");
    }

    @Then("^User add medicine and see successfull popup$")
    public void userAddMedicineAndSeeSuccessfullPopup() throws InterruptedException {
        patientScreening.verifySuccessfullPopupForAddMedicineInPrescription("Calchil","Buccal","1-1-0","4","Allow Twice");
    }

    @Then("^User edit added medicine and save$")
    public void userEditAddedMedicineAndSave() throws InterruptedException {
       patientScreening.editAddedMedicineInPrescription("Buccal");
    }

    @Then("^User delete added medicine and save$")
    public void userDeleteAddedMedicineAndSave() throws InterruptedException {
        patientScreening.deleteAddedMedicineInPrescription();
    }

    @Then("^User verify delete successfull popup msg text$")
    public void userVerifyDeleteSuccessfullPopupMsgText() throws InterruptedException {
        patientScreening.verifyDeletePopupTextInPrescription();
    }

    @Then("^User click on Diagnosis$")
    public void userClickOnDiagnosis() throws InterruptedException {
        patientScreening.clickOnPatientScreeningFeatureAndVerifyPageTitle("Diagnosis","Diagnosis");
    }

    @Then("^User click on AddDiagnosis$")
    public void userClickOnAddDiagnosis() throws InterruptedException {
        patientScreening.clickOnAddDiagnosisBtn();
    }

    @Then("^User add Diagnosis$")
    public void userAddDiagnosis() throws InterruptedException {
        patientScreening.addDiagnosis("Fear of bridges","Working");
        patientScreening.clickOnSave();
        Thread.sleep(2000);
    }

    @Then("^User search and add Diagnosis$")
    public void userSearchAndAddDiagnosis() throws InterruptedException {
        patientScreening.searchAndAddDiagnosis("Activity","Provisional");
    }

    @Then("^User search and delete Diagnosis$")
    public void userSearchAndDeleteDiagnosis()
    {
        patientScreening.deleteAddedDiagnosis();
    }

    @Then("^click on patient and see patient Basic Info$")
    public void clickOnPatientToSeePatientDetails() throws InterruptedException {
        dpAddPatients.clickOnPatientNameInPatients();
    }

    @Then("^User click on Payments$")
    public void userClickOnPayments()
    {
        payments.clickOnPaymentsOptionInMenu();
    }

    @Then("^User can see transactions$")
    public void userCanSeeTransactions() throws InterruptedException {
        payments.viewTransactions();
    }

    @Then("^User click outside$")
    public void userClickOutside() throws InterruptedException {
        patientScreening.clickOUtside();
    }

    @Then("^User click on Patient Instruction$")
    public void userClickOnPatientInstruction() throws InterruptedException {
        patientScreening.clickOnPatientScreeningFeatureAndVerifyPageTitle("Patient Instructions","Instructions");
    }

    @Then("^User add Patient Instructions$")
    public void userAddPatientInstructions() throws InterruptedException {
        patientScreening.addPatientInstruction();
    }

    @Then("^User click on Investigation$")
    public void userClickOnInvestigation() throws InterruptedException {
        patientScreening.clickOnPatientScreeningFeatureAndVerifyPageTitle("Investigations","Investigations");
    }

    @Then("^User add Investigation Lab Order$")
    public void userAddInvestigationLabOrder() throws InterruptedException {
        patientScreening.addLabOrderInvestigation("BLOOD");
        patientScreening.clickOnSave();

    }

    @Then("^User click on followUp$")
    public void userClickOnFollowUp() throws InterruptedException {
        patientScreening.clickOnPatientScreeningFeatureAndVerifyPageTitle("Follow Up","Add Follow Up");
    }

    @Then("^User add followUp$")
    public void userAddFollowUp() throws InterruptedException {
        patientScreening.addFollowUp("4");
        patientScreening.clickOnBackArrow();
    }

    @Then("^User click on refer Doctor$")
    public void userClickOnReferDoctor() throws InterruptedException {
        patientScreening.clickOnPatientScreeningFeatureAndVerifyPageTitle("Refer a doctor","Refer A Doctor");
    }

    @Then("^User refer another Doctor$")
    public void userReferAnotherDoctor() throws InterruptedException {
        patientScreening.referDoctor("Bharat Reddy","General Practitioner");
    }

    @Then("^User click on preview$")
    public void userClickOnPreview() throws InterruptedException {
        patientScreening.clickOnPreview();
    }

    @Then("^User click on end encounter and send pdf also$")
    public void userClickOnEndEncounterAndSendPdfAlso() throws InterruptedException {
        patientScreening.clickOnEndEncounter();
    }
}
