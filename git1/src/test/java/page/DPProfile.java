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

import java.util.List;

import static steps.BackGround.driver;

public class DPProfile {
    private String YearsOfExperience;
    private String HouseNo;
    private String Address;
    private String Pincode;

    //Clinic details
    private String ClinicName;
    private String RegistrationNumber;
    private String ConsultationFee;
    private String ClinicAddress;
    private String Locality;
    private String Pincode1;

    //Bank details

    private String AccountHolderName;

    private String AccountNumber;
    private String ConfirmAccountNumber;
    private String BankName;
    private String BranchName;
    private String IFSCCode;
    private String BankLocation;
    private String TransferLimit;
    private String EmailID;
    private String MobileNumber;

    Logger logger= LogManager.getLogger(DPProfile.class);

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='home_nav_to_prof_id']")
    private WebElement clickOnProfileIcon;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Personal Information']")
    private WebElement clickpersonalinformation;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='13']")
    private WebElement selectprimaryspeciality;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.ScrollView[@resource-id='undefined flatlist']//android.widget.TextView")
    private List<WebElement> primaryspecialityinlist;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='13']")
    private WebElement selectsecondaryspeciality;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.ScrollView[@resource-id='undefined flatlist']//android.widget.TextView\n" +
            "\n")
    private List<WebElement> secondaryspecialityinlist;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='18']")
    private WebElement txtyrsofexperience;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='20']")
    private WebElement txthousenum;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='22']")
    private WebElement txtaddress;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Pincode']")
    private WebElement txtpincode;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Gender']")
    private WebElement clickgender;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gynecology']")
    private WebElement selectgender;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='\uDB83\uDE17']")
    private WebElement clickdob;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private WebElement selectdob;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Speciality']")
    private WebElement clickprimarspeciality;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gynecology']")
    private WebElement selectprimayspeciality;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='26']\n")
    private WebElement clickstate;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private WebElement selectstate;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='28']\n")
    private WebElement clickcity;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private WebElement selectcity;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='34']")
    private WebElement clicklanguage;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.TextView")
    private WebElement selectlanguage;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Short Description']")
    private WebElement enterdescription;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='NEXT']")
    private WebElement clicknext;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Pincode']")
    private WebElement clickoneducation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ADD QUALIFICATION']")
    private WebElement addqualification;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[17]")
    private WebElement clickontype;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private WebElement selectedutype;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phd']")
    private WebElement txtcourse;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select University']")
    private WebElement clickonuniversity;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Al-Falah University']")
    private WebElement selectuniversity;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[18]")
    private WebElement clickonyrofgraduation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='2018']")
    private WebElement selectyrofgraduatin;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select State']")
    private WebElement clickonstate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Andhra Pradesh']")
    private WebElement selectthestate;

