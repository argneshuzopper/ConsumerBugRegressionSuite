package BugRegressionSuite;

import junit.framework.Assert;

import org.testng.annotations.Test;

import App_Functions.GmailLogin;
import App_Functions.OpenHomePage;
import Page_Objects.AppConstants;
import Page_Objects.AppData;
import Page_Objects.AppVerificationChecks;

//Test case info: Submitting review for Symphony Ninja product. This test case should be execute for already registered user in mobile device

/**************** Requirements to run the the test cases ***********************/
// Can use account(zopper.test@gmail.com)
// For login user One review should be added in app Symphony Ninja product
// Wifi should be open in app
// Review for symphony ninja product should be submitted only 1 characters like
// (.) or a

@SuppressWarnings("deprecation")
public class SubmitReview extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try {
			OpenHomePage.openHomePage();
			clickXpath(AppConstants.MyAccountSearchIcon_xpath);
			sendKeysForName(AppConstants.Search_Bar_textbar_text,
					AppData.SubmitReviewTestData);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
			// scrollTo(AppData.ReviewString);
			for (int i = 0; i < 3; i++) {
				swipeWithAxis(0, 750, 0, 250, 3000);
			}

			clickXpath(AppConstants.SecondViewDetailsLink_xpath);

			clickId(AppConstants.ProductReviewsPencilIcon_id);
			GmailLogin.gmailLogin();
			clickName(AppConstants.ReviewProductFiveStarRating_text);
			if (findElementById(AppConstants.ReviewProductTitle_ID)
					.isDisplayed())
				;
			{
				clearForId(AppConstants.ReviewProductTitle_ID);
			}

			sendKeysForID(AppConstants.ReviewProductTitle_ID, AppData.title);

			navigateBack();
			if (findElementById(AppConstants.ReviewProductDescription_ID)
					.isDisplayed())
				;
			{
				clearForId(AppConstants.ReviewProductDescription_ID);
			}

			sendKeysForID(AppConstants.ReviewProductDescription_ID,
					AppData.description);

			navigateBack();

			clickName(AppConstants.ReviewProductSubmitButton);
			//driver1.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
			Thread.sleep(2000);
			clickClassName(AppConstants.ProductReviewsBackbutton_class);
			//driver1.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
			Thread.sleep(2000);

			for (int i = 0; i < 2; i++) {
				swipeWithAxis(0, 750, 0, 250, 3000);
			}
			clickXpath(AppConstants.SecondViewDetailsLink_xpath);
			Assert.assertEquals(AppVerificationChecks.SubmitReviewCheck,
					findElementById(AppConstants.ProductReviewsAddedTitle_id)
							.getText());

		} catch (Exception e) {
			takeSnapShot("D:\\takeScreenshots", "Submit Review");
			e.printStackTrace();
			throw (e);

		}

	}

}
