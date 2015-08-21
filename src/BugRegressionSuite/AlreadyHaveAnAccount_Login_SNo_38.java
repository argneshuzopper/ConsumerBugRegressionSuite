package BugRegressionSuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class AlreadyHaveAnAccount_Login_SNo_38 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		
		try{
		
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DetectAutomatically_name);
			clickName(AppConstants.SignUP_name);
			clickId(AppConstants.SignUp_already_have_acc_id);
			Assert.assertEquals("Login", driver.findElement(By.name(AppConstants.Login_text)).getText());
		}
		catch(Throwable e){
			e.printStackTrace();
		}
	}

}
