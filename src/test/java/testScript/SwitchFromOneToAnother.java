package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import GenericUtility.AndroidDriverUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwitchFromOneToAnother {

	public static void main(String[] args) throws MalformedURLException, Throwable {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1718");
		cap.setCapability(MobileCapabilityType.UDID, "c7fdaace");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		

		// capabilities
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		
		// Url appium 
		URL url= new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url,cap);
		AndroidDriverUtility.implicit(driver, 10);
		driver.findElementByAccessibilityId("Views").click();
		driver.startActivity("com.androidsample.generalstore", ".SplashActivity");
		Thread.sleep(1000);
		// switch back same app
		driver.startActivity("io.appium.android.apis", ".ApiDemos");
		
		driver.launchApp();
	}

}
