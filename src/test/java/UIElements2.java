import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class UIElements2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final long startTime = System.currentTimeMillis();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 6 API 34_MyDevice");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion","14.0");
		caps.setCapability("appPackage","io.appium.android.apis");
		caps.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		
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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Interact with UI elements
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
		// Scroll till 'switches' element
		WebElement switches = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Switches']"));
		String text = switches.getText();
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))").click();
		
		driver.findElement(By.xpath("//android.widget.Switch[@content-desc='Standard switch']")).click();
		
		final long endTime = System.currentTimeMillis();
		System.out.println("Execution Time: "+(endTime-startTime));
		
		driver.quit();
		
	}

}
