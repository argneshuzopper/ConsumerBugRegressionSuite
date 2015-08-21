package BugRegressionSuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class UserNameTapping_SNo_32 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		try{
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DetectAutomatically_name);
			clickXpath(AppConstants.Google_button_xpath);
			clickXpath(AppConstants.Gmail_account_id_option2_xpath);
			clickId(AppConstants.Gmail_account_ok_button);
			clickClassName(AppConstants.Open_Navigation_Drawer);
			clickId(AppConstants.NavDrawer_Login_button_id);
	
			Assert.assertEquals("My Account", driver.findElement(By.name(AppConstants.Myaccount_text)).getText());
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
