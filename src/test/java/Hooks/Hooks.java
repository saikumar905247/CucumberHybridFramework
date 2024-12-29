package Hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Factory.driverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import utils.ConfigReader;

public class Hooks {
	
	WebDriver driver;
	
	@Before
	public void Setup() {
		Properties prop = ConfigReader.InitlizeProperties();
		driver=driverFactory.InitilizeBrowser(prop.getProperty("browser"));
//		driver = driverFactory.GetDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
	}

	@After
	public void TearDown() {
		driver.quit();
	}
	
	@BeforeStep
	public void waittime() throws InterruptedException {
		Thread.sleep(3000);
	}
}
