import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class UIElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final long startTime = System.currentTimeMillis();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 6 API 34_MyDevice");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion","14.0");
		caps.setCapability("appPackage","io.appium.android.apis");
		caps.setCapability("appActivity","io.appium.android.apis.view.Controls1");
		
		// Set the URL to the appium server
		URL server_url = null;
		try {
		server_url = new URL("http://127.0.0.1:4723/wd/hub");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		// Create an android driver
		AndroidDriver driver = new AndroidDriver(server_url,caps);
		Thread.sleep(3000);
				
		driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/check2")).click();
		driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"RadioButton 1\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Earth\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"textColorSecondary\"]")).click();
		
		final long endTime = System.currentTimeMillis();
		
		System.out.println("Execution Time: "+(endTime-startTime));
		
		driver.quit(); //Close the session 

	}

}
