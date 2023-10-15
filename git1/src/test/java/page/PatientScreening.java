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

import java.util.List;

import static steps.BackGround.driver;

public class PatientScreening {
    TemplatePage templatePage;

    public PatientScreening(AndroidDriver driver) throws InterruptedException {
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        templatePage=new TemplatePage(driver);
    }

    Logger logger = LogManager.getLogger(PatientScreening.class);
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']//android.view.ViewGroup//android.widget.TextView[@index='1']")
    List<WebElement> patientScreeningFeatureList;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='header_LG']//android.view.ViewGroup//android.widget.TextView[@index='1']")
    WebElement titleOfPatScreeningFeaturePage;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='header_LG']//android.view.ViewGroup//android.widget.TextView[@index='0']")
    WebElement backBtnOfPatScreeningFeaturePage;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search / add symptoms']")
    private WebElement searchBarHOPI;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']//android.widget.TextView[@index='1']")
    private List<WebElement> listOfHOPI;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='1']//android.widget.TextView[@index='1']")
    private List<WebElement> listOfAddedHOPIForEdit;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Save']")
    private WebElement saveBtn;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='1']//android.view.ViewGroup//android.widget.TextView[@index='1']")
    private List<WebElement> listOfAddedHOPI;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='1']//android.widget.TextView[@index='0'])[1]")
    private WebElement onsetFieldInFever;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='1']//android.widget.TextView[@index='0'])[2]")
    private WebElement characterFieldInFever;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='1']")
    private WebElement agrevatingFactorFieldInFever;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='1']")
    private WebElement releavingFactorFieldInFever;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='5']//android.view.ViewGroup[@index='1']")
    private WebElement associationFieldInFever;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='6']//android.view.ViewGroup[@index='1']")
    private WebElement courseFieldInFever;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='7']//android.view.ViewGroup[@index='1']")
    private WebElement severityFieldInFever;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']//android.widget.TextView")
    private List<WebElement> optionsListInFeverForDifferentField;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private List<WebElement> onsetOptionList;

    @AndroidFindBy(xpath = "//android.widget.Button//android.widget.TextView[@text='Ok']")
    private WebElement okPopupBtn;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='1']//android.view.ViewGroup[@index='2'])[1]")
    private WebElement deleteIconForHOPI;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Demographics']")
    private WebElement demographicsPatientInfo;
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index='0']//android.view.ViewGroup[@index='1']//android.widget.TextView")
    private List<WebElement> listOfPatientInformationPatientInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lifeline']")
    private WebElement lifelinePatientInfo;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Reports And Records']")
    private WebElement reportsAndRcordsPatientInfo;

    @AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='0'])[2]")
    private WebElement lifeTimeDrpDwnLifeline;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private List<WebElement> lifeTimeListLifeline;

    @AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='0'])[4]")
    private WebElement allEventDrpDwnLifeline;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView")
    private List<WebElement> allEventListLifeline;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='2'])[2]//android.view.ViewGroup[@index='5']//android.widget.TextView")
    private List<WebElement> listOfEventsInLifeline;

    @AndroidFindBy(xpath = "//android.widget.HorizontalScrollView//android.view.ViewGroup//android.widget.TextView")
    private List<WebElement> reportTypesListInReportsAndRecords;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='3']")
    private List<WebElement> listOfErrorMessagesForVitals;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='History Of Vitals']")
    private WebElement historyOfVitalOption;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='1']//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='2']//android.widget.EditText)[4]")
    private WebElement bodyHeightVitalField;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='1']//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='2']//android.widget.EditText)[5]")
    private WebElement bodyWeightVitalField;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='1']//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='2']//android.widget.EditText)[6]")
    private WebElement bpSystolicVitalField;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='1']//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='2']//android.widget.EditText)[7]")
    private WebElement bpDystolicVitalField;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='header_LG']//android.view.ViewGroup[@index='2']")
    private WebElement assesmentSettingIcon;

    @AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0'])[1]//android.widget.TextView[@index='0']") private List<WebElement> enabledAssesmentList;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='1'])[2]//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.TextView[@index='0']")
    private List<WebElement> assesmentListVisible;

   @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='1']//android.widget.ScrollView[@index='0']//android.view.ViewGroup)[3]") private WebElement mentalStatusFieldNeuro;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='1']//android.widget.ScrollView[@index='0']//android.view.ViewGroup)[5]") private WebElement pupilFieldNeuro;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='1']//android.widget.ScrollView[@index='0']//android.view.ViewGroup)[7]") private WebElement pupilSizeLeftFieldNeuro;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='1']//android.widget.ScrollView[@index='0']//android.view.ViewGroup)[9]") private WebElement pupilSizeRightFieldNeuro;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='1']//android.widget.ScrollView[@index='0']//android.view.ViewGroup)[11]") private WebElement affectFieldNeuro;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc='undefined flatlist']//android.widget.TextView") private List<WebElement> optionListForNeuroAssesmentFields;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drug Sensitivity']") private WebElement drugSensitivityOverview;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Food Sensitivity']") private WebElement foodSensitivityOverview;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Environment Sensitivity']") private WebElement environmentSensitivityOverview;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Medication History']") private WebElement medicationHistoryOverview;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Past Medical Condition']") private WebElement pastMedicalConditionOverview;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Family History']") private WebElement familyHistoryOverview;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Past Surgical History']") private WebElement pastSurgicalHistoryOverview;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Problem List']") private WebElement problemListOverview;
  @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='1']//android.widget.EditText") private WebElement searchBarInOverview;
  @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='1']//android.widget.ScrollView[@index='0']//android.widget.TextView")private List<WebElement> listOfResultsOverview;

   @AndroidFindBy(xpath = "//android.widget.EditText[@index='1']") private WebElement startedFromField;
   @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']//android.widget.TextView") private List<WebElement> optionsListOfStartedFrom;

   @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='5']") private WebElement editIconForDrugInDrugSensitivity;

   @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='2'])[1]") private WebElement deleteIconDrugSensitivity;

   @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='1'])[4]")private WebElement frequencyFieldInOverview;
@AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")private WebElement outcomeFieldInPastMedicalConditionOverview;

@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='4'])[1]") private WebElement editIconForPastMedicalHistory;
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Family History']")private WebElement addFamilyHistoryBtn;
@AndroidFindBy(xpath = "//android.view.ViewGroup[@index='3']") private WebElement relationFieldInFamilyHistory;
@AndroidFindBy(xpath = "//android.widget.EditText[@index='1']") private WebElement conditionFieldInFamilyHistory;
@AndroidFindBy(xpath = "//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='0']") private WebElement deleteIconForFamilyMemberInFamHistory;
@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='2']//android.view.ViewGroup[@index='0'])[1]")private WebElement currentStatusFieldInProblemList;

@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='7'])[1]") private WebElement editIconInProblemList;

@AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.TextView[@text='Edit']") private WebElement editSocialHistoryBtn;

@AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1']//android.view.ViewGroup[@index='0']") private WebElement sleepFieldInSocialHistory;

