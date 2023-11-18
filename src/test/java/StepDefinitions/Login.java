package StepDefinitions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	
	WebDriver driver;
	LoginPage loginPage;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		
	//	WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();		
	driver.get("https://www.saucedemo.com/v1");
	loginPage = new LoginPage(driver);
	   
	}

	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {   
		loginPage.enterUsername("standard_user");
		loginPage.enterUsername("secret_sauce");
	}

	@When("the clicks on the Login button")
	public void clicks_on_the_login_button() {
	  loginPage.clickLoginButton();
		
	}

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
	    
		driver.quit();
	}

}
