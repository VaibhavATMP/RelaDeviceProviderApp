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

import static steps.BackGround.driver;

public class SettingsPage {
    public SettingsPage(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static Logger logger = LogManager.getLogger(TemplatePage.class);

    @AndroidFindBy(xpath= "//android.view.ViewGroup[@resource-id='home_open_menu_id']")
    private WebElement menuIcon;

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
    private WebElement BlockDateStartTime;

    @AndroidFindBy(xpath="(//android.widget.TextView[@index='1'])[2]")
    private WebElement selBlockDateStartTime;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Select end time']")
    private WebElement BlockDateEndTime;

    @AndroidFindBy(xpath="//android.widget.TextView[@index='1'])[2]")
    private WebElement selBlockDateEndTime;

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

    @AndroidFindBy(xpath="(//android.widget.EditText[@index='1'])[1]")
    private WebElement beforeAptTime;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='2 Days']")
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
    private WebElement selectClinic;

    @AndroidFindBy(xpath="(//android.widget.ImageView[@index='1'])[1]")
    private WebElement clickClinic;

    @AndroidFindBy(xpath="(//android.widget.ImageView[@index='1'])[2]")
    private WebElement clickNoOfConsultations;

    @AndroidFindBy(xpath="(//android.view.ViewGroup[@index='0'])[10]")
    private WebElement selectNoOfConsultations;

