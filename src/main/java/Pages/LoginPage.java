package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Returning Customer')]")
	private WebElement Cust;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//div[@id='content']/*[contains(text(),'My Account')]")
	private WebElement MyAccount;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement ValidationMessage;
	
	public String Cust() {
		return Cust.getText();
	}
	
	public void SendEmail(String User) {
		Email.clear();
		Email.sendKeys(User);
	}
	
	public void SendPassword(String Pass) {
		Password.clear();
		Password.sendKeys(Pass);
	}
	
	public void clickLoginButton() {
		LoginButton.click();
	}
	
	public String MyAccount() {
		return MyAccount.getText();
	}
	
	public String ValidationMessage() {
		return ValidationMessage.getText();
		
	}
}