@AndroidFindBy(xpath = "//android.view.ViewGroup[@index='1']//android.widget.ScrollView[@index='0']//android.widget.TextView[@index='1']") private List<WebElement> medicineListInPrescription;
@AndroidFindBy(xpath = "//android.view.ViewGroup[@index='4']//android.widget.TextView[@index='0']") private WebElement favouriteDdrugIconPrescription;

@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='2'])[1]") private WebElement dosageRoutInPrescription;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']//android.widget.TextView") private List<WebElement> frequencyListInPrescription;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']//android.widget.EditText[@index='4']") private WebElement frequencyFieldInPrescription;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='5']//android.widget.EditText[@index='1']") private WebElement durationFieldInPrescription;
    //@AndroidFindBy(xpath = "")private List<WebElement> listOfDurationOptionInPrescription;

    //@AndroidFindBy(accessibility = "header_goback") private WebElement backButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='\uF110']") private WebElement backButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='6']//android.widget.EditText[@index='1']") private WebElement instructionsFieldInPrescription;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='8']")private WebElement allowRefillsFieldInPrescription;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='10']") private WebElement allowGenericsYesInPrescription;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='11']") private WebElement allowGenericsNoInPrescription;
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Show Templates']") private WebElement showTemplatesBtnInPrescription;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Apply']") private WebElement applyTemplatBtnInPrescription;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Prescription History']") private WebElement prescriptionHistoryBtnInPrescription;

@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='8']//android.widget.Button)[1]") private WebElement addPrescriptionBtnInPrescriptioHistory;

@AndroidFindBy(xpath = "(//android.widget.TextView[@index='2'])") private WebElement successfullPopupTextPrescription;
@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='1']//android.view.ViewGroup[@index='2'])[2]") private WebElement editMedicineInPrescription;

@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='2']//android.view.ViewGroup[@index='2'])") private WebElement deleteIconForMedicineInPrescription;
@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0']//android.widget.TextView[@index='2'])")private WebElement deleteSuccessfullPopupInPrescription;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Diagnosis']") private WebElement addDiagnosisBtnInDiagnosis;

@AndroidFindBy(xpath = "//android.view.ViewGroup[@index='1']//android.widget.EditText[@index='0']") private WebElement writeDiagnosisTextBox;
@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='1'])[6]") private WebElement diagnosisTypeFieldInDiagnosis;

@AndroidFindBy(xpath = "(//android.widget.ScrollView[@index='0']//android.view.ViewGroup)[2]") private WebElement outsideClickPatientInfo;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Exercise regularly']") private WebElement patientInstructionsPreDefined;
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lab Investigations']") private WebElement labInvestigation;
@AndroidFindBy(xpath = "//android.widget.EditText[@text='eg: CBC']") private WebElement labInvestigationSearchBar;
@AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']//android.widget.TextView") private List<WebElement> labOrdersList;
@AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")private WebElement labOrderInstructionField;
@AndroidFindBy(xpath = "//android.widget.EditText[@index='1']") private WebElement followUpFieldInPatientScreening;
@AndroidFindBy(xpath = "//android.widget.EditText[@index='1']") private WebElement doctorNameFieldInReferdoctor;

