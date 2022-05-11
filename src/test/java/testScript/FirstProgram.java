package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstProgram {

	public static void main(String[] args) throws MalformedURLException {
      
		DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1718");
	cap.setCapability(MobileCapabilityType.UDID, "c7fdaace");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		// capability of app
	cap.setCapability("appPackage","com.android.bbkcalculator");
	cap.setCapability("appActivity",".Calculator");
	// Appium server url
	URL url= new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,cap);
	WebElement five = driver.findElement(By.id("com.android.bbkcalculator:id/digit5"));
	five.click();
	WebElement plus = driver.findElement(By.id("com.android.bbkcalculator:id/plus"));
	plus.click();
	WebElement two = driver.findElement(By.id("com.android.bbkcalculator:id/digit2"));
	two.click();
	WebElement equals = driver.findElement(By.id("com.android.bbkcalculator:id/equal"));
	equals.click();
   String result = driver.findElement(By.id("com.android.bbkcalculator:id/input_edit")).getText();
	System.out.println(result);

	}

}
