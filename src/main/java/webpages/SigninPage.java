package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {
	
	private WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By username = By.id("username");
	private By password = By.id("password");
	private By signinButton = By.cssSelector("button[data-test=signin-submit]");
	private By signupLink = By.cssSelector("a[data-test=signup]");
	
	public void signin(String userName, String userPassword){
		driver.findElement(username).sendKeys(userName);
		driver.findElement(password).sendKeys(userPassword);
		driver.findElement(signinButton).click();
	}
	
	public SignUpPage clickSignupLink() {
		driver.findElement(signupLink).click();
		return new SignUpPage(driver);
	}
	
	
}