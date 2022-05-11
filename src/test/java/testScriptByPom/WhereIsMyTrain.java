package testScriptByPom;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import io.appium.java_client.android.AndroidDriver;


public class WhereIsMyTrain extends BaseClass{
	static AndroidDriver driver;
@Test
	public void train() throws InterruptedException
	{
	Thread.sleep(2000);
		driver.findElement(By.id("com.whereismytrain.android:id/spot_autocompleteFrom")).sendKeys("yadgir");
		Thread.sleep(2000);
		driver.findElement(By.id("com.whereismytrain.android:id/spot_autocomplete_to")).sendKeys("bidar"); 
		Thread.sleep(2000);
		driver.findElement(By.id("com.whereismytrain.android:id/findTrainsFl")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.whereismytrain.android:id/autocompleteTrain")).sendKeys("16571");
		Thread.sleep(2000);
		driver.findElement(By.id("com.whereismytrain.android:id/spot_search_button")).click();
		
	}
}
