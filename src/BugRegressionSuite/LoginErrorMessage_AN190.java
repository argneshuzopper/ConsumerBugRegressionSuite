package BugRegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class LoginErrorMessage_AN190 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		
		try{
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DetectAutomatically_name);
			sendKeysForName(AppConstants.Email_name, "shashankmshr94@gmail.com");
			sendKeysForID(AppConstants.login_passwd_id,"shashank");
			clickName(AppConstants.LoginButton_name);
			Assert.assertEquals("Login", findElementByName(AppConstants.Login_text).getText());
	
		}
		catch(Throwable e){
			//e.printStackTrace();
			System.out.println("Inside Outer Catch");
		}
	}

}

