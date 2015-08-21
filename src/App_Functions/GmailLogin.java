package App_Functions;

import org.testng.annotations.Test;

import BugRegressionSuite.BaseTestBugRegression;
import Page_Objects.AppConstants;

//This function is created to handle the Gmail login from Login page
public class GmailLogin extends BaseTestBugRegression {

	public static void gmailLogin() {
		try {
			clickXpath(AppConstants.Google_button_xpath);
			clickXpath(AppConstants.Gmail_account_id_option1_xpath);
			clickId(AppConstants.Gmail_account_ok_button);
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
