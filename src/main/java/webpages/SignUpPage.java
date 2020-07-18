package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	
	private WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By firstname = By.id("firstName");
	private By lastname = By.id("lastName");
	private By username = By.id("username");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmPassword");
	private By signup = By.cssSelector("button[data-test=signup-submit]");
	
	public SigninPage signUp(String firstName, String lastName, String UserName, String password, String confirmPassword) {
		driver.findElement(firstname).sendKeys(firstName);
		driver.findElement(lastname).sendKeys(lastName);
		driver.findElement(username).sendKeys(UserName);
		driver.findElement(this.password).sendKeys(password);
		driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
		driver.findElement(signup).click();
		return new SigninPage(driver);
	}	
}