package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Notifivation {
	static AndroidDriver driver;
	public static void main(String[] args) throws Throwable   {
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
		 driver= new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int height = driver.manage().window().getSize().getHeight();
		driver.findElementByAccessibilityId("App").click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Notification\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"IncomingMessage\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/notify_app")).click();
		//Thread.sleep(2000);
		driver.openNotifications();
//		scrollToElement(driver,"text","Joe");
		
//		driver.swipe(334, 600, 334, 350, 500);
		
		for (int i = 1; i <50; i++) {
			try {
				driver.findElement(By.xpath("//android.widget.TextView[@text='Joe']")).click();
			} catch (Exception e) {
				driver.swipe(334, height/2, 334, height/4, 500);
			}
		}
		
		
	}
	public static void scrollToElement(AndroidDriver driver,String an,String av)
	{
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	
	
	}
}
