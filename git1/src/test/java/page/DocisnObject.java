
package page;


//import io.appium.java_client.AppiumBy;
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

import static steps.BackGround.driver;


public class DocisnObject {
    
    private String email;
    private String password;

    Logger logger = LogManager.getLogger(DocisnObject.class);


    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Docisn Plus']")
    private WebElement clickdocisn;


    @AndroidFindBy(xpath= "//android.widget.TextView[@text='SIGN IN']")
    private WebElement clicksignin;


    @AndroidFindBy(xpath= "//android.widget.EditText[@index='2']")
    private WebElement txtemail;


    @AndroidFindBy(xpath= "//android.widget.EditText[@text='password']")
    private WebElement txtpassword;


    @AndroidFindBy(xpath= "//android.widget.Button[@index='0']")
    private WebElement clicklogin;

    @AndroidFindBy(xpath= "(//android.widget.Button[@index='0'])[1]")
    private WebElement tryToClicklogin;


    @AndroidFindBy(xpath= "//android.view.ViewGroup[@resource-id='home_open_menu_id']")
    private WebElement menuIcon;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Book Appointment']")
    private WebElement bookAptIcon;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='Mobile']")
    private WebElement patientMobNum;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Manoullasini Gadag - Self']")
    private WebElement selPatient;

    @AndroidFindBy(xpath= "//android.widget.ImageView[@index='1']")
    private WebElement clickClinic;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Healthcare Clinic']")
    private WebElement selClinic;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Select Time']")
    private WebElement clickTimeSlot;

    @AndroidFindBy(xpath= "//android.view.ViewGroup[@index='0']")
    private WebElement selTimeSlot;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Proceed To Pay']")
    private WebElement clickProceedtopay;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Preview Payment']")
    private WebElement clickPreviewPayment;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Amount Due (INR)']")
    private WebElement clickSend;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='OK']")
    private WebElement clickOk;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Reschedule']")
    private WebElement reschIcon;

    @AndroidFindBy(xpath= "(//android.widget.TextView[@index='0'])[34]")
    private WebElement reschTimeSlot;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='Enter Reason']")
    private WebElement enterReschReason;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Submit']")
    private WebElement submitResch;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='OK']")
    private WebElement reschOk;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Email is invalid']")
    private WebElement errMsgForemail;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid Username or Password']")
    private WebElement errMsgForPwd;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='User Not Found']")
    private WebElement unregisteredUNErrMsg;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
    private WebElement clickSettings;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Account']")
    private WebElement clickAccounts;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Add']")
    private WebElement clickAdd;

    @AndroidFindBy(xpath="//android.widget.EditText[@text='Write reason']")
    private WebElement reasonForBlockDate;

    @AndroidFindBy(xpath="//android.view.ViewGroup[@index='5']")
    private WebElement startDateForBlockDate;

    @AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
    private WebElement selBlockDatestartDate;

    @AndroidFindBy(xpath="//android.view.ViewGroup[@index='6']")
    private WebElement endDateForBlockDate;

    @AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
    private WebElement selBlockDateEndDate;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Select start time']")
    private WebElement BDstartTime;

    @AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
    private WebElement selBDstartTime;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Select end time']")
    private WebElement BDEndTime;

    @AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
    private WebElement selBDEndTime;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Save']")
    private WebElement saveBlockDate;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='OK']")
    private WebElement blockDateOkBtn;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Add']")
    private WebElement clickAddBlockDate;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Remove']")
    private WebElement removeBlockDate;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='OK']")
    private WebElement okBtnInBlockdate;

    @AndroidFindBy(xpath="(//android.widget.TextView[@index='0'])[11]")
    private WebElement addTimeSlotInBlockdate;

    @AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']//android.view.ViewGroup[@index='12']//android.view.ViewGroup[2]")
    private WebElement deleteTimeSlotInBlockdate;

    @AndroidFindBy(xpath="(//android.widget.TextView[@index='0'])[13]")
    private WebElement editTimeSlotInBlockdate;

    @AndroidFindBy(xpath="(//android.view.ViewGroup[@index='0'])[17]//android.widget.EditText")
    private WebElement beforeAptTime;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='1 Day']")
    private WebElement selBeforeAptTime;

    @AndroidFindBy(xpath="((//android.view.ViewGroup[@index='1'])//android.widget.EditText)[3]")
    private WebElement afterAptTime;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='3 Days']")
    private WebElement selAfterAptTime;

    @AndroidFindBy(xpath="//android.widget.ImageView[@index='1']")
    private WebElement aptDuration;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='30 Minutes']")
    private WebElement selAptDuration;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Clinical']")
    private WebElement clickClinical;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Clinic']")
    private WebElement selClinicInClinicalSettings;

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public DocisnObject(AndroidDriver driver) {
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void clickdocisn() {
        this.clickdocisn.click();

    }


    public void clicksigninbutton() throws InterruptedException{
        this.clicksignin.click();
        Thread.sleep(5000);
    }


    public void clicklogin() throws InterruptedException{
        this.clicklogin.click();
        logger.info("Logged in successfully");
    }


    public void loginData() throws IOException {
        UtilityClass.implicitlyWait(driver, 60);
        txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("username"));
        txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("password"));

    }

    public void clickMenu() {
        UtilityClass.implicitlyWait(driver, 60);
        menuIcon.click();
    }

    public void clickBookApt() {
        UtilityClass.implicitlyWait(driver, 60);
        bookAptIcon.click();
    }

    public void bookApt() throws InterruptedException {
        UtilityClass.implicitlyWait(driver, 60);
        patientMobNum.sendKeys("7022162195");
        selPatient.click();
        clickClinic.click();
        selClinic.click();
        clickTimeSlot.click();
        Thread.sleep(3000);
        selTimeSlot.click();
//        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\\\"Proceed To Pay\\\").instance(0))")).click();
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Proceed To Pay\").instance(0))").click();
        clickProceedtopay.click();
        UtilityClass.implicitlyWait(driver, 60);
