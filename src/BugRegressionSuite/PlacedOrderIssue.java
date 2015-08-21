package BugRegressionSuite;

import org.junit.Assert;
import org.testng.annotations.Test;

import App_Functions.GmailLogin;
import App_Functions.OpenAndroidPage;
import Page_Objects.AppConstants;
import Page_Objects.AppVerificationChecks;

public class PlacedOrderIssue extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try{
			OpenAndroidPage.openAndroidPage();
			clickId(AppConstants.Android_phones_id);
			clickXpath(AppConstants.first_android_phone_xpath);
			try{
			if(findElementByName(AppConstants.BuyNow_button_text).isDisplayed()){
				clickName(AppConstants.BuyNow_button_text);
				GmailLogin.gmailLogin();
			}
			
			else{
				backButton();
				System.out.println("Get Prices button is displayed");
			}
			}catch(Exception e){
				System.out.println("Get Prices button is displayed");
				e.printStackTrace();
				throw(e);
			}
			clickId(AppConstants.CheckoutButton_id);
			clickId(AppConstants.ContinueButton_id);
			clickId(AppConstants.CashOnDelivery_id);
			clickId(AppConstants.PlaceOrder_id);
			clickId(AppConstants.ShopMore_id);
			clickCart();
			Assert.assertTrue(AppVerificationChecks.NoItemInCartLabel
					.equals(findElementById(AppConstants.NoItemInCartLabel_id)
							.getText()));

			
			
		}catch(Exception e){
			e.printStackTrace();
			takeSnapShot("D:\\takeScreenshots", "Placed Order issue");
			throw(e);
			
		}
		
	}

}
