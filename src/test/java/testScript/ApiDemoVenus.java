package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemoVenus {

	public static void main(String[] args) throws MalformedURLException {
      DesiredCapabilities cap= new DesiredCapabilities();
      cap.setCapability( MobileCapabilityType.DEVICE_NAME, "vivo 1718");
      cap.setCapability( MobileCapabilityType.UDID, "c7fdaace");
      cap.setCapability( MobileCapabilityType.PLATFORM_NAME, "Anddroid");
      cap.setCapability( MobileCapabilityType.PLATFORM_NAME, "8.1");
      
      // capabilities
  	cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", ".ApiDemos");
	// url
	URL url =new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver= new AndroidDriver(url, cap);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")).click();
	driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("tejas");
	driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]")).click();
	driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"RadioButton 1\"]")).click();
	driver.hideKeyboard();
	driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Star\"]")).click();
	driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
	driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
	
	List<WebElement> option = driver.findElementsByClassName("android.widget.CheckedTextView");
	
	System.out.println(option.size());
	for (WebElement ele : option) {
		String test = ele.getText();
		System.out.println(test);
	}
	for (WebElement ele : option) {
		String test = ele.getText();
		if(test.equalsIgnoreCase("Venus"))
		{
			ele.click();
			break;
		}
	}

	
	
	}

}
