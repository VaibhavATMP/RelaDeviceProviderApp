package page;

import io.appium.java_client.AppiumBy;
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
import java.util.List;

import static steps.BackGround.driver;

public class DPAppointmentHistory {
    private String MobileNumber;
    private String Name;
    private String Email;
    private String phoneNumber;


    Logger logger = LogManager.getLogger(DPAppointmentHistory.class);
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Appointments'])[1]")
    private WebElement clickonapphistory;

    @AndroidFindBy(accessibility = "header_goback")
    private WebElement clickbackarrow;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Date']")
    private WebElement clickonpatientname;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Today Appointments']")
    private WebElement clickontodayappointment;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Filters']")
    private WebElement clickonfiltericon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Reschedule']")
    private WebElement clickonreschedule;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@index='0'])[34]")
    private WebElement clickreschtime;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter Reason']")
    private WebElement reasonforreschedule;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Submit']")
    private WebElement clicksubmit;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cancel']")
    private WebElement clickoncancel;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Reason for cancel']")
    private WebElement enterreasonforcancel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Yes, Cancel']")
    private WebElement clickonyescancel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='COMPLETED']")
    private WebElement checkcompletedappointments;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Prescription']")
    private WebElement clickonprescription;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@index='0'])[2]")
    private WebElement clickonvideo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='No Appointments Available']")
    private WebElement noappointments;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='2'])[4]")
    private WebElement clickDropdownAppointment;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private List<WebElement> fliterAppointmentsList;

    @AndroidFindBy(xpath ="(//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='4'])[3]")
    private WebElement clinicAppointments;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private List<WebElement> filterClinicList;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Video Consultation']")
    private WebElement clickvideoconsultation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='In Clinic']")
    private WebElement selectinclinicappointments;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='12']")
    private WebElement selectenddate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Manogna']")
    private WebElement selectclinic;

    public DPAppointmentHistory(AndroidDriver driver) {
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickonapphistory() throws InterruptedException {
        Thread.sleep(5000);
        this.clickonapphistory.click();
        Thread.sleep(7000);
    }
    public void clickbackarrow() throws InterruptedException {
        Thread.sleep(10000);
    this.clickbackarrow.click();
    logger.info("Clicked On Back");
    Thread.sleep(5000);
    }

    public void clickonpatientname() {
        this.clickonpatientname.click();
    }

    public void Todayappointment() {
        this.clickontodayappointment.click();
        logger.info("Clicked on today's appointments");
    }

    public void Filter() {
        this.clickonfiltericon.click();
        logger.info("clicked on filter icon");
    }

    public void clickreschedule() {
        this.clickonreschedule.click();
        logger.info("clicked on Reschedule button");
    }

    public void selectrescheduletime() throws InterruptedException {
        Thread.sleep(5000);
        this.clickreschtime.click();
        logger.info("selected reschedule time");
    }

    public void reschedulereason() throws IOException, InterruptedException {
        Thread.sleep(5000);
//        String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Evening\").instance(0))";
//        driver.ByAndroidUIAutomator(scrollElement).click();
//     driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Enter Reason\").instance(0))")).click();
       UtilityClass.scrollDownCustom(driver,0.8,0.1);
       Thread.sleep(5000);
             driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Enter Reason\").instance(0))")).sendKeys("Test");
//        UtilityClass.scrollDownCustom(driver,0.8,0.1);
        Thread.sleep(2000);
        this.reasonforreschedule.sendKeys(UtilityClass.readDataFromPropertyFile("reasonforreschedule"));
        logger.info("Reason for Reschedule entered successfully.");
    }

    public void clickonsubmit() {
        this.clicksubmit.click();
        logger.info("click on submit");
    }
    public void clickcancel() {
        this.clickoncancel.click();
        logger.info("click on cancel");
    }

    public void cancelreason() throws IOException {
        this.enterreasonforcancel.sendKeys(UtilityClass.readDataFromPropertyFile("reasonforcancelappointment"));
        logger.info("enter appointment cancel reason");
    }

    public void completedappointments() {
        this.checkcompletedappointments.click();
        logger.info("clicked on completed appointments");
    }

    public void checkprescription() {
        this.clickonprescription.click();
        logger.info("Prescription clicked");
    }

    public void videoicon() {
        this.clickonvideo.click();
        logger.info("video icon clicked");
    }
    public void dropdowninfilterscreen() {
        this.clickDropdownAppointment.click();
        logger.info("dropdown clicked");
    }
    public void filterbookedappointments(String FilterAppointments) throws InterruptedException {
        Thread.sleep(2000);
        this.clickDropdownAppointment.click();
        Thread.sleep(2000);
        for(WebElement appointments:fliterAppointmentsList)
        {
            if(appointments.getText().contains(FilterAppointments))
            {
                appointments.click();
                break;
            }
        }
    }

    public void filtervideoconsultations() {
        this.clickvideoconsultation.click();
        logger.info("clicked on video icon");
    }
    public void filterinclinicconsultation() {
        this.selectinclinicappointments.click();
        logger.info("clicked in clinic consultation");
    }
    public void filterappointmentswithclinic(String filterClinicAppointments) throws InterruptedException {
        Thread.sleep(2000);
        this.clinicAppointments.click();
        Thread.sleep(2000);
        for(WebElement clinic:filterClinicList)
        {
            if(clinic.getText().contains(filterClinicAppointments))
            {
                clinic.click();
                break;
            }
        }

    }

    public void noappointments() throws IOException {
        String firstnamevalidation = this.noappointments.getText();
        if (firstnamevalidation.equals(UtilityClass.readDataFromPropertyFile("defaultmessage"))) {
            logger.info("actual and expected error messages for noappointments");
        } else {
            logger.info("actual and expected error messages for noappointments");
        }
    }
}
