package utils;

//import io.appium.java_client.AppiumBy;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class UtilityClass extends BaseTest
{
    public static void implicitlyWait(AndroidDriver driver,int time)
  {
      driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
  }

    public static void explicitlyWait(WebElement element,AndroidDriver driver,int time)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
  public static String readDataFromPropertyFile(String key) throws IOException, FileNotFoundException
  {
      Properties prop=new Properties();
      FileInputStream myfile=new FileInputStream("D:\\AutomationDocisnProviderAPK\\src\\test\\resources\\config\\config.properties");
      prop.load(myfile);
        //return prop.getProperty(key);
      String value=prop.getProperty(key);
      return value;
  }
    public static void scrollDown(AndroidDriver driver)
    {
        Dimension dimension=driver.manage().window().getSize();
        int scrollStart=(int)(dimension.getHeight()*0.6);
        int scrollEnd=(int)(dimension.getHeight()*0.1);
        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(0,scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(0,scrollEnd))
                .release().perform();
    }
    public static void scrollToElement(WebElement element,AndroidDriver driver)
    {
        int retry=0;
        while (retry<=5)
        {
            try {
                element.click();
                break;
            }
            catch (NoSuchElementException e)
            {
                scrollDown(driver);
                retry++;
            }
        }
    }

    public static void scrollDownCustom(AndroidDriver driver,double startScroll,double endScroll)
    {
        Dimension dimension=driver.manage().window().getSize();
        int scrollStart=(int)(dimension.getHeight()*startScroll);
        int scrollEnd=(int)(dimension.getHeight()*endScroll);
        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(0,scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(0,scrollEnd))
                .release().perform();
    }


}
