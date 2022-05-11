package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallAndLaunchApp {
	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, Exception {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1718");
		dc.setCapability(MobileCapabilityType.UDID, "c7fdaace");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "8.1");
		//
		//dc.setCapability("app", "C:\\Users\\kiran ke\\Downloads\\ApiDemos-debug.apk");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver= new AndroidDriver(url,dc);
		
		driver.installApp("C:\\Users\\kiran ke\\Downloads\\ApiDemos-debug.apk");
		Thread.sleep(2000);
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		driver = new AndroidDriver(url, dc);
		driver.launchApp();
		
		

	}

}
