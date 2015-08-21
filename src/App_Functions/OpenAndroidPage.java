package App_Functions;

import org.testng.annotations.Test;

import BugRegressionSuite.BaseTestBugRegression;
import Page_Objects.AppConstants;

public class OpenAndroidPage extends BaseTestBugRegression {
	
	public static void openAndroidPage(){
		try{
			OpenHomePage.openHomePage();
			clickClassName(AppConstants.Open_Navigation_Drawer);
			clickName(AppConstants.NavDrawer_Mobile_tablets_link);
		}catch(Exception e){
			e.printStackTrace();
			throw(e);
		}
	}

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
