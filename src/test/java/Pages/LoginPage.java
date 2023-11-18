package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	@FindBy(id = "user-name")
	private WebElement usernameInput;
	
	@FindBy(id= "password")
	private WebElement passwordInput;
	
	@FindBy(id= "login-button")
	private WebElement loginButton;
	
	// constructor
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	// methods to interact with elements
	
	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}

}
