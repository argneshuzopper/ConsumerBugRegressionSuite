package BugRegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class AN_186 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		
		try{
			
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DetectAutomatically_name);
			sendKeysForName(AppConstants.Email_name, "shashankmshr94@gmail.com");
			sendKeysForID(AppConstants.login_passwd_id,"shashank@24");
			clickName(AppConstants.LoginButton_name);
			Assert.assertEquals("Home", findElementByName(AppConstants.Home_name).getText());
			clickClassName(AppConstants.Open_Navigation_Drawer);
			//System.out.println(findElementById(AppConstants.NavDrawer_Login_button_id).getText());
			String name=new String(findElementById(AppConstants.NavDrawer_Login_button_id).getText());
			clickId(AppConstants.NavDrawer_Login_button_id);
			Assert.assertEquals(name, findElementById(AppConstants.ProfileName_id).getText());
			//System.out.println("After Test");
			
		}
		catch(Throwable e){
			e.printStackTrace();
			//System.out.println("Inside Outer Catch");
		}
	}

}

