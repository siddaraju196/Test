package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TapAction {
	  static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
       DesiredCapabilities cap= new DesiredCapabilities();
       cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1718");
       cap.setCapability(MobileCapabilityType.UDID, "c7fdaace");
       cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
       cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
       
       // capability of app
       cap.setCapability("appPackage","com.android.bbkcalculator");
       cap.setCapability("appActivity",".Calculator");
       
		// Appium server Url
       URL url= new URL("http://localhost:4723/wd/hub");
       
      driver = new AndroidDriver(url, cap);  
      WebElement five = driver.findElement(By.id("com.android.bbkcalculator:id/digit5"));
       // driver.tap(1, five, 1000);
        tapActions(1, five, 1000);
       WebElement plus = driver.findElement(By.id("com.android.bbkcalculator:id/plus"));
      // driver.tap(1, 609,1139,1000);
       tapActions(1, 609,1139,1000);
        WebElement two = driver.findElement(By.id("com.android.bbkcalculator:id/digit2"));
       //driver.tap(1, two, 500);
       tapActions(1, two, 500);
        WebElement equal = driver.findElement(By.id("com.android.bbkcalculator:id/equal"));
        //driver.tap(1, 614,1266, 500);
        tapActions(1, 614,1266, 500);
         String result = driver.findElement(By.id("com.android.bbkcalculator:id/input_edit")).getText();
        System.out.println(result);
	}
	public static void tapActions(int finger,WebElement element,int duration)
	{
		
       driver.tap(finger, element, duration);
       
	}
	public static void tapActions(int finger,int x, int y, int duration)
	{
		driver.tap(finger, x, y, duration);
	}

}
