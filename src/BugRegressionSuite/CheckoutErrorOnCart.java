package BugRegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import App_Functions.GmailLogin;
import App_Functions.OpenAndroidPage;
import Page_Objects.AppConstants;
import Page_Objects.AppVerificationChecks;

//Test case info : In this test case we are verifying whether user is able to checkout from the cart or not 
public class CheckoutErrorOnCart extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try{
			int count = 0, loop = 0;
			String[] android_phone_product_xpath = {
					AppConstants.first_android_phone_xpath,
					AppConstants.second_android_phone_xpath,
					AppConstants.third_android_phone_xpath,
					AppConstants.fourth_android_phone_xpath };
			OpenAndroidPage.openAndroidPage();
			clickId(AppConstants.Android_phones_id);
			//clickXpath(AppConstants.first_android_phone_xpath);
			while (count == 0 && loop < 4) {

				clickXpath(android_phone_product_xpath[loop]);
				try {
					if (findElementByName(AppConstants.BuyNow_button_text)
							.isDisplayed())

					{
						count++;
						clickName(AppConstants.BuyNow_button_text);
						GmailLogin.gmailLogin();
					}
				} catch (Throwable e) {
					backButton();
					loop++;
					if (loop == 2) {
						swipeWithAxis(224, 750, 224, 400, 3000);
					}
				}

			}

				clickId(AppConstants.CheckoutButton_id);
				Assert.assertTrue(AppVerificationChecks.ContinueLabel
						.equals(findElementById(AppConstants.ContinueButton_id).getText()));

		}
			catch(Exception e){
				e.printStackTrace();
				takeSnapShot("D:\\takeScreenshots", "Check Out Error on Cart");
				throw(e);
			}

		
	}

}
