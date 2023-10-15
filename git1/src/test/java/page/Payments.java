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

public class Payments {
    public Payments(AndroidDriver driver) {
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static Logger logger = LogManager.getLogger(Payments.class);
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payments']")
    private WebElement paymentOptionInMenu;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='6']//android.widget.TextView)[2]")
    private WebElement totalAmount;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='7']//android.widget.TextView)[2]")
    private WebElement pendingAmount;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='8']//android.widget.TextView)[2]")
    private WebElement receivedAmount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Today']") private WebElement todayBtnInPaymentScreen;


    public void clickOnPaymentsOptionInMenu()
    {
        UtilityClass.explicitlyWait(paymentOptionInMenu,driver,10);
        paymentOptionInMenu.click();
        logger.info("Clicked on Payments");
    }

    public void viewTransactions() throws InterruptedException {
        UtilityClass.implicitlyWait(driver,10);
      logger.info("Total amount of Last 7 days: "+totalAmount.getText());
        logger.info("Pending amount of Last 7 days: "+pendingAmount.getText());
        logger.info("Received amount of Last 7 days: "+receivedAmount.getText());
        Thread.sleep(3000);
        todayBtnInPaymentScreen.click();
        Thread.sleep(3000);
        logger.info("Total amount for Today: "+totalAmount.getText());
        logger.info("Pending amount for Today: "+pendingAmount.getText());
        logger.info("Received amount for Today: "+receivedAmount.getText());


    }
}
