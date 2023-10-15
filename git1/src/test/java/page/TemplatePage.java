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

public class TemplatePage {
    public TemplatePage(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static Logger logger = LogManager.getLogger(TemplatePage.class);

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Templates']")
    private WebElement templateOptionInMenu;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Show Template']")
    private WebElement showTemplateText;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[16]")
    private WebElement showTemplateRadioButton;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[18]")
    private WebElement createTemplateRadioButton;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[20]")
    private WebElement showTempGenderDrpDown;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='10']")
    private WebElement showTempAgeGrpDrpDown;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='3']")
    private WebElement showTempDiseaseField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='6']")
    private WebElement showTempLineOfTreatmentField;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.TextView[@index='0']")
    private List<WebElement> showTempListDiseaseTemplate;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.TextView[@index='0'][1]")
    private WebElement showTempLineOfTreatmentValue;
    //@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[6]//android.widget.TextView")private List<WebElement> showTempGenderList;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.view.ViewGroup//android.widget.TextView")
    private List<WebElement> showTempAgelist;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='No Template Available']")
    private WebElement noTemplateDefaultMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Edit Template']")
    private WebElement editTemplateButton;

    @AndroidFindBy(xpath = "((//android.view.ViewGroup[@index='9'])//android.widget.TextView[@text='Edit'])[1]")
    private WebElement editMedicine;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='5'])")
    private WebElement showTempFrequencyField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Medicine']")
    private WebElement addMedicineButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='UPDATE TEMPLATE']")
    private WebElement updateTemplateButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CREATE / SUBMIT']")
    private WebElement createSubmitTemplate;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
    private WebElement createTempDiseaseField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    private WebElement createTemplineOfTreatmentDiseaseFiiled;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='3']")
    private WebElement createTemplineOfTreatmentDiseaseUnFiiled;
    @AndroidFindBy(xpath = "((//android.view.ViewGroup[@index='0'])[19]//android.widget.TextView)[1]")
    private WebElement createTempDrpDwnValueDiseaseField;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='7']")
    private WebElement gederFieldCreateTemplate;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[6]//android.widget.TextView")
    private List<WebElement> genderListCreateTemplate;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='8'])")
    private WebElement ageGroupDrpDownCreateTemplate;

    @AndroidFindBy(xpath = "(//android.widget.Button[@index='0'])[2]")
    private WebElement addMedicineCreateTemplate;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='1'])[2]")
    private WebElement addMedicineFieldCreateTemplate;

    @AndroidFindBy(xpath = "((//android.view.ViewGroup[@index='0'])[24]//android.view.ViewGroup)[1]")
    private WebElement selectDrugCreateTemplate;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='4'])")
    private WebElement dosageRouteDrpDwnCreateTemplate;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[8]")
    private WebElement dosageRouteValueCreateTemplate;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='6'])")
    private WebElement frequencyDrpDwnCreateTemplate;

    @AndroidFindBy(xpath = "((//android.view.ViewGroup[@index='0'])[6]//android.view.ViewGroup)[1]")
    private WebElement frequencyDrpDwnValueCreateTemplate;

    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='1'])[3]")
    private WebElement durationFieldCreateTemplate;

    @AndroidFindBy(xpath = "((//android.view.ViewGroup[@index='0'])[26]//android.widget.TextView)[1]")
    private WebElement durationValueCreateTemplate;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='11'])[2]")
    private WebElement allowReffillsField;

    @AndroidFindBy(xpath = "((//android.view.ViewGroup[@index='0'])[5]//android.widget.TextView)[2]")
    private WebElement allowRefillsValueCreateTemp;

    @AndroidFindBy(xpath = "((//android.view.ViewGroup[@index='13'])//android.view.ViewGroup)[2]")
    private WebElement allowGenericYesRadioButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ok']")
    private WebElement okPopup;

    @AndroidFindBy(xpath = "//android.widget.Switch[@index='13']")
    private WebElement togglebuttonForLabOrder;

    @AndroidFindBy(xpath = "//android.widget.Switch[@index='14']")
    private WebElement togglebuttonForLabOrderAfterfillingdata;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[18]//android.widget.TextView")
    private List<WebElement> labOrderSections;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select']")
    private WebElement selectOptionLabOrderCreateTemplate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Test']")
    private WebElement addTestOptionLabCreateTemp;

    //@AndroidFindBy(xpath = "(//android.widget.EditText[@index='1'])[2]")
    //private WebElement addTestFieldCreateTemp;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='1'])[2]")
    private WebElement addTestFieldCreateTemp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' 24 Hr.Blood Pressure Monitoring']")
    private WebElement testSearchResultcreateTemp;

    @AndroidFindBy(xpath = "((//android.view.ViewGroup[@index='2'])//android.widget.TextView)[5]")
    private WebElement addTestButton;

    @AndroidFindBy(xpath = "((//android.view.ViewGroup[@index='2'])//android.widget.EditText)[2]")
    private WebElement instructionsFieldCreateTemp;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='4'])")
    private WebElement reasonForStudyCreateTemplate;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Select item'])[1]") private WebElement modalityAndTestName;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[6]//android.widget.TextView")
    List<WebElement> modalityList;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[23]//android.view.ViewGroup//android.widget.TextView") List<WebElement> templateListOnClickOnDiseaseField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete Template']")private WebElement deleteTemplateBtn;
    public void clickOnTemplateAndLandOnTemplatepage() throws InterruptedException {
        UtilityClass.implicitlyWait(driver, 20);
        this.templateOptionInMenu.click();
        logger.info("Clicked on Temlates option in menu");
        Thread.sleep(2000);
        logger.info("Landed on Template page and user can see radio button for:" + this.showTemplateText.getText());
    }

    public void verifyBydefaultShowTemplateRadioButtonSelected() throws InterruptedException {
        Thread.sleep(4000);
        if (this.showTemplateRadioButton.isEnabled()) {
            logger.info("By Default Show Template Radio Button is Selected TC is Passed");
        } else {
            logger.info("By Default Show Template Radio Button is not Selected. TC is Failed.");
        }
    }

    public void showAllreadyCreatedTemplateList() throws InterruptedException {
        this.showTempDiseaseField.click();
        Thread.sleep(3000);
        System.out.println("List Of Allready Created Templates");
        Thread.sleep(2000);
        for (WebElement templatefromList : this.showTempListDiseaseTemplate) {
            //System.out.println(templatefromList.getText());
            logger.info(templatefromList.getText());
        }
        logger.info("All allready created Templates fetched successfully");
    }

    public void selectDiseaseORTemplate(String templateName) throws InterruptedException {
        Thread.sleep(2000);
        this.showTempDiseaseField.click();
        Thread.sleep(3000);
        for (WebElement templatefromList : this.showTempListDiseaseTemplate) {
            if (templatefromList.getText().equals(templateName)) {
                templatefromList.click();
                break;
            }
        }
        logger.info("Template Selected:" + templateName);
    }

    public void selectLineOfTreatment() throws InterruptedException {
        Thread.sleep(5000);
        this.showTempLineOfTreatmentField.click();
        Thread.sleep(2000);
        logger.info("Line of Treatment Selected");
        Thread.sleep(2000);
        this.showTempLineOfTreatmentValue.click();
    }

    public void selectGender(String enterGender) throws InterruptedException {
        Thread.sleep(3000);
        this.gederFieldCreateTemplate.click();
        Thread.sleep(2000);
        for (int i = 1; i <= 3; i++) {
            WebElement gender = driver.findElement(By.xpath("((//android.view.ViewGroup[@index='0'])[6]//android.widget.TextView)[" + i + "]"));
            if (gender.getText().equals(enterGender)) {
                gender.click();
                break;
            }

        }
        logger.info("Gender selected:" + enterGender);

    }

    public void selectAgeGroup(String enterAgeGroup) throws InterruptedException {
        Thread.sleep(2000);
        this.showTempAgeGrpDrpDown.click();
        Thread.sleep(2000);
        for (WebElement ageGroup : this.showTempAgelist) {
            if (ageGroup.getText().equals(enterAgeGroup)) {
                ageGroup.click();
                break;
            }
        }
        logger.info("Age Group selected: " + enterAgeGroup);
    }

    public void clickOnEditTemplateButton() throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.scrollDownCustom(driver, 0.9, 0.1);
        Thread.sleep(2000);
        this.editTemplateButton.click();
        logger.info("Clicked on Edit Template Button");
    }

    public void clickOnEditMedicineAndEdit(String enterFrequency) throws InterruptedException {
        Thread.sleep(4000);
        this.editMedicine.click();
        Thread.sleep(4000);
        this.showTempFrequencyField.click();
        Thread.sleep(2000);
        List<WebElement> freqList = driver.findElements(By.xpath("//android.widget.ScrollView[@content-desc='undefined flatlist']//android.view.ViewGroup//android.widget.TextView"));
        for (WebElement frequency : freqList) {
            if (frequency.getText().equals(enterFrequency)) {
                frequency.click();
                break;
            }
        }
        logger.info("Clicked on Edit option for medicine");
    }

    public void clickOnAddMedicine() {

        this.addMedicineButton.click();
        logger.info("Clicked on add medicine button.");
    }

    public void clickOnUpdateTemplate() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.scrollDownCustom(driver, 0.9, 0.1);
        Thread.sleep(3000);
        this.updateTemplateButton.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='OK']")).click();
        logger.info("Template Updated successfully.");
    }

    public void editTemplate(String templateName, String enterGender, String enterAgeGroup) throws InterruptedException {
        selectDiseaseORTemplate(templateName);
        selectLineOfTreatment();
        selectGender(enterGender);
        selectAgeGroup(enterAgeGroup);
        clickOnEditTemplateButton();
        clickOnEditMedicineAndEdit("1-0-0");
        clickOnAddMedicine();
        clickOnUpdateTemplate();
    }

    public void tryToEditWithoutFillingMandatoryField(String templateName) throws InterruptedException {
        selectDiseaseORTemplate(templateName);
        selectLineOfTreatment();
        logger.info("Selected Template and Line of Treatment but not Gender and Age Group which are mandatory");
        logger.info("Showing default message as: " + this.noTemplateDefaultMessage.getText());

    }

    public void enterValidGenderAndAgeGroupCombination(String templateName, String enterGender, String enterAgeGroup) throws InterruptedException {
        selectDiseaseORTemplate(templateName);
        selectLineOfTreatment();
        selectGender(enterGender);
        selectAgeGroup(enterAgeGroup);
        Thread.sleep(2000);
        UtilityClass.scrollDownCustom(driver, 0.9, 0.1);
        Thread.sleep(2000);
        if (this.editTemplateButton.isDisplayed()) {
            logger.info("Entered data is valid and User can view and Edit Template TC is Passed.");
        } else {
            logger.info("Entered data is invalid. User not able to edit Templae TC is Failed.");
        }
    }

    public void verifyDefaultMessage() throws IOException {
        if (this.noTemplateDefaultMessage.getText().equals(UtilityClass.readDataFromPropertyFile("DefaultMsgForTemplate"))) {
            logger.info("Actual and Expected Default Messages are matched TC is Passed");
        } else {
            logger.info("Actual and Expected Default Messages are not matched TC is Failed");
        }
    }

    public void clickOnCreateTemplateAndNavigateToCreteTemplatePage() {
        UtilityClass.implicitlyWait(driver, 10);
        this.createTemplateRadioButton.click();
        if (this.createSubmitTemplate.isDisplayed()) {
            logger.info("User landed on Create Template Page.");
        } else {
            logger.info("User not landed on Create Template Page.");
        }

    }

    public void enterDiseaseInCreateTemplate(String templateORDiseaseName) throws InterruptedException {
        this.createTempDiseaseField.sendKeys(templateORDiseaseName);
        Thread.sleep(5000);
        this.createTempDrpDwnValueDiseaseField.click();
    }

    public void enterLineOfTreatmentCreateTemplate(String enterLineOfTreatment) throws InterruptedException {
        this.createTemplineOfTreatmentDiseaseFiiled.sendKeys(enterLineOfTreatment);
    }

    public void selectGenderCreateTemplate(String enterGender) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@index='7']")).click();
        Thread.sleep(2000);
        for (WebElement gender : this.genderListCreateTemplate) {
            if (gender.getText().equals(enterGender)) {
                gender.click();
                break;
            }
        }

    }

    public void selectAgeGroupCreateTemplate(String enterAgeGroup) throws InterruptedException {
        Thread.sleep(2000);
        this.ageGroupDrpDownCreateTemplate.click();
        Thread.sleep(3000);
        for (WebElement ageGroup : this.showTempAgelist) {
            if (ageGroup.getText().equals(enterAgeGroup)) {
                ageGroup.click();
                logger.info("Age group value selected");
                break;
            }
        }
    }

    public void emptyTemplate() throws InterruptedException {
        enterDiseaseInCreateTemplate("Custom Template for Fever cold Headache");
        enterLineOfTreatmentCreateTemplate("Tablets and Tests");
        this.selectGenderCreateTemplate("Other");
        selectAgeGroupCreateTemplate("Any");
        if (this.createSubmitTemplate.isEnabled()) {
            logger.info("Medicines and Lab Orders are not added.");
            logger.info("User not able to add Empty Template.");
        } else {
            logger.info("Medicines and Lab Orders are not added. Create/Submit Button is Disable");
            logger.info("User not able to add Empty Template.");
        }


    }

    public void addMedicineInCreateTemplate(String enterMedicineName) throws InterruptedException {
        Thread.sleep(2000);
        this.addMedicineCreateTemplate.click();
        Thread.sleep(2000);
        this.addMedicineFieldCreateTemplate.sendKeys(enterMedicineName);
        Thread.sleep(5000);
        this.selectDrugCreateTemplate.click();
        Thread.sleep(2000);
        this.dosageRouteDrpDwnCreateTemplate.click();
        Thread.sleep(2000);
        this.dosageRouteValueCreateTemplate.click();
        Thread.sleep(2000);
        this.frequencyDrpDwnCreateTemplate.click();
        Thread.sleep(2000);
        this.frequencyDrpDwnValueCreateTemplate.click();
        Thread.sleep(2000);
        this.durationFieldCreateTemplate.sendKeys("3");
        Thread.sleep(2000);
        this.durationValueCreateTemplate.click();
        Thread.sleep(2000);
        this.allowReffillsField.click();
        Thread.sleep(2000);
        this.allowRefillsValueCreateTemp.click();
        Thread.sleep(2000);
        this.allowGenericYesRadioButton.click();
        Thread.sleep(2000);
        this.addMedicineButton.click();
        logger.info("Medicine added successfully");

    }

    public void clickOnCreateOrSubmitTemplate() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.scrollDownCustom(driver, 0.8, 0.3);
        Thread.sleep(2000);
        this.createSubmitTemplate.click();
        Thread.sleep(4000);
        this.okPopup.click();
    }

    public void createTemplateAddOnlyMedicine() throws InterruptedException {
        enterDiseaseInCreateTemplate("Fever With Chills");
        enterLineOfTreatmentCreateTemplate("Medicines and Lab Tests");
        selectGenderCreateTemplate("Other");
        selectAgeGroupCreateTemplate("Any");
        addMedicineInCreateTemplate("dolo");
        clickOnCreateOrSubmitTemplate();
        logger.info("Template Created having only medicines.");
    }

    public void selectLabOrderSection(String labOrderSection) throws InterruptedException {
        Thread.sleep(4000);
        for (WebElement labOrdersSection : labOrderSections) {
            if (labOrdersSection.getText().contains(labOrderSection)) {
                labOrdersSection.click();
                break;
            }
        }
    }

    public void enableLabOrderToggleButtonAndSee() throws InterruptedException {
        Thread.sleep(3000);
        this.togglebuttonForLabOrder.click();
        logger.info("User enabled Toggle button");
        selectLabOrderSection("Clinical Investigations");
        logger.info("User can able to see Lab,Clinical and Radiology Orders.");
    }

    public void clickOnSelectAndAddTest() throws InterruptedException {
        Thread.sleep(2000);
        this.selectOptionLabOrderCreateTemplate.click();
        Thread.sleep(2000);
        this.addTestOptionLabCreateTemp.click();
    }

    public void addTestNameInLabOrders(String enterTestName) throws InterruptedException {
        Thread.sleep(3000);
        this.addTestFieldCreateTemp.sendKeys(enterTestName);
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[29]//android.widget.TextView[@index='1']")).click();
    }

    public void addClinicalInvestigation(String enterTemplateName, String lineOfTreatment, String enterGender, String enterAgeGroup, String labOrdersSections) throws InterruptedException {
        Thread.sleep(3000);
        enterDiseaseInCreateTemplate(enterTemplateName);
        enterLineOfTreatmentCreateTemplate(lineOfTreatment);
        selectGenderCreateTemplate(enterGender);
        selectAgeGroupCreateTemplate(enterAgeGroup);
        Thread.sleep(3000);
        this.togglebuttonForLabOrderAfterfillingdata.click();
        selectLabOrderSection(labOrdersSections);
        clickOnSelectAndAddTest();
        addTestNameInLabOrders("Blood");
        Thread.sleep(3000);
        this.instructionsFieldCreateTemp.sendKeys("Test and Submit Report");
        Thread.sleep(3000);
        this.reasonForStudyCreateTemplate.sendKeys("For Accurate Diagnosis");
        Thread.sleep(3000);
        this.addTestOptionLabCreateTemp.click();
        clickOnCreateOrSubmitTemplate();
    }
    public void addAnySingleLabOrders(String labSection,String testName) throws InterruptedException {
        Thread.sleep(3000);
        selectLabOrderSection(labSection);
        clickOnSelectAndAddTest();
        addTestNameInLabOrders(testName);
        Thread.sleep(3000);
        this.instructionsFieldCreateTemp.sendKeys("Test and Submit Report");
        Thread.sleep(3000);
        this.reasonForStudyCreateTemplate.sendKeys("For Accurate Diagnosis");
        Thread.sleep(3000);
        this.addTestOptionLabCreateTemp.click();
        Thread.sleep(2000);
        logger.info("Test added successfully");
    }
    public void addRadiologyOrders(String modalityDrpDwnValue,String testNameDrpDwnValue) throws InterruptedException {
        Thread.sleep(2000);
        selectLabOrderSection("Radiology Orders");
        clickOnSelectAndAddTest();
        Thread.sleep(2000);
        this.modalityAndTestName.click();
        Thread.sleep(2000);
        for(WebElement modalityResult:modalityList)
        {
            if(modalityResult.getText().contains(modalityDrpDwnValue))
            {
                modalityResult.click();
                break;
            }
        }
        Thread.sleep(2000);
        this.modalityAndTestName.click();
        Thread.sleep(2000);
        for(WebElement modalityResult:modalityList)
        {
            if(modalityResult.getText().contains(testNameDrpDwnValue))
            {
                modalityResult.click();
                break;
            }
        }
        Thread.sleep(3000);
       driver.findElement(By.xpath("((//android.view.ViewGroup[@index='2'])//android.widget.EditText)[1]")).sendKeys("Test and Submit Report");
        Thread.sleep(3000);
        driver.findElement(By.xpath("((//android.view.ViewGroup[@index='2'])//android.widget.EditText)[2]")).sendKeys("For Accurate Diagnosis");
        Thread.sleep(3000);
        this.addTestOptionLabCreateTemp.click();
        Thread.sleep(2000);

    }
    public void addAllLabOrderAndCreateTemplate(String enterTemplateName, String lineOfTreatment, String enterGender, String enterAgeGroup) throws InterruptedException
    {
        Thread.sleep(3000);
        enterDiseaseInCreateTemplate(enterTemplateName);
        enterLineOfTreatmentCreateTemplate(lineOfTreatment);
        selectGenderCreateTemplate(enterGender);
        selectAgeGroupCreateTemplate(enterAgeGroup);
        Thread.sleep(3000);
        this.togglebuttonForLabOrderAfterfillingdata.click();

        addAnySingleLabOrders("Lab Orders","Blood");
        addAnySingleLabOrders("Clinical Investigation","Blood");
        addRadiologyOrders("ANGIOGRAPHY","ANGIOGRAPHY");

        clickOnCreateOrSubmitTemplate();
    }

    public void createSampleTemplateHavingMedicineandTests(String enterTemplateNames, String lineOfTreatments, String enterGender, String enterAgeGroup) throws InterruptedException {

        Thread.sleep(3000);
        enterDiseaseInCreateTemplate(enterTemplateNames);
        enterLineOfTreatmentCreateTemplate(lineOfTreatments);
        selectGender(enterGender);
        selectAgeGroupCreateTemplate(enterAgeGroup);
        Thread.sleep(3000);

        addMedicineInCreateTemplate("Para");
        Thread.sleep(3000);

        this.togglebuttonForLabOrderAfterfillingdata.click();
        Thread.sleep(3000);
        UtilityClass.scrollDownCustom(driver,0.7,0.2);
        Thread.sleep(3000);

        addAnySingleLabOrders("Clinical Investigation","Blood");

        clickOnCreateOrSubmitTemplate();

    }
    public void viewlistOfTemplateOnClickOnDiseaseField() throws InterruptedException {Thread.sleep(3000);
        this.showTempDiseaseField.click();
        Thread.sleep(3000);
        logger.info("List of Templates created by Provider");
        for(WebElement template:templateListOnClickOnDiseaseField)
        {
            logger.info(template.getText());
        }
    }

    public void userClickOnDiseaseFieldAndDeleteTemplate(String enterTemplateToBeDelete) throws InterruptedException {
        this.showTempDiseaseField.click();
        Thread.sleep(3000);
        logger.info("clicked on Disease field now find list");
        List<WebElement> templateNameANdDeleteSymbolList=driver.findElements(By.xpath("((//android.view.ViewGroup[@index='0'])[23]//android.view.ViewGroup)"));

        for(int i=1;i<=templateNameANdDeleteSymbolList.size();i=i+2)
        {
            WebElement templateName=driver.findElement(By.xpath("((//android.view.ViewGroup[@index='0'])[23]//android.view.ViewGroup//android.widget.TextView)["+i+"]"));
            if (templateName.getText().contains(enterTemplateToBeDelete))
            {
                logger.info(templateName.getText());
                WebElement deleteIcon=driver.findElement(By.xpath("((//android.view.ViewGroup[@index='0'])[23]//android.view.ViewGroup)["+i+"]//android.view.ViewGroup//android.widget.TextView"));
                deleteIcon.click();
                logger.info("Template Deleted Successfully.");
                break;

            }
        }
        this.okPopup.click();

    }
    public void clickOnDeleteTemplateButton() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.scrollDownCustom(driver,0.8,0.2);
        Thread.sleep(2000);
        this.deleteTemplateBtn.click();
    }

    public void fillAllValidDataOfTemplateViewAndThenDelete(String enterTemplateNames,String enterGender,String enterAgeGroup) throws InterruptedException {
        Thread.sleep(3000);
        this.selectDiseaseORTemplate(enterTemplateNames);
        this.selectLineOfTreatment();
        this.selectGender(enterGender);
        this.selectAgeGroup(enterAgeGroup);
        Thread.sleep(1000);
        clickOnDeleteTemplateButton();
    }

    public void editDiseaseORTemplateName(String tempNameToBeEdit) throws InterruptedException {
        Thread.sleep(2000);
        this.createTempDiseaseField.clear();
        this.createTempDiseaseField.sendKeys(tempNameToBeEdit);
        List<WebElement>editTempDiseaseList=driver.findElements(By.xpath("(//android.view.ViewGroup[@index='0'])[19]//android.widget.TextView"));
        Thread.sleep(3000);
        for (WebElement templatefromList : editTempDiseaseList) {
            if (templatefromList.getText().contains(tempNameToBeEdit)) {
                templatefromList.click();
                break;
            }
        }
        logger.info("Template Selected:" + tempNameToBeEdit);
    }


    public void editTemplateNameAndVerify(String templateName,String enterGender,String enterAgeGroup,String  tempNameToBeEdit) throws InterruptedException {
        selectDiseaseORTemplate(templateName);
        selectLineOfTreatment();
        selectGender(enterGender);
        selectAgeGroup(enterAgeGroup);
        clickOnEditTemplateButton();
      editDiseaseORTemplateName(tempNameToBeEdit);
      clickOnUpdateTemplate();
        Thread.sleep(2000);
        this.showTempDiseaseField.click();
        Thread.sleep(3000);
        for (WebElement templatefromList : this.showTempListDiseaseTemplate) {
            if (templatefromList.getText().contains(tempNameToBeEdit)) {
                logger.info("Updated Template Name: "+templatefromList.getText());
                break;
            }
        }


    }
    public void editLineOfTreatment(String enterLineOfTreatmentNew) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.EditText[@index='4']")).clear();
        driver.findElement(By.xpath("//android.widget.EditText[@index='4']")).sendKeys("Test and Update Line Of Treatment");
    }

    public void editAndVerifyLineOfTreatmentInTemplate(String templateName,String enterGender,String enterAgeGroup,String lineOfTreatmentToBeEdit) throws InterruptedException {
        selectDiseaseORTemplate(templateName);
        selectLineOfTreatment();
        selectGender(enterGender);
        selectAgeGroup(enterAgeGroup);
        clickOnEditTemplateButton();
        editLineOfTreatment(lineOfTreatmentToBeEdit);
        clickOnUpdateTemplate();
        selectDiseaseORTemplate(templateName);
        Thread.sleep(2000);
        this.showTempLineOfTreatmentField.click();
        Thread.sleep(2000);
        WebElement lineOfTreatmentsList=driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[23]//android.widget.TextView"));
        logger.info("Updated Line of Treatment: "+lineOfTreatmentsList.getText());
        //        for(WebElement lineOfTreatment:lineOfTreatmentsList)
//        {
//            if(lineOfTreatment.getText().contains(lineOfTreatmentToBeEdit))
//            {
//                logger.info("New Edited Line of Treatment is: "+lineOfTreatment.getText());
//                break;
//            }
//        }

    }
}
