package BugRegressionSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class ForgotPassword_Sno_36 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
	try{
		clickClassName(AppConstants.Skip_button);
		clickName(AppConstants.DetectAutomatically_name);
		clickId(AppConstants.Forgot_password_id);
		Assert.assertEquals("Forgot Password", driver.findElement(By.name(AppConstants.Forgot_password_text)).getText());
		sendKeysForName(AppConstants.Email_id_text,"shashankmshr94@gmail.com");
		clickName(AppConstants.submit_button_text );
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://www.gmail.com");
		
		Assert.assertEquals("Login", driver.findElement(By.name(AppConstants.Login_text)).getText());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

		
	}

}

