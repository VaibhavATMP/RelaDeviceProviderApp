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

public class CustSuppFeedback
{
    public CustSuppFeedback(AndroidDriver driver) throws InterruptedException
    {
        Thread.sleep(3000);
        driver= BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public static Logger logger= LogManager.getLogger(CustSuppFeedback.class);

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Customer Support']") private WebElement customerSupportOptionInMenu;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='8']") private WebElement titleFieldInCustSupport;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='10']") private WebElement issueDescriptionFieldInCustSupport;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@index='0'])[4]") private WebElement submitCustSupport;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='2'])") private WebElement nameField;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='4'])") private WebElement mobNoField;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='6'])") private WebElement emailField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Feedback']") private WebElement feedbackOptionInMenu;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@index='1'])[2]") private WebElement totalReviewsCount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Latest One First']") private WebElement latestOldestFilterFeedback;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='19']//android.view.ViewGroup[@index='0']//android.widget.TextView") private List<WebElement> feedbackGivenByPatientDetails;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='All']") private WebElement starsFilter;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@index='4'])[1]") private WebElement totalRatingsFeedback;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Oldest One First']") private WebElement oldestOneFirstFilter;

    //@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='"+text+"']") private WebElement starsFilterOptions;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ok']")
    private WebElement okPopup;


    public void enterdataAndSubmitCustomerSupport() throws InterruptedException {
        Thread.sleep(3000);
        this.customerSupportOptionInMenu.click();
        logger.info("Clicked on Customer support");
        Thread.sleep(2000);
        this.titleFieldInCustSupport.sendKeys("Entered Title successfully");
        logger.info("Entered Title succesfully");
        this.issueDescriptionFieldInCustSupport.sendKeys("Loading Issues");
        logger.info("Entered IssueDespriction successfully");
        this.submitCustSupport.click();
        logger.info("Clicked on Submit successfully");
        Thread.sleep(4000);
        this.okPopup.click();
    }
    public void veirfySubmitOnlyAfterEnteringMandatoryField() throws InterruptedException {
        Thread.sleep(3000);
        this.customerSupportOptionInMenu.click();
        logger.info("Clicked on Customer support");
        logger.info("Title field is empty");
        this.issueDescriptionFieldInCustSupport.sendKeys("Loading Issues");
        logger.info("Entered IssueDespriction successfully");
        Thread.sleep(3000);
        if(this.submitCustSupport.isEnabled())
        {
           logger.info("Submit Button for Customer Support is enabled");
        }
        else {
            logger.info("Submit Button for Customer Support is disabled.Fill all mandatory fields");
        }

    }

    public void verifyNameEmailAndMobNo() throws InterruptedException, IOException {
        Thread.sleep(3000);
        this.customerSupportOptionInMenu.click();
        logger.info("Clicked on Customer support");
        Thread.sleep(2000);
        if(this.nameField.getText().contains(UtilityClass.readDataFromPropertyFile("DrName")))
        {
            logger.info("Actual and Expected Dr. Name matched.");
        }
        else
        {
            logger.info("Actual and Expected Dr. Name is not matched.");
        }
        Thread.sleep(2000);
        if(this.mobNoField.getText().contains(UtilityClass.readDataFromPropertyFile("MobNumber")))
        {
            logger.info("Actual and Expected Contact Number matched.");
        }
        else
        {
            logger.info("Actual and Expected Contact Number is not matched.");
        }
        Thread.sleep(2000);
        if(this.emailField.getText().contains(UtilityClass.readDataFromPropertyFile("UN")))
        {
            logger.info("Actual and Expected Email matched.");
        }
        else
        {
            logger.info("Actual and Expected Email is not matched.");
        }

    }

    public void clickAndSeeFeedbacks() throws InterruptedException {
        Thread.sleep(5000);
        this.feedbackOptionInMenu.click();
        logger.info("Clicked on Feedback option in menu");
        Thread.sleep(4000);
        String TotalReviewsCount=this.totalReviewsCount.getText();
        logger.info("Total Reviews are: "+TotalReviewsCount);

        String TotalRatingsCount=this.totalRatingsFeedback.getText();
        logger.info("Total Ratings is : "+TotalRatingsCount);


    }

    public void viewPatientDetails() throws InterruptedException {
        Thread.sleep(5000);
        this.feedbackOptionInMenu.click();
        logger.info("Clicked on Feedback option in menu");
        Thread.sleep(5000);
        for(WebElement patients:feedbackGivenByPatientDetails)
        {
            System.out.println(patients.getText());
        }
        logger.info("Patient details fetched successfully who had given reviews according to filter.");
    }
    public void selectStarFilter(int i) throws InterruptedException {
        Thread.sleep(5000);
        WebElement star=driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[4]//android.view.ViewGroup["+i+"]"));
        Thread.sleep(3000);
        star.click();
    }

    public void applyFilterLatestAndFourFiveStar() throws InterruptedException {
        Thread.sleep(5000);
        this.feedbackOptionInMenu.click();
        logger.info("Clicked on Feedback option in menu");
        this.starsFilter.click();
        Thread.sleep(3000);
        selectStarFilter(2);
        logger.info("'Latest One First' and '4-5 Star Rating' Filter applied");
        Thread.sleep(5000);
        for(WebElement patients:feedbackGivenByPatientDetails)
        {
            System.out.println(patients.getText());
        }
        logger.info("Patient details fetched successfully who had given reviews according to filter.");
    }
    public void applyFilterLatestAndThreeStar() throws InterruptedException {
        Thread.sleep(5000);
        this.feedbackOptionInMenu.click();
        logger.info("Clicked on Feedback option in menu");
        this.starsFilter.click();
        logger.info("'Latest One First' and '3 Star Rating' Filter applied");
        Thread.sleep(3000);
        selectStarFilter(3);
        Thread.sleep(5000);
        for(WebElement patients:feedbackGivenByPatientDetails)
        {
            System.out.println(patients.getText());
        }
        logger.info("Patient details fetched successfully who had given reviews according to filter.");
    }
    public void applyFilterNewestAndZeroToTwoStar() throws InterruptedException
    {
        Thread.sleep(5000);
        this.feedbackOptionInMenu.click();
        logger.info("Clicked on Feedback option in menu");
        this.starsFilter.click();
        Thread.sleep(3000);
        selectStarFilter(4);
        logger.info("'Latest one first' and '0-2 Star' Filter applied");
        Thread.sleep(5000);
        for(WebElement patients:feedbackGivenByPatientDetails)
        {
            System.out.println(patients.getText());
        }
        logger.info("Patient details fetched successfully who had given reviews according to filter.");
    }

    public void applyFilterOldesttAndAll() throws InterruptedException
    {
        Thread.sleep(3000);
        this.feedbackOptionInMenu.click();
        logger.info("Clicked on Feedback option in menu");
        Thread.sleep(2000);
        this.latestOldestFilterFeedback.click();
        this.oldestOneFirstFilter.click();
        logger.info("'Oldest one first' and 'All Star' Filter applied");
        Thread.sleep(2000);
        for(WebElement patients:feedbackGivenByPatientDetails)
        {
            System.out.println(patients.getText());
        }
        logger.info("Patient details fetched successfully who had given reviews according to filter.");
    }

    public void applyFilterOldesttAnd4_5StarRating() throws InterruptedException {
        Thread.sleep(3000);
        this.feedbackOptionInMenu.click();
        logger.info("Clicked on Feedback option in menu");
        Thread.sleep(2000);
        this.latestOldestFilterFeedback.click();
        this.oldestOneFirstFilter.click();
        this.starsFilter.click();
        Thread.sleep(3000);
        selectStarFilter(2);
        logger.info("'Oldest one first' and '4-5 Star Rating' Filter applied");
        Thread.sleep(2000);
        for(WebElement patients:feedbackGivenByPatientDetails)
        {
            System.out.println(patients.getText());
        }
        logger.info("Patient details fetched successfully who had given reviews according to filter.");
    }

    public void applyFilterOldesttAnd3StarRating() throws InterruptedException {
        Thread.sleep(3000);
        this.feedbackOptionInMenu.click();
        logger.info("Clicked on Feedback option in menu");
        Thread.sleep(2000);
        this.latestOldestFilterFeedback.click();
        this.oldestOneFirstFilter.click();
        this.starsFilter.click();
        Thread.sleep(3000);
        selectStarFilter(3);
        logger.info("'Oldest one first' and '3 Star Rating' Filter applied");
        Thread.sleep(2000);
        for(WebElement patients:feedbackGivenByPatientDetails)
        {
            System.out.println(patients.getText());
        }
        logger.info("Patient details fetched successfully who had given reviews according to filter.");
    }

    public void applyFilterOldesttAnd0_2StarRating() throws InterruptedException {
        Thread.sleep(3000);
        this.feedbackOptionInMenu.click();
        logger.info("Clicked on Feedback option in menu");
        Thread.sleep(2000);
        this.latestOldestFilterFeedback.click();
        this.oldestOneFirstFilter.click();
        this.starsFilter.click();
        Thread.sleep(3000);
        selectStarFilter(4);
        logger.info("'Oldest one first' and '0-2 Star Rating' Filter applied");
        Thread.sleep(2000);
        for(WebElement patients:feedbackGivenByPatientDetails)
        {
            System.out.println(patients.getText());
        }
        logger.info("Patient details fetched successfully who had given reviews according to filter.");
    }
}
