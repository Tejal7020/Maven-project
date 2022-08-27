package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.BaseClass;
import main.LoginPage;


public class BaseTest extends BaseClass{
	
	@BeforeClass
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
	}
	
	@BeforeClass
	public void pageObjects() {
		loginpage = new LoginPage(driver);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	

	

}
