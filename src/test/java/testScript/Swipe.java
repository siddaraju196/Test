package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
	      cap.setCapability( MobileCapabilityType.DEVICE_NAME, "vivo 1718");
	      cap.setCapability( MobileCapabilityType.UDID, "c7fdaace");
	      cap.setCapability( MobileCapabilityType.PLATFORM_NAME, "Anddroid");
	      cap.setCapability( MobileCapabilityType.PLATFORM_NAME, "8.1");
	      
	      // capabilities
	  	cap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability("appActivity", ".TouchScreenTestActivity");
		
		// url
		URL url =new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// horizontally 
		//driver.swipe(363, 25, 399, 1349,5000);
		//vertically
		
		
//	driver.swipe(16,766,713,761,5000);
	Dimension size = driver.manage().window().getSize();
	int ht = size.getHeight();
		int wd = size.getWidth();
		// height
		Thread.sleep(2000);
		driver.swipe(wd/2, 10, wd/2, ht, 500);
		Thread.sleep(2000);
		driver.swipe(1, wd, ht/2, wd, 5000);
		// width 
		Thread.sleep(2000);
		driver.swipe(wd/4, 10, wd/4, ht, 500);
		Thread.sleep(2000);
		driver.swipe(1, ht/4, wd, ht/4, 5000);
		
		Thread.sleep(2000);
		driver.swipe(wd/2+wd/4, 10, wd/2+wd/4, ht, 500);
		Thread.sleep(2000);
		driver.swipe(1, ht/2+ht/4, wd,ht/2+ ht/4, 5000);
		
	}

}
