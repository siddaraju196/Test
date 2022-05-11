package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
static Properties prop;
	public static String fetch(String key) throws IOException {
		FileInputStream fis= new FileInputStream(constantPath.propertiPath);
		 prop= new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
	     return value;

	}
	

}
