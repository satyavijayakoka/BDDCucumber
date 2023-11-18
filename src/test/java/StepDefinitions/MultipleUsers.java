package StepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleUsers {
	WebDriver driver;
	@Given("the user is on the Saucedemo login page")
	public void the_user_is_on_the_saucedemo_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver = new ChromeDriver();
	   driver.get("https://www.saucedemo.com/v1/");
	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	  WebElement userNameField = driver.findElement(By.id("user-name"));
	  WebElement passwordField = driver.findElement(By.id("password"));
	  userNameField.sendKeys(username);
	  passwordField.sendKeys(password);
	}
	@When("clicks on the Login button")
	public void clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions	
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
	}
     
	// h3[data-test="error"]
	
	@Then("the user should be {string}")
	public void the_user_should_be(String login_status) {
	   if(login_status.equals("successful")) {
		  WebElement product = driver.findElement(By.cssSelector(".product_label"));
		   assertEquals("Products",product.getText());
	   }
	   else {
		 WebElement errorElement =  driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
		assertEquals("Epic sadface: Sorry, this user has been locked out." ,errorElement.getText());
	   }
	   
		driver.quit();
	}
	
/*	@Then("the user should be {string}")
	public void the_user_should_be(String login_status) {
	   if(login_status.equals("successful")) {
	      WebElement productLabel = driver.findElement(By.cssSelector(".product_label"));
	      assertTrue(productLabel.isDisplayed()); // Check if the product label is displayed
	   }
	   else {
	     WebElement errorElement = driver.findElement(By.cssSelector("h3[data-test='error']"));
	     assertTrue(errorElement.isDisplayed()); // Check if the error message is displayed
	     assertEquals("Epic sadface: Sorry, this user has been locked out.", errorElement.getText());
	   }

	   driver.quit();
	}*/

	/* @Then("the user should be {string}")
	    public void the_user_should_be(String login_status) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        if (login_status.equals("successful")) {
	            WebElement productLabel = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".product_label")));
	            assertTrue(productLabel.isDisplayed()); // Check if the product label is displayed
	        } else {
	            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h3[data-test='error']")));
	            assertEquals("Epic sadface: Sorry, this user has been locked out.", errorElement.getText());
	        }

	        driver.quit();
	    } */
	
	
	
	
	
	


}
