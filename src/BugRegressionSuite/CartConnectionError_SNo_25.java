package BugRegressionSuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class CartConnectionError_SNo_25 extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
			
		clickClassName(AppConstants.Skip_button);
		clickName(AppConstants.DetectAutomatically_name);
		sendKeysForName(AppConstants.Email_name,"shashankmshr94@gmail.com");
		//sendKeysForXpath(AppConstants.Password_xpath,"shashank@24");
		sendKeysForID(AppConstants.login_passwd_id,"shashank@24");
		clickName(AppConstants.LoginButton_name);
		Assert.assertEquals("Home", driver.findElement(By.name("Home")).getText());
		clickId(AppConstants.Cart_id);
		Assert.assertEquals(AppConstants.ShoppingCart_Text, driver.findElement(By.name("Shopping Cart")).getText());
		
	}

}
