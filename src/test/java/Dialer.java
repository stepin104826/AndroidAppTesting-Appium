import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Dialer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("deviceName", "Pixel 6 API 34_MyDevice");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "14.0");
		dc.setCapability("automationName", "UIAutomator2");
		
		// To get appPackage, appActivity capabilities, in cmd prompt from the adb.exe file location
		// use: dumpsys window displays | grep -e 'mCurrentFocus' 
		dc.setCapability("appPackage", "com.google.android.dialer");
		dc.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
		
		URL url = null;
		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.findElement(By.id("com.google.android.dialer:id/dialpad_fab")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.google.android.dialer:id/eight")).click();
		driver.findElement(By.id("com.google.android.dialer:id/one")).click();
		driver.findElement(By.id("com.google.android.dialer:id/two")).click();
		driver.findElement(By.id("com.google.android.dialer:id/four")).click();
		driver.findElement(By.id("com.google.android.dialer:id/five")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.google.android.dialer:id/dialpad_voice_call_button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("com.google.android.dialer:id/incall_end_call")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
