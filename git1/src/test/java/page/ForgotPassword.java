package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BackGround;
import utils.UtilityClass;

import java.io.IOException;

import static steps.BackGround.driver;

public class ForgotPassword
{ 
    public ForgotPassword(AndroidDriver driver)
    {
        driver= BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    Logger logger= LogManager.getLogger(ForgotPassword.class);
    @FindBy(xpath = "//android.widget.TextView[@text='Forgot Password ?']") private WebElement forgotPasswordButton;
    @FindBy(xpath = "//android.widget.EditText[@text='Mobile']") private WebElement forgotPassMobileField;
    @FindBy(xpath = "//android.widget.TextView[@text='Get OTP']") private WebElement forgotPassGetOTPButton;
    @FindBy(xpath = "//android.widget.EditText[@text='OTP']") private WebElement forgotPassOTPField;
    @FindBy(xpath = "(//android.widget.Button[@index='0'])[2]") private WebElement forgotPassSubmitButton;

    @FindBy(xpath = "//android.widget.EditText[@index='2']")private WebElement newPasswordField;

    @FindBy(xpath = "//android.widget.EditText[@index='5']")private WebElement confirmPasswordField;
    @FindBy(xpath = "(//android.widget.TextView[@index='0'])[1]")private WebElement viewNewPasswordButton;

    @FindBy(xpath = "(//android.widget.TextView[@index='0'])[2]")private WebElement viewConfirmPasswordButton;
    @FindBy(xpath = "//android.widget.TextView[@text='Submit']") private WebElement submitPasswordButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Ok']") private WebElement successfulPopupOKBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Mobile number cannot be blank']") private WebElement errorMsgForEmptyMobNoField;
    @FindBy(xpath = "//android.widget.TextView[@text='OTP cannot be blank']") private WebElement errorMsgForEmptyOTPField;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter password']") private WebElement errorMsgForEmptyNewPasswordField;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter Confirm password']") private WebElement errorMsgForEmptyConfirmPasswordField;

    public void verifyForgotPasswordClickable()
    {
        UtilityClass.implicitlyWait(driver,30);
        this.forgotPasswordButton.click();
        logger.info("Clicked on forgot password link");
        UtilityClass.explicitlyWait(this.forgotPassMobileField,driver,20);
        if(this.forgotPassMobileField.isDisplayed())
        {
            logger.info("User landed on forgot password and able to see mobile field to reset password");
        }
        else
        {
            logger.error("User not landed on forgot password page.Check forgot password is clicked or not.");
        }
    }

    public void enterMobNoAndOTPAndClickOnSubmit() throws IOException, InterruptedException {
        this.forgotPassMobileField.sendKeys(UtilityClass.readDataFromPropertyFile("MobNumber"));
        logger.info("Entered  Mobile number successfully.");
        Thread.sleep(3000);
        this.forgotPassGetOTPButton.click();
        logger.info("Clicked on Get OTP Button");
        Thread.sleep(10000);
        logger.info("Enter OTP Manually");
        Thread.sleep(3000);
        this.forgotPassSubmitButton.click();
        logger.info("Clicked on Submit Button Successfully.");
    }

    public void setNewPassword() throws IOException, InterruptedException {
      //UtilityClass.implicitlyWait(driver,20);
        Thread.sleep(2000);
      this.newPasswordField.sendKeys(UtilityClass.readDataFromPropertyFile("NewPassword"));
      this.viewNewPasswordButton.click();
        Thread.sleep(2000);
      this.confirmPasswordField.sendKeys(UtilityClass.readDataFromPropertyFile("ConfirmPassword"));
      this.viewConfirmPasswordButton.click();
        Thread.sleep(4000);
      this.submitPasswordButton.click();
      UtilityClass.explicitlyWait(this.successfulPopupOKBtn,driver,10);
      this.successfulPopupOKBtn.click();
      logger.info("Password changed successfully.");

    }

    public void clickOnSubmitWithoutFillingMobNoAndOTP()
    {
        UtilityClass.implicitlyWait(driver,10);
        this.forgotPassSubmitButton.click();
    }

    public void verifyErrorMessagesForEmptyMobNoAndOTP() throws IOException {
        UtilityClass.explicitlyWait(errorMsgForEmptyMobNoField,driver,10);
        String actualErrorMessageForEmptyMobNo=this.errorMsgForEmptyMobNoField.getText();
       String expectedErrorMessageForEmptyMobNo=UtilityClass.readDataFromPropertyFile("ExpectedErrorMsgForEmptyMobNoField");
       if(actualErrorMessageForEmptyMobNo.equals(expectedErrorMessageForEmptyMobNo))
       {
           logger.info("Actual and Expected Error Messages for Empty/Mandatory MobNo. field  are matched.");
       }
       else {
           logger.info("Actual and Expected Error Messages for Empty/Mandatory MobNo. field are different.");
       }
        UtilityClass.explicitlyWait(errorMsgForEmptyOTPField,driver,10);
       String actualErrorMessageForEmptyOTPField=this.errorMsgForEmptyOTPField.getText();
       String expectedErrorMsgForEmptyOTPField=UtilityClass.readDataFromPropertyFile("ExpectedErrorMsgForEmptyOTPField");
        if(actualErrorMessageForEmptyMobNo.equals(expectedErrorMessageForEmptyMobNo))
        {
            logger.info("Actual and Expected Error Messages for Empty/Mandatory OTP. field  are matched.");
        }
        else {
            logger.info("Actual and Expected Error Messages for Empty/Mandatory OTP. field are different.");
        }
    }

    public void clickOnSubmitWithoutFillingNewAndConfirmPassFields()
    {
        UtilityClass.implicitlyWait(driver,10);
        this.submitPasswordButton.click();
    }

    public void verifyErrorMsgsForEmptyNewAndConfirmPasswordFields() throws IOException {
        UtilityClass.explicitlyWait(errorMsgForEmptyNewPasswordField,driver,10);
        String actualErrorMessageForEmptyNewPass=this.errorMsgForEmptyNewPasswordField.getText();
        String expectedErrorMessageForEmptyNewPass=UtilityClass.readDataFromPropertyFile("ExpectedErrorMsgForEmptyNewPasswordField");
        if(actualErrorMessageForEmptyNewPass.equals(expectedErrorMessageForEmptyNewPass))
        {
            logger.info("Actual and Expected Error Messages for Empty/Mandatory New Password field  are matched.");
        }
        else {
            logger.info("Actual and Expected Error Messages for Empty/Mandatory New Password. field are different.");
        }
        UtilityClass.explicitlyWait(errorMsgForEmptyConfirmPasswordField,driver,10);
        String actualErrorMessageForEmptyConfirmPassField=this.errorMsgForEmptyConfirmPasswordField.getText();
        String expectedErrorMsgForEmptyConfirmPassField=UtilityClass.readDataFromPropertyFile("ExpectedErrorMsgForEmptyConfirmPasswordField");
        if(actualErrorMessageForEmptyConfirmPassField.equals(expectedErrorMsgForEmptyConfirmPassField))
        {
            logger.info("Actual and Expected Error Messages for Empty/Mandatory Confirm Password field  are matched.");
        }
        else {
            logger.info("Actual and Expected Error Messages for Empty/Mandatory Confirm Password field are different.");
        }
    }


}
