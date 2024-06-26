import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new Desired Capability class object and set all the required capabilities.
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("automationName","Appium");
		dc.setCapability("deviceName", "Pixel 6 API 34_MyDevice");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "14.0");

		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		// Set the URL to the appium server
		URL server_url = null;
		try {
		server_url = new URL("http://127.0.0.1:4723/wd/hub");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		// Create an android driver
		AndroidDriver driver = new AndroidDriver(server_url,dc);
		Thread.sleep(3000);
		
		// Find the elements after getting their locators 
		driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"6\"]")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]")).click();
		WebElement result = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/result_final\"]"));
		
		if(result.getText().equals("7")) {
			System.out.println("Test Passed!");
		}
		else {
			System.out.println("Failed");
		}
		
//		driver.close();
		
		

	}

}
