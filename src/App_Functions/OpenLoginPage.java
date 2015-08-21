package App_Functions;

import org.testng.annotations.Test;

import BugRegressionSuite.BaseTestBugRegression;
import Page_Objects.AppConstants;

public class OpenLoginPage extends BaseTestBugRegression {

	public static void openLoginPage() {
		clickClassName(AppConstants.Skip_button);
		clickName(AppConstants.DetectAutomatically_name);
		
	}

	@Override
	@Test
	public void executeTestCase() throws Exception {

	}
}
