package BugRegressionSuite;

import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class AN_180  extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		
		try{
	
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DetectAutomatically_name);
			clickId(AppConstants.DetectAutomaticallyDisabled_popup_cancelButton_id);
			throw new Throwable();
			//Assert.assertEquals("Location Disabled", findElementByName(AppConstants.DetectAutomaticallyDisabled_popup_cancelButton_id).getText());
			//clickXpath(AppConstants.Home_search_button_xpath);
			//backButton();
			//Assert.assertEquals("Hitachi", findElementByXpath(AppConstants.SuggestedProductForSubmitReviewScenario).getText());
			//System.out.println("Close ");
		}
		catch(Throwable e)
		{
			System.out.println(e);
			//System.out.println("Element Not Found");
		}
	}

}