@AndroidFindBy(xpath = "(//android.widget.EditText[@index='4'])") private WebElement specialityOfDrRefDr;
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Preview']") private WebElement previewInPatientScreening;
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Close']") private WebElement closePreviewPdf;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='End Encounter']") private WebElement endEncounter;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Whats app']") private WebElement whatsappOption;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Email']") private WebElement emailOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SEND']") private WebElement sendEncounterPdfOption;




    public void clickOnPatientScreeningFeatureAndVerifyPageTitle(String enterPatientScreeningFeature, String enterTitleOfPage) throws InterruptedException {
        UtilityClass.implicitlyWait(driver,20);
        for (WebElement patScreeningFeature : patientScreeningFeatureList) {
            if (patScreeningFeature.getText().contains(enterPatientScreeningFeature)) {
                Thread.sleep(2000);
                String feature=patScreeningFeature.getText();
                patScreeningFeature.click();
                Thread.sleep(2000);
                logger.info("User successfully clicked on: " +feature);
                break;
            }
        }
        //UtilityClass.explicitlyWait(titleOfPatScreeningFeaturePage,driver,20);
        Thread.sleep(4000);
        System.out.println("Title of page is: " + titleOfPatScreeningFeaturePage.getText());
        if (titleOfPatScreeningFeaturePage.getText().equals(enterTitleOfPage)) {
            logger.info("User landed on: " + enterTitleOfPage);
        } else {
            logger.info("Check Page loaded or not.");
        }
    }

    public void addSingleHOPI(String enterHOPI) throws InterruptedException {
        UtilityClass.explicitlyWait(searchBarHOPI, driver, 20);
        //this.searchBarHOPI.sendKeys(enterHOPI);
        this.searchBarHOPI.click();
        Thread.sleep(3000);
        for (WebElement hopi : listOfHOPI) {
            if (hopi.getText().contains(enterHOPI)) {
                UtilityClass.explicitlyWait(hopi, driver, 10);
                hopi.click();
                logger.info("HOPI Selected: " + enterHOPI);
                break;
            }
        }

    }

    public void clickOnSave() throws InterruptedException {
        Thread.sleep(3000);
        this.saveBtn.click();
    }

    public void selectOptionForDifferentFields(String enterOptionToSelect) {
        for (WebElement option : optionsListInFeverForDifferentField) {
            if (option.getText().contains(enterOptionToSelect)) {
                option.click();
                break;
            }
        }
    }

    public void addDetailsForHOPI(String enterHOPIToAddDetails, String enterOnsetOptionNeedToSelect, String enterOptionToSelectInCharacter,
                                  String enterOptionToSelectInAgrevatIngFactor, String enterOptionToSelectInReleavingFactor, String enterOptionToSelectInAssociation, String enterOptionToSelectInCourse,
                                  String enterOptionToSelectInseverity) throws InterruptedException {
        for (WebElement HOPI : listOfAddedHOPI) {
            if (HOPI.getText().contains(enterHOPIToAddDetails)) {
                HOPI.click();
                logger.info("Clicked on " + HOPI.getText() + " and landed on Details page");
                break;
            }
        }
        this.onsetFieldInFever.click();
        for (WebElement onsetOption : onsetOptionList) {
            if (onsetOption.getText().contains(enterOnsetOptionNeedToSelect)) {
                onsetOption.click();
                break;
            }
        }
        this.characterFieldInFever.click();
        Thread.sleep(1000);
        selectOptionForDifferentFields(enterOptionToSelectInCharacter);
        Thread.sleep(1000);
        this.clickOnSave();

        Thread.sleep(1000);
        this.agrevatingFactorFieldInFever.click();
        Thread.sleep(1000);
        selectOptionForDifferentFields(enterOptionToSelectInAgrevatIngFactor);
        this.clickOnSave();

        Thread.sleep(1000);
        this.releavingFactorFieldInFever.click();
        Thread.sleep(1000);
        selectOptionForDifferentFields(enterOptionToSelectInReleavingFactor);
        this.clickOnSave();

        Thread.sleep(1000);
        this.associationFieldInFever.click();
        Thread.sleep(1000);
        selectOptionForDifferentFields(enterOptionToSelectInAssociation);
        this.clickOnSave();

        Thread.sleep(1000);
        this.courseFieldInFever.click();
        Thread.sleep(1000);
        selectOptionForDifferentFields(enterOptionToSelectInCourse);
        this.clickOnSave();

        Thread.sleep(1000);
        this.severityFieldInFever.click();
        Thread.sleep(1000);
        selectOptionForDifferentFields(enterOptionToSelectInseverity);
        this.clickOnSave();
    }

    public void clickOnOK() throws InterruptedException {
        //UtilityClass.explicitlyWait(this.okPopupBtn,driver,10);
        Thread.sleep(5000);
        this.okPopupBtn.click();
    }

    public void addCustomizedHOPI(String enterUserDefinedHOPI) {
        this.searchBarHOPI.sendKeys(enterUserDefinedHOPI);
        for (WebElement hopi : listOfHOPI) {
            if (hopi.getText().contains(enterUserDefinedHOPI)) {
                UtilityClass.explicitlyWait(hopi, driver, 10);
                hopi.click();
                logger.info("HOPI Selected: " + hopi.getText());
                break;
            }
        }

    }

    public void editDetailsOfAddedHOPI(String enterHOPINeedToEdit, String enterOptionToSelectInCharacter) throws InterruptedException {
        Thread.sleep(10000);
        for (WebElement patScreeningFeature : patientScreeningFeatureList) {
            if (patScreeningFeature.getText().contains("HOPI")) {
                Thread.sleep(3000);
                patScreeningFeature.click();
                logger.info("User successfully clicked on: " + patScreeningFeature.getText());
                break;
            }
        }
        Thread.sleep(5000);
        for (WebElement hopi : listOfAddedHOPI) {
            if (hopi.getText().contains(enterHOPINeedToEdit)) {
                UtilityClass.explicitlyWait(hopi, driver, 10);
                hopi.click();
                logger.info("HOPI Selected: " + hopi.getText());
                break;
            }
        }
        Thread.sleep(5000);
        this.characterFieldInFever.click();
        logger.info("User clicked on Character field to edit.");
        Thread.sleep(1000);
        selectOptionForDifferentFields(enterOptionToSelectInCharacter);
        Thread.sleep(1000);
        this.clickOnSave();
        logger.info("User succesfully edited Character field.");
    }

    public void deleteAddedHOPI() throws InterruptedException {
        Thread.sleep(6000);
        this.deleteIconForHOPI.click();
        Thread.sleep(3000);
        this.clickOnSave();
        logger.info("User successfully deleted HOPI.");
    }

    public void tryToAddDuplicateHOPI(String enterHOPI) throws InterruptedException {
        addSingleHOPI(enterHOPI);
        Thread.sleep(4000);
        addSingleHOPI(enterHOPI);
        Thread.sleep(4000);
        int countHOPI = 0;
        for (WebElement hopi : listOfAddedHOPI) {
            if (hopi.getText().contains(enterHOPI)) {
                logger.info("Added HOPI: " + hopi.getText());
                countHOPI++;
            }
        }
        System.out.println(countHOPI);
        if (countHOPI >= 2) {
            System.out.println("Two or more than two times HOPI's are added TC Failed.");
        } else {
            System.out.println("User not able to add Duplicate HOPI");
        }

    }

    public void clickAndLandOnPatientInfoPage() throws InterruptedException {
        // UtilityClass.implicitlyWait(driver,15);
        Thread.sleep(20000);
        for (WebElement patScreeningFeature : patientScreeningFeatureList) {
            if (patScreeningFeature.getText().contains("Patient Info")) {
                Thread.sleep(2000);
                String feature=patScreeningFeature.getText();
                Thread.sleep(1000);
                patScreeningFeature.click();
                logger.info("User successfully clicked on: " +feature);
                break;
            }
        }
        UtilityClass.explicitlyWait(demographicsPatientInfo, driver, 20);
        if (demographicsPatientInfo.isDisplayed()) {
            logger.info("Patient landed on Patient info Page");
        } else {
            logger.error("Check user clicked on Patient info or not");
        }
    }

    public void verifyPatientInformationInPatientInfo() throws InterruptedException {
        Thread.sleep(2000);
        for (WebElement patInfo : listOfPatientInformationPatientInfo) {
            logger.info(patInfo.getText());
        }

    }

    public void clickAndLandOnLifelinePageInPatientInfo() throws InterruptedException {
        Thread.sleep(3000);
        this.lifelinePatientInfo.click();
        logger.info("User clicked on Lifeline and landed on Lifeline page");
    }

    public void applyDifferentLifelineFilter() throws InterruptedException {
        Thread.sleep(5000);
        logger.info("Bydefault LifeTime and AllEvent filter value selected");
        logger.info("Events");
        for (int i = 5; i <= 20; i = i + 3) {
            List<WebElement> ListOfevents = driver.findElements(By.xpath("(//android.view.ViewGroup[@index='2'])[2]//android.view.ViewGroup[@index='" + i + "']//android.widget.TextView"));
            for (WebElement events : ListOfevents) {
                logger.info(events.getText());
            }
            logger.info("================================================");
            Thread.sleep(3000);
            UtilityClass.scrollDownCustom(driver, 0.6, 0.2);
            Thread.sleep(3000);
        }
    }

    public void applyDifferentLifelineFilter1(String enterLifeTimeFilterValue, String enterAllEventFilterValue) throws InterruptedException {
        Thread.sleep(3000);
        lifeTimeDrpDwnLifeline.click();
        for (WebElement lifetime : lifeTimeListLifeline) {
            if (lifetime.getText().contains(enterLifeTimeFilterValue)) {
                lifetime.click();
                logger.info("Clicked on: " + lifetime.getText());
                break;
            }
        }
        Thread.sleep(3000);
        allEventDrpDwnLifeline.click();
        for (WebElement allevent : allEventListLifeline) {
            if (allevent.getText().contains(enterAllEventFilterValue)) {
                allevent.click();
                logger.info("Filter value selected for All event DrpDwn is: " + allevent.getText());
                break;
            }
        }
        Thread.sleep(3000);
        for (int i = 5; i <= 20; i = i + 3) {
            try {
                List<WebElement> ListOfevents = driver.findElements(By.xpath("(//android.view.ViewGroup[@index='2'])[2]//android.view.ViewGroup[@index='" + i + "']//android.widget.TextView"));
                for (WebElement events : ListOfevents) {
                    logger.info(events.getText());
                }
                logger.info("================================================");
                Thread.sleep(3000);
                UtilityClass.scrollDownCustom(driver, 0.5, 0.3);
                Thread.sleep(3000);
            } catch (Exception e) {
                break;
            }
        }
    }

    public void clickAndLandOnReportsAndRecords() throws InterruptedException {
        Thread.sleep(3000);
        reportsAndRcordsPatientInfo.click();
    }

    public void selectDifferentTypesOfReportsAndRecords(String enterReportType) throws InterruptedException {
        clickAndLandOnReportsAndRecords();
        Thread.sleep(3000);
        for (WebElement reportType : reportTypesListInReportsAndRecords) {
            if (reportType.getText().contains(enterReportType)) {
                reportType.click();
                logger.info("Report Type selected: " + reportType.getText());
                break;
            }
        }
    }

    public void addVitals(int vitalNumber, int enterVitalValue) throws InterruptedException {
        Thread.sleep(2000);
        for (int i = vitalNumber; i <= 7; i++) {
            if (i == vitalNumber) {
                WebElement vital = driver.findElement(By.xpath("(//android.widget.ScrollView[@index='1']//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='2']//android.widget.EditText)[" + i + "]"));
                Thread.sleep(1000);
                vital.clear();
                //Thread.sleep(1000);
                vital.sendKeys(String.valueOf(enterVitalValue));
                logger.info("Vital value " + enterVitalValue + " added/updated.");
            }
        }
    }

    public void saveVitals() throws InterruptedException {
        Thread.sleep(1000);
        this.saveBtn.click();
        Thread.sleep(1000);
        this.clickOnOK();
    }

    public void errorMessagesForVitals(String expectedErrorMessage) throws InterruptedException {
        Thread.sleep(3000);
        for (WebElement errMsgVital : listOfErrorMessagesForVitals) {
            if (errMsgVital.getText().contains("Enter")) {
                String actualErrorMessages = errMsgVital.getText();
                logger.info("Actual Error Messages: " + actualErrorMessages);
                if (actualErrorMessages.equals(expectedErrorMessage)) {
                    logger.info("Actual and Expected error messages matched.");
                }
            }
        }
    }

    public void clickOnHistoryOfVitals() throws InterruptedException {
        Thread.sleep(2000);
        historyOfVitalOption.click();
        logger.info("Clicked on History of Vitals and User can see History of Vitals.");
    }

    public void clearingHeightAndVerifyClearingWeight() throws InterruptedException {
        Thread.sleep(2000);
        bodyHeightVitalField.clear();
        logger.info("Body Height field is cleared.");
        if (bodyWeightVitalField.getText().isEmpty()) {
            logger.info("Body Weight field is automatcally cleared, TC Passed.");
        } else {
            logger.info("Body Weight field is not cleared, TC Failed.");
        }
    }

    public void clearingBPSystolicAndVerifyClearedBPdystolic() throws InterruptedException {
        Thread.sleep(2000);
        bpSystolicVitalField.clear();
        logger.info("BP Systolic field is cleared.");
        if (bpDystolicVitalField.getText().isEmpty()) {
            logger.info("BP Dystolic field is automatcally cleared, TC Passed.");
        } else {
            logger.info("BP Dystolic field is not cleared, TC Failed.");
        }
    }

    public void verifySaveBtnForWrongVitalValue() throws InterruptedException {
        addVitals(1, 900);
        Thread.sleep(2000);
        if (saveBtn.isSelected()) {
            logger.info("After entering wrong value of vitals Save button is Enabled");
        } else {
            logger.info("After entering wrong value of vitals Save button is Disabled");
        }
    }
    public void disableToggleBtnAssesmentSettings(int enterNoOfAssesment)
    {
        for (int i = enterNoOfAssesment; i <= 8; i++)
        {
            WebElement assesmentToggleBtn=driver.findElement(By.xpath("(//android.widget.ScrollView[@index='0'])[1]//android.widget.Switch["+i+"]"));
            if(assesmentToggleBtn.isEnabled())
            {
                assesmentToggleBtn.click();
                logger.info("Toggle Btn is enabled earlier now it is disabled");
                break;
            }
            else
            {
                logger.info("Toggle Btn is allready disabled");
            }
        }
    }
    public void enableToggleBtnAssesmentSettings(int enterNoOfAssesment) throws InterruptedException {
        for (int i = enterNoOfAssesment; i <= 8; i++)
        {
            Thread.sleep(3000);
            WebElement assesmentToggleBtn=driver.findElement(By.xpath("(//android.widget.ScrollView[@index='0'])[1]//android.widget.Switch["+i+"]"));
            if(assesmentToggleBtn.isSelected())
            {
                logger.info("Toggle Btn is  allready enabled");
            }
            else
            {
                assesmentToggleBtn.click();
                logger.info("Toggle Btn is enabled now");
                break;
            }
        }
    }
    public void assesmentList()
    {
        for(WebElement assesment:enabledAssesmentList)
        {
            logger.info(assesment.getText());
        }

    }

    public void changeAndSaveAssesmentSettings(int enterNoOfAssesment) throws InterruptedException {
        assesmentSettingIcon.click();
        logger.info("Before change of Assesment Settings");
        assesmentList();
       enableToggleBtnAssesmentSettings(enterNoOfAssesment);
       saveBtn.click();
       okPopupBtn.click();
       Thread.sleep(2000);
       logger.info("Changed and Saved Assesment Settings Successfully");
        logger.info("After change of Assesment Settings");
        assesmentList();
    }
    public void clickOnAssesmentSettings()
    {
        assesmentSettingIcon.click();
        logger.info("User successfully clicked on Assesment settings");
    }

    public void addDetailsOfAssesment(String enterAssesmentToBeSelect,String enterMentalStatusValue,String enterPupilValue,String enterPupilSizeLeftValue,String enterPupilSizeRightValue,String enterAffectFieldValue) throws InterruptedException {
      for(WebElement assesment:assesmentListVisible)
      {
          if(assesment.getText().contains(enterAssesmentToBeSelect))
          {
              assesment.click();
              logger.info("Clicked on: "+assesment.getText());
              break;
          }
      }
        Thread.sleep(2000);
        mentalStatusFieldNeuro.click();
        Thread.sleep(1000);
         selectOptionFromListForNeuroAssesment(enterMentalStatusValue);
        Thread.sleep(1000);
        this.pupilFieldNeuro.click();
        Thread.sleep(1000);
        selectOptionFromListForNeuroAssesment(enterPupilValue);
        pupilSizeLeftFieldNeuro.click();
        Thread.sleep(1000);
        selectOptionFromListForNeuroAssesment(enterPupilSizeLeftValue);
        pupilSizeRightFieldNeuro.click();
        Thread.sleep(1000);
        selectOptionFromListForNeuroAssesment(enterPupilSizeRightValue);
        affectFieldNeuro.click();
        Thread.sleep(1000);
        selectOptionFromListForNeuroAssesment(enterAffectFieldValue);

    }
    public void selectOptionFromListForNeuroAssesment(String enterOptionTobeselected) throws InterruptedException {
        Thread.sleep(3000);
        try {
            for (WebElement option : optionListForNeuroAssesmentFields) {
                if (option.getText().contains(enterOptionTobeselected)) {
                    option.click();
                    logger.info("Option selected: " + option.getText());
                }
            }
        }
        catch (Exception e)
        {
            for (WebElement option : optionListForNeuroAssesmentFields) {
                if (option.getText().contains(enterOptionTobeselected)) {
                    option.click();
                    logger.info("Option selected: " + option.getText());
                }
            }
        }
    }

    public void editDetailsOfAssesment(String enterAssesmentToBeSelect,String enterMentalStatusValue) throws InterruptedException {
        for(WebElement assesment:assesmentListVisible)
        {
            if(assesment.getText().contains(enterAssesmentToBeSelect))
            {
                assesment.click();
                logger.info("Clicked on: "+assesment.getText());
                break;
            }
        }
        Thread.sleep(2000);
        mentalStatusFieldNeuro.click();
        Thread.sleep(1000);
        selectOptionFromListForNeuroAssesment(enterMentalStatusValue);
        clickOnSave();
        clickOnOK();
        clickOnSave();

    }

    public void clickAndNavigateToDrugSensitivity()
    {
        UtilityClass.explicitlyWait(drugSensitivityOverview,driver,15);
        drugSensitivityOverview.click();
        logger.info("User successfully clicked on Drug sensitivity");
    }

    public void selectOptionInOverview(String enterOptionToSelectInOverview) throws InterruptedException {
      searchBarInOverview.click();
      Thread.sleep(2000);
      for(WebElement results:listOfResultsOverview)
      {
          if(results.getText().contains(enterOptionToSelectInOverview))
          {
              results.click();
              logger.info("Options selected: "+results.getText());
              break;
          }
      }
    }
    public void addDrugInDrugSensitivity(String enterOptionToSelectInOverview) throws InterruptedException {
     selectOptionInOverview(enterOptionToSelectInOverview);
    selectStartedFromField(4,"4 Days");
    clickOnSave();
    Thread.sleep(2000);
    this.clickOnOK();
        logger.info("User successfully added drug from drug Sensitivity");
    }
    public void selectStartedFromField(int enterNoOfDays,String enterDayWeekYear) throws InterruptedException {
        startedFromField.sendKeys(String.valueOf(enterNoOfDays));
        Thread.sleep(1000);
        for(WebElement noOfDay:optionsListOfStartedFrom)
        {
            if(noOfDay.getText().contains(enterDayWeekYear))
            {
                noOfDay.click();
                logger.info("Selected value for Started From field: "+noOfDay.getText());
                break;
            }
        }

    }

    public void editDrugsInDrugSensitivity() throws InterruptedException {
        Thread.sleep(2000);
       editIconForDrugInDrugSensitivity.click();
       selectStartedFromField(5,"5 Days");
        clickOnSave();
        clickOnOK();
        logger.info("User successfully edited drug from drug Sensitivity");
    }

    public void deleteDrugFromDrugSensitivity() throws InterruptedException {
        Thread.sleep(2000);
        editIconForDrugInDrugSensitivity.click();
        Thread.sleep(1000);
        deleteIconDrugSensitivity.click();
        clickOnOK();
        logger.info("User successfully deleted Drug from Drug Sensitivity");
        clickOnSave();
    }

    public void clickAndNavigateToFoodSensitivityPage()
    {
        UtilityClass.explicitlyWait(foodSensitivityOverview,driver,15);
        foodSensitivityOverview.click();
        logger.info("User successfully clicked on Food sensitivity");
    }

    public void addFoodInFoodSensitivity() throws InterruptedException {
        selectOptionInOverview("Milk");
        selectStartedFromField(2,"2 Months");
        clickOnSave();
        clickOnOK();
        logger.info("User successfully added food in Food Sensitivity");
    }

    public void editFoodInFoodSensitivity() throws InterruptedException {
        Thread.sleep(2000);
        editIconForDrugInDrugSensitivity.click();
        selectStartedFromField(5,"5 Days");
        clickOnSave();
        clickOnOK();
        logger.info("User successfully edited food in Food Sensitivity");
    }

    public void deleteFoodInFoodSensitivity() throws InterruptedException {
        Thread.sleep(2000);
        editIconForDrugInDrugSensitivity.click();
        Thread.sleep(1000);
        deleteIconDrugSensitivity.click();
        clickOnOK();
        logger.info("User successfully deleted Food from Food Sensitivity");
        clickOnSave();
    }

    public void clickAndNavigateToEnvironmentSensitivity()
    {
        UtilityClass.explicitlyWait(environmentSensitivityOverview,driver,15);
        environmentSensitivityOverview.click();
        logger.info("User successfully clicked on Environment sensitivity");
    }

    public void addEnvironmentConditionInEnvSensitivity() throws InterruptedException {
        selectOptionInOverview("High altitude");
        selectStartedFromField(4,"4 Months");
        clickOnSave();
        clickOnOK();
        logger.info("User successfully added Environmental Condition in Environment Sensitivity");
    }

    public void editEnvironmentConditionInEnvSensitivity() throws InterruptedException {
        Thread.sleep(2000);
        editIconForDrugInDrugSensitivity.click();
        selectStartedFromField(3,"3 Days");
        clickOnSave();
        clickOnOK();
        logger.info("User successfully edited Environmental Condition in Environment Sensitivity");
    }

    public void deleteEnvironmentConditionInEnvSensitivity() throws InterruptedException {
        Thread.sleep(2000);
        editIconForDrugInDrugSensitivity.click();
        Thread.sleep(1000);
        deleteIconDrugSensitivity.click();
        clickOnOK();
        logger.info("User successfully deleted Environmental Condition in Environment Sensitivity");
        clickOnSave();
    }

    public void clickAndNavigateToMedicationHistory()
    {
        UtilityClass.explicitlyWait(medicationHistoryOverview,driver,10);
        medicationHistoryOverview.click();
        logger.info("User successfully clicked and navigate to Medication History Page");
    }
    public void selectFrequency(String enterFrequency)
    {
        for(WebElement frequency:onsetOptionList)
        {
            if(frequency.getText().contains(enterFrequency))
            {
               frequency.click();
               logger.info("Frequency is selected: "+enterFrequency);
               break;
            }
        }
    }

    public void addMedicationInMedicationHistory() throws InterruptedException {
        selectOptionInOverview("Calchill");
        Thread.sleep(1000);
        frequencyFieldInOverview.click();
        Thread.sleep(1000);
        selectFrequency("1-1-0");
        clickOnSave();
        Thread.sleep(8000);
        this.okPopupBtn.click();
        logger.info("User successfully added Medication in Medication History");
    }

    public void editMedicationInMedicationHistory() throws InterruptedException {
        Thread.sleep(2000);
       driver.findElement(By.xpath("(//android.view.ViewGroup[@index='4'])[1]")).click();
        Thread.sleep(1000);
        frequencyFieldInOverview.click();
        Thread.sleep(1000);
        selectFrequency("1-1-1");
        clickOnSave();
        Thread.sleep(8000);
        this.okPopupBtn.click();
        logger.info("User successfully edited Medication in Medication History");
    }

    public void deleteMedicationInMedicationHistory() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//android.view.ViewGroup[@index='4'])[1]")).click();
        Thread.sleep(1000);
        deleteIconDrugSensitivity.click();
        Thread.sleep(8000);
        this.okPopupBtn.click();
        clickOnSave();
        logger.info("User successfully deleted Medication in Medication History");
    }

    public void clickAndNavigateToPastMedicalCondition() throws InterruptedException {
        Thread.sleep(2000);
        //pastMedicalConditionOverview.click();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Past Medical Condition\").instance(0))")).click();
        logger.info("User successfully clicked on Past Medical Condition");
    }

    public void addMedicalConditionInPastMedicalCondition() throws InterruptedException {
        selectOptionInOverview("Fear of flying");
        selectStartedFromField(8,"8 Days");
        outcomeFieldInPastMedicalConditionOverview.sendKeys("Active");
        clickOnSave();
        clickOnOK();
        logger.info("User successfully added Medical Condition in Past medical Condition.");
    }

    public void editMedicalConditionInPastMedicalCondition() throws InterruptedException {
        Thread.sleep(2000);
        editIconForPastMedicalHistory.click();
        selectStartedFromField(15,"15 Days");
        outcomeFieldInPastMedicalConditionOverview.sendKeys("Inactive");
        clickOnSave();
        clickOnOK();
        logger.info("User successfully edited Medical Condition in Past medical Condition.");
        clickOnSave();
    }

    public void deleteMedicalConditionInPastMedicalCondition() throws InterruptedException {
        Thread.sleep(2000);
        editIconForPastMedicalHistory.click();
        Thread.sleep(1000);
        deleteIconDrugSensitivity.click();
        clickOnOK();
        clickOnSave();
        logger.info("User successfully deleted Medical Condition in Past medical Condition.");
        clickOnSave();
    }

    public void clickAndNavigateToFamilyHistoy() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Family History\").instance(0))")).click();
        logger.info("User successfully clicked and Navigate to Family History Page");
    }
    public void addFamilyMemberInFamilyHistory(String enterFamilyMemberCondition,String enterRelation) throws InterruptedException {
        Thread.sleep(2000);
        addFamilyHistoryBtn.click();
        conditionFieldInFamilyHistory.sendKeys(enterFamilyMemberCondition);
        Thread.sleep(1000);
        relationFieldInFamilyHistory.click();
        Thread.sleep(1000);
        for(WebElement frequency:onsetOptionList)
        {
            if(frequency.getText().contains(enterRelation))
            {
                frequency.click();
                logger.info("Relation is selected: "+enterRelation);
                break;
            }
        }
        clickOnSave();
        logger.info("Family member Problem added in Family History Successfully.");
        clickOnOK();
        clickOnSave();
    }

    public void deleteFamilyMemberInFamilyHistory() throws InterruptedException {
        Thread.sleep(2000);
        deleteIconForFamilyMemberInFamHistory.click();
        clickOnOK();
        logger.info("Family member deleted from Family History Successfully.");
        clickOnSave();
        clickOnSave();

    }

    public void clickAndNavigateToPastSurgicalHistory() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Past Surgical History\").instance(0))")).click();
        logger.info("User successfully clicked and Navigate to Past Surgical History Page");
    }

    public void addPastSurgicalHistory() throws InterruptedException {
        Thread.sleep(2000);
        searchBarInOverview.click();
        selectOptionInOverview("FEV");
        selectStartedFromField(9,"Days");
        outcomeFieldInPastMedicalConditionOverview.sendKeys("Active");
        clickOnSave();
        clickOnOK();
        logger.info("User successfully added Past Surgical History");
        clickOnSave();
    }

    public void editPastSurgicalHistory() throws InterruptedException {
        Thread.sleep(2000);
        editIconForPastMedicalHistory.click();
        selectStartedFromField(3,"Days");
        outcomeFieldInPastMedicalConditionOverview.sendKeys("InActive");
        clickOnSave();
        clickOnOK();
        logger.info("User successfully edited Past Surgical History");
        clickOnSave();
    }

    public void deletePastSurgicalHistory() throws InterruptedException {
        Thread.sleep(2000);
        editIconForPastMedicalHistory.click();
        Thread.sleep(1000);
        deleteIconDrugSensitivity.click();
        clickOnOK();
        clickOnSave();
        logger.info("User succesfully deleted Past surgical History");
        clickOnSave();
    }


    public void clickAndNavigateToProblemList() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Problem List\").instance(0))")).click();
        logger.info("User successfully clicked and Navigate to Problem List Page");
    }

    public void addProblemList(String enterProblem,String enterCurrentStatus) throws InterruptedException
    {
        Thread.sleep(2000);
        searchBarInOverview.click();
        selectOptionInOverview(enterProblem);
        Thread.sleep(1000);
        selectStartedFromField(4,"Months");
        Thread.sleep(1000);
        currentStatusFieldInProblemList.click();
        Thread.sleep(1000);
        for(WebElement frequency:onsetOptionList)
        {
            if(frequency.getText().contains(enterCurrentStatus))
            {
                frequency.click();
                logger.info("Current Status is selected: "+enterCurrentStatus);
                break;
            }
        }
        clickOnSave();
        clickOnOK();
        logger.info("User successfully added Problem List");
        clickOnSave();
    }

    public void editProblemList(String enterCurrentStatus) throws InterruptedException {
        Thread.sleep(2000);
        editIconInProblemList.click();
        selectStartedFromField(5,"Days");
        Thread.sleep(1000);
        currentStatusFieldInProblemList.click();
        Thread.sleep(1000);
        for(WebElement frequency:onsetOptionList)
        {
            if(frequency.getText().contains(enterCurrentStatus))
            {
                frequency.click();
                logger.info("Current Status is selected: "+enterCurrentStatus);
                break;
            }
        }

        logger.info("User successfully edited Problem List");
        clickOnSave();
        clickOnOK();
        clickOnSave();
    }

    public void deleteProblemList() throws InterruptedException {
        Thread.sleep(2000);
        editIconInProblemList.click();
        Thread.sleep(1000);
        deleteIconDrugSensitivity.click();
        clickOnOK();
        clickOnSave();
        logger.info("User successfully deleted Problem List");
        clickOnSave();
    }


    public void clickAndNavigateToSocialHistory() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Social History\").instance(0))")).click();
        logger.info("User successfully clicked and Navigate to Social History Page");
    }

    public void editSocialHistory(String enterSleepStatus) throws InterruptedException {
        Thread.sleep(2000);
        editSocialHistoryBtn.click();
        sleepFieldInSocialHistory.click();
        Thread.sleep(1000);
        for(WebElement frequency:onsetOptionList)
        {
            if(frequency.getText().contains(enterSleepStatus))
            {
                frequency.click();
                logger.info("Status selected for Slee Field is: "+enterSleepStatus);
                break;
            }
        }
        clickOnSave();
        clickOnOK();
        logger.info("User successfully edited social History");
        clickOnSave();
    }

    public void clickOnBackArrow() throws InterruptedException {
        //UtilityClass.explicitlyWait(backButton,driver,15);
        Thread.sleep(7000);
        backButton.click();
    }
    public void enablePrescriptionSetting(int enterNoOfPrescriptionSettingToggleBtn) throws InterruptedException {
        Thread.sleep(3000);
        int i=enterNoOfPrescriptionSettingToggleBtn;
        WebElement assesmentToggleBtn=driver.findElement(By.xpath("(//android.widget.ScrollView[@index='0'])[1]//android.widget.Switch["+i+"]"));
        Thread.sleep(3000);
        if(assesmentToggleBtn.isEnabled())
        {
            logger.info(assesmentToggleBtn.isEnabled());
            logger.info("Toggle Btn is  allready enabled");
        }
        else
        {
            assesmentToggleBtn.click();
            logger.info("Toggle Btn is enabled now");
        }
    }
    public void disablePrescriptionSetting(int enterNoOfPrescriptionSettingToggleBtn) throws InterruptedException {
        Thread.sleep(3000);
        int i=enterNoOfPrescriptionSettingToggleBtn;
        WebElement assesmentToggleBtn=driver.findElement(By.xpath("(//android.widget.ScrollView[@index='0'])[1]//android.widget.Switch["+i+"]"));
        Thread.sleep(3000);
        if(assesmentToggleBtn.isEnabled())
        {
            assesmentToggleBtn.click();
            logger.info("Toggle Btn is Disabled now");

        }
        else
        {
            logger.info(assesmentToggleBtn.isEnabled());
            logger.info("Toggle Btn is  allready disabled");
        }
    }

    public void changeAndSavePrescriptionSettings(int enterNoOfPrescriptionSettingToggleBtn,int enterPrescriptionTogleBtnNo) throws InterruptedException {
        assesmentSettingIcon.click();
        enablePrescriptionSetting(enterNoOfPrescriptionSettingToggleBtn);
        Thread.sleep(1000);
        disablePrescriptionSetting(enterPrescriptionTogleBtnNo);
        Thread.sleep(1000);
        saveBtn.click();
        Thread.sleep(1000);
        okPopupBtn.click();
        Thread.sleep(2000);
        logger.info("Changed and Saved Prescription Settings Successfully");
    }

    public void addMedicineInPrescription(String enterMedicineName,String enterDosageRoute,String enterFrequency,String enterDuration,String enterAllowRefillsYesNo) throws InterruptedException {
        Thread.sleep(2000);
        searchBarInOverview.click();
        Thread.sleep(1000);
        selectMedicineFromPrescriptionList(enterMedicineName);
        selectDosageRoutInPrescription(enterDosageRoute);
        selectFrequencyInPrescription(enterFrequency);
        selectDuration(enterDuration);
        instructionsFieldInPrescription.sendKeys("Take Medicine after lunch");
        selectAllowRefills(enterAllowRefillsYesNo);
        allowGenericsYesInPrescription.click();
        clickOnSave();
        clickOnOK();

    }
    public void selectMedicineFromPrescriptionList(String enterMedicineName)
    {
        for(WebElement medicine: medicineListInPrescription)
        {
            if(medicine.getText().contains(enterMedicineName))
            {
                medicine.click();
                logger.info("Medicine selected: "+medicine.getText());
                break;
            }
        }
    }
    public void selectDosageRoutInPrescription(String enterDosageRoute) throws InterruptedException {
       // UtilityClass.explicitlyWait(dosageRoutInPrescription,driver,10);
        Thread.sleep(2000);
        dosageRoutInPrescription.click();
        Thread.sleep(2000);
        for(WebElement dosageRoute:onsetOptionList)
        {
            if(dosageRoute.getText().contains(enterDosageRoute))
            {
                dosageRoute.click();
                logger.info("Dosage Route is selected: "+enterDosageRoute);
                break;
            }
        }
    }
    public void selectFrequencyInPrescription(String enterFrequency)
    {
        UtilityClass.explicitlyWait(frequencyFieldInPrescription,driver,10);
        frequencyFieldInPrescription.click();
        for(WebElement frequency:frequencyListInPrescription)
        {
            if(frequency.getText().contains(enterFrequency))
            {
                String freq=frequency.getText();
                frequency.click();
                logger.info("Frequency Selected: "+freq);
                break;
            }
        }
    }
    public void selectDuration(String enterDuration)
    {
        durationFieldInPrescription.sendKeys(enterDuration);
        for(WebElement duration:frequencyListInPrescription)
        {
            if(duration.getText().contains("Days"))
            {
                String durationn=duration.getText();
                duration.click();
                logger.info("Duration Selected: "+durationn);
                break;
            }
        }
    }
    public void selectAllowRefills(String enterAllowRefillsYesNo)
    {
        UtilityClass.explicitlyWait(allowRefillsFieldInPrescription,driver,10);
       allowRefillsFieldInPrescription.click();
        for(WebElement allowRefills:frequencyListInPrescription)
        {
            if(allowRefills.getText().contains(enterAllowRefillsYesNo))
            {
                allowRefills.click();
                logger.info("allowRefills Selected: "+enterAllowRefillsYesNo);
                break;
            }
        }
    }

    public void addMedicineInPrescriptionUsingTemplate(String templateName,String enterGender,String enterAgeGroup) throws InterruptedException {
      showTemplatesBtnInPrescription.click();
      UtilityClass.implicitlyWait(driver,10);
        templatePage.selectDiseaseORTemplate(templateName);
        templatePage.selectLineOfTreatment();
        templatePage.selectGender(enterGender);
        templatePage.selectAgeGroup(enterAgeGroup);
        UtilityClass.explicitlyWait(applyTemplatBtnInPrescription,driver,15);
        applyTemplatBtnInPrescription.click();
    }

    public void addMedicineThroughPrescriptionHistoryInPrescription() throws InterruptedException {
        Thread.sleep(2000);
        prescriptionHistoryBtnInPrescription.click();
        //UtilityClass.explicitlyWait(addPrescriptionBtnInPrescriptioHistory,driver,5);
        Thread.sleep(2000);
      addPrescriptionBtnInPrescriptioHistory.click();
      clickOnOK();
    }

    public void addMedicineAsAFavouriteMedicine(String enterMedicineName) throws InterruptedException {
        searchBarInOverview.click();
        Thread.sleep(1000);
        selectMedicineFromPrescriptionList(enterMedicineName);
        Thread.sleep(5000);
        favouriteDdrugIconPrescription.click();
        Thread.sleep(3000);
        clickOnSave();
        clickOnOK();
    }

    public void verifySuccessfullPopupForAddMedicineInPrescription(String enterMedicineName,String enterDosageRoute,String enterFrequency,String enterDuration,String enterAllowRefillsYesNo) throws InterruptedException
    {
        searchBarInOverview.click();
        Thread.sleep(1000);
        selectMedicineFromPrescriptionList(enterMedicineName);
        selectDosageRoutInPrescription(enterDosageRoute);
        selectFrequencyInPrescription(enterFrequency);
        selectDuration(enterDuration);
        instructionsFieldInPrescription.sendKeys("Take Medicine after lunch");
        selectAllowRefills(enterAllowRefillsYesNo);
        allowGenericsYesInPrescription.click();
        clickOnSave();
        Thread.sleep(2000);
       if(successfullPopupTextPrescription.getText().equals("Prescription Added Successfully"))
       {
           logger.info("Successfull popup message text matched with expected text after adding prescription.");
       }
       else {
           logger.info("Actual and expected text for successfull popup not matched.");
       }
       clickOnOK();

    }

    public void editAddedMedicineInPrescription(String enterDosageRoute) throws InterruptedException {
       editMedicineInPrescription.click();
        selectDosageRoutInPrescription(enterDosageRoute);
        clickOnSave();
        clickOnOK();

    }

    public void deleteAddedMedicineInPrescription() throws InterruptedException {
        UtilityClass.explicitlyWait(deleteIconForMedicineInPrescription,driver,10);
      deleteIconForMedicineInPrescription.click();
      clickOnOK();
    }

    public void verifyDeletePopupTextInPrescription() throws InterruptedException {
        UtilityClass.explicitlyWait(deleteIconForMedicineInPrescription,driver,10);
        deleteIconForMedicineInPrescription.click();
        UtilityClass.explicitlyWait(deleteSuccessfullPopupInPrescription,driver,10);
        Thread.sleep(2000);
        if(deleteSuccessfullPopupInPrescription.getText().equals("Prescription Deleted Successfully"))
        {
            logger.info("Successfull popup message text matched with expected text after adding prescription.");
        }
        else {
            logger.info("Actual and expected text for successfull popup not matched.");
        }
        clickOnOK();
    }

    public void clickOnAddDiagnosisBtn() throws InterruptedException {
        Thread.sleep(4000);
        addDiagnosisBtnInDiagnosis.click();
        logger.info("Clicked on Add Diagnosis successfully");
    }

    public void addDiagnosis(String enterDiagnosis,String enterDiagnosisType) throws InterruptedException {
        UtilityClass.explicitlyWait(writeDiagnosisTextBox,driver,10);
        Thread.sleep(3000);
       writeDiagnosisTextBox.click();
        for(WebElement diagnosis:frequencyListInPrescription)
        {
            if(diagnosis.getText().contains(enterDiagnosis))
            {
                diagnosis.click();
                logger.info("Diagnosis Selected: "+diagnosis.getText());
                break;
            }
        }
        UtilityClass.explicitlyWait(diagnosisTypeFieldInDiagnosis,driver,10);
        diagnosisTypeFieldInDiagnosis.click();
        Thread.sleep(2000);
        for(WebElement diagnosisType:frequencyListInPrescription)
        {
            if(diagnosisType.getText().contains(enterDiagnosisType))
            {
                diagnosisType.click();
                logger.info("DiagnosisType Selected: "+enterDiagnosisType);
                break;
            }
        }
        clickOnSave();
        Thread.sleep(5000);
        this.clickOnOK();
    }

    public void searchAndAddDiagnosis(String enterDiagnosis,String enterDiagnosisType) throws InterruptedException {
        UtilityClass.explicitlyWait(writeDiagnosisTextBox,driver,10);
        writeDiagnosisTextBox.sendKeys(enterDiagnosis);
        Thread.sleep(7000);
        for(WebElement diagnosis:frequencyListInPrescription)
        {
            if(diagnosis.getText().contains(enterDiagnosis))
            {
                diagnosis.click();
                logger.info("Diagnosis Selected: "+enterDiagnosis);
                break;
            }
        }
        UtilityClass.explicitlyWait(diagnosisTypeFieldInDiagnosis,driver,10);
        diagnosisTypeFieldInDiagnosis.click();
        Thread.sleep(2000);
        for(WebElement diagnosisType:frequencyListInPrescription)
        {
            if(diagnosisType.getText().contains(enterDiagnosisType))
            {
                diagnosisType.click();
                logger.info("DiagnosisType Selected: "+enterDiagnosisType);
                break;
            }
        }
        clickOnSave();
        Thread.sleep(4000);
        clickOnOK();
    }

    public void deleteAddedDiagnosis()
    {

    }

    public void clickOUtside() throws InterruptedException {
        Thread.sleep(6000);
      outsideClickPatientInfo.click();
    }

    public void addPatientInstruction() throws InterruptedException {
        patientInstructionsPreDefined.click();
        clickOnSave();
        logger.info("Patient Instruction added Successfully.");
        this.clickOnOK();
    }

    public void addLabOrderInvestigation(String enterLabOrder) throws InterruptedException {
      Thread.sleep(5000);
      labInvestigation.click();
      labInvestigationSearchBar.click();
      for(WebElement labOrder:labOrdersList)
            {
                if(labOrder.getText().contains(enterLabOrder))
                {
                    labOrder.click();
                    logger.info("LabInvestiagation is selected: "+enterLabOrder);
                    break;
                }
            }
        Thread.sleep(3000);
      labOrderInstructionField.sendKeys("Test and Submti Report");
      clickOnSave();
      UtilityClass.explicitlyWait(okPopupBtn,driver,15);
      clickOnOK();
        clickOnSave();
    }

    public void addFollowUp(String enterNumber)
    {
        followUpFieldInPatientScreening.sendKeys(enterNumber);

    }

    public void referDoctor(String enterDoctorName,String enterSpeciality) throws InterruptedException {
        doctorNameFieldInReferdoctor.clear();
        Thread.sleep(2000);
        doctorNameFieldInReferdoctor.sendKeys(enterDoctorName);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]")).click();
        logger.info("Doctor Name added "+ enterDoctorName);
        specialityOfDrRefDr.clear();
        specialityOfDrRefDr.sendKeys(enterSpeciality);
        logger.info("Doctor Speciality added "+ enterSpeciality);
        Thread.sleep(2000);
        clickOnSave();

    }

    public void clickOnPreview() throws InterruptedException {
        Thread.sleep(5000);
        UtilityClass.scrollDown(driver);
        //UtilityClass.explicitlyWait(previewInPatientScreening,driver,10);
        Thread.sleep(5000);
        previewInPatientScreening.click();
        Thread.sleep(2000);
        logger.info("Clicked on Preview");
        closePreviewPdf.click();
        logger.info("Closed Priview pdf.");
    }

    public void clickOnEndEncounter() throws InterruptedException {
        Thread.sleep(5000);
        UtilityClass.scrollDown(driver);
        UtilityClass.explicitlyWait(endEncounter,driver,10);
        endEncounter.click();
        logger.info("Clicked on endEncounter");
        Thread.sleep(4000);
        whatsappOption.click();
        emailOption.click();
        logger.info("Selected whatsapp and Email");
        Thread.sleep(2000);
        sendEncounterPdfOption.click();
        clickOnOK();
        logger.info("Patient Screening completed and Pdf sent successfully.");

    }
}
