package StepDefinations;

import static org.testng.Assert.assertEquals;

import java.time.LocalTime;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Factory.driverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Register {
	WebDriver driver;
	
	@Given("Navigate to Register page")
	public void navigate_to_register_page() {
		driver = driverFactory.GetDriver();
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	}

	@When("User provides all the below fields")
	public void user_provides_all_the_below_fields(DataTable dataTable) throws InterruptedException {
		Map<String, String> datatable =dataTable.asMap(String.class, String.class);
		driver.findElement(By.id("input-firstname")).sendKeys(datatable.get("FirstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(datatable.get("LastName"));
		driver.findElement(By.id("input-telephone")).sendKeys(datatable.get("Phone"));
		driver.findElement(By.id("input-password")).sendKeys(datatable.get("Password"));
		driver.findElement(By.id("input-confirm")).sendKeys(datatable.get("Password"));
		driver.findElement(By.id("input-email")).sendKeys(Email());
		Thread.sleep(2000);
	}

	@And("User click on privacy policy check box")
	public void user_click_on_privacy_policy_check_box() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@Then("user click on continue button")
	public void user_click_on_continue_button() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@And("User account should get created")
	public void user_account_should_get_created() {
		assertEquals("Your Account Has Been Created!", driver.findElement(By.xpath("//div[@id='content']/h1")).getText());
	}

	public String Email() {
		LocalTime time = LocalTime.now();
		return "Saikumar"+time.toString()
		.replace(":", "_").replace(".", "_")
		+"@gmail.com";
	}

}
