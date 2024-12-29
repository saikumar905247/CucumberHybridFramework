package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.driverFactory;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.*;

public class Login {

	WebDriver driver;
	LoginPage loginPage;
	
	@Given("Open the application")
	public void Open_the_application() throws InterruptedException {
		driver = driverFactory.GetDriver();
		HomePage homePage= new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.ClickMyAccount();
		homePage.ClickLogin();
//		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(1000);
		Assert.assertEquals("Returning Customer", loginPage.Cust());
	}
	
	@When("User provides username {string}")
	public void User_provides_username(String username) {	
		loginPage.SendEmail(username);
//		driver.findElement(By.xpath("//input[@name='email']")).clear();
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	}
	
	@And("User provides password {string}")
	public void User_provides_password(String pass) {
		loginPage.SendPassword(pass);
//		driver.findElement(By.xpath("//input[@name='password']")).clear();
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	}
	
	@Then("Click on login button")
	public void Click_on_login_button() {
		loginPage.clickLoginButton();
	}
	
	@And("Verify successfully login")
	public void Verify_successfully_login() {
		assertEquals("My Account", loginPage.MyAccount());
	}
	
	@And("Verify validation message")
	public void Verify_validation_message() {
		assertEquals("Warning: No match for E-Mail Address and/or Password.", loginPage.ValidationMessage());
		
	}
}
