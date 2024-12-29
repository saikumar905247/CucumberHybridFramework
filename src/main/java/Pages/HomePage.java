package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement MyAccount ;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement Login;
	
	public void ClickMyAccount() {
		MyAccount.click();
	}
	
	public void ClickLogin() {
		Login.click();
	}
	
}
