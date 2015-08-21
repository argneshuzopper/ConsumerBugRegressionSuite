package BugRegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import App_Functions.OpenHomePage;
import Page_Objects.AppConstants;
import Page_Objects.AppVerificationChecks;

//Test case info: In this test case we are verifying that overflow option is not missing  
public class OverflowOptionIsMissing extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try{
			OpenHomePage.openHomePage();
			clickName(AppConstants.HomeOverflow_name);
			Assert.assertTrue(AppVerificationChecks.MyOrdertext.equals(findElementByName(AppConstants.OFMyOrders_name).getText()));
			}
			catch(Exception e){
				e.printStackTrace();
				takeSnapShot("D:\\takeScreenshots", "Overflow option is missing");
				throw(e);
			}
		
	}

}
