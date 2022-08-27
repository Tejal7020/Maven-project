package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginText extends BaseTest{
	
	@Test(priority = 0)
	public void VerifyLoginPageText() {
		loginpage.LoginPageText();
		Assert.assertEquals(loginpage.LoginPageText(), "Login");	
	}
	
	
	
	

}
