package BugRegressionSuite;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Page_Objects.AppConstants;

public class AndroidPhoneSearch_AN203 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		
		try{
	
			clickClassName(AppConstants.Skip_button);
			clickName(AppConstants.DetectAutomatically_name);
			clickId(AppConstants.SkipButton_id);
			System.out.println("Before SEarch");
			clickXpath(AppConstants.Home_search_button_xpath);
			System.out.println("After Search");
			sendKeysForName(AppConstants.Search_product_text,"Android Phone");
			clickName(AppConstants.Android_Phone_text);
			Assert.assertEquals("Android Phones", driver.findElement(By.name(AppConstants.Android_Phone_text)).getText());
			System.out.println("Close ");
		}
		catch(Throwable e)
		{
			System.out.println(e);
			//System.out.println("Element Not Found");
		}
	}

}
