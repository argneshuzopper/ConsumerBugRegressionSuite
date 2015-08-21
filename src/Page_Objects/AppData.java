package Page_Objects;

//This interface hold all the application data which is used in different test cases scripts

public interface AppData {
	
//Test data for Submit review scenario
	String SubmitReviewTestData= "Symphony Ninja 17 Ltr Air Cooler";
	String ReviewString = "Reviews";
	
//Test data for Review Product page
	String title = ".";
	String description = ".";
	
//Test data for Review with Special character scenario
	String title1 = ".";
	String description1= ".";
	
//Test data for Similar products scenario
	String EnteredStringInTextBox = "Samsung galaxy Grand Neo 8GB Black";
	String SimilarProductsText = "Similar Products";
	String EnteredStringInTextBox1 = "Samsung Z1 Dual Sim Red";
	String Lg= "LG";
	String Fly = "Fly";
	String Samsung = "Samsung";
	String EnteredStringInTextBox2 = "Eureka Forbes Easy Clean Vacuum Cleaner";

//Test data for HtcProductConnectionIssue scenario
	String EnteredStringInTextBox3 = "Micromax 32 Inch 32B200HD LED TV";
	
//Test data for Shopping Cart Product Delete
	String MobileAndTabletsLink = "Mobiles and Tablets";
	
//Test data for CouponPromptIssue
	String CouponTextboxData = "fafjkds";

//Test data for AddressPagevalidationIssue 
	String AddressEmailTextboxData = "a";
	String AdressContactNumberData = "9899";
			

}
