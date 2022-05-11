package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ContextSwitch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
DesiredCapabilities dc= new DesiredCapabilities();
dc.setCapability(MobileCapabilityType.DEVICE_NAME, "viv0 1718");
dc.setCapability(MobileCapabilityType.UDID, "c7fdaace");
dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "viv0 1718");
dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1");
//
dc.setCapability("appPackage", "com.androidsample.generalstore");
dc.setCapability("appActivity", ".SplashActivity");
//
URL url = new URL("http://localhost:4723/wd/hub");
	
AndroidDriver driver= new AndroidDriver(url,dc);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
scrollToElement(driver,"text","India");
driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();

driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("siddarajus");
driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
scrollToElement(driver,"text","PG 3");
driver.findElement(By.xpath("//android.widget.TextView[@text='PG 3']/..//android.widget.TextView[@text='ADD TO CART']")).click();
driver.findElement(By.id("appbar_btn_cart")).click();
Thread.sleep(2000);
driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
Thread.sleep(1000);
Set <String>windows = driver.getContextHandles();
for (String window : windows) {
	System.out.println("Active Applications"+window);
	System.out.println("Active Applications"+windows);
	Thread.sleep(2000);
	driver.context("WEBVIEW_com.androidsample.generalstore");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sachin");
}
}

	public static void scrollToElement(AndroidDriver driver,String an, String av)
	{
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
}