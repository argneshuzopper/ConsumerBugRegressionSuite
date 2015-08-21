package BugRegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import App_Functions.GmailLogin;
import App_Functions.OpenHomePage;
import Page_Objects.AppConstants;
import Page_Objects.AppVerificationChecks;

//Test Case info : In this test cases we are verifying application should not get crashed if application ask for user login 
// while submitting review and clicking on Cart
public class ApplicationCrashIssue extends BaseTestBugRegression {

	@Override
	@Test(enabled = true)
	public void executeTestCase() throws Exception {
		try {
			OpenHomePage.openHomePage();

			clickClassName(AppConstants.Open_Navigation_Drawer);
			clickName(AppConstants.NavDrawer_Mobile_tablets_link);
			clickId(AppConstants.Android_phones_id);
			clickCart();
			GmailLogin.gmailLogin();
			Assert.assertTrue(AppVerificationChecks.Checkouttext
					.equals(findElementById(AppConstants.CheckoutButton_id)
							.getText()));

		}

		catch (Exception e) {
			takeSnapShot("D:\\takeScreenshots", "Application Crash Issue");
			throw (e);
		}

	}

	@Test
	public void appCrashDuringReviewLogin() {
		try {
			OpenHomePage.openHomePage();
			clickClassName(AppConstants.Open_Navigation_Drawer);
			clickName(AppConstants.NavDrawer_Mobile_tablets_link);
			clickId(AppConstants.Android_phones_id);
			clickXpath(AppConstants.first_android_phone_xpath);
			for (int i = 0; i < 3; i++) {
				swipeWithAxis(0, 750, 0, 250, 3000);
			}
			clickXpath(AppConstants.SecondViewDetailsLink_xpath);
			clickId(AppConstants.ProductReviewsPencilIcon_id);
			GmailLogin.gmailLogin();
			Assert.assertTrue(AppVerificationChecks.ReviewProductText
					.equals(findElementByName(AppConstants.ReviewProductText)
							.getText()));
		} catch (Exception e) {
			e.printStackTrace();
			takeSnapShot("D:\takeScreenshots", "appCrashDuringReviewLogin");
			throw (e);
		}

	}
}
