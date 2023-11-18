package StepDefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	//ChromeDriver driver;
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("opening the login page");
	//   driver = new ChromeDriver();
		
	//driver.get("https://www.saucedemo.com/");
	   
	}

	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("entering the username and password");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
	}

	/*@When("clicks on the Login button")
	public void clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
		// driver.findElement(By.cssSelector("#login-button")).click();
		
	}*/

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("validate logo on dashboard");
		//driver.findElement(By.className("app_logo")).isDisplayed();
	}

}
