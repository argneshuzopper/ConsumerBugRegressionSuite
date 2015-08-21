package BugRegressionSuite;

import junit.framework.Assert;

import org.testng.annotations.Test;

import App_Functions.GmailLogin;
import App_Functions.OpenHomePage;
import Page_Objects.AppConstants;
import Page_Objects.AppData;
import Page_Objects.AppVerificationChecks;

//Test case: submitting review for Special characters. This test case
// should be execute for already registered user in mobile device

/**************** Requirements to run the the test cases ***********************/
// Can use account(zopper.test@gmail.com)
// One review should be added in app for login user
// Wifi should be open in app
// Review for symphony ninja product should be submitted only 4 characters like
// (....)

@SuppressWarnings("deprecation")
public class ReviewWithSpecialCharacters extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try {
			OpenHomePage.openHomePage();
			clickXpath(AppConstants.MyAccountSearchIcon_xpath);
			sendKeysForName(AppConstants.Search_Bar_textbar_text,
					AppData.SubmitReviewTestData);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
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

			sendKeysForID(AppConstants.ReviewProductTitle_ID, AppData.title1);
			navigateBack();
			if (findElementById(AppConstants.ReviewProductDescription_ID)
					.isDisplayed())
				;
			{
				clearForId(AppConstants.ReviewProductDescription_ID);
			}
			sendKeysForID(AppConstants.ReviewProductDescription_ID,
					AppData.description1);

			navigateBack();

			clickName(AppConstants.ReviewProductSubmitButton);
			// MobileElement element = (MobileElement)
			// driver.findElement(By.className("android.widget.ImageButton"));
			// wait.until(ExpectedConditions.elementToBeClickable(element));
			Thread.sleep(2000);
			clickClassName(AppConstants.ProductReviewsBackbutton_class);
			Thread.sleep(2000);
			for (int i = 0; i < 2; i++) {
				swipeWithAxis(0, 750, 0, 250, 3000);
			}

			clickXpath(AppConstants.SecondViewDetailsLink_xpath);
			Assert.assertEquals(AppVerificationChecks.ReviewWithSpecialChar,
					findElementById(AppConstants.ProductReviewsAddedTitle_id)
							.getText());
		} catch (Exception e) {
			e.printStackTrace();
			takeSnapShot("D:\\takeScreenshots",
					"Review with special character ");
			throw (e);
		}

	}

}
