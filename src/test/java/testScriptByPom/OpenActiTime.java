package testScriptByPom;

import java.io.IOException;

import org.junit.Test;

import GenericUtility.FileUtility;
import GenericUtility.constantPath;
import io.appium.java_client.android.AndroidDriver;

public class OpenActiTime {
	static AndroidDriver driver;
@Test
	public  void  First() throws IOException {
         String prop = constantPath.propertiPath;
         FileUtility .fetch(prop);
        String url = FileUtility.fetch("url");
        String username = FileUtility.fetch("username");
        String password = FileUtility.fetch("password");
         
	}

}
