package GenericUtility;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidDriverUtility {
   static AndroidDriver driver;
	public static void scroolToElement(AndroidDriver driver,String an,String av) {
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\" ))");
	}
	public static void implicit(AndroidDriver driver, long timeouts)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
   	  
	}