//    @AndroidFindBy(xpath= "//android.widget.EditText[@text='Pincode']")
//    private WebElement clickaddbutton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Registration Number']")
    private WebElement clickaddregistration;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Registration Number']")
    private WebElement txtregistrationnum;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Registraion Council']")
    private WebElement clickonregcouncil;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='NEXT']")
    private WebElement selectregcouncil;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='National Registration Number']]")
    private WebElement txtnationalregnum;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='\uDB83\uDE17']")
    private WebElement clickregdate;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private WebElement selectregdate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='\uDB83\uDE17']")
    private WebElement clickregissuedate;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private WebElement selectregissuedate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hospitals or Clinics']")
    private WebElement addhospitalorclinic;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hospitals or Clinics']")
    private WebElement txtclinicname;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='2000']")
    private WebElement txtconsultationfee;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='2000']")
    private WebElement txtonlineconsultationfee;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select State']")
    private WebElement clickclinicstate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Andhra Pradesh']")
    private WebElement selectclinicstate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select City']")
    private WebElement clickcliniccity;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Addanki']")
    private WebElement selectcliniccity;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Upload Clinic Logo']")
    private WebElement uploadcliniclogo;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Address']")
    private WebElement txtaddress1;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Street / Locality']")
    private WebElement txtlocality;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hospitals or Clinics']")
    private WebElement txtpincode1;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Account Holder Name']")
    private WebElement txtAccountHolderName;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Account Number']")
    private WebElement txtAccountNumber;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Confirm Account Number']")
    private WebElement txtConfirmAccountNumber;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Bank Name']")
    private WebElement txtBankName;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Branch Name']")
    private WebElement txtBranchName;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='IFSC Code *']")
    private WebElement txtIFSCCode;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bank Location *']")
    private WebElement txtBankLocation;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Account Type *']")
    private WebElement txtTransferLimit;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Savings']")
    private WebElement txtEmailID;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transfer Limit *']")
    private WebElement txtMobileNumber;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Payments To Be Made']")
    private WebElement clickacctype;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='MONTHLY']")
    private WebElement selectacctype;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Signature']")
    private WebElement clickonsignature;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Upload Signature']")
    private WebElement clickonuploadsignature;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='android.widget.TextView']")
    private WebElement clickonuploadimage;

    public String getClinicName() {
        return ClinicName;
    }

    public void setClinicName(String clinicName) {
        ClinicName = clinicName;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    public String getConsultationFee() {
        return ConsultationFee;
    }

    public void setConsultationFee(String consultationFee) {
        ConsultationFee = consultationFee;
    }

    public String getClinicAddress() {
        return ClinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        ClinicAddress = clinicAddress;
    }

    public String getLocality() {
        return Locality;
    }

    public void setLocality(String locality) {
        Locality = locality;
    }

    public String getPincode1() {
        return Pincode1;
    }

    public void setPincode1(String pincode1) {
        Pincode1 = pincode1;
    }

    public String getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        YearsOfExperience = yearsOfExperience;
    }

    public String getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(String houseNo) {
        HouseNo = houseNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPincode() {
        return Pincode;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }


    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getConfirmAccountNumber() {
        return ConfirmAccountNumber;
    }

    public void setConfirmAccountNumber(String confirmAccountNumber) {
        ConfirmAccountNumber = confirmAccountNumber;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public String getBankLocation() {
        return BankLocation;
    }

    public void setBankLocation(String bankLocation) {
        BankLocation = bankLocation;
    }

    public String getTransferLimit() {
        return TransferLimit;
    }

    public void setTransferLimit(String transferLimit) {
        TransferLimit = transferLimit;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public DPProfile(AndroidDriver driver) {
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickProfileIcon(){
        this.clickOnProfileIcon.click();
    }
    public void clickOnPersonalInformation() {
        this.clickpersonalinformation.click();
    }
    public void enterPersonalInformationDetails(String PrimarySpecialityList){
        this.selectprimaryspeciality.click();
        for(WebElement PrimarySpeciality:primaryspecialityinlist)
        {
            if(PrimarySpeciality.getText().contains(PrimarySpecialityList))
            {
                PrimarySpeciality.click();
                this.txtyrsofexperience.sendKeys("6");
                this.txthousenum.sendKeys("302");
                this.txtaddress.sendKeys("Ameenpur");
                this.clickstate.click();
                this.selectstate.sendKeys("Telangana");
                this.clickcity.click();
                this.selectcity.sendKeys("Hyderabad");
                UtilityClass.scrollDownCustom(driver,0.4,0.8);
                this.txtpincode.sendKeys("502033");
                this.clicklanguage.click();
                this.selectlanguage.sendKeys("English","Hindi");
                UtilityClass.scrollDownCustom(driver,0.4,0.8);
                this.enterdescription.sendKeys("My self manogna I have 5 yrs experience as a gynecologist");
                this.clickstate.click();
                this.selectstate.sendKeys();
                clicknext.click();
                break;
            }
        }
    }

    public void medicalregistrationdetails() {
        clickaddregistration.click();
        txtregistrationnum.sendKeys("3675467576");
        clickonregcouncil.click();
        selectregcouncil.click();
        txtnationalregnum.sendKeys("5455435435345");
        clickregdate.click();
        selectregdate.click();
        clickregissuedate.click();
        selectregissuedate.click();
    }

    public void entereducationdetails() throws InterruptedException {
//        this.addqualification.click();
        Thread.sleep(2000);
        this.clickontype.click();
        Thread.sleep(5000);
        this.selectedutype.sendKeys("Post Graduation");
        this.txtcourse.sendKeys("MBBS");
        this.clickonuniversity.click();
        this.selectuniversity.click();
        this.clickonyrofgraduation.click();
        this.selectyrofgraduatin.click();
        this.clickstate.click();
        this.selectstate.click();
    }

    public void enterclinicdetails() throws InterruptedException {
//        addhospitalorclinic.click();
//        txtclinicname.sendKeys(getClinicAddress());
//        txtregistrationnum.sendKeys(getRegistrationNumber());
        Thread.sleep(2000);
        txtconsultationfee.sendKeys("1000");
        txtonlineconsultationfee.sendKeys("500");
//        txtaddress1.sendKeys(getAddress());
//        txtlocality.sendKeys(getLocality());
//        txtpincode.sendKeys(getPincode());
//        clickstate.click();
//        selectstate.click();
//        clickcity.click();
//        selectcity.click();s
    }

    public void enterbankaccountdetails() {
        txtAccountHolderName.sendKeys(getAccountHolderName());
        txtAccountNumber.sendKeys(getAccountNumber());
        txtConfirmAccountNumber.sendKeys(getConfirmAccountNumber());
        txtBankName.sendKeys(getBankName());
        txtBranchName.sendKeys(getBranchName());
        txtIFSCCode.sendKeys(getIFSCCode());
        txtBankLocation.sendKeys(getBankLocation());
        txtTransferLimit.sendKeys(getTransferLimit());
        txtEmailID.sendKeys(getEmailID());
        txtMobileNumber.sendKeys(getMobileNumber());
    }

    public void addSignature() {
        this.clickonsignature.click();
        this.clickonuploadsignature.click();
        this.clickonuploadimage.click();
    }
    public void checkUserShouldNotAddPersonalInformationWithoutEnterMandatoryFields(String expectedErrorMsgForPrimarySpec,String expectedErrorMsgForYrsOfExp, String expectedErrorMsgForHNo,String expectedErrorMsgForAdd,String expectedErrorMsgForState,String expectedErrorMsgForCity,String expectedErrorMsgForPincode,String expectedErrorMsgForLanguageKnown,String expectedErrorMsgForIdProof,String expectedErrorMsgForShortDescription) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))")).click();
        logger.info("Clicked on Skip Payment");
        Thread.sleep(3000);
        UtilityClass.scrollDownCustom(driver,0.4,0.8);
        Thread.sleep(2000);
//        logger.info("Primaray Speciality: "+this.expe.getText());
//        logger.info("Secondary Speciality: "+this.errorMsgForEmptyPatientName.getText());
//        logger.info("Years Of Experience: "+this.errorMsgForEmptyGender.getText());
//        logger.info("House No: "+this.errorMsgForEmptyRelation.getText());
//        if(this.errorMsgForEmptyMobNoField.getText().equals(expectedErrorMsgForMobNo)&&this.errorMsgForEmptyPatientName.getText().equals(expectedErrorMsgForPatientName)&&this.errorMsgForEmptyGender.getText().equals(expectedErrorMsgForGender)
//                &&this.errorMsgForEmptyRelation.getText().equals(expectedErrorMsgForRelation))
//        {
//            logger.info("Without filling mandatory fields user not able to book appointment.Gettig Error messages.");
//            logger.info("All expected and actual error messages are matched TC is Passed.");
//        }
//        else
//        {
//            logger.error("Check actual and expected Error Messages. TC is Failed.");
//        }
    }
}