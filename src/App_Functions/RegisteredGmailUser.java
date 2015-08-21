package App_Functions;

import org.testng.annotations.Test;

import BugRegressionSuite.BaseTestBugRegression;
import Page_Objects.AppConstants;

public class RegisteredGmailUser extends BaseTestBugRegression {

	public static void gmailUserLogin() {
		try {
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DetectAutomatically_name);
			clickXpath(AppConstants.Google_button_xpath);
			clickXpath(AppConstants.Gmail_account_id_option1_xpath);
			clickId(AppConstants.Gmail_account_ok_button);
			clickClassName(AppConstants.Open_Navigation_Drawer);
			clickId(AppConstants.NavDrawer_Login_button_id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub

	}

	

}

