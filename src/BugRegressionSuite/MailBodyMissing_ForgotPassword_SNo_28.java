package BugRegressionSuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class MailBodyMissing_ForgotPassword_SNo_28 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		try{
		clickClassName(AppConstants.Skip_button);
		clickName(AppConstants.DetectAutomatically_name);
		clickId(AppConstants.Forgot_password_id);
		Assert.assertEquals("SUBMIT", driver.findElement(By.name(AppConstants.submit_button_text)).getText());
		
		sendKeysForName(AppConstants.Email_id_text,"shashank.mishra@zopper.com");
		clickName(AppConstants.submit_button_text );
		Assert.assertEquals(AppConstants.Login_text, driver.findElement(By.name("Login")).getText());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}