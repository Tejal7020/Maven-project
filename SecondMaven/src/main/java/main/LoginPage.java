package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//*[text()='Username']//parent::div//parent::div//input")
	WebElement username;
	
	@FindBy(xpath = "//*[text()='password']//parent::div//parent::div//input")
	WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement btnlogin;
	
	@FindBy(xpath = "//h5[text() = 'Login']")
	WebElement txtlogin;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String LoginPageText() {
		return txtlogin.getText();	
	}
	
	public void Login() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btnlogin.click();	
	}
	
	
	
	
	
	
}
