package testScript;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartServerThroughScript {

	public static void main(String[] args) throws MalformedURLException {
     AppiumDriverLocalService server= AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
    		 .withArgument(GeneralServerFlag.SESSION_OVERRIDE) .usingPort(4724).withLogFile(new File("..Appium1332/Logs.txt")));
     server.start();
     DesiredCapabilities dc= new DesiredCapabilities();
     dc.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1718");
     dc.setCapability(MobileCapabilityType.UDID, "c7fdaace");
     dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
     dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
     

		// capabilities
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		// Url appium 
		URL url= new URL("http://localhost:4724/wd/hub");
		AndroidDriver driver= new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     server.stop();
     
     
     
     
	}

}
