import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class InstallAppAndroidEmulator {

	public static void main(String[] args) {
		
		// Create a new Desired Capability class object and set all the capabilities.
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("automationName","Appium");
		dc.setCapability("deviceName", "Pixel 6 API 34_MyDevice");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "14.0");
		dc.setCapability("app","C:\\Program Files\\APK Files\\apk-info.apk");	
		System.out.println("ok");
		
		URL url = null;
		try {
		url = new URL("http://127.0.0.1:4723/wd/hub");   // Set the URL to the path where Appium Server is running.
		}
		catch(MalformedURLException e){
			System.out.println(e.getMessage());
		}
		
		// Initialize a new android driver with the set capabilities and server URL.
		AndroidDriver driver = new AndroidDriver(url, dc);
	
		
	}
}
