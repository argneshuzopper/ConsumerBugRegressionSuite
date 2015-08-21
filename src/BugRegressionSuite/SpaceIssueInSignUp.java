package BugRegressionSuite;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import org.testng.annotations.Test;

import App_Functions.OpenLoginPage;
import Page_Objects.AppConstants;

public class SpaceIssueInSignUp extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try {
			OpenLoginPage.openLoginPage();
			clickId(AppConstants.signUp_id);
			sendKeysForID(AppConstants.signUp_fullname_id, "    ");
			
			clickId(AppConstants.signUp_button_id);
			sendKeysForID(AppConstants.signUp_emailId_id, "hellloo");
			takeSnapShot("E:\\Screenshots", "SpaceIssueInSignUp");
			clickId(AppConstants.signUp_button_id);
			File image = new File("E:\\Screenshots\\SpaceIssueInSignUp");
			@SuppressWarnings("deprecation")
			Tesseract instance = Tesseract.getInstance();
			try{
			String result =instance.doOCR(image);
			System.out.println(result);
			}catch (TesseractException e){
				System.err.println(e.getMessage());
			}
			

			// sendKeysForID(AppConstants.signUp_Contact_no_id, keyword);
			// sendKeysForID(AppConstants.signUp_password_id, keyword)
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}

	}

}
