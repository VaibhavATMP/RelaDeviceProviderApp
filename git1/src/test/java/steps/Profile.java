package steps;

import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import page.DPProfile;

public class Profile {

    AndroidDriver driver;
    BaseTest basetest;
    DPProfile dpProfile;

    public Profile() {
        this.driver =BackGround.getDriver();
        dpProfile = new DPProfile(driver);
    }
    @Then("^User click on profile icon$")
    public void userClickOnProfileIcon() {
     dpProfile.clickProfileIcon();
        dpProfile.clickOnPersonalInformation();
    }

    @Then("^user enter personal information data in fields$")
    public void userEnterDataInFields() throws InterruptedException {
        dpProfile.enterPersonalInformationDetails("Gynecology");
    }

    @Then("^user select the primary speciality$")
    public void userSelectThePrimarySpeciality() throws InterruptedException {

    }

    @Then("^user enter education details data$")
    public void clickOnEducationSection() throws InterruptedException {
        dpProfile.entereducationdetails();
    }

    @Then("^click on next buton$")
    public void clickOnNextButon() {
        driver.findElement(By.xpath("//android.widget.TextView[@text='NEXT']")).click();
    }

    @Then("^click on add clinic button$")
    public void clickOnAddClinicButton() {
        driver.findElement(By.xpath("//android.widget.TextView[@text='ADD HOSPITAL / CLINIC']")).click();
    }

    @Then("^user enter the data in clinic fields$")
    public void userEnterTheDataInClinicFields() throws InterruptedException {
        dpProfile.enterclinicdetails();
    }
    @Then("^select the clinic logo$")
    public void selectTheClinicLogo() {
        driver.findElement(By.xpath("//android.widget.TextView[@text='Upload Clinic Logo']")).click();
    }

    @Then("^user enter data in bank fields$")
    public void userEnterDataInBankFields(){
        dpProfile.enterbankaccountdetails();
    }

    @Then("^user enter registration details data$")
    public void userEnterRegistrationDetailsData() {
        dpProfile.medicalregistrationdetails();
    }

    @Then("^User try to save personal information data without filling mandatory fields$")
    public void userTryToSavePersonalInformationDataWithoutFillingMandatoryFields() {

    }
    @Then("^user add signature$")
    public void userAddSignature() {
     dpProfile.addSignature();
    }
}