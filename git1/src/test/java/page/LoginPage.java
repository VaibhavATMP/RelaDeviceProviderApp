package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
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

public class LoginPage
{
  public LoginPage(AndroidDriver driver) throws InterruptedException {Thread.sleep(3000);
      driver= BackGround.getDriver();
      PageFactory.initElements(new AppiumFieldDecorator(driver),this);
  }
  public static Logger logger=LogManager.getLogger(LoginPage.class);
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Docisn Plus']")
  private WebElement docisnApp;
  //@AndroidFindBy(new MobileBy.ByAccessibilityId("Docisn Plus, has 1 notification"));
   // @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Docisn Plus, has 1 notification\"]")private WebElement docisnApp;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='2']") private WebElement username;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='password']") private WebElement pass;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']") private WebElement docisnLogo;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LOGIN']")
    private WebElement loginButton;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='home_open_menu_id']")
    private WebElement menuButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']") private WebElement settingsOptionMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Logout']")private WebElement logoutOptionInSetting;

    @AndroidFindBy(id = "android:id/button2") private WebElement logoutConfirmPopup;

    @AndroidFindBy(xpath= "//android.widget.EditText[@index='2']")
    private WebElement txtemail;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='password']")
    private WebElement txtpassword;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid Username or Password']")
    private WebElement errMsgForPwd;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Email is invalid']")
    private WebElement errMsgForemail;

    @AndroidFindBy(xpath= "(//android.widget.Button[@index='0'])[1]")
    private WebElement tryToClicklogin;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='User Not Found']")
    private WebElement unregisteredUNErrMsg;

    public void clickOnDocisnApp() throws InterruptedException {
        UtilityClass.implicitlyWait(driver,60);
        this.docisnApp.click();
        logger.info("Clicked on Docisn Plus app.");

    }
    public void enterUsername() throws InterruptedException, IOException {
        UtilityClass.implicitlyWait(driver,30);
        this.username.sendKeys(UtilityClass.readDataFromPropertyFile("UN"));
        logger.info("UserName entered successfully");
    }
    public void enterPassword() throws InterruptedException, IOException {
        this.pass.sendKeys(UtilityClass.readDataFromPropertyFile("Pass"));
        logger.info("Password entered successfully");
    }
    public void clickOnLogin() throws InterruptedException
    {
        this.loginButton.click();
        logger.info("Clicked on Login and Log In successfully.");
    }
    public void clickOnMenu() throws InterruptedException {
         UtilityClass.implicitlyWait(driver,60);
         this.menuButton.click();
         logger.info("Clicked on menu button.");
    }
    public void clickOnSettingOptionInMenu()
    {
        UtilityClass.explicitlyWait(this.settingsOptionMenu,driver,15);
        this.settingsOptionMenu.click();
        logger.info("Clicked on settings option present in menu");
    }
    public void clickOnLogout() throws InterruptedException {  //UtilityClass.explicitlyWait(this.logoutOptionInSetting,driver,10);
       // Thread.sleep(3000);
        this.logoutOptionInSetting.click();
        this.logoutConfirmPopup.click();
        //driver.navigate().back();
        Thread.sleep(2000);
        //press back button.
        ((PressesKey)driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        logger.info("Logged out successfully");
        driver.quit();
    }


    public void validEmailWrongPassword() throws IOException, InterruptedException {
        UtilityClass.implicitlyWait(driver, 60);
        txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("username"));
        txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("wrongPWD"));
        logger.info("Entered valid username and wrong password");
        loginButton.click();
        Thread.sleep(2000);
        System.out.println(errMsgForPwd.getText());
        logger.info("Invalid Username or Password");
    }

    public void invalidEmail() throws IOException, InterruptedException {
        UtilityClass.implicitlyWait(driver, 60);
        txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("invalidUN"));
        txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("password"));
        Thread.sleep(2000);
        logger.info("Entered invalid email with right password");
        loginButton.click();
        Thread.sleep(2000);
        System.out.println(errMsgForemail.getText());
    }

    public void onlyEmail() throws IOException, InterruptedException {
        Thread.sleep(3000);
        txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("username"));
        logger.info("Entered only Email");
        String msg = String.valueOf(tryToClicklogin.isEnabled());
        if (tryToClicklogin.isEnabled()) {
            System.out.println(msg);
            System.out.println("Login is enabled");
        }
        else{
            System.out.println(msg);
            System.out.println("Login is disabled");
        }
    }

    public void onlyPassword() throws IOException, InterruptedException {
        Thread.sleep(3000);
        txtemail.clear();
        logger.info("Email cleared");
        Thread.sleep(2000);
        txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("password"));
        logger.info("Entered only Password");
        String msg = String.valueOf(tryToClicklogin.isEnabled());
        if (tryToClicklogin.isEnabled()) {
            System.out.println(msg);
            System.out.println("Login is enabled");
        }
        else{
            System.out.println(msg);
            System.out.println("Login is disabled");
        }

    }

    public void unregisteredUserLogin() throws IOException, InterruptedException {
        UtilityClass.implicitlyWait(driver,80);
        txtemail.sendKeys(UtilityClass.readDataFromPropertyFile("URUserName"));
        txtpassword.sendKeys(UtilityClass.readDataFromPropertyFile("URPwd"));
        loginButton.click();
        Thread.sleep(2000);
        System.out.println(unregisteredUNErrMsg.getText());
    }

}
