package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Youtube{
	static AndroidDriver driver;
	
	public Youtube(AndroidDriver driver) {
		this.driver = driver;
	}
	
	public WebElement textsearch() {
		WebElement ele = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Search YouTube\"]"));
		return ele;
	}
	
	public WebElement voicesearch() {
		WebElement ele = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\'Search with your voice\']"));
		return ele;
	}
	
}
