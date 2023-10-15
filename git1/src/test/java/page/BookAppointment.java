package page;


import io.appium.java_client.AppiumBy;
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

import java.io.IOException;
import java.util.List;

import static steps.BackGround.driver;

public class BookAppointment
{

    public BookAppointment(AndroidDriver driver)
    {
        driver= BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    Logger logger= LogManager.getLogger(BookAppointment.class);
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Book Appointment']")private WebElement bookAppointmentBtnOnDashboard;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Mobile']")private WebElement mobileNoField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Patient Name']")private WebElement patientNameField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email']")private WebElement emailField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='7']")private WebElement emailFieldindex;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[14]//android.view.ViewGroup[@index='8']//android.view.ViewGroup[@index='1']//android.widget.TextView") private WebElement patientGenderFieldIndex;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='13']//android.widget.EditText[@index='1']")private WebElement patientAgeFieldIndex;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[14]//android.view.ViewGroup[@index='9']//android.view.ViewGroup[@index='1']//android.widget.TextView")private WebElement patientRelationFieldIndex;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='8']//android.view.ViewGroup//android.view.ViewGroup") private  WebElement patientGenderDrpDwnField;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")private List<WebElement> patientGenderList;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='9']//android.view.ViewGroup//android.widget.TextView") private  WebElement patientRelationDrpDwnField;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")private List<WebElement> patientRelationsList;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='13']//android.widget.EditText")private  WebElement patientAgeField;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='VaibhavHadpe - Self']")private WebElement patientName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ajay - Friend']")private WebElement familyMemberName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Other Relative']")private WebElement otherRealativeOption;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[16]")private WebElement clinicDrDwnBookApt;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])//android.widget.TextView")
    private  List<WebElement> clinicListBookApt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Time']")private WebElement selectTimeSlotField;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[20]")private WebElement selectTime;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Skip Payment']") private WebElement skipPaymentBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Send']")private WebElement sendBtnBillReciept;
    @AndroidFindBy(xpath = "//android.widget.Button//android.widget.TextView[@text='Ok']") private WebElement OkBtnConfirmationPopupBkApt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Inclinic']") private WebElement walkinType;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@index='1'])[1]") private WebElement selectedHospitalName;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='9']//android.view.ViewGroup)[2]")private WebElement rescheduleBtnOnAptCardsDashboard;
   @AndroidFindBy(xpath = "//android.widget.TextView[@text='Submit']")private WebElement submitBtnReschedule;
   @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='16']//android.widget.TextView") private WebElement rescheduleTimeSlot;
   @AndroidFindBy(xpath = "//android.widget.EditText[@index='6']") private WebElement reasonToReschedule;
   @AndroidFindBy(xpath = "//android.widget.EditText[@index='3']") private WebElement reasonToCancel;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Yes, Cancel']") private WebElement yesCancelButton;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='9']//android.view.ViewGroup)[3]")private WebElement cancelBtnOnAptCardsDashboard;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='9']//android.view.ViewGroup)[1]") private WebElement initiateAppointmentButton;
   @AndroidFindBy(xpath = "//android.widget.TextView[@text='Patient Screening']") private WebElement patientScreeningPageTitle;

   @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='8']//android.view.ViewGroup)[4]")private WebElement billingBtnOnDashboard;
   @AndroidFindBy(xpath = "//android.widget.TextView[@text='Send']") private WebElement sendBillRecieptBtn;
   @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preview Payment']") private WebElement previewPaymentBtn;
   @AndroidFindBy(xpath = "(//android.widget.TextView[@index='0'])[1]") private WebElement notificationIcon;
   @AndroidFindBy(xpath = "(//android.widget.ImageView[@index='0'])[1]")private  WebElement profileIconDashboard;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Notifications']") private WebElement titleOfNotificationPage;
    @AndroidFindBy(accessibility = "header_goback") private WebElement backfromNotifications;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@index='1'])[2]") private WebElement drProfileName;

   @AndroidFindBy(xpath = "//android.widget.TextView[@text='Time slot is required']") private WebElement errorMsgRescheduleWithoutTime;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Reason is required']") private WebElement errorMsgRescheduleWithoutReason;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='3'])[3]//android.view.ViewGroup//android.view.ViewGroup[@index='1']//android.widget.TextView") public List<WebElement> futureDatesRescheduleList;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Dismiss']")private WebElement dismissCancelApt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Succesfull ! ']")private WebElement succesfullPopup;

   @AndroidFindBy(xpath="(//android.view.ViewGroup[@index='0'])[16]//android.widget.TextView") private List<WebElement> patientNameList;

   @AndroidFindBy(xpath = "//android.widget.EditText[@index='23']") private WebElement symptompsFieldBkApt;

  @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0'])[2]//android.widget.TextView") private List<WebElement> symptompsList;

  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cancel']") private WebElement cancelBkAptProcess;

   @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile number cannot be blank']") private WebElement errorMsgForEmptyMobNoField;

   @AndroidFindBy(xpath = "//android.widget.TextView[@text='Name cannot be blank']")private  WebElement errorMsgForEmptyPatientName;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gender cannot be blank']")private  WebElement errorMsgForEmptyGender;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please select relationship']")private  WebElement errorMsgForEmptyRelation;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@bounds='[590,757][1038,967]']")private  WebElement errorMsgForEmptyAge;
   // @AndroidFindBy(xpath = "//android.widget.TextView[@index='16']") private WebElement errorMsgForEmptyAge;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Appointment time is required']")private  WebElement errorMsgWhenTimeNotSelected;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Current Appointment']") private WebElement textOnReschedulePage;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='3'])[3]//android.view.ViewGroup[@index='0']") private WebElement backwardButtonForWeekDaysReschedule;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='3'])[3]//android.view.ViewGroup[@index='2']") private WebElement forwardButtonForWeekDaysReschedule;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1'])[1]//android.widget.TextView[1]")
    private WebElement patientNameOnReschedulePage;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1'])[1]//android.widget.TextView[3]")
    private WebElement patientAgeOnReschedulePage;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1'])[1]//android.widget.TextView[5]")
    private WebElement patientGenderOnReschedulePage;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1'])[1]//android.widget.TextView[7]")
    private WebElement patientBookedDateOnReschedulePage;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1'])[1]//android.widget.TextView[9]")
    private WebElement patientAppointmentDateOnReschedulePage;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1'])[1]//android.widget.TextView[11]")
    private WebElement patientAptTimingOnReschedulePage;

    @AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.TextView)[1]")
    private WebElement patientNameOnAptCardDashboard;

    @AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.TextView)[2]")
    private WebElement patientAppointmentStatusDashboard;
    @AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.TextView)[3]")
    private WebElement patientGenderOnAptCardDashboard;
    @AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.TextView)[4]")
    private WebElement patientAgeOnAptCardDashboard;
    @AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.TextView)[6]")
    private WebElement patientsChiefComplaintOnAptCardDashboard;
    @AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.TextView)[7]")
    private WebElement aptDateOnAptCardDashboard;
    @AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.TextView)[8]")
    private WebElement aptTimingOnAptCardDashboard;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Ok']")
    private WebElement clickOkForReschedulingAppointment;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.TextView[@text='CANCEL APPOINTMENT']")
    private WebElement cancelAptpageText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OK']")
    private WebElement okPopupBtn;

    public void clickOnBookAppointmentDashboard() throws InterruptedException {
        //Thread.sleep(5000);
        this.bookAppointmentBtnOnDashboard.click();
        logger.info("Clicked on Book Appointment");
    }
    public void enterMobileNoAndSelectName(String enterMobNo,String enterPatientName) throws IOException, InterruptedException {
        enterMobNoAndSelectPatientNameFromList(enterMobNo,enterPatientName);
        Thread.sleep(2000);
        UtilityClass.scrollDownCustom(driver,0.7,0.4);
        this.selectTimeSlotField.click();
        Thread.sleep(1000);
        //this.selectTime.click();
        WebElement availableFirstTimeSlot=driver.findElement(By.xpath("((//android.widget.ScrollView[@index='0'])[2]//android.view.ViewGroup[@index='0'])[2]"));
        Thread.sleep(3000);
        availableFirstTimeSlot.click();
        logger.info("Time slot selected.");

    }
    public void clickOnSkipPayment() throws InterruptedException {
        Thread.sleep(3000);
       driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Later\").instance(0))")).click();
       UtilityClass.explicitlyWait(OkBtnConfirmationPopupBkApt,driver,10);
        this.OkBtnConfirmationPopupBkApt.click();
        logger.info("Clicked on skip Payment and Appointment Booked Successfully.");
        Thread.sleep(5000);
    }

    public void clickOnProceedToPay() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Pay\").instance(0))")).click();
        logger.info("Clicked on Proceed To Pay option.");
      Thread.sleep(4000);
        UtilityClass.scrollDown(driver);
        Thread.sleep(4000);
        this.previewPaymentBtn.click();
        logger.info("Clicked on Preview Payment");
      Thread.sleep(6000);
      logger.info("Clicked manually on send Button");
      //this.sendBtnBillReciept.click();
       //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Send\").instance(0))")).click();
       Thread.sleep(6000);
        this.OkBtnConfirmationPopupBkApt.click();
        logger.info("Paid amount and Appointment Booked Successfully.");
    }

    public void clickOnWalkinTypeOfAppointment() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Online\").instance(0))")).click();
        Thread.sleep(3000);
        this.walkinType.click();
        logger.info("Walkin Type appointment selected.");

    }

    public void clickOnHospitalAndSwitchAccordingly(String clinicName) throws InterruptedException {
        Thread.sleep(5000);
        this.selectedHospitalName.click();
        Thread.sleep(3000);
        WebElement clinic=driver.findElement(By.xpath("//android.widget.TextView[@text='"+clinicName+"']"));
        clinic.click();
    }

    public void rescheduleAppointment1() throws InterruptedException {
       Thread.sleep(10000);
       this.rescheduleBtnOnAptCardsDashboard.click();
       logger.info("Clicked on Reschedule Button.");
    }

    public void selectTimeSlotReschedule() throws InterruptedException {
        Thread.sleep(15000);
        this.rescheduleTimeSlot.click();
        logger.info("Time slots selected to Reschedule Appointment");
        Thread.sleep(5000);
        UtilityClass.scrollDownCustom(driver,0.9,0.1);
        Thread.sleep(2000);
    }
    public void enterRescheduleReason() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Enter Reason\").instance(0))")).sendKeys("Test");
        UtilityClass.scrollDownCustom(driver,0.8,0.2);
        this.reasonToReschedule.sendKeys("Test");
        logger.info("Reason for Reschedule entered successfully.");
        Thread.sleep(2000);
    }
    public void ScrollAndSubmitBtnReschedule() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.scrollDown(driver);
        Thread.sleep(2000);
        this.submitBtnReschedule.click();
        logger.info("Clicked on Submit for Reschedule Appointment.");
        Thread.sleep(5000);
        this.OkBtnConfirmationPopupBkApt.click();
        logger.info("Appointment Rescheduled Successfully.");
    }
    public void cancelAppointment() throws InterruptedException {
        Thread.sleep(30000);
      this.cancelBtnOnAptCardsDashboard.click();
      logger.info("Clicked on Cancel Button to cancel Appointment.");
        Thread.sleep(2000);
      this.reasonToCancel.sendKeys("Testing cancel");
      logger.info("Entered Reason To cancel Appointment.");
       this.yesCancelButton.click();
       logger.info("Clicked on Yes Cancel Button.");
        Thread.sleep(2000);
      this.OkBtnConfirmationPopupBkApt.click();
      logger.info("Appointment Cancelled Successfully.");
    }

    public void iniitateAppointment() throws InterruptedException {
        //Thread.sleep(20000);
        UtilityClass.explicitlyWait(this.initiateAppointmentButton,driver,50);
        this.initiateAppointmentButton.click();
        logger.info("Clicked on initiate appointment.");
        UtilityClass.explicitlyWait(this.patientScreeningPageTitle,driver,40);
        if(this.patientScreeningPageTitle.isDisplayed())
        {
           logger.info("User successfully landed on Patient Screening Page");
        }
        else
        {
            logger.info("User not landed on patient Screening page");
        }
        Thread.sleep(10000);
    }

    public void completePayment() throws InterruptedException {
        Thread.sleep(20000);
        this.billingBtnOnDashboard.click();
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Preview Payment\").instance(0))")).click();
        Thread.sleep(8000);
        logger.info("Click manually on Send Button.");
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Send\").instance(0))").click();
        this.sendBtnBillReciept.click();
        logger.info("Amount paid succesfully.");

    }

    public void clickAndSeeNotifications() throws InterruptedException {
        Thread.sleep(10000);
        this.notificationIcon.click();
        Thread.sleep(5000);
        if(this.titleOfNotificationPage.getText().equals("Notifications"))
        {
            logger.info("User clicked on Notifications icon and able to see notifications");
        }
        else
        {
            logger.info("User not able to clicked on Notifications");
        }
        Thread.sleep(3000);
        this.backfromNotifications.click();
        logger.info("Clicked on back button and land on Dashboard from notification page");
    }

    public void viewProfile() throws InterruptedException
    {
        Thread.sleep(20000);
        this.profileIconDashboard.click();
        Thread.sleep(10000);
        if(this.drProfileName.getText().equals("Dr. Vaibhav Hadpe"))
        {
            logger.info("User clicked on Profile icon and able to see Dr.Profile and Name:"+drProfileName.getText()+".");
        }
        else
        {
            logger.info("User not able to clicked on Profile");
        }
    }

    public void fillAllInformationOfFamilyMember() throws InterruptedException, IOException {
        Thread.sleep(3000);
        this.mobileNoField.sendKeys(UtilityClass.readDataFromPropertyFile("MobNumber"));
        logger.info("Entered Mobile Number");
        UtilityClass.explicitlyWait(this.patientName,driver,10);
        this.familyMemberName.click();
        logger.info("Selected Family member of Primary User");
        Thread.sleep(2000);
        this.selectTimeSlotField.click();
        Thread.sleep(2000);
        this.selectTime.click();
        logger.info("Selected Time for Appointment for Family Member.");


    }

    public void selectDifferentClinicOfDoctor(String selectClinicName) throws InterruptedException {
        Thread.sleep(3000);
      this.clinicDrDwnBookApt.click();
        Thread.sleep(2000);
        for(WebElement clinic:clinicListBookApt)
        {
            if(clinic.getText().contains(selectClinicName))
            {
                clinic.click();
                break;
            }
        }

    }

    public void fillInfoOfPatientAndSelectDifferentClinic() throws InterruptedException, IOException {
        Thread.sleep(3000);
        this.mobileNoField.sendKeys(UtilityClass.readDataFromPropertyFile("MobNumber"));
        logger.info("Entered Mobile Number");
        UtilityClass.explicitlyWait(this.patientName,driver,10);
        this.patientName.click();
        logger.info("Selected self/primary user");
        this.selectDifferentClinicOfDoctor("Vaibhav Clinic");
        logger.info("Selected Different Clinic");
        Thread.sleep(4000);
        this.selectTimeSlotField.click();
        Thread.sleep(2000);
        this.selectTime.click();
        logger.info("Selected Time for Appointment.");
    }
    public void selectPatientGenderWhileBkApt(String enterGender) throws InterruptedException {
        Thread.sleep(2000);
        this.patientGenderDrpDwnField.click();
        Thread.sleep(2000);
        for(WebElement gender:patientGenderList)
        {
            if(gender.getText().contains(enterGender))
            {
                gender.click();
                break;
            }
        }
    }
    public void selectRelationWhileBkApt(String enterRelation) throws InterruptedException {
        Thread.sleep(1000);
        this.patientRelationDrpDwnField.click();
        Thread.sleep(1000);
        for(WebElement relation:patientRelationsList)
        {
            if(relation.getText().contains(enterRelation))
            {
                relation.click();
                break;
            }
        }
    }
    public void enterPatientAge(int enterAge) throws InterruptedException {
        Thread.sleep(1000);
        this.patientAgeField.sendKeys(String.valueOf(enterAge));
    }
    public void fillInformationForOtherPatient(String enterMobileNo,String enterOtherPatientName,String enterOtherPatientEmail,String Gender,String Realation,int Age) throws InterruptedException, IOException {
        Thread.sleep(3000);
        this.mobileNoField.sendKeys(enterMobileNo);
        logger.info("Entered Mobile Number");
        UtilityClass.explicitlyWait(this.otherRealativeOption,driver,10);
        this.otherRealativeOption.click();
        this.patientNameField.sendKeys(enterOtherPatientName);
        this.emailField.sendKeys(enterOtherPatientEmail);
        selectPatientGenderWhileBkApt(Gender);
        selectRelationWhileBkApt(Realation);
        enterPatientAge(Age);
        Thread.sleep(4000);
        this.selectTimeSlotField.click();
        Thread.sleep(2000);
        this.selectTime.click();
        logger.info("Selected Time for Appointment.");



    }
    public void clickOnSubmitRescheduleBtn() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.scrollDown(driver);
        Thread.sleep(2000);
        this.submitBtnReschedule.click();
        logger.info("Clicked on Submit for Reschedule Appointment.");
    }

    public void rescheduleWithoutTime(String expectedErrorMsgForRescheduleWithoutTime) throws InterruptedException {
        rescheduleAppointment1();
        logger.info("User not selected any time slots");
        Thread.sleep(5000);
        UtilityClass.scrollDownCustom(driver,0.9,0.2);
        Thread.sleep(2000);
        enterRescheduleReason();
        clickOnSubmitRescheduleBtn();
        if(errorMsgRescheduleWithoutTime.getText().equals(expectedErrorMsgForRescheduleWithoutTime))
        {
           logger.info("Actual and Expected Error messags for Reschedule without selecting time slots are matched.");
           logger.info("User not able to reschedule appointment without selecting time slots.Error Message is: "+errorMsgRescheduleWithoutTime.getText());
        }
        else
        {
            logger.info("Actual and Expected Error messages are not matching.");
        }
    }

    public void rescheduleWithoutReason(String expectedErrorMsgForRescheduleWithoutReason) throws InterruptedException {
        rescheduleAppointment1();
        selectTimeSlotReschedule();
        logger.info("User not entering reason for Rescheduling");
        clickOnSubmitRescheduleBtn();
        if(errorMsgRescheduleWithoutReason.getText().equals(expectedErrorMsgForRescheduleWithoutReason))
        {
            logger.info("Actual and Expected Error messags for Reschedule without Reason are matched.");
            logger.info("User not able to reschedule appointment without giving Reason.Error Message is: "+errorMsgRescheduleWithoutReason.getText());
        }
        else
        {
            logger.info("Actual and Expected Error messages are not matching.");
        }
    }

    public void rescheduleOnFutureDate(String enterDateWithinOneWeek) throws InterruptedException {
        rescheduleAppointment1();
        Thread.sleep(3000);
        for(WebElement dates:futureDatesRescheduleList)
        {    Thread.sleep(1000);
            if(dates.getText().contains(enterDateWithinOneWeek))
            {
                dates.click();
                logger.info("User clicked on: "+dates.getText());
                break;
            }
        }
        selectTimeSlotReschedule();
        enterRescheduleReason();
        clickOnSubmitRescheduleBtn();
    }

    public void cancelWithoutReason(String errorMessageForCancelWithoutReason) throws InterruptedException {
        Thread.sleep(20000);
        this.cancelBtnOnAptCardsDashboard.click();
        logger.info("Clicked on Cancel Button to cancel Appointment.");
        Thread.sleep(2000);
        logger.info("User not giving Reason for Cancel");
        this.yesCancelButton.click();
        logger.info("Clicked on Yes Cancel Button.");
        Thread.sleep(2000);
        if(errorMsgRescheduleWithoutReason.getText().contains(errorMessageForCancelWithoutReason))
        {
            logger.info("Actual and Expected Error Messages are matched.");
            logger.info("User not able to cancel without reason.Error Message is: "+errorMsgRescheduleWithoutReason.getText());
        }
    }

    public void dismissCancellationOfAppointment() throws InterruptedException {
        Thread.sleep(30000);
        this.cancelBtnOnAptCardsDashboard.click();
        logger.info("Clicked on Cancel Button to cancel Appointment.");
        Thread.sleep(2000);
        this.reasonToCancel.sendKeys("Testing cancel");
        logger.info("Entered Reason To cancel Appointment.");
        this.dismissCancelApt.click();
        logger.info("Clicked On Dismiss Btn to stop cancellation process.");

    }
    public void clickOK() throws InterruptedException {
        Thread.sleep(7000);
        this.clickOkForReschedulingAppointment.click();
    }
    public void fillInformationForUnregisteredPatient(String enterMobileNo,String enterPatientName,String enterOtherPatientEmail,String Gender,String Relation,int Age) throws InterruptedException
    {
        Thread.sleep(3000);
        this.mobileNoField.sendKeys(enterMobileNo);
        logger.info("Entered UnRegitstered Mobile Number");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//android.widget.EditText[@index='7']")).click();
        if(driver.findElement(By.xpath("//android.widget.EditText[@index='7']")).isEnabled()) {

            driver.findElement(By.xpath("//android.widget.EditText[@index='7']")).sendKeys(enterPatientName);
            logger.info("Entered patient Name: " + enterPatientName);
            this.emailField.sendKeys(enterOtherPatientEmail);
            logger.info("Selected Email: " + enterOtherPatientEmail);
            selectPatientGenderWhileBkApt(Gender);
            logger.info("Selected Gender: " + Gender);
            selectRelationWhileBkApt(Relation);
            logger.info("Selected Relation: " + Relation);
            enterPatientAge(Age);
            logger.info("Entered patient age: " + Age);
            Thread.sleep(4000);
            this.selectTimeSlotField.click();
            Thread.sleep(2000);
            this.selectTime.click();
            logger.info("Selected Time for Appointment: " + this.selectTime.getText());
        }
        else
        {
            System.out.println("Patient Name Field isEnabled: "+this.patientNameField.isEnabled());
            System.out.println("Patient Name field is not enabled to enter value TC Failed.");
        }
    }

    public void verifyAppointmentBookedOrNot() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Skip Payment\").instance(0))")).click();
        Thread.sleep(3000);
        if(succesfullPopup.isDisplayed())
        {
            this.OkBtnConfirmationPopupBkApt.click();
            logger.info("Clicked on skip Payment and Appointment Booked Successfully.");
        }
        else
        {
            logger.error("Getting Error while booking appointment.");
        }


    }
    public void enterMobNoAndSelectPatientNameFromList(String enterMobileNumber,String selectPatientName) throws InterruptedException {
        UtilityClass.explicitlyWait(this.mobileNoField,driver,10);
        this.mobileNoField.sendKeys(enterMobileNumber);
        logger.info("Entered Mobile Number successfully.");
        Thread.sleep(2000);
        patientName.click();
//        for(WebElement patientName:this.patientNameList)
//        {
//            if(patientName.getText().contains(selectPatientName))
//            {
//                patientName.click();
//                logger.info("Patient selected: "+patientName.getText());
//                break;
//            }
//        }
    }
    public void clickOnOK() throws InterruptedException {
        //UtilityClass.explicitlyWait(this.okPopupBtn,driver,10);
        Thread.sleep(4000);
        this.okPopupBtn.click();
    }

    public void verifyInfoPopulatingOnSelectingRegisteredMember(String patientMobileNo,String patientName,String expectedpatientEmail,String expectedPatientGender,String expectedPatientRelation,String expectedPatientAge) throws InterruptedException, IOException {
        enterMobNoAndSelectPatientNameFromList(patientMobileNo,patientName);
        logger.info("Entered Mobile no. and selected Pateint.");
        logger.info("EmailPopulated in email field is: "+this.emailFieldindex.getText());
        logger.info("Patient Gender populated in Gender field is: "+this.patientGenderFieldIndex.getText());
        logger.info("Patient Relation populated in Relation field is: "+this.patientRelationFieldIndex.getText());
        logger.info("Patient Age populated in Age field is: "+this.patientAgeFieldIndex.getText());
        Thread.sleep(5000);
        if(this.emailFieldindex.getText().equals(expectedpatientEmail)&&this.patientGenderFieldIndex.getText().equals(expectedPatientGender)&&this.patientRelationFieldIndex.getText().equals(expectedPatientRelation)&&this.patientAgeFieldIndex.getText().equals(expectedPatientAge))
        {
            logger.info("Actual and Expected Email,Gender,Relation and Age matched. TC is Passed.");
        }
        else
        {
            logger.info("Error Check once.");
        }
    }

    public void addSymptompsWhileBookingAppointment(String enterSymptomp) throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.scrollDownCustom(driver,0.7,0.2);
        Thread.sleep(2000);
      this.symptompsFieldBkApt.sendKeys(enterSymptomp);
      for (WebElement symptomp:symptompsList)
      {
          if(symptomp.getText().contains(enterSymptomp))
          {
              symptomp.click();
              logger.info("Symptomp selected: "+symptomp.getText());
              break;
          }
          else
          {
              this.symptompsFieldBkApt.sendKeys(enterSymptomp+"\n");
          }
      }
    }

    public void duplicateSymptompsBkApt(String enterSymptomp1,String enterSymptomp2) throws InterruptedException {
        addSymptompsWhileBookingAppointment(enterSymptomp1);
        Thread.sleep(2000);
        addSymptompsWhileBookingAppointment(enterSymptomp2);
        WebElement symptomp1=driver.findElement(By.xpath("(//android.view.ViewGroup[@index='25']//android.widget.TextView)[1]"));
        WebElement btn=driver.findElement(By.xpath("(//android.view.ViewGroup[@index='26']//android.widget.TextView)[1]"));
        logger.info("Symptomps added is: "+symptomp1.getText()+",At next index: "+btn.getText()+",So no duplicates.");
         if(btn.getText().equals("Skip Payment"))
         {
             logger.info("Duplicates symptomps are not added");
         }
         else
         {
             logger.error("Duplicates symptomps are added.");
         }
    }

    public void cancelBookAptProcess() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.scrollDownCustom(driver,0.8,0.2);
        Thread.sleep(2000);
        this.cancelBkAptProcess.click();
        logger.info("clicked on cancel Btn while booking apt");
        if(this.bookAppointmentBtnOnDashboard.isDisplayed())
        {
            logger.info("Book Appointment process cacelled successfully.");

        }
       else
        {
            logger.info("Even after click on cancel apt booked");
        }
    }

    public void verifyPatientDetailsOnBillRecipt(String enterPatientMobileNo,String enterPatientName) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Proceed To Pay\").instance(0))")).click();
        logger.info("Clicked on Proceed To Pay option.");
        Thread.sleep(4000);
        UtilityClass.scrollDown(driver);
        Thread.sleep(4000);
        this.previewPaymentBtn.click();
        logger.info("Clicked on Preview Payment");


    }

    public void verifyUserShouldNotBookedAptWithoutFillingMadatoryField(
            String expectedErrorMsgForMobNo,String expectedErrorMsgForPatientName, String expectedErrorMsgForGender,String expectedErrorMsgForRelation
    ) throws InterruptedException
    {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Skip Payment\").instance(0))")).click();
        logger.info("Clicked on Skip Payment");
        Thread.sleep(3000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Mobile Number\").instance(0))")).click();
        UtilityClass.scrollDownCustom(driver,0.4,0.8);
        Thread.sleep(2000);
        logger.info("Mobile No. msg: "+this.errorMsgForEmptyMobNoField.getText());
        logger.info("Patient Name: "+this.errorMsgForEmptyPatientName.getText());
        logger.info("Patient Gender: "+this.errorMsgForEmptyGender.getText());
        logger.info("Patient Relation: "+this.errorMsgForEmptyRelation.getText());
        if(this.errorMsgForEmptyMobNoField.getText().equals(expectedErrorMsgForMobNo)&&this.errorMsgForEmptyPatientName.getText().equals(expectedErrorMsgForPatientName)&&this.errorMsgForEmptyGender.getText().equals(expectedErrorMsgForGender)
        &&this.errorMsgForEmptyRelation.getText().equals(expectedErrorMsgForRelation))
        {
            logger.info("Without filling mandatory fields user not able to book appointment.Gettig Error messages.");
            logger.info("All expected and actual error messages are matched TC is Passed.");
        }
        else
        {
            logger.error("Check actual and expected Error Messages. TC is Failed.");
        }


    }

    public void clickAndLandOnRescheduleAptPage() throws InterruptedException
    {
        rescheduleAppointment1();
        UtilityClass.explicitlyWait(this.textOnReschedulePage,driver,10);
        if(textOnReschedulePage.getText().equals("Current Appointment"))
        {
            logger.info("User landed on Reschedule Page Successfully.");
        }
        Thread.sleep(5000);
    }

    public void rescheduleAptInFutureWeek(String enterDateInNextWeek) throws InterruptedException {
        clickAndLandOnRescheduleAptPage();
        UtilityClass.explicitlyWait(this.forwardButtonForWeekDaysReschedule,driver,30);
        this.forwardButtonForWeekDaysReschedule.click();
        Thread.sleep(3000);
        for(WebElement dates:futureDatesRescheduleList)
        {    Thread.sleep(1000);
            if(dates.getText().contains(enterDateInNextWeek))
            {
                dates.click();
                logger.info("User clicked on: "+dates.getText());
                break;
            }
        }
        UtilityClass.explicitlyWait(this.rescheduleTimeSlot,driver,20);
        selectTimeSlotReschedule();
        enterRescheduleReason();
        clickOnSubmitRescheduleBtn();

    }

    public void tryToRescheduleOnPastDates(String enterpastDate) throws InterruptedException {
        clickAndLandOnRescheduleAptPage();
        UtilityClass.explicitlyWait(this.backwardButtonForWeekDaysReschedule,driver,10);
        this.backwardButtonForWeekDaysReschedule.click();
        Thread.sleep(3000);
        for(WebElement dates:futureDatesRescheduleList)
        {    Thread.sleep(1000);
            if(dates.getText().contains(enterpastDate))
            {
                logger.info("User able to reschedule apt on past dates.");
            }
            else
            {
                logger.info("User not able to reschedule apt on past dates.");
                break;
            }
        }
    }

    public void verifyPateintDetailsOnReschedulePage() throws InterruptedException {
        UtilityClass.implicitlyWait(driver,20);
        String patientNameOnDashboard=this.patientNameOnAptCardDashboard.getText();
        String patientGenderOnDashboard;
        if(this.patientGenderOnAptCardDashboard.getText().contains("M"))
        {
           patientGenderOnDashboard="Male";
        }
        else if (this.patientGenderOnAptCardDashboard.getText().contains("F"))

        {
            patientGenderOnDashboard="Female";
        }
        else
        {
            patientGenderOnDashboard="Other";
        }
        String patientAgeOnDashboard=this.patientAgeOnAptCardDashboard.getText();
        String patientAptTimeOnDashboard=this.aptTimingOnAptCardDashboard.getText();
        System.out.println("Dashboard Patient Name: "+patientNameOnDashboard);
        System.out.println("Dashboard Patient Gender: "+patientGenderOnDashboard);
        System.out.println("Dashboard Patient Age: "+patientAgeOnDashboard);
        System.out.println("Dashboard Patient AptTiming: "+patientAptTimeOnDashboard);
        clickAndLandOnRescheduleAptPage();
        UtilityClass.explicitlyWait(this.patientNameOnReschedulePage,driver,20);
        System.out.println("Reschedule Page Patient Name : "+patientNameOnReschedulePage.getText());
        System.out.println("Reschedule Page Patient Gender : "+patientGenderOnReschedulePage.getText());
        System.out.println("Reschedule Page Patient Age : "+patientAgeOnReschedulePage.getText());
        System.out.println("Reschedule Page Patient AptTime : "+patientAptTimingOnReschedulePage.getText());

        if(patientNameOnReschedulePage.getText().equals(patientNameOnDashboard)&&patientGenderOnReschedulePage.getText().contains(patientGenderOnDashboard)
        &&patientAgeOnReschedulePage.getText().contains(patientAgeOnDashboard)&&patientAptTimingOnReschedulePage.getText().contains(patientAptTimeOnDashboard))
        {
            logger.info("Patient Name matched TC Passed.");
            logger.info("Patient Gender matched TC Passed.");
            logger.info("Patient Age matched TC Passed.");
            logger.info("Patient Apt Timing matched TC Passed.");
        }

    }

    public void verifyRescheduledTagForRescheduleApt()
    {
        UtilityClass.explicitlyWait(patientAppointmentStatusDashboard,driver,10);
        if(this.patientAppointmentStatusDashboard.getText().equals("RE_SCHEDULED"))
        {
            logger.info("Appointment Rescheduled successfully and showing Apt status RE_SCHEDULED.");
        }
    }

    public void clickOnCancelAndNavigateToCancelPage() throws InterruptedException {
        Thread.sleep(30000);
        this.cancelBtnOnAptCardsDashboard.click();
        logger.info("Clicked on Cancel Button to cancel Appointment.");
       Thread.sleep(5000);
        if(this.cancelAptpageText.getText().contains("CANCEL APPOINTMENT"))
        {
            logger.info("User landed on Cancel Apt Page");
        }
        else
        {
            logger.info("Check page is loading in time");
        }
    }
}
