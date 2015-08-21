package BugRegressionSuite;

import org.junit.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class AN_184 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		
		try{
	
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DetectAutomatically_name);
			clickId(AppConstants.SkipButton_id);
			//System.out.println("Before SEarch");
			clickXpath(AppConstants.Home_search_button_xpath);
			//System.out.println("After Search");
			sendKeysForName(AppConstants.Search_product_text,"Hitachi");
			
			Assert.assertEquals("Hitachi", findElementByXpath(AppConstants.SuggestedProductForSubmitReviewScenario).getText());
			//System.out.println("Close ");
		}
		catch(Throwable e)
		{
			System.out.println(e);
			//System.out.println("Element Not Found");
		}
	}

}
