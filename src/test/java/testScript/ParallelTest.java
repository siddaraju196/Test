package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParallelTest {
	@Parameters({"deviceName", "platformVersion","UDID","port"})
	@Test
	public void parallel(String deviceName, String platformVersion, String UDID, String port)
			throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", deviceName);
		cap.setCapability("UDID", UDID);
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", platformVersion);

		// app capabilities
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");

		// url
		URL url = new URL("http://localhost:" + port + "/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
