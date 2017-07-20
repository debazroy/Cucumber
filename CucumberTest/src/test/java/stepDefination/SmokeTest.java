package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class SmokeTest {
	WebDriver driver;
	
	@Given("^Open chrome and Start Applicattion$")
	public void open_chrome_and_Start_Applicattion() throws Throwable {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String username, String password) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);   
	}

	@Then("^user should able to login successfully$")
	public void user_should_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("u_0_r")).click();
	}
	
	@Then("^Application should be close$")
	public void application_should_be_close() throws Throwable {
		driver.quit();
	}


}
