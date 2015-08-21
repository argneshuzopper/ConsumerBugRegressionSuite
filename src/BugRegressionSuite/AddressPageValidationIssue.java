package BugRegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import App_Functions.GmailLogin;
import App_Functions.OpenHomePage;
import Page_Objects.AppConstants;
import Page_Objects.AppData;
import Page_Objects.AppVerificationChecks;


//Test case Info: In this test case we are verifying whether the correct validtion label is displayed or not for Email and Contact Number
// Address Page of consumer
public class AddressPageValidationIssue extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try {
			int count = 0, loop = 0;
			String[] android_phone_product_xpath = {
					AppConstants.first_android_phone_xpath,
					AppConstants.second_android_phone_xpath,
					AppConstants.third_android_phone_xpath,
					AppConstants.fourth_android_phone_xpath };
			OpenHomePage.openHomePage();
			clickClassName(AppConstants.Open_Navigation_Drawer);
			clickName(AppConstants.NavDrawer_Mobile_tablets_link);
			clickId(AppConstants.Android_phones_id);
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
			clickId(AppConstants.AddNewAdress_id);
			sendKeysForID(AppConstants.AddressPageEmail_id,
					AppData.AddressEmailTextboxData);
			clickId(AppConstants.AddressPageContactNumber_id);
			Assert.assertTrue(AppVerificationChecks.AddressEmailtext
					.equals(findElementByName(AppConstants.EmailValidation_text)
							.getText()));
			sendKeysForID(AppConstants.AddressPageContactNumber_id,
					AppData.AdressContactNumberData);
			clickId(AppConstants.AddressPageFullName_id);
			navigateBack();
			Assert.assertTrue(AppVerificationChecks.AddresContactNumber
					.equals(findElementByName(AppConstants.MobileNumber_text)
							.getText()));

		} catch (Exception e) {
			e.printStackTrace();
			takeSnapShot("D:\\takeScreenshots", "AddressPageValidationIssue");
			throw (e);
		}

	}

}
