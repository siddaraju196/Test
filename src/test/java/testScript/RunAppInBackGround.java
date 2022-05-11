package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunAppInBackGround {

	public static void main(String[] args) throws MalformedURLException {
      DesiredCapabilities dc= new DesiredCapabilities();
      dc.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1718");
      dc.setCapability(MobileCapabilityType.UDID, "c7fdaace");
      dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
      dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");

      dc.setCapability("appPackage", "com.androidsample.generalstore");
      dc.setCapability("appActivity", ".SplashActivity");
      
       URL url = new URL("http://localhost:4723/wd/hub");
       AndroidDriver driver= new AndroidDriver(url,dc);
       
       driver.runAppInBackground(10);
	}

}
