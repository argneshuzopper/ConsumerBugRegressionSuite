package Page_Objects;

//This interface hold all data of checkpoints used in test cases script

public interface AppVerificationChecks {
//Submit Review Scenario check 
String SubmitReviewCheck = ".";
//Review with special char check
String ReviewWithSpecialChar = ".";
//Review with similar products check
String SimilarProductsIssue = "Samsung Galaxy Grand Neo 8GB Black";
//HTC product connection issue scenario
String HomeText ="Home";
//Shopping Cart Product delete scenario
String NoItemInCartLabel = "No Item in Cart";
String GetPricesText = "GET PRICES";
//Checkout error on cart
String ContinueLabel = "CONTINUE";
//Overflow option is missing scenario
String MyOrdertext ="My Orders";
//Coupon Prompt Issue scenario
String CouponErrorText = "Sorry, This coupon code is not valid";
//Application crash issue
String Checkouttext = "Checkout";
String ReviewProductText = "Review Product";
//AppVerificationCheck scenario
String AddressEmailtext ="Please enter a valid email ID";
String AddresContactNumber = "Please enter a 10 digit mobile number";
}

