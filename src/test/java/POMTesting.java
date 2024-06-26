import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

import PageObjects.Youtube;

public class POMTesting {

	public static void main(String args[]) throws InterruptedException {
		
		// Set the desired caps.
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability("deviceName", "Pixel 6 API 34_MyDevice");
		cp.setCapability("devicePlatform", "Android");
		cp.setCapability("platformVersion", "14.0");
		cp.setCapability("appPackage","com.google.android.youtube");
		cp.setCapability("appActivity","com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
		cp.setCapability("autoAcceptAlerts", true);
		
		// Access the Appium Server URL
		URL url = null;
		try {
		url = new URL("http://127.0.0.1:4723/wd/hub");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		AndroidDriver driver = new AndroidDriver(url,cp);
		
		Youtube obj = new Youtube(driver);
		
		WebElement searchbox = obj.textsearch();
		WebElement voice = obj.voicesearch();
		
		searchbox.sendKeys("Pop Songs");
		Thread.sleep(3);
		driver.navigate().back();
		Thread.sleep(3);
		voice.click();
		
		driver.quit();
		
		
	}
}
