package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BackGround;
import utils.UtilityClass;

import java.io.IOException;

public class DPAddPatients {
    private String MobileNumber;
    private String Name;
    private String Email;

    private String phoneNumber;


    Logger logger= LogManager.getLogger(DPAddPatients.class);
    @AndroidFindBy(xpath= "//android.widget.EditText[@text='Email id']")
    private WebElement enterEmail;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='password']")
    private WebElement enterPassword;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='LOGIN']")
    private WebElement clickLogin;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='Enter Mobile number']")
    private WebElement txtmobileNumber;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='Enter Name']")
    private WebElement textName;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='Enter Email']")
    private WebElement textEmail;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='ADD']")
    private WebElement clickAdd;

    @AndroidFindBy(xpath= "//android.view.ViewGroup[@resource-id='home_open_menu_id']")
    private WebElement clickMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Patients']")
    private WebElement clickOnPatients;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Patient']")
    private WebElement clickAddPatient;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile number cannot be blank']")
    private WebElement withoutPhoneNum;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Email is required']")
    private WebElement withoutEmail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Name is required']")
    private WebElement withoutName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter only alphabets. Special characters or numbers or alpha-numeric or combination of all these characters is not allowed']")
    private WebElement phoneNumValidation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Email is invalid']")
    private WebElement invalidEmail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter 10 digit mobile number']")
    private WebElement invalidMobNum;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Basic Info']")
    private WebElement clickonbasicinfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Date of Birth']")
    private WebElement checkbasicinfodetails;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Appointment Id']")
    private WebElement appointmentrelateddetails;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='View More']")
    private WebElement clickonviewmore;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OK']")
    private WebElement clickOk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Manognak']")
    private WebElement clickonpatientprofile;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='0'])[2]")
    private WebElement patientNameFromList;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Appointment Details']")
    private WebElement clickonappointmentdetails;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Overview']")
    private WebElement clickonoverview;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Reports And Records']")
    private WebElement clickReportsandRecords;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OK']")
    private WebElement openreportsandrecordsfile;


    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DPAddPatients(AndroidDriver driver) {
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickOnLogin() {
        this.clickLogin.click();
        logger.info("Clicked on login");
    }


    public void clickAddButton() {
        this.clickAdd.click();
        logger.info("Clicked on add button");
    }

    public void clickMenuSection() {
        this.clickMenu.click();
        logger.info("Clicked on menu");
    }

    public void clickPatients() {
        this.clickOnPatients.click();
        logger.info("Clicked on patients in menu list");
    }

    public void clickOnAddPatients() {
        this.clickAddPatient.click();
        logger.info("Clicked on add patient button");
    }

    public void clickOnCancel() {
        this.clickAddPatient.click();
        logger.info("Clicked on add patient button");
    }

    public void clickOnOk() {
        this.clickOk.click();
        logger.info("Clicked on add patient button");
    }

    public void clickOnBasicInfo() {
        this.clickonbasicinfo.click();
        logger.info("Clicked on add patient button");
    }

    public void checkBasicInfoDetails() {
        this.checkbasicinfodetails.isDisplayed();
        logger.info("Basic details are showing");
    }

    public void checkAppointmentRelatedDetails() {
        this.appointmentrelateddetails.click();
        logger.info("Clicked on appointment details");
    }

    public void clickOnAddPatientsProfile() throws InterruptedException {
        this.clickonpatientprofile.click();
        Thread.sleep(8000);
        logger.info("Clicked on add patient profile");
    }

    public void clickOnAppointmentdetails() {
        this.clickonappointmentdetails.click();
        logger.info("Clicked on appointment details");
    }

    public void clickOnOverView() throws InterruptedException {
        this.clickonoverview.click();
        Thread.sleep(6000);
        logger.info("Clicked on overview");
    }

    public void clickOnReportsAndRecords() {
        this.clickReportsandRecords.click();
        logger.info("Clicked on reports and records");
    }

    public void clickOnviewmore() {
        this.clickonviewmore.click();
        logger.info("Clicked on view more to see the appointment details");
    }
    public void openuploadedrecords() {
        this.clickAddPatient.click();
        logger.info("Clicked on add patient button");
    }
    public void enterlogindetails() throws IOException {
        this.enterEmail.sendKeys(UtilityClass.readDataFromPropertyFile("username"));
        this.enterPassword.sendKeys(UtilityClass.readDataFromPropertyFile("password"));
        logger.info("Login to the application successfully");
    }
    public void enterprofiledetils() throws IOException {
        this.txtmobileNumber.sendKeys(UtilityClass.readDataFromPropertyFile("PatientMobileNumber"));
        this.textName.sendKeys(UtilityClass.readDataFromPropertyFile("PatientName"));
        this.textEmail.sendKeys(UtilityClass.readDataFromPropertyFile("Patientemailid"));
        logger.info("Entered patient details");
    }

    public void enterEmailDetails() throws IOException {
        this.txtmobileNumber.sendKeys(UtilityClass.readDataFromPropertyFile("PatientMobileNumber"));
        this.textName.sendKeys(UtilityClass.readDataFromPropertyFile("PatientName"));
    }
    public void enterMobileNumber() throws IOException {
        textName.sendKeys(UtilityClass.readDataFromPropertyFile("PatientMobileNumber"));
        textEmail.sendKeys(UtilityClass.readDataFromPropertyFile("PatientMobileNumber"));
        logger.info("Add patient without mobile number");
    }
    public void enterNameDetails() throws IOException {
        txtmobileNumber.sendKeys(UtilityClass.readDataFromPropertyFile("PatientMobileNumber"));
        textEmail.sendKeys(UtilityClass.readDataFromPropertyFile("Patientemailid"));
        logger.info("Add patient without name");
    }

    public void verifyName() throws IOException {
        String actualnameerror = this.withoutName.getText();
        if (actualnameerror.equals(UtilityClass.readDataFromPropertyFile("chatscreen")) ){
            logger.info("actual and expected error messages are matched for name field");
        }
        else{
            logger.info("actual and expected error messages are not matched for name field");
        }
    }

    public void verifyEmail() throws IOException {
        String actualemailerror = this.withoutEmail.getText();
        if (actualemailerror.equals(UtilityClass.readDataFromPropertyFile("withoutemail")) ){
            logger.info("actual and expected error messages are matched for email field");
        }
        else{
            logger.info("actual and expected error messages are not matched for email field");
        }
    }

    public void verifyMobileNum() throws IOException {
        String mobilenum = this.withoutPhoneNum.getText();
        if (mobilenum.equals(UtilityClass.readDataFromPropertyFile("withoutmobilenumber")) ){
            logger.info("actual and expected error messages are matched for mobile field");
        }
        else{
            logger.info("actual and expected error messages are not matched for mobile field");
        }
    }

    public void invalidEmailId() throws IOException {
        String invalidemail = this.invalidEmail.getText();
        if (invalidemail.equals(UtilityClass.readDataFromPropertyFile("Invalidemail")) ){
            logger.info("actual and expected error messages are matched for emailid");
        }
        else{
            logger.info("actual and expected error messages are not matched for emailid");
        }
    }

    public void invalidephnnum() throws IOException {
        String invalidphnnum = this.invalidMobNum.getText();
        if (invalidphnnum.equals(UtilityClass.readDataFromPropertyFile("InvalidPhoneNumber")) ){
            logger.info("actual and expected error messages are matched for mobilenum");
        }
        else{
            logger.info("actual and expected error messages are not matched for mobilenum");
        }
    }
    public void errorMessageForNameField() throws IOException {
        String namefielderrormsg = this.invalidMobNum.getText();
        if (namefielderrormsg.equals(UtilityClass.readDataFromPropertyFile("Errormessagefornamefield")) ){
            logger.info("actual and expected error messages are matched for namefield");
        }
        else{
            logger.info("actual and expected error messages are not matched for namefield");
        }
    }

    public void errorMessageForMobileNumber() throws IOException {
        String namefielderrormsg = this.invalidMobNum.getText();
        if (namefielderrormsg.equals(UtilityClass.readDataFromPropertyFile("Errormessageformobilenumfield")) ){
            logger.info("actual and expected error messages are matched for namefield");
        }
        else{
            logger.info("actual and expected error messages are not matched for namefield");
        }
    }
    public void withoutEnterPatientDetails() throws IOException {
        String patientdetails = this.invalidMobNum.getText();
        if (patientdetails.equals(UtilityClass.readDataFromPropertyFile("withoutname")) ){
            logger.info("actual and expected error messages are matched");
        }
        else{
            logger.info("actual and expected error messages are not matched");
        }
    }
    public void userAlreadyExistingMessage() throws IOException {
        this.clickOk.click();
    }

    public void enterInvalidEmail() throws IOException {
        textEmail.sendKeys(UtilityClass.readDataFromPropertyFile("Invalidemailid"));
        logger.info("Entered invalid email");
    }
    public void enterInvalidMobileNumber() throws IOException {
        txtmobileNumber.sendKeys(UtilityClass.readDataFromPropertyFile("Invalidmobnum"));
        logger.info("Entered invalid mobile number");
    }

    public void enterInvalidName() throws IOException {
        txtmobileNumber.sendKeys(UtilityClass.readDataFromPropertyFile("Invalidname"));
        logger.info("Entered invalid name");
    }
    public void enterInvalidNumber() throws IOException {
        txtmobileNumber.sendKeys(UtilityClass.readDataFromPropertyFile("Invalidphonenum"));
        logger.info("Entered invalid phone number");
    }
    public void clickOnPatientNameInPatients() throws InterruptedException {
        Thread.sleep(2000);
        patientNameFromList.click();
        logger.info("Clicked on patient and can see details of that patient");
    }
}