//        Thread.sleep(8000);
//        driver.findElement(new AppiumBy.ByAndroidUIAutomator("")).click();
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Preview Payment\").instance(0))").click();
        clickPreviewPayment.click();
        Thread.sleep(8000);
        clickSend.click();
        clickOk.click();
    }

    public void validEmail() throws IOException, InterruptedException {
        UtilityClass.implicitlyWait(driver, 60);
        txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("username"));
        txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("wrongPWD"));
        logger.info("Entered valid username and wrong password");
        clicklogin.click();
        Thread.sleep(2000);
        System.out.println(errMsgForPwd.getText());
    }

    public void invalidEmail() throws IOException, InterruptedException {
        UtilityClass.implicitlyWait(driver, 60);
        txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("invalidUN"));
        txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("password"));
        Thread.sleep(2000);
        logger.info("Entered invalid email with right password");
        clicklogin.click();
        Thread.sleep(2000);
        System.out.println(errMsgForemail.getText());
    }

    public void onlyEmail() throws IOException, InterruptedException {
        Thread.sleep(3000);
        txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("username"));
        logger.info("Entered only Email");
        String msg = String.valueOf(tryToClicklogin.isEnabled());
        if (tryToClicklogin.isEnabled()) {
            System.out.println(msg);
            System.out.println("Login is enabled");
        }
        else{
            System.out.println(msg);
            System.out.println("Login is disabled");
        }
    }

    public void onlyPassword() throws IOException, InterruptedException {
        Thread.sleep(3000);
        txtemail.clear();
        logger.info("Email cleared");
        Thread.sleep(2000);
        txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("password"));
        logger.info("Entered only Password");
        String msg = String.valueOf(tryToClicklogin.isEnabled());
        if (tryToClicklogin.isEnabled()) {
            System.out.println(msg);
            System.out.println("Login is enabled");
        }
        else{
            System.out.println(msg);
            System.out.println("Login is disabled");
        }

    }

    public void reschIcon() throws InterruptedException {
        Thread.sleep(20000);
//        UtilityClass.implicitlywait(driver, 1000);
        reschIcon.click();
        logger.info("Reschedule icon is clicked");
    }

    public void reschedule() throws InterruptedException {
        Thread.sleep(15000);
        this.reschTimeSlot.click();
        Thread.sleep(6000);
        logger.info("Time Slot is clicked");
        UtilityClass.scrollDown(driver);
        Thread.sleep(2000);
        enterReschReason.sendKeys("Not available");
        submitResch.click();
        Thread.sleep(6000);
        reschOk.click();
        Thread.sleep(2000);
    }

    public void unregisteredUserLogin() throws IOException, InterruptedException {
        UtilityClass.implicitlyWait(driver,80);
        txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("URUserName"));
        txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("URPwd"));
        clicklogin.click();
        Thread.sleep(2000);
        System.out.println(unregisteredUNErrMsg.getText());
    }

    public void clickSettings() throws InterruptedException {
        clickSettings.click();
        Thread.sleep(2000);
    }

    public void clickAccounts() throws InterruptedException {
        clickAccounts.click();
        Thread.sleep(8000);
    }

    public void clickAdd() throws InterruptedException {
        clickAdd.click();
        Thread.sleep(2000);
    }

    public void clickAddMultipleTimes() throws InterruptedException {
        clickAdd.click();
        Thread.sleep(2000);
        clickAdd.click();
    }

    public void addBlockDate() {
        UtilityClass.implicitlyWait(driver, 180);
        reasonForBlockDate.sendKeys("Not Available");
        startDateForBlockDate.click();
        selBlockDatestartDate.click();
        endDateForBlockDate.click();
        selBlockDateEndDate.click();
        BDstartTime.click();
        selBDstartTime.click();
        BDEndTime.click();
        selBDEndTime.click();
        saveBlockDate.click();
        blockDateOkBtn.click();
    }

    public void removeBlockDate() throws InterruptedException {
        Thread.sleep(2000);
        removeBlockDate.click();
        Thread.sleep(2000);
        saveBlockDate.click();
        Thread.sleep(2000);
        okBtnInBlockdate.click();
    }

    public void addMulBlockDate() throws InterruptedException {
        Thread.sleep(5000);
        UtilityClass.implicitlyWait(driver, 180);
        clickAddBlockDate.click();
        reasonForBlockDate.sendKeys("Not Available");
        startDateForBlockDate.click();
        selBlockDatestartDate.click();
        endDateForBlockDate.click();
        selBlockDateEndDate.click();
        BDstartTime.click();
        selBDstartTime.click();
        BDEndTime.click();
        selBDEndTime.click();
        saveBlockDate.click();
        okBtnInBlockdate.click();
    }

    public void blockDateWithMulTimeSlots() {
        UtilityClass.implicitlyWait(driver, 180);
        reasonForBlockDate.sendKeys("Not Available");
        startDateForBlockDate.click();
        selBlockDatestartDate.click();
        endDateForBlockDate.click();
        selBlockDateEndDate.click();
        BDstartTime.click();
        selBDstartTime.click();
        BDEndTime.click();
        selBDEndTime.click();
        addTimeSlotInBlockdate.click();
        BDstartTime.click();
        selBDstartTime.click();
        BDEndTime.click();
        selBDEndTime.click();
        saveBlockDate.click();
        okBtnInBlockdate.click();
    }

    public void deleteTimeSlot() throws InterruptedException {
        Thread.sleep(3000);
        deleteTimeSlotInBlockdate.click();

    }

    public void editTimeSlot() throws InterruptedException {
        Thread.sleep(4000);
        editTimeSlotInBlockdate.click();
    }

    public void chatSettings() throws InterruptedException {
        Thread.sleep(3000);
        beforeAptTime.sendKeys("1");
        Thread.sleep(2000);
        selBeforeAptTime.click();
        afterAptTime.sendKeys("3");
        Thread.sleep(2000);
        selAfterAptTime.click();
        saveBlockDate.click();
        okBtnInBlockdate.click();
    }

    public void aptduration() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.implicitlyWait(driver, 120);
        aptDuration.click();
        selAptDuration.click();
        saveBlockDate.click();
        okBtnInBlockdate.click();
    }

    public void clickClinical() {
        clickClinical.click();
    }

    public void followUps() {
        UtilityClass.implicitlyWait(driver, 180);


    }
}
