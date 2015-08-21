package BugRegressionSuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class UniqueCouponMultipleTime_SNo_39 extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		
		//try{
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DetectAutomatically_name);
			sendKeysForName(AppConstants.Email_name,"shashankmshr94@gmail.com");
			sendKeysForID(AppConstants.login_passwd_id,"shashank@24");
			clickName(AppConstants.LoginButton_name);
			Assert.assertEquals("Home", driver.findElement(By.name("Home")).getText());
			clickId(AppConstants.fourth_product_id);
			clickName(AppConstants.BuyNow_button_text);
			
				sendKeysForID(AppConstants.CouponCode_id,"QW123");
				clickId(AppConstants.ApplyCoupon_id);
//				if(findElementById(AppConstants.CouponErrorMessage_id).getText()=="Have other coupon? Reapply to avail the offer")
//					{
						Assert.assertEquals("Have other coupon? Reapply to avail the offer", driver.findElement(By.id(AppConstants.CouponErrorMessage_id)).getText());
//					}
//				else{
//					System.out.println("else");
//					throw new Throwable();
//				}
				
			
			clickId(AppConstants.CheckoutButton_id);
			clickId(AppConstants.ContinueButton_id);
			clickId(AppConstants.CashOnDelivery_id);
			clickId(AppConstants.PlaceOrderButton_id);
			clickId(AppConstants.ShopMoreButton_id);
			
			Assert.assertEquals("Home", driver.findElement(By.name("Home")).getText());
			clickId(AppConstants.fourth_product_id);
			clickName(AppConstants.BuyNow_button_text);
			sendKeysForID(AppConstants.CouponCode_id,"QW123");
			clickId(AppConstants.ApplyCoupon_id);
			Assert.assertEquals("Sorry, You have reached the maximum limit for this coupon", driver.findElement(By.id(AppConstants.CouponErrorMessage_id)).getText());
//			throw new Throwable();
//		}
//		catch(Throwable e)
//		{
//			e.printStackTrace();
//		}
	}

}
