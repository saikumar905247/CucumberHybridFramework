package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driverFactory {

	static WebDriver driver;
	
	public static WebDriver InitilizeBrowser(String Browser) {
		
		switch(Browser) {
		 case "Chrome" : driver = new ChromeDriver();
		 break;
		 case "FireFox" : driver = new FirefoxDriver();
		 break;
		 case "Edge" : driver = new EdgeDriver();
		 break;
		 case "Safari" : driver = new SafariDriver();
		 break;
		 default:driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static WebDriver GetDriver() {
		return driver;
	}
	
	
}
