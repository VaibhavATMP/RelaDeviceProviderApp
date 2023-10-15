package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BackGround;
import utils.UtilityClass;

import java.util.List;

import static steps.BackGround.driver;

public class SettingsSchedule
{
    private boolean flag;

    public SettingsSchedule(AndroidDriver driver) throws InterruptedException {Thread.sleep(3000);
        driver= BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public static Logger logger= LogManager.getLogger(SettingsSchedule.class);
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Schedules']") private WebElement scheduleOptionInSetting;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Schedules']") private WebElement schedulePageTitle;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")private WebElement datePickerOKButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Submit']") private WebElement submitScheduleSetting;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OK']")private WebElement OkPopupForSubmitScheduleSetting;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Time is overlaping'][1]") private WebElement errorMsgForOverlapTiming;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Select clinic'])[2]") private WebElement errorMsgForClinic;

    @AndroidFindBy(xpath = "((//android.widget.ScrollView//android.view.ViewGroup//android.view.ViewGroup)[1]//android.view.ViewGroup)[7]//android.view.ViewGroup[1]")
    private WebElement editMondaySchedule;

    @AndroidFindBy(xpath = "((//android.widget.ScrollView//android.view.ViewGroup//android.view.ViewGroup)[1]//android.view.ViewGroup)[7]//android.view.ViewGroup[2]")
    private WebElement deleteScheduleMonday;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Alteast One Default Schedule Required ']") private WebElement warningMsgAltlesastOne;


    public void clickOnSchedule()
    {
        UtilityClass.implicitlyWait(driver,10);
        this.scheduleOptionInSetting.click();
        logger.info("Clicked on Schedule option in setting page.");
    }

    public void verifyUserLandedOnDefaultSchedulePage()
    {
        logger.info("User landed on Schedule Page and Title is: "+schedulePageTitle.getText());
    }
    public void clickAndSetClinic(int dayNumber,String setClinicName) throws InterruptedException {
        Thread.sleep(3000);
        WebElement clinicFieldAccordingtoDay=driver.findElement(By.xpath(("(//android.widget.TextView[@text='Select clinic'])["+dayNumber+"]")));
        clinicFieldAccordingtoDay.click();
        logger.info("Clicked on Select clinic Dropdown");
        Thread.sleep(3000);
       List< WebElement> clinics =driver.findElements(By.xpath("(//android.view.ViewGroup[@index='0'])[6]//android.widget.TextView"));
       for(WebElement clinic:clinics)
       {
           if(clinic.getText().equals(setClinicName))
           {
               clinic.click();
               logger.info("Clinic selected successfully.");
               break;
           }
       }
    }
    public void clickStartTime(int dayNumber) throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> startDateDays = driver.findElements(By.xpath("((//android.view.ViewGroup[@index='0'])[15]//android.view.ViewGroup//android.widget.TextView[@text='Select start time'])[" + dayNumber + "]"));
        for (WebElement startDateDay : startDateDays) {
            startDateDay.click();
            break;
        }
        String currentHr = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='android:id/numberpicker_input'])[1]")).getText();
        String currentMinutes = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='android:id/numberpicker_input'])[2]")).getText();
        String currentAmPm = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='android:id/numberpicker_input'])[3]")).getText();
        WebElement currentHrElement = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='android:id/numberpicker_input'])[1]"));
        logger.info("Clicked on Start Time and Selected Time is:"+currentHr+":"+currentMinutes+" "+currentAmPm);


    }
    public void clickEndTime(int dayNumber) throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> endTimeDays = driver.findElements(By.xpath("((//android.view.ViewGroup[@index='0'])[15]//android.view.ViewGroup//android.widget.TextView[@text='Select end time'])[" + dayNumber + "]"));
        for (WebElement endTimeDay : endTimeDays) {
            endTimeDay.click();
            break;
        }
        String currentHr = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='android:id/numberpicker_input'])[1]")).getText();
        String currentMinutes = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='android:id/numberpicker_input'])[2]")).getText();
        String currentAmPm = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='android:id/numberpicker_input'])[3]")).getText();
        WebElement currentHrElement = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='android:id/numberpicker_input'])[1]"));
        logger.info("Clicked on End Time and Selected Time is:"+currentHr+":"+currentMinutes+" "+currentAmPm);
    }
    public void clickOnAddIcon(int dayNumber) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("((//android.view.ViewGroup[@index='0'])[15]//android.view.ViewGroup[5])["+dayNumber+"]")).click();
    }
    public void setDefaultScheduleForMonday() throws InterruptedException {
      clickAndSetClinic(1,"Vaibhav Clinic");
      clickStartTime(1);
        Thread.sleep(3000);
        this.datePickerOKButton.click();
      clickEndTime(1);
        Thread.sleep(3000);
      this.datePickerOKButton.click();
      this.clickOnAddIcon(1);
        Thread.sleep(3000);
       this.submitScheduleSetting.click();
        Thread.sleep(3000);
       this.OkPopupForSubmitScheduleSetting.click();
    }
    public void setDefaultScheduleForTuesday() throws InterruptedException {
        clickAndSetClinic(2,"Vaibhav Clinic");
        clickStartTime(2);
        Thread.sleep(3000);
        this.datePickerOKButton.click();
        clickEndTime(2);
        Thread.sleep(3000);
        this.datePickerOKButton.click();
        this.clickOnAddIcon(2);
        Thread.sleep(3000);
        this.submitScheduleSetting.click();
        Thread.sleep(3000);
        this.OkPopupForSubmitScheduleSetting.click();
    }
    public void verifyOverlappingSchedule() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.scrollDownCustom(driver,0.7,0.2);
        logger.info("User allready have schedule from 8Am-8Pm");
        Thread.sleep(5000);
        clickAndSetClinic(1,"Vaibhav Clinic");
        clickStartTime(1);
        Thread.sleep(3000);
        this.datePickerOKButton.click();
        clickEndTime(1);
        Thread.sleep(3000);
        this.datePickerOKButton.click();
        this.clickOnAddIcon(1);
        Thread.sleep(3000);
        logger.info("Error Message when Timing is Overlapping: "+this.errorMsgForOverlapTiming.getText());

    }

    public void scheduleWithoutClinic() throws InterruptedException {
        clickStartTime(1);
        Thread.sleep(3000);
        this.datePickerOKButton.click();
        clickEndTime(1);
        Thread.sleep(3000);
        this.datePickerOKButton.click();
        this.clickOnAddIcon(1);
        Thread.sleep(3000);
        logger.info("Error message when user try to add schedule without clinic is: "+this.errorMsgForClinic.getText());

    }

    public void deleteAtleastOneScheduleMonday() throws InterruptedException {
        Thread.sleep(3000);
        this.deleteScheduleMonday.click();
        Thread.sleep(2000);
        logger.info("On click on delete for only one shcedule showing warning popup: "+this.warningMsgAltlesastOne.getText());
        Thread.sleep(3000);
        this.OkPopupForSubmitScheduleSetting.click();
    }

    public void editDefaultSchedule() throws InterruptedException {
        Thread.sleep(3000);
        this.editMondaySchedule.click();
        logger.info("Clicked on edit icon");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//android.view.ViewGroup[@index='1'])[4]")).click();
        driver.findElement(By.xpath("(//android.widget.ScrollView[@content-desc='undefined flatlist']//android.view.ViewGroup[1])[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//android.view.ViewGroup[@index='4'])[1]")).click();
        this.datePickerOKButton.click();
        logger.info("Start Time edited successfully.");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//android.view.ViewGroup[@index='5'])")).click();
        this.datePickerOKButton.click();
        logger.info("End Time edited successfully.");
        Thread.sleep(3000);
        this.clickOnAddIcon(1);
        Thread.sleep(3000);
        this.submitScheduleSetting.click();
        Thread.sleep(3000);
        this.OkPopupForSubmitScheduleSetting.click();
        logger.info("Clicked on submit and Ok. Schedule Saved Successfully.");
    }

    public void deleteScheduleMoreThanOne() throws InterruptedException {
        Thread.sleep(3000);
      this.deleteScheduleMonday.click();
        Thread.sleep(3000);
        logger.info("Schedule deleted successfully.");
        this.submitScheduleSetting.click();
        Thread.sleep(3000);
        this.OkPopupForSubmitScheduleSetting.click();
        logger.info("Clicked on submit and Ok. Schedule Saved Successfully.");
    }
}