    @AndroidFindBy(xpath="(//android.widget.ImageView[@index='1'])[3]")
    private WebElement clickNoOfDays;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='14 Days']")
    private WebElement selectNoOfDays;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Save']")
    private WebElement clickSaveInClinical;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='OK']")
    private WebElement clickOkInClinical;

    @AndroidFindBy(xpath="//android.widget.EditText[@index='11']")
    private WebElement clickVideoConsultation;

    @AndroidFindBy(xpath="//android.widget.EditText[@index='9']")
    private WebElement clickWalkInConsultation;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Examination']")
    private WebElement clickExamination;

    @AndroidFindBy(xpath="(//android.widget.TextView[@index='1'])[2]")
    private WebElement clickAssessmentSettings;

    @AndroidFindBy(xpath="(//android.widget.TextView[@index='1'])[3]")
    private WebElement clickPrescriptionSettings;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='1']")
    private WebElement enableNeuroAssessment;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='3']")
    private WebElement enableRespiratoryAssessment;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Save']")
    private WebElement saveAssessment;


    @AndroidFindBy(xpath="//android.widget.TextView[@text='OK']")
    private WebElement clickOkInAssessment;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='5']")
    private WebElement enableCardioVascularAssessment;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='7']")
    private WebElement enableAbdominalGUAssessment;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='9']")
    private WebElement enableMuscoloskeletalAssessment;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='11']")
    private WebElement enableGCSscaleAssessment;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='13']")
    private WebElement enableIntegumentaryAssessment;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='15']")
    private WebElement enableNeurovascularExtremetiesAssessment;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Drug Name']")
    private WebElement drugnameInPrescription;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='1']")
    private WebElement drugnameBtnInPrescription;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Dosage Route']")
    private WebElement dosageRouteInPrescription;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='3']")
    private WebElement dosageRouteBtnInPrescription;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Frequency']")
    private WebElement frequencyInPrescription;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='5']")
    private WebElement frequencyBtnInPrescription;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Duration']")
    private WebElement durationInPrescription;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='7']")
    private WebElement durationBtnInPrescription;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Instruction']")
    private WebElement instructionsInPrescription;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='9']")
    private WebElement instructionsBtnInPrescription;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Allow Refils']")
    private WebElement allowRefillsInPrescription;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='11']")
    private WebElement allowRefillsBtnInPrescription;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Allow Generics']")
    private WebElement allowGenericsInPrescription;

    @AndroidFindBy(xpath="//android.widget.Switch[@index='13']")
    private WebElement allowGenericsBtnInPrescription;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Save']")
    private WebElement saveInPrescriptionSettings;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='OK']")
    private WebElement clickOkInPrescriptionSettings;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Privacy policy']")
    private WebElement clickOkInPrivacyPolicy;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Logout']")
    private WebElement clickLogoutInSettings;

    @AndroidFindBy(xpath="//android.widget.Button[@text='LOGOUT']")
    private WebElement LogoutInSettings;


    public void clickMenu() {
        UtilityClass.implicitlyWait(driver, 60);
        menuIcon.click();
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
        BlockDateStartTime.click();
        selBlockDateStartTime.click();
        BlockDateEndTime.click();
        selBlockDateEndTime.click();
        saveBlockDate.click();
        blockDateOkBtn.click();
    }

    public void removesBlockDate() throws InterruptedException {
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
        BlockDateEndTime.click();
        selBlockDateStartTime.click();
        BlockDateEndTime.click();
        selBlockDateEndTime.click();
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
        BlockDateStartTime.click();
        selBlockDateStartTime.click();
        BlockDateEndTime.click();
        selBlockDateEndTime.click();
        addTimeSlotInBlockdate.click();
        BlockDateStartTime.click();
        selBlockDateStartTime.click();
        BlockDateEndTime.click();
        selBlockDateEndTime.click();
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
        beforeAptTime.sendKeys("2");
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

    public void addFollowUps() throws InterruptedException {
        UtilityClass.implicitlyWait(driver, 120);
        Thread.sleep(2000);
        clickClinic.click();
        selectClinic.click();
        Thread.sleep(2000);
        clickNoOfConsultations.click();
        Thread.sleep(2000);
        selectNoOfConsultations.click();
        clickNoOfDays.click();
        Thread.sleep(2000);
        selectNoOfDays.click();
        Thread.sleep(2000);
        clickSaveInClinical.click();
        Thread.sleep(2000);
        clickOkInClinical.click();
    }

    public void setWalkInConsultationFee() throws InterruptedException {
        clickWalkInConsultation.sendKeys("500");
        Thread.sleep(2000);
        clickSaveInClinical.click();
        Thread.sleep(2000);
        clickOkInClinical.click();
    }

    public void setVideoConsultationFee() throws InterruptedException {
        clickVideoConsultation.sendKeys("400");
        Thread.sleep(2000);
        clickSaveInClinical.click();
        Thread.sleep(2000);
        clickOkInClinical.click();
    }

    public void clickExamination() throws InterruptedException {
        Thread.sleep(2000);
        clickExamination.click();
    }

    public void clickAssessmentSettings() throws InterruptedException {
        Thread.sleep(2000);
        clickAssessmentSettings.click();
    }

    public void makeAssessmentSettings() throws InterruptedException {
        UtilityClass.implicitlyWait(driver, 60);
        Thread.sleep(2000);
        enableNeuroAssessment.click();
        Thread.sleep(2000);
        enableRespiratoryAssessment.click();
        Thread.sleep(2000);
        saveAssessment.click();
        clickOkInAssessment.click();
    }

    public void enableAssessments() {
        UtilityClass.implicitlyWait(driver,120);
        enableNeuroAssessment.click();
        enableRespiratoryAssessment.click();
        enableCardioVascularAssessment.click();
        enableMuscoloskeletalAssessment.click();
        enableAbdominalGUAssessment.click();
        enableGCSscaleAssessment.click();
        enableIntegumentaryAssessment.click();
        enableNeurovascularExtremetiesAssessment.click();

    }


    public void clickPrescriptionSettings() {
        UtilityClass.implicitlyWait(driver,20);
        clickPrescriptionSettings.click();
    }

    public void prescriptionFields() {
        UtilityClass.implicitlyWait(driver, 240);
        System.out.println(drugnameInPrescription.getText());
        System.out.println(drugnameBtnInPrescription.isEnabled());
        System.out.println(dosageRouteInPrescription.getText());
        System.out.println(dosageRouteBtnInPrescription.isEnabled());
        System.out.println(durationInPrescription.getText());
        System.out.println(durationBtnInPrescription.isEnabled());
        System.out.println(frequencyInPrescription.getText());
        System.out.println(frequencyBtnInPrescription.isEnabled());
        System.out.println(instructionsInPrescription.getText());
        System.out.println(instructionsBtnInPrescription.isEnabled());
        System.out.println(allowRefillsInPrescription.getText());
        System.out.println(allowRefillsBtnInPrescription.isEnabled());
        System.out.println(allowGenericsInPrescription.getText());
        System.out.println(allowGenericsBtnInPrescription.isEnabled());
    }

    public void settingsInPrescription() {
        UtilityClass.implicitlyWait(driver, 30);
        instructionsBtnInPrescription.click();
        allowGenericsBtnInPrescription.click();
        saveInPrescriptionSettings.click();
        clickOkInPrescriptionSettings.click();
    }

    public void privacyPolicy() {
        clickOkInPrivacyPolicy.click();
    }

    public void logOut() {
        UtilityClass.implicitlyWait(driver, 30);
        clickLogoutInSettings.click();
        LogoutInSettings.click();
    }
}

