package StepsDef;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Keys;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	public static AndroidDriver driver = null;
	
	@Before
	public void setup() {
		// Create a new Desired Capability class object and set all the capabilities.
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Pixel 6 API 34_MyDevice");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "14.0");
		dc.setCapability("automationName","uiautomator2");
		dc.setCapability("browserName","Chrome");
		
		
		URL url = null;
		try {
		url = new URL("http://127.0.0.1:4723/wd/hub");   // Set the URL to the path where Appium Server is running.
		}
		catch(MalformedURLException e){
			System.out.println(e.getMessage());
		}
		
		AndroidDriver driver = new AndroidDriver(url, dc);
	}
	
	
	@Given("Google page is loaded to the browser successfully")
	public void google_page_is_loaded_to_the_browser_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.google.com/");
	}

	@When("the search phrase {string} is entered")
	public void the_search_phrase_is_entered(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys(string);
	}

	@When("Enter key is pressed")
	public void enter_key_is_pressed() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys(Keys.ENTER);
	}

	@Then("the relevant search results are shown")
	public void the_relevant_search_results_are_shown() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();		
	}
}
