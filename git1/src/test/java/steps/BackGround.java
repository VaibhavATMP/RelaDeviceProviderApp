package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.LoginPage;
import utils.UtilityClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import steps.BackGround;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class BackGround
{
    public  static AndroidDriver driver;

    LoginPage loginPage;
    UtilityClass util=new UtilityClass();

    public BackGround() throws InterruptedException, FileNotFoundException {
        UtilityClass.setDriver();
       driver= UtilityClass.getDriver();
       loginPage = new LoginPage(driver);
    }
    public static AndroidDriver getDriver()
    {
        return driver;
    }
    public static Logger logger= LogManager.getLogger(BackGround.class);
    @Given("^User click on docisn to launch the app$")
    public void user_click_on_docisn_to_launch_the_app() throws InterruptedException {
       // BaseTest.startEmulator();
        loginPage.clickOnDocisnApp();
    }
    @Then("^User enter valid Username and valid Password$")

    public void user_enter_valid_Username_and_valid_Password() throws IOException, InterruptedException {
        loginPage.enterUsername();
        loginPage.enterPassword();
    }
    @Then("^User click on login button$")
    public void user_click_on_login_button() throws InterruptedException {
        loginPage.clickOnLogin();
    }
    @After
    public void home() throws InterruptedException {
        if(driver==null)
        {
            System.out.println("Driver is Null");
        }
        else {
            //click on menu
            WebElement menu = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='home_open_menu_id']"));
            //UtilityClass.explicitlyWait(menu, driver, 8);
            Thread.sleep(5000);
            menu.click();
            logger.info("Clicked On Menu");
            //click on settings
            Thread.sleep(5000);
            WebElement settings = driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']"));
            UtilityClass.explicitlyWait(settings, driver, 5);
            settings.click();
            logger.info("Clicked On Settings");
            //click on logout
            WebElement logout = driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']"));
            UtilityClass.explicitlyWait(logout, driver, 5);
            logout.click();
            logger.info("Clicked On Logout");
            //click on popup
            WebElement yesPopup = driver.findElement(By.id("android:id/button2"));
            UtilityClass.explicitlyWait(yesPopup, driver, 5);
            yesPopup.click();
            logger.info("Clicked On Yes for Logout");
            Thread.sleep(2000);
           //press back button.
            ((PressesKey)driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
            logger.info("Clicked On Back button and landed on Home screen");
            //driver.quit();

        }


    }
//        @After
//    public void afterScenario(Scenario scenario) throws IOException {
//        String scenarioName = scenario.getName();
//        String status = scenario.getStatus();
//        if (status.equalsIgnoreCase("failed")) {
//            TakesScreenshot ts = (TakesScreenshot) driver;
//            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//            File source = ts.getScreenshotAs(OutputType.FILE);
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
//            String fileName = scenarioName + dtf.format(LocalDateTime.now());
//            FileUtils.copyFile(source, new File("./Screenshots/" + fileName + ".png"));
//            System.out.println("Screenshot taken");
//            scenario.embed(screenshot, "image/png");
//            UtilityClass.stopServer();
//        }
//
//    }


}
