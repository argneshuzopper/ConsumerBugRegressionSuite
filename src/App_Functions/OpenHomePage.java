package App_Functions;

import org.testng.annotations.Test;

import BugRegressionSuite.BaseTestBugRegression;
import Page_Objects.AppConstants;

	//This function is used to open Homepage of application

	public class OpenHomePage extends BaseTestBugRegression {
		public static void openHomePage() {
			try {
				clickClassName(AppConstants.Skip_button);
				clickName(AppConstants.DetectAutomatically_name);
				clickId(AppConstants.SkipButton_id);
			} catch (Exception e) {
				e.printStackTrace();
				throw(e);
			}
		}

		@Override
		@Test
		public void executeTestCase() throws Exception {
			// TODO Auto-generated method stub

		}

	}


