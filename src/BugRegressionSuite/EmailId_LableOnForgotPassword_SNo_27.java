package BugRegressionSuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class EmailId_LableOnForgotPassword_SNo_27 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
	try{	clickClassName(AppConstants.Skip_button);
		clickName(AppConstants.DetectAutomatically_name);
		clickId(AppConstants.Forgot_password_id);
		Assert.assertEquals("Forgot Password", driver.findElement(By.name(AppConstants.Forgot_password_text)).getText());
		Assert.assertEquals(AppConstants.Email_id_text,driver.findElement(By.name(AppConstants.Email_id_text)).getText());
	}
	catch(Exception e)
	{
		//e.setStackTrace(null);
		e.printStackTrace();
	}

		
	}

}
