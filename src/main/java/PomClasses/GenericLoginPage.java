package PomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GenericLoginPage {
	public AndroidDriver Driver;
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement spinner;
  public WebElement getSpinner() {
		return spinner;
	}

	public AndroidDriver getDriver() {
		return Driver;
	}
@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
  private WebElement nameText;
  @AndroidFindBy (id="com.androidsample.generalstore:id/radioMale")
  private WebElement maleRadio;
  @AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
  private WebElement letsShop;
  //initialization
 public  GenericLoginPage(AndroidDriver driver)
 {
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
 }
public WebElement getNameText() {
	return nameText;
}
public WebElement getMaleRadio() {
	return maleRadio;
}
public WebElement getLetsShop() {
	return letsShop;
}
 // utilization business libraries
public void loginButton(String name)
{    
	spinner.click();
	nameText.sendKeys(name);
	maleRadio.click();
	letsShop.click();
}
  
  
  
}




