package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScaleImage {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
	      cap.setCapability( MobileCapabilityType.DEVICE_NAME, "vivo 1718");
	      cap.setCapability( MobileCapabilityType.UDID, "c7fdaace");
	      cap.setCapability( MobileCapabilityType.PLATFORM_NAME, "Anddroid");
	      cap.setCapability( MobileCapabilityType.PLATFORM_NAME, "8.1");
	      
	      // capabilities
	  	cap.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		cap.setCapability("appActivity", ".MainActivity");
		// url
		URL url =new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
		WebElement picture = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		driver.zoom(picture);
		driver.pinch(picture);
	}

}
