package BugRegressionSuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class LocationShownOnDrawerScreen_Sno_35 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		try{
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DelhiLocation_text);
			clickName(AppConstants.DelhiSubLocation_AnandLok_text);
			clickId(AppConstants.SkipButton_id);
			clickClassName(AppConstants.Open_Navigation_Drawer);
			Assert.assertEquals((String)driver.findElement(By.name(AppConstants.DelhiLocation_text)).getText(),(String)driver.findElement(By.name(AppConstants.NavDrawer_Location_text)).getText());
			Assert.assertEquals((String)driver.findElement(By.name(AppConstants.DelhiSubLocation_AnandLok_text)).getText(),(String)driver.findElement(By.id(AppConstants.NavDrawer_SubLocation_id)).getText());
//			System.out.println(driver.findElement(By.name(AppConstants.DelhiSubLocation_AnandLok_text)).getText());
//			System.out.println(driver.findElement(By.id(AppConstants.NavDrawer_SubLocation_id)).getText());
			clickId(AppConstants.NavDrawer_Login_button_id);
			Assert.assertEquals("Login", driver.findElement(By.name(AppConstants.Login_text)).getText());
//			System.out.println("Test Stop");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

