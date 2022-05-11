package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HandleGeneralStorePopUp {
static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
         DesiredCapabilities cap= new DesiredCapabilities();
         cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1718");
         cap.setCapability(MobileCapabilityType.UDID, "c7fdaace");
         cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
         cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
         
         cap.setCapability("appPackage", "com.androidsample.generalstore");
 		cap.setCapability("appActivity", ".SplashActivity");
 		// Url appium 
 		URL url= new URL("http://localhost:4723/wd/hub");
 		scrollToElement(driver,"text","India");
 		 driver= new AndroidDriver(url,cap);
 		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
 		
	}
	
public static void scrollToElement(AndroidDriver driver,String an,String av)
{
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).ScrollIntoView("+an+"(\""+av+"\"))");
}
}   
