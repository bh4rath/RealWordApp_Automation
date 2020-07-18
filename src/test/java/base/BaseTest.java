package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import webpages.SigninPage;

public class BaseTest {
	
	private static WebDriver driver;
	protected SigninPage signinPage;
	
	@BeforeMethod
	public void launchApplication() {
		SetChromeDriverProperty();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://localhost:3000/signin");
		signinPage = new SigninPage(driver);
	}
	
	@AfterMethod
	public void quitDriver() {
//		driver.quit();
	}

	private void SetChromeDriverProperty() {
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\Real_World_App\\resources\\chromedriver.exe");
	}
}
