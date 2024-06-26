package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/features.feature",  // Path to the feature file
		glue = "StepsDef",                          // Name of the Steps definition folder
		dryRun = false                            // true => DryRun will only check if all the test steps are implemented, else false. 
//		monochrome = true,							// true => If terminal output should be without colours
//		plugin = {"pretty","html:target/cucumber"}			
		)

public class Run {

}
