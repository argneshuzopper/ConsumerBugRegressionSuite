package BugRegressionSuite;

import junit.framework.Assert;

import org.testng.annotations.Test;

import App_Functions.OpenAndroidPage;
import Page_Objects.AppConstants;

//Test case info : In this test case we are verifying sorting filters are working as expected

@SuppressWarnings("deprecation")

public class SortingIssue extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try{
		OpenAndroidPage.openAndroidPage();
		clickId(AppConstants.Android_phones_id);
		clickId(AppConstants.AndroidPhonesSortingButton_id);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("com.zopperapp.dev:id/layout_product_sort")));
		clickName(AppConstants.LTH);
		String text = findElementById(AppConstants.PriceOfFirstProduct_id)
				.getText();
		System.out.println(text);
		clickId(AppConstants.AndroidPhonesSortingButton_id);
		clickName(AppConstants.HTL);
		String text1 = findElementById(AppConstants.PriceOfFirstProduct_id)
				.getText();
		System.out.println(text1);
		Assert.assertTrue(text != text1);
		}catch(Exception e){
			e.printStackTrace();
			takeSnapShot("D:\\takeScreenshots", "Sorting issue");
			throw(e);
		}

	}

}
