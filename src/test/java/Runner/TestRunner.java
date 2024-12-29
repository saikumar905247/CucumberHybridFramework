package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Features/login.feature"},
				glue = {"StepDefinations","Hooks"},
				plugin= {"pretty","html:target/CucumberReport/CucumberReport.html"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
