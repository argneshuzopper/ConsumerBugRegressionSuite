package BugRegressionSuite;

import java.awt.Dimension;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import App_Functions.OpenOverflowMenu;
import Page_Objects.AppConstants;

public class ShareAppIssue extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		OpenOverflowMenu.openOverflowMenu();
		clickName(AppConstants.ShareApp_name);
		clickName(AppConstants.WhatsApp_name);
		clickId(AppConstants.JustOnceButton_id);
		//driver.findElement(By.xpath("//android.widget.FrameLayout /android.widget.TextView[1]")).click();
		//driver.findElement(By.id("com.whatsapp:id/search_src_text")).sendKeys("Share");
		driver.findElement(By.id("com.whatsapp:id/contactpicker_row_name")).click();
		driver.findElement(By.id("android:id/button1")).click();
		List  li = (List) driver.findElements(By.id("android:id/list"));
	int i =li.getRows();
		System.out.println(i);
		 
	}

}
