package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class IsAppInstalled {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
	      cap.setCapability( MobileCapabilityType.DEVICE_NAME, "vivo 1718");
	      cap.setCapability( MobileCapabilityType.UDID, "c7fdaace");
	      cap.setCapability( MobileCapabilityType.PLATFORM_NAME, "Anddroid");
	      cap.setCapability( MobileCapabilityType.PLATFORM_NAME, "8.1");
	       
	      // capabilities
	  	//cap.setCapability("appPackage", "io.appium.android.apis");//when app is in phone
		//cap.setCapability("appActivity", ".ApiDemos");//when app is in phone
		cap.setCapability("app", "C:\\Users\\kiran ke\\Downloads\\ApiDemos-debug.apk");// when app is not in phone use this line
		// url
		URL url =new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver= new AndroidDriver(url, cap);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("App status"+driver.isAppInstalled("io.appium.android.apis"));
		driver.removeApp("io.appium.android.apis");
		System.out.println("App status"+driver.isAppInstalled("io.appium.android.apis"));
	}

}
