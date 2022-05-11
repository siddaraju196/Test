package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidKeyCode_first {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1718");
		cap.setCapability(MobileCapabilityType.UDID, "c7fdaace");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		URL url =new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver= new AndroidDriver(url, cap);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		Thread.sleep(1000);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
		
		System.out.println(AndroidKeyCode.KEYCODE_BACK);
		System.out.println(AndroidKeyCode.KEYCODE_ENTER);
		
		System.out.println(AndroidKeyCode.KEYCODE_CAMERA);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(5000);
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	     driver.pressKeyCode(220);
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		//driver.pressKeyCode(221);
		driver.longPressKeyCode(221);
		Thread.sleep(5000);
		driver.longPressKeyCode(64);
		 
		Thread.sleep(5000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		
	}

}
