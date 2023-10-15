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

import java.io.IOException;

import static steps.BackGround.driver;

public class DPChatScreen {
    Logger logger= LogManager.getLogger(DPAddPatients.class);
    @AndroidFindBy(xpath= "//android.widget.EditText[@text='Type a message']")
    private WebElement entermessage;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Chat']")
    private WebElement clickonchat;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='Type a message']")
    private WebElement clickonchatbar;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='\uF50D']")
    private WebElement clickonsend;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Chat Room']")
    private WebElement chatroomscreen;

    @AndroidFindBy(xpath= "//android.view.ViewGroup[@resource-id='chatHist_nav_to_chat_0']")
    private WebElement selectchat;

    @AndroidFindBy(xpath= "//android.widget.EditText[@resource-id='ChatHist_srchdoc_id']")
    private WebElement clickonsearch;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='\uF1D3']")
    private WebElement clickonsettings;

    @AndroidFindBy(xpath= "//android.widget.Switch[@text='off']")
    private WebElement clickonradiobutton;

    @AndroidFindBy(xpath= "//android.widget.Switch[@text='on']")
    private WebElement radiobutton;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Submit']")
    private WebElement clicksubmitbutton;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='1 Hour']")
    private WebElement enterbeforetime;

    @AndroidFindBy(xpath= "(//android.widget.EditText[@text='1 Hour'])[1]")
    private WebElement enteraftertime;

    public DPChatScreen(AndroidDriver driver) {
        driver = BackGround.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickonchat() {
        UtilityClass.explicitlyWait(clickonchat,driver,10);
        this.clickonchat.click();
    }

    public void selectchat() {
        this.selectchat.click();
    }
    public void clickonchatbar() {
        this.clickonchatbar.sendKeys("hi");
    }
    public void clickonsend() {
        this.clickonsend.click();
    }

    public void clickonsearch() {
        this.clickonsearch.click();
        this.clickonsearch.sendKeys("manogna");
        this.selectchat.click();
    }
    public void clickonsetting() {
        this.clickonsettings.click();
    }
    public void clickonradiobutton() {
        this.clickonradiobutton.click();
    }

    public void disableradiobutton() {
        this.radiobutton.click();
    }
    public void clickonsubmit() {
        this.clicksubmitbutton.click();
    }
    public void entermessage() throws IOException {
        this.entermessage.sendKeys(UtilityClass.readDataFromPropertyFile("enterchatmessage"));
    }
    public void chatscreen() throws IOException {
        String actualnameerror = this.chatroomscreen.getText();
        if (actualnameerror.equals(UtilityClass.readDataFromPropertyFile("chatscreen")) ){
            logger.info("actual and expected error messages are matched for name field");
        }
        else{
            logger.info("actual and expected error messages are not matched for name field");
        }
    }
}
