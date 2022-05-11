package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class NetworkConnection {
static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
                 
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1718");
		cap.setCapability(MobileCapabilityType.UDID, "c7fdaace");

		// capabilities
	//	cap.setCapability("appPackage", "com.androidsample.generalstore");
		//cap.setCapability("appActivity", ".SplashActivity");
		// Url appium 
		URL url= new URL("http://localhost:4723/wd/hub");
		 driver= new AndroidDriver(url,cap);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Connection currentstate= driver.getConnection();
		 System.out.println(currentstate); 
		 driver.setConnection(Connection.WIFI);
	System.out.println( driver.getConnection());
		 driver.setConnection(Connection.DATA);
		 System.out.println( driver.getConnection());
		 driver.setConnection(Connection.AIRPLANE);
	 System.out.println( driver.getConnection());
		
		 
	}

}
