package App_Functions;

import org.testng.annotations.Test;

import BugRegressionSuite.BaseTestBugRegression;
import Page_Objects.AppConstants;

public class OpenOverflowMenu extends BaseTestBugRegression{
	
	public static void openOverflowMenu(){
		OpenHomePage.openHomePage();
		clickName(AppConstants.HomeOverflow_name);
	}

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
