package BugRegressionSuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class ForgotPasswordScreen_SNo_26 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		try{
		clickClassName(AppConstants.Skip_button);
		clickName(AppConstants.DetectAutomatically_name);
		clickId(AppConstants.Forgot_password_id);
		Assert.assertEquals("SUBMIT", driver.findElement(By.name(AppConstants.submit_button_text)).getText());
		Assert.assertEquals(AppConstants.submit_button_text,driver.findElement(By.name(AppConstants.submit_button_text)).getText());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
