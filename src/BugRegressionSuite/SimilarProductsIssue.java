package BugRegressionSuite;

import junit.framework.Assert;

import org.testng.annotations.Test;

import App_Functions.OpenHomePage;
import Page_Objects.AppConstants;
import Page_Objects.AppData;
import Page_Objects.AppVerificationChecks;

//Test case info: In this test case we are verifying regarding similar products.
//Similar products must not include products with same name 

/**************** Requirements to run the the test cases ***********************/
// This test case needs to run for Samsung galaxy Grand Neo 8GB Black product
// If this product get removed script will fail

@SuppressWarnings("deprecation")
public class SimilarProductsIssue extends BaseTestBugRegression {

	@Override
	@Test(enabled = true)
	public void executeTestCase() throws Exception {
		try {
			OpenHomePage.openHomePage();
			// RegisteredGmailUser.gmailUserLogin();
			clickXpath(AppConstants.MyAccountSearchIcon_xpath);
			sendKeysForName(AppConstants.Search_Bar_textbar_text,
					AppData.EnteredStringInTextBox);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
			String text = findElementByName(
					AppConstants.SamsungProductSimilarProductIssue_text)
					.getText();

			for (int i = 0; i < 7; i++) {
				driver.swipe(0, 770, 0, 250, 1000);
			}
			clickId(AppConstants.FirstSimilarProduct_id);
			String text1 = findElementById(
					AppConstants.FirstSimilarProductPagination_id).getText();

			Assert.assertTrue(text != text1);
			clickClassName(AppConstants.ProductDetailsBackbutton_class);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
			for (int i = 0; i < 7; i++) {
				driver.swipe(0, 770, 0, 250, 1000);
			}
			clickId(AppConstants.SecondSimilarProduct_id);
			String text2 = findElementById(
					AppConstants.FirstSimilarProductPagination_id).getText();
			Assert.assertTrue(text != text2);
			clickClassName(AppConstants.ProductDetailsBackbutton_class);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
			for (int i = 0; i < 7; i++) {
				driver.swipe(0, 770, 0, 250, 1000);
			}
			clickId(AppConstants.ThirdSimilarProduct_id);
			String text3 = findElementById(
					AppConstants.FirstSimilarProductPagination_id).getText();
			Assert.assertTrue(text != text3);
			clickClassName(AppConstants.ProductDetailsBackbutton_class);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
			for (int i = 0; i < 7; i++) {
				driver.swipe(0, 770, 0, 250, 1000);
			}
			clickId(AppConstants.FourthSimilarProduct_id);
			String text4 = findElementById(
					AppConstants.FirstSimilarProductPagination_id).getText();
			Assert.assertTrue(text != text4);
			clickClassName(AppConstants.ProductDetailsBackbutton_class);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
			Assert.assertEquals(
					AppVerificationChecks.SimilarProductsIssue,
					findElementById(
							AppConstants.FirstSimilarProductPagination_id)
							.getText());

			// Assert.assertTrue("value donot match", val!=text);
		} catch (Exception e) {
			e.printStackTrace();
			takeSnapShot("D:\\takeScreenshots",
					"Similar products must not include products with same name ");
			throw (e);
		}

	}

	@Test(enabled = true)
	public void similarProductSamsungIssue() {
		String verifyText = AppData.Lg;
		String verifyText1 = AppData.Fly;

		try {
			OpenHomePage.openHomePage();
			//RegisteredGmailUser.gmailUserLogin();
			clickXpath(AppConstants.MyAccountSearchIcon_xpath);
			sendKeysForName(AppConstants.Search_Bar_textbar_text,
					AppData.EnteredStringInTextBox1);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);

			for (int i = 0; i < 7; i++) {
				swipeWithAxis(0, 770, 0, 250, 1000);
			}

			clickId(AppConstants.FirstSimilarProduct_id);

			String text1 = findElementById(
					AppConstants.FirstSimilarProductPagination_id).getText();
			Assert.assertTrue(verifyText != text1);
			Assert.assertTrue(verifyText1 != text1);
			clickClassName(AppConstants.ProductDetailsBackbutton_class);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
			for (int i = 0; i < 7; i++) {
				swipeWithAxis(0, 770, 0, 250, 1000);
			}
			clickId(AppConstants.SecondSimilarProduct_id);
			String text2 = findElementById(
					AppConstants.FirstSimilarProductPagination_id).getText();
			Assert.assertTrue(verifyText != text2);
			Assert.assertTrue(verifyText1 != text2);
			clickClassName(AppConstants.ProductDetailsBackbutton_class);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
			for (int i = 0; i < 7; i++) {
				swipeWithAxis(0, 770, 0, 250, 1000);
			}
			clickId(AppConstants.ThirdSimilarProduct_id);
			String text3 = findElementById(
					AppConstants.FirstSimilarProductPagination_id).getText();
			Assert.assertTrue(verifyText != text3);
			Assert.assertTrue(verifyText1 != text3);
			clickClassName(AppConstants.ProductDetailsBackbutton_class);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
			for (int i = 0; i < 7; i++) {
				swipeWithAxis(0, 770, 0, 250, 1000);
			}
			clickId(AppConstants.ThirdSimilarProduct_id);
			String text4 = findElementById(
					AppConstants.FirstSimilarProductPagination_id).getText();
			Assert.assertTrue(verifyText != text4);
			Assert.assertTrue(verifyText1 != text4);

		} catch (Exception e) {
			e.printStackTrace();
			takeSnapShot("D:\\takeScreenshots", "similar Product Samsung Issue");
			throw (e);

		}

	}

	@Test(enabled = true)
	public void similarEurekaProductIssue() {
		// String verifyText = AppData.Eureka;
		try {
			OpenHomePage.openHomePage();
			//RegisteredGmailUser.gmailUserLogin();
			clickXpath(AppConstants.MyAccountSearchIcon_xpath);
			sendKeysForName(AppConstants.Search_Bar_textbar_text,
					AppData.EnteredStringInTextBox2);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);

			for (int i = 0; i < 7; i++) {
				swipeWithAxis(0, 770, 0, 250, 1000);
			}

			Assert.assertTrue(findElementById(
					AppConstants.FirstSimilarProduct_id).isEnabled());
			Assert.assertTrue(findElementById(
					AppConstants.SecondSimilarProduct_id).isEnabled());

		} catch (Exception e) {
			e.printStackTrace();
			takeSnapShot("D:\\takeScreenshots", "Similar Eureka Product issue");
			throw (e);

		}

	}

}
