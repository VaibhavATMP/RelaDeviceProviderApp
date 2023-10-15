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

import java.io.IOException;
import java.util.List;

import static steps.BackGround.driver;

public class DPAddPackages {
    Logger logger = LogManager.getLogger(DPAddPackages.class);
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email id']")
    private WebElement enteremail;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='password']")
    private WebElement enterpassword;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LOGIN']")
    private WebElement clicklogin;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='home_open_menu_id']")
    private WebElement clickmenu;

    @AndroidFindBy(xpath = "//android.view.ViewGroup//android.widget.TextView[@text='\uEA04']")
    private WebElement clickAddIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Packages']")
    private WebElement clickpackages;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='\uF100']")
    private WebElement clickplusicon;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='\uDB83\uDE17'])[2]")
    private WebElement enterenddate;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private WebElement Selectenddate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Edit']")
    private WebElement clickedit;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Active']")
    private WebElement clickactive;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Inactive']")
    private WebElement clickinactive;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='1']//android.widget.EditText[@index='3']")
    private WebElement enterpackagename;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='1']//android.widget.EditText[@index='5']")
    private WebElement enterpackagepunchline;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='7']")
    private WebElement clickpackagetype;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private List<WebElement>  filterPackageType;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='11']")
    private WebElement clickNoOfConsultation;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private List<WebElement> filterNoOfConsultation;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='13']")
    private WebElement clickNoOfOfficeVisits;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private List<WebElement> filterNoOfOfficeVisits;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='16']")
    private WebElement enterconsultationfrequency;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='20']")
    private WebElement clickOnDurtion;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"undefined flatlist\"]//android.widget.TextView")
    private List <WebElement> filterPackageDuration;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='9']")
    private WebElement clickclinicname;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"undefined flatlist\"]//android.widget.TextView")
    private List<WebElement> selectClinicInDropDown;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='22']")
    private WebElement enterChronicDesease;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='23']//android.widget.TextView")
    private WebElement clickOnAddChronic;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter Package Description']")
    private WebElement enterpackagedescription;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='0']")
    private WebElement enteractualprice;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='\uF096']")
    private WebElement checktermsandconditions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Submit']")
    private WebElement clickonsubmit;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Start Date']")
    private WebElement clickexistingpackage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Update']")
    private WebElement clickonupdate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Name is required']")
    private WebElement withoutpackagename;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Actual price cannot be blank']")
    private WebElement withoutactualprice;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Purchased Package']")
    private WebElement clickonpurchasedpackages;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='All']")
    private WebElement clickondropdown;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Body Checkup']")
    private WebElement selectpackageindropdown;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Package Name: ']")
    private WebElement openpurchasedpackages;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Package Purchased User Detail']")
    private WebElement purchasedpackagesuserdetails;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='18']")private WebElement consultationFrequencyField;


    public DPAddPackages(AndroidDriver driver) {
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickOnAddIcon() throws InterruptedException {
        Thread.sleep(7000);
        this.clickAddIcon.click();
        logger.info("Clicked on add icon");
    }
    public void selectPackageEndDate() throws InterruptedException {
        Thread.sleep(3000);
        this.enterenddate.click();
        Thread.sleep(3000);
        this.Selectenddate.click();
        logger.info("Selected package end date");
    }

    public void clickonpackages() throws InterruptedException {
        Thread.sleep(5000);
        this.clickpackages.click();
        logger.info("Clicked on packages");
    }
    public void clickonactive() {
        this.clickactive.click();
        logger.info("Clicked on active radio button");
    }
    public void Clickoninactive() {
        this.clickinactive.click();
        logger.info("Clicked on inactive radio button");
    }

    public void clickonedit() {
        this.clickedit.click();
        logger.info("Clicked on edit button");
    }
    public void selectpackagetype(String PackageType) throws InterruptedException {
        Thread.sleep(3000);
        this.clickpackagetype.click();
        Thread.sleep(3000);
        for(WebElement packagetype:filterPackageType)
        {System.out.println(packagetype.getText());
            if(packagetype.getText().contains(PackageType))
            {
                Thread.sleep(2000);
                packagetype.click();
                break;
            }
        }
    }

    public void clickonconsultation(String NumOfConsultation) throws InterruptedException {
        this.clickNoOfConsultation.click();
        Thread.sleep(2000);
        for(WebElement NumOfConsultations:filterNoOfConsultation)
        {
            if(NumOfConsultations.getText().contains(NumOfConsultation))
            {
                NumOfConsultations.click();
                break;
            }
        }
    }
    public void selectofficevisits(String officevisits) throws InterruptedException {
        this.clickNoOfOfficeVisits.click();
        Thread.sleep(2000);
        for(WebElement NumOfOfficeVisits:filterNoOfOfficeVisits)
        {
            if(NumOfOfficeVisits.getText().contains(officevisits))
            {
                NumOfOfficeVisits.click();
                break;
            }
        }
    }
    public void enterConsultationFrequency(String enterConsultationfrequencyNo)
    {
        consultationFrequencyField.clear();
        consultationFrequencyField.sendKeys(enterConsultationfrequencyNo);
    }
    public void selectDuration(String PackageDuration) throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.scrollDownCustom(driver,0.8,0.3);
        Thread.sleep(1000);
        this.clickOnDurtion.click();
        Thread.sleep(2000);
        for(WebElement packageduration:filterPackageDuration)
        {
            if(packageduration.getText().contains(PackageDuration))
            {
                packageduration.click();
                break;
            }
        }
    }
    public void selectclinic(String selectTheClinic) throws InterruptedException {
        Thread.sleep(6000);
        UtilityClass.scrollDownCustom(driver,0.8,0.3);
        this.clickclinicname.click();
        Thread.sleep(2000);
        for(WebElement selectclinicindropdown:selectClinicInDropDown)
        {
            if(selectclinicindropdown.getText().contains(selectTheClinic))
            {
                selectclinicindropdown.click();
                break;
            }
        }
    }
    public void selectClinicInPackage() throws InterruptedException {
        Thread.sleep(2000);
        this.clickclinicname.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//android.widget.ScrollView[@content-desc=\"undefined flatlist\"]//android.widget.TextView)[1]")).click();
       logger.info("Clinic Name selected");
    }
    public void clickChronic() {
        this.enterChronicDesease.sendKeys("Diet");
    }

    public void selectChronic() {
        this.clickOnAddChronic.click();
    }
    public void enterPackageDescription(){
        this.enterpackagedescription.sendKeys("Master Health Checkup");
    }
    public void Clicksubmit() {
        UtilityClass.scrollDownCustom(driver,0.8,0.3);
        this.clickonsubmit.click();
    }

    public void Clickonlogin() {
        this.clicklogin.click();
    }

    public void Clickonupdate() {
        this.clickonupdate.click();
    }

    public void Clickonexistingpackage() {
        this.clickexistingpackage.click();
        logger.info("Existing package is opened");
    }
    public void enterPackageActualPrice() throws InterruptedException {
        UtilityClass.scrollDownCustom(driver,0.8,0.3);
        this.enteractualprice.sendKeys("2000");
        Thread.sleep(5000);
    }

    public void purchasedpackage() {
        this.clickonpurchasedpackages.click();
    }
    public void dropdown() {
        this.clickondropdown.click();
    }
    public void selectpackage() {
        this.selectpackageindropdown.click();
    }
    public void selectpurchasedpackage() {
        this.openpurchasedpackages.click();
    }

    public void enterloginuserdetails() throws IOException {
        this.enteremail.sendKeys(UtilityClass.readDataFromPropertyFile("username"));
        this.enterpassword.sendKeys(UtilityClass.readDataFromPropertyFile("password"));
        logger.info("Register details");
    }

    public void updatepackage() throws IOException {
        this.enterpackagename.sendKeys(UtilityClass.readDataFromPropertyFile("updatepackagename"));
        logger.info("Register details");
    }

    public void enterpackagedetails() throws IOException {
        this.enterpackagename.sendKeys(UtilityClass.readDataFromPropertyFile("packagename"));
        this.enterpackagepunchline.sendKeys(UtilityClass.readDataFromPropertyFile("packagepunchline"));
//        this.enterconsultationfrequency.sendKeys(UtilityClass.readDataFromPropertyFile("packageconsultationfrequency"));
//        this.enteractualprice.sendKeys(UtilityClass.readDataFromPropertyFile("packageactualprice"));
        logger.info("Enter package details");
    }
    public void enterwithoutpackagename() throws IOException {
        this.enterpackagepunchline.sendKeys(UtilityClass.readDataFromPropertyFile("packagepunchline"));
        this.enterconsultationfrequency.sendKeys(UtilityClass.readDataFromPropertyFile("packageconsultationfrequency"));
        this.enteractualprice.sendKeys(UtilityClass.readDataFromPropertyFile("packageactualprice"));
        logger.info("Register details");
    }
    public void verifypackagenamename() throws IOException {
        String actualnameerror = this.withoutpackagename.getText();
        if (actualnameerror.equals(UtilityClass.readDataFromPropertyFile("errormessageforpackagename")) ){
            logger.info("actual and expected error messages are matched for name field");
        }
        else{
            logger.info("actual and expected error messages are not matched for name field");
        }
    }

    public void enterwithoutactualprice() throws IOException {
        this.enterpackagename.sendKeys(UtilityClass.readDataFromPropertyFile("packagename"));
        this.enterpackagepunchline.sendKeys(UtilityClass.readDataFromPropertyFile("packagepunchline"));
        this.enterconsultationfrequency.sendKeys(UtilityClass.readDataFromPropertyFile("packageconsultationfrequency"));
        logger.info("without actual details");
    }

    public void verifyactualprice() throws IOException {
        UtilityClass.scrollDownCustom(driver,0.8,0.9);
        String actualnameerror = this.withoutactualprice.getText();
        if (actualnameerror.equals(UtilityClass.readDataFromPropertyFile("errormessageforactualprice")) ){
            logger.info("actual and expected error messages are matched for name field");
        }
        else{
            logger.info("actual and expected error messages are not matched for name field");
        }
    }

    public void verifypurchasedpackagedetails() throws IOException {
        String actualnameerror = this.purchasedpackagesuserdetails.getText();
        if (actualnameerror.equals(UtilityClass.readDataFromPropertyFile("purchasedpackageuserdetails")) ){
            logger.info("actual and expected error messages are matched for name field");
        }
        else{
            logger.info("actual and expected error messages are not matched for name field");
        }
    }

}


