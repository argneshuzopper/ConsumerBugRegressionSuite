package BugRegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class CallingTablet_AN197 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		
		try{
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DetectAutomatically_name);

			clickId(AppConstants.SkipButton_id);
			clickClassName(AppConstants.Open_Navigation_Drawer);
			clickName(AppConstants.NavDrawer_Mobile_tablets_link);
			swipeWithAxis(200,750,200,200,3000);
			swipeWithAxis(200,750,200,200,3000);
			clickName(AppConstants.CallingTbalets_text);
			Assert.assertEquals("Calling Tablet",
					findElementByName(AppConstants.CallingTabletTitle_text).getText());
			
//			clickId(AppConstants.Android_phones_id);
//			Assert.assertEquals("Android Phones", findElementByName(AppConstants.Android_Phone_text).getText());
//			backButton();
//			clickId(AppConstants.iphone_id);
//			backButton();
//			clickId(AppConstants.iPad_id);
//			backButton();
//			clickId(AppConstants.Windows_phones_id);
//			backButton();
//			clickName(AppConstants.Other_smart_phone_text);
//			backButton();
			
		}
		catch(Throwable e){
			e.printStackTrace();
			//System.out.println("Inside Outer Catch");
		}
	}

}

