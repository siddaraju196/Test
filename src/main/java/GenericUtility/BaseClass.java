package GenericUtility;

import java.io.IOException;
import java.net.URL;

import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	static AppiumDriverLocalService service;
	static AndroidDriver driver;
	
	

	@BeforeMethod
	public void launchApplication () throws IOException
	{

		String deviceName = FileUtility.fetch("deviceName");
		String UDID = FileUtility.fetch("UDID");
		String platformName = FileUtility.fetch("platformName");
		String platformVersion = FileUtility.fetch("platformVersion");
                String browserName = FileUtility.fetch("browserName");
		String appPackage1 = FileUtility.fetch("appPackage");
		String appActivity1 = FileUtility.fetch("appActivity");
		
		//driver=AndroidDriverUtility.openUrl(deviceName, UDID, platformName, platformVersion, appActivity1, appPackage1);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		dc.setCapability(MobileCapabilityType.UDID, UDID);
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformVersion);
 		dc.setCapability("appPackage", appPackage1);
		dc.setCapability("appActivity", appActivity1);
		
		URL url= new URL(constantPath.URL);
		 driver=new AndroidDriver(url, dc);
		

	}

	@AfterMethod

	public void closeApp()
	{
//		driver.closeApp();
	}

	
	

	@AfterSuite
	public void stopDataconnection()
	{
		System.out.println("stop data base connection");
	}



}

