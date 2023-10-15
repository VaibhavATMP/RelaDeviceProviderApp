package steps;


import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import page.DPAddPackages;

import java.io.IOException;


public class AddPackages {

    AndroidDriver driver;
    BaseTest basetest;
    DPAddPackages dpAddPackages;

    public AddPackages() {
        this.driver =BackGround.getDriver();
        dpAddPackages = new DPAddPackages(driver);

    }

    @Then("^enter data in the fields$")
    public void enterDataInTheFields() throws IOException {
       dpAddPackages.enterloginuserdetails();
    }

    @Then("^click on login button$")
    public void clickOnLoginButton() {
       dpAddPackages.Clickonlogin();
    }

    @Then("^select packages$")
    public void selectPackages() throws InterruptedException {
       dpAddPackages.clickonpackages();
    }

    @Then("^enter all the mandatory fields$")
    public void enterAllTheMandatoryFields() throws IOException {
      dpAddPackages.enterpackagedetails();
    }

    @Then("^Click on the submit button$")
    public void clickOnTheSubmitButton() {
      dpAddPackages.Clicksubmit();
    }

    @Then("^click existing package$")
    public void clickExistingPackage() {
      dpAddPackages.Clickonexistingpackage();
    }

    @Then("^update any data$")
    public void updateAnyData() throws IOException {
      dpAddPackages.updatepackage();
    }

    @Then("^click on update button$")
    public void clickOnUpdateButton() {
    dpAddPackages.Clickonupdate();
    }

    @Then("^click on add icon$")
    public void clickOnAddIcon() throws InterruptedException {
        Thread.sleep(500);
      dpAddPackages.clickOnAddIcon();
    }

    @Then("^Select end date$")
    public void selectEndDate() throws InterruptedException {
        dpAddPackages.selectPackageEndDate();
    }

    @Then("^click on inactive radio button$")
    public void clickOnInactiveRadioButton() {
      dpAddPackages.Clickoninactive();
    }

    @Then("^click on active radio button$")
    public void clickOnActiveRadioButton() {
        dpAddPackages.clickonactive();
    }

    @Then("^enter data without package name$")
    public void enterDataWithoutPackageName() throws IOException {
        dpAddPackages.enterwithoutpackagename();
    }

    @Then("^user will get error message for package name field$")
    public void userWillGetErrorMessageForPackageNameField() throws IOException {
       dpAddPackages.verifypackagenamename();
    }

    @Then("^user will get error message for all the mandatory fields$")
    public void userWillGetErrorMessageForAllTheMandatoryFields() throws IOException {
        dpAddPackages.verifypackagenamename();
    }

    @Then("^enter all the data in the fields$")
    public void enterAllTheDataInTheFields() throws IOException {
       dpAddPackages.enterwithoutactualprice();
    }

    @Then("^user will get error message for actual price field$")
    public void userWillGetErrorMessageForActualPriceField() throws IOException {
       dpAddPackages.verifyactualprice();
    }

    @Then("^click on purchased packages$")
    public void clickOnPurchasedPackages() {
      dpAddPackages.purchasedpackage();
    }

    @Then("^click on dropdown box$")
    public void clickOnDropdownBox() {
     dpAddPackages.dropdown();
    }

    @Then("^select the package$")
    public void selectThePackage() {
        dpAddPackages.selectpackage();
    }

    @Then("^click on package$")
    public void clickOnPackage() {
        dpAddPackages.selectpurchasedpackage();
    }

    @Then("^check the package details$")
    public void checkThePackageDetails() throws IOException {
      dpAddPackages.verifypurchasedpackagedetails();
    }

    @Then("^select package type$")
    public void selectPackageType() throws InterruptedException {
        dpAddPackages.selectpackagetype("Men");
    }

    @Then("^select num of consultation$")
    public void selectNoOfConsultation() throws InterruptedException {
        dpAddPackages.clickonconsultation("1");
    }

    @Then("^select num of office visits$")
    public void selectNoOfOfficeVisits() throws InterruptedException {
        dpAddPackages.selectofficevisits("2");
    }

    @Then("^select the duration$")
    public void selectTheDuration() throws InterruptedException {
        dpAddPackages.selectDuration("1 Month");
    }

    @Then("^select the clinic$")
    public void selectTheClinic() throws InterruptedException {
       //dpAddPackages.selectclinic("Vaibhavhadpeindependent");
        dpAddPackages.selectClinicInPackage();
    }

    @Then("^enter chronic$")
    public void enterChronic() throws InterruptedException {
        Thread.sleep(6000);
      dpAddPackages.clickChronic();
      Thread.sleep(5000);
      dpAddPackages.selectChronic();
      Thread.sleep(5000);
    }

    @Then("^enter package description$")
    public void enterPackageDescription() {
      dpAddPackages.enterPackageDescription();
    }

    @Then("^enter package price details$")
    public void enterPackagePriceDetails() throws InterruptedException {
        dpAddPackages.enterPackageActualPrice();
    }


    @Then("^select consultation Frequency$")
    public void selectConsultationFrequency()
    {
       dpAddPackages.enterConsultationFrequency("3");
    }
}

