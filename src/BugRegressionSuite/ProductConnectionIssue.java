package BugRegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import App_Functions.OpenHomePage;
import Page_Objects.AppConstants;
import Page_Objects.AppData;

//Test case info : In this test case we need to verify that Micromax 32 inch 32B200HD LED TV product should not throw connection error issue
public class ProductConnectionIssue extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try {
			OpenHomePage.openHomePage();
			clickXpath(AppConstants.MyAccountSearchIcon_xpath);
			sendKeysForName(AppConstants.Search_Bar_textbar_text,
					AppData.EnteredStringInTextBox3);
			clickXpath(AppConstants.SuggestedProductForSubmitReviewScenario);
			Assert.assertTrue(AppData.EnteredStringInTextBox3
					.equals(findElementById(
							AppConstants.FirstSimilarProductPagination_id)
							.getText()));

		} catch (Exception e) {
			e.printStackTrace();
			takeSnapShot("D:\\takeScreenshots", "Product Connection issue");
			throw (e);
		}

	}

}
