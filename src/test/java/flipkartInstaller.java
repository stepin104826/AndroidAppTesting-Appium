import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class flipkartInstaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "11.0");
		dc.setCapability("deviceName", "Galaxy Tab S6");
		dc.setCapability("app", "E:\\Downloads\\flipkart.apk");
		
		URL url = null;
		try {
			url = new URL("http://10.2.7.20:4723/wd/hub");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
//		driver.quit();
	}

}
