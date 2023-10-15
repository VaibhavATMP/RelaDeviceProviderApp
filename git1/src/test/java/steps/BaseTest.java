package steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Provider;

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


public class BaseTest {
    public static AndroidDriver driver;
    static AppiumDriverLocalService appiumServer;
    static AppiumServiceBuilder appiumServiceBuilder;


    public BaseTest() {
        //startEmulator();
        setDriver();
    }


    public static void setDriver() {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Manogna's M33");
        //realme_Pad_X
        //capability.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capability.setCapability(MobileCapabilityType.BROWSER_NAME, "dialer");
        capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capability.setCapability("skipUnlock", "true");
        capability.setCapability("app-package", "com.aciana.docisn");
        capability.setCapability("app-activity", "com.aciana.docisn.MainActivity");
        capability.setCapability("noReset", "false");
        capability.setCapability("newCommandTimeout", 25000);

//        MutableCapabilities caps = new MutableCapabilities();
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("appium:platformVersion", "12.0");
//        caps.setCapability("appium:deviceName", "realme_Pad_X");
//        caps.setCapability("appium:AUTOMATION_NAME","UIAutomator2");

        appiumServiceBuilder = new AppiumServiceBuilder();
        appiumServiceBuilder.withAppiumJS(new File("C:\\Users\\Archents\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
                .usingPort(4723)
                .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
                .withIPAddress("127.0.0.1")
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(GeneralServerFlag.LOG_LEVEL,"error");
        appiumServer = AppiumDriverLocalService.buildService(appiumServiceBuilder);
        appiumServer.start();
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void startEmulator() {
        String sdkPath = "C:\\Users\\Archents\\AppData\\Local\\Android\\Sdk";
//                "C:\\Users\\Sandeep\\AppData\\Local\\Android\\Sdk\\";
        String emulatorPath = sdkPath + "\\emulator" + File.separator + "emulator";
        System.out.println("Starting emulator for '" + "Manogna's M33" + "' ...");
//        String[] aCommand = new String[]{emulatorPath, "-avd", nameOfAVD};
        try {
            ProcessBuilder process = new ProcessBuilder("cmd.exe", "/C", "start", emulatorPath, "-avd", "Manogna's M33");
            process.start();
            Thread.sleep(15000);
            System.out.println("Emulator launched successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

//    @After
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
//            stopServer();
//        }
//
//    }

    public static void stopServer() {
        if (appiumServer != null) {
            appiumServer.stop();
            System.out.println("Appium Server Stopped");
        }
        else System.out.println("Appium is not running. Hence can't stop");
    }
    public void EndSession() {
        if (driver == null) {
            driver.quit();
        }
    }

}