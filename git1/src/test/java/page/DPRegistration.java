package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BackGround;
import utils.UtilityClass;

import java.io.IOException;

public class DPRegistration {

    private String FirstName;
    private String LastName;
    private String emailId;
    private String phoneNumber;
    private String password;
    private String confirmPassword;

    Logger logger=LogManager.getLogger(DPRegistration.class);

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Register']")
    private WebElement signup;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='First Name']")
    private WebElement txtfirstname;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Last Name']")
    private WebElement txtlastname;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email']")
    private WebElement txtemail;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Mobile']")
    private WebElement txtphoneNumber;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='OTP']")
    private WebElement txtotp;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='password']")
    private WebElement txtpassword;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='confirm password']")
    private WebElement txtconfirmpassword;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Get OTP']")
    private WebElement clickgetOTP;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='OTP']")
    private WebElement enterotp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
    private WebElement submit;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
    private WebElement register;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private WebElement clickok;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Register here']")
    private WebElement registerhere;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Email is invalid']")
    private WebElement emailerrormessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter 10 digit mobile number']")
    private WebElement mobileerrormessage;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getEmailId(){
        return emailId;
    }

    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public DPRegistration(AppiumDriver driver) {
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clicksignup(){
        this.signup.click();
    }
    public void clickgetotp(){
        this.clickgetOTP.click();
    }


    public void enterotp(){
        this.enterotp.click();
    }

    public void clicksubmit(){
        this.submit.click();
    }

    public void clickregister(){
        this.register.click();
        logger.info("Successfully clicked on register");
    }

    public void clickregisterhere1(){
        this.registerhere.click();
        logger.info("clicked on registration link successfully");
    }

    public void clickok(){
        this.clickok.click();
    }
    public void enteruserregisterdetails() throws IOException {
        this.txtfirstname.sendKeys(UtilityClass.readDataFromPropertyFile("manogna"));
        this.txtlastname.sendKeys(UtilityClass.readDataFromPropertyFile("kondapaneni"));
        this.txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("manogna.kondapaneni@archents.com"));
        this.txtphoneNumber.sendKeys(UtilityClass.readDataFromPropertyFile("7893295960"));
        logger.info("Added Register details Successfully");
    }
    public void enterregister() throws IOException {
        this.txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("Archents@123"));
        this.txtconfirmpassword.sendKeys(UtilityClass.readDataFromPropertyFile("Archents@123"));
        logger.info("Registration Password details");
    }

    public void invalidemailformat() throws IOException, InterruptedException {
        Thread.sleep(5000);
        this.txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("invalidemail"));
        logger.info("invalid email");
    }

    public void verifyemailformat() throws IOException {
        String actualemailerror = this.emailerrormessage.getText();
        if (actualemailerror.equals(UtilityClass.readDataFromPropertyFile("expectedemailerror")) ){
            logger.info("actual and expected error messages are matched");
        }
        else{
            logger.info("actual and expected error messages are not matched");
        }

    }

    public void emailformat() throws IOException {
        this.txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("incorrectemail"));
        logger.info("email is incorrect");
    }
    public void invalidemailerror() throws IOException {
        this.txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("invalidemailid"));
         logger.info("Entered emaild is not valid");
    }
    public void wrongemail() throws IOException {
        this.txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("errormessage"));
         logger.info("Password details");
    }
    public void wrongemailformat() throws IOException {
        this.txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("invalidemailformat"));
            logger.info("Email format is invalid");
    }
    public void incorrectemail() throws IOException {
        this.txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("incorrectemailformat"));
           logger.info("Password details");
    }

    public void invalidmobilenumber() throws IOException {
        this.txtphoneNumber.sendKeys(UtilityClass.readDataFromPropertyFile("invalidmobile"));
        logger.info("Password details");
    }
    public void mobilefielderror() throws IOException {
            String actualmobilevalidationerror = this.mobileerrormessage.getText();
            if (actualmobilevalidationerror.equals(UtilityClass.readDataFromPropertyFile("expectedmobilenumbererror")) ){
                logger.info("actual and expected error messages are matched for mobile field");
            }
            else{
                logger.info("actual and expected error messages are not matched mobile field");
            }

        }

    public void firstname() throws IOException {
        this.txtfirstname.sendKeys(UtilityClass.readDataFromPropertyFile("firstname"));
        logger.info("firstname");
    }
    public void firstnameerror() throws IOException {
        String firstnamevalidation = this.mobileerrormessage.getText();
        if (firstnamevalidation.equals(UtilityClass.readDataFromPropertyFile("firstnamevalidation")) ){
            logger.info("actual and expected error messages are matched for firstname");
        }
        else{
            logger.info("actual and expected error messages are not matched firstname");
        }

    }
    public void lastname() throws IOException {
        this.txtlastname.sendKeys(UtilityClass.readDataFromPropertyFile("lastname"));
        logger.info("lastname");
    }

    public void lastnameerror() throws IOException {
        String lastnamevalidation = this.mobileerrormessage.getText();
        if (lastnamevalidation.equals(UtilityClass.readDataFromPropertyFile("lastnamevalidation")) ){
            logger.info("actual and expected error messages are matched for lastname");
        }
        else{
            logger.info("actual and expected error messages are not matched lastname");
        }
    }

//    public void firstnamefield() throws IOException {
//        this.txtfirstname.sendKeys(Utilityclass.readDataFropPropertyFile("firstname1"));
//        logger.info("Password details");
//    }
//    public void invalidfirstname() throws IOException {
//        this.txtfirstname.sendKeys(Utilityclass.readDataFropPropertyFile("Archents@123"));
//        logger.info("Password details");
//    }
//    public void lastnamefield() throws IOException {
//        this.txtlastname.sendKeys(Utilityclass.readDataFropPropertyFile("lastname1"));
//        logger.info("Password details");
//    }
//    public void invalidlastname() throws IOException {
//        this.txtlastname.sendKeys(Utilityclass.readDataFropPropertyFile("Archents@123"));
//        logger.info("Password details");
//    }

    public void passwordmissmatch() throws IOException {
        this.txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("password1"));
        this.txtconfirmpassword.sendKeys(UtilityClass.readDataFromPropertyFile("confirmpassword"));
        logger.info("Password details");
    }

    public void passworderrormessage() throws IOException {
        this.txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("Archents@123"));
        logger.info("Password details");
    }

    public void passwordvalidation() throws IOException {
        this.txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("passwordvalidation"));
        logger.info("Password details");
    }

    public void passwordvalidationerror() throws IOException {
        this.txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("Archents@123"));
        logger.info("Password details");
    }
}
