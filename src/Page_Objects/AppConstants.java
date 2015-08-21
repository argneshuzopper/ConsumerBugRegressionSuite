package Page_Objects;

//This interface hold all the objects of consumer application

public interface AppConstants {
	// Navigation Drawer
	String Skip_button = "android.widget.Button";
	String skip_button_text = "Skip";
	String Open_Navigation_Drawer = "android.widget.ImageButton";
	String NavDrawer_Mobile_tablets_link = "Mobiles and Tablets";
	String NavDrawer_Kitchen_Appliances_link = "Kitchen Appliances";
	String NavDrawer_Home_Appliances_link = "Home Appliances";
	String NavDrawer_TV_VideoPlayer_link = "TV & Video Player";
	String NavDrawer_Login_button_id = "com.zopperapp.dev:id/tv_drawer_signup_title";
	String NavDrawer_Location_text = "Delhi";
	String NavDrawer_SubLocation_id = "com.zopperapp.dev:id/tv_drawer_location_child";

	// Home page
	String Home_Mobiles_Tablets_id = "com.zopperapp.dev:id/iv_root_cat_full1";
	String Home_Kitchen_Appliances_id = "com.zopperapp.dev:id/iv_root_cat_full2";
	String Home_Appliances_id = "com.zopperapp.dev:id/iv_root_cat_full3";
	String Home_TV_Video_Player_id = "com.zopperapp.dev:id/iv_root_cat";
	String Home_search_button_id = "com.zopperapp:id/action_search";
	String Search_Bar_textbar_text = "Search Product";
	String Search_Bar_textbar_id = "com.zopperapp.dev:id/et_search_product";
	String Cart_id = "com.zopperapp.dev:id/action_cart";
	String Home_name = "Home";
	String HomeOverflow_name = "More options";
	String first_product_id = "com.zopperapp.dev:id/rl_first_product_block";
	String second_product_id = "com.zopperapp.dev:id/rl_second_product_block";
	String third_product_id = "com.zopperapp.dev:id/rl_third_product_block";
	String fourth_product_id = "com.zopperapp.dev:id/rl_fourth_product_block";
	String Home_search_button_xpath = "//android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.TextView[2]";

	// Login page
	String Login_text = "Login";
	String Facebook_button_id = "com.zopperapp:id/login_button_fb";
	String Facebook_button_xpath = "//android.widget.FrameLayout/ android.widget.Button[2]";
	String Google_button_xpath = "//android.widget.FrameLayout/ android.widget.Button[3]";
	String Gmail_account_id_option1_xpath = "//android.widget.CheckedTextView[@index=0]";
	String Gmail_account_ok_button = "android:id/button2";
	String Google_SignIn_link = "Sign in";
	String Email_name = "E-mail ID";
	String Password_xpath = "//android.widget.FrameLayout/ android.widget.EditText[2]";
	String LoginButton_name = "LOGIN";
	String SignUP_name = "sign up";
	String SkipButton_id = "com.zopperapp.dev:id/item_skip";
	String login_passwd_id = "com.zopperapp.dev:id/et_login_password";
	String Forgot_password_id = "com.zopperapp.dev:id/tv_forgot_password";
	String Gmail_account_id_option2_xpath = "//android.widget.CheckedTextView[@index=1]";

	// Forgot Password Page
	String Forgot_password_text = "Forgot Password";
	String submit_button_text = "SUBMIT";
	String Email_id_text = "E-mail ID";

	// Shopping Cart

	String ShoppingCartDeleteButton_id = "com.zopperapp.dev:id/iv_cart_delete_product";
	String ShoppingCart_Text = "Shopping Cart";
	String NoItemInCartLabel_id = "com.zopperapp.dev:id/tv_error_label";
	String CheckoutButton_id = "com.zopperapp.dev:id/tv_checkout";
	String ContinueButton_id = "com.zopperapp.dev:id/tv_checkout";
	String CashOnDelivery_id = "com.zopperapp.dev:id/tv_payment_mode_cod";
	String PlaceOrder_id = "com.zopperapp.dev:id/tv_checkout";
	String CouponTextbox_id = "com.zopperapp.dev:id/et_coupon_value";
	String CouponApplyButton_id = "com.zopperapp.dev:id/tv_apply_coupon";
	String CouponError_id = "com.zopperapp.dev:id/tv_apply_coupon_error";
	String NameValidation_text = "Please enter your full name";
	String EmailValidation_text = "Please enter a valid email ID";
	String MobileNumber_text = "Please enter a 10 digit mobile number";
	String AddNewAdress_id = "com.zopperapp.dev:id/saved_address";
	String CouponCode_id = "com.zopperapp.dev:id/et_coupon_value";
	String ApplyCoupon_id = "com.zopperapp.dev:id/tv_apply_coupon";
	String PlaceOrderButton_id = "com.zopperapp.dev:id/tv_checkout";
	String ShopMoreButton_id = "com.zopperapp.dev:id/tv_payment_next_step";

	String CouponErrorMessage_id = "com.zopperapp.dev:id/tv_apply_coupon_error";

	// Shipping Address Page

	String AddressPageFullName_id = "com.zopperapp.dev:id/et_full_name";
	String AddressPageEmail_id = "com.zopperapp.dev:id/et_email";
	String AddressPageContactNumber_id = "com.zopperapp.dev:id/et_contact";

	// Sign UP Page

	String Fullname_Name = "Full Name";
	String EmailID_Name = "E-mail ID";
	String Password_id = "com.zopperapp.dev:id/et_signup_password";
	String Sign_Up_button_name = "Sign Up";
	String signUp_id = "com.zopperapp.dev:id/tv_sign_up";
	String signUp_fullname_id = "com.zopperapp.dev:id/et_signup_name";
	String signUp_emailId_id = "com.zopperapp.dev:id/et_signup_email";
	String signUp_Contact_no_id = "com.zopperapp.dev:id/et_contact";
	String signUp_password_id = "com.zopperapp.dev:id/et_signup_password";
	String signUp_referral_id = "com.zopperapp.dev:id/et_referral_code";
	String signUp_button_id = "com.zopperapp.dev:id/button_sign_up";
	String SignUp_already_have_acc_id = "com.zopperapp.dev:id/tv_have_account";

	// My Account page
	String Myaccount_text = "My Account";
	String Logout_button_id = "com.zopperapp:id/log_out";
	String MyAccountSearchIcon_xpath = "//android.widget.FrameLayout /android.widget.TextView[2]";
	String ProfileName_id="com.zopperapp.dev:id/name_profile";

	// Mobile and Tablets page
	String Android_phones_id = "com.zopperapp.dev:id/iv_popular_cat1";
	String iphone_id = "com.zopperapp.dev:id/iv_popular_cat2";
	String iPad_id = "com.zopperapp.dev:id/iv_popular_cat3";
	String Windows_phones_id = "com.zopperapp.dev:id/iv_popular_cat4";

	// Tv and Video player page
	String tv_player_text = "TV & Video Player";

	// Android phones page
	String first_android_phone_xpath = "//android.widget.FrameLayout/ android.support.v7.widget.RecyclerView/ android.widget.RelativeLayout[1]/ android.widget.TextView";
	String second_android_phone_xpath = "//android.widget.FrameLayout/ android.support.v7.widget.RecyclerView/ android.widget.RelativeLayout[2]/ android.widget.TextView";
	String third_android_phone_xpath = "//android.widget.FrameLayout/ android.support.v7.widget.RecyclerView/ android.widget.RelativeLayout[3]/ android.widget.TextView";
	String fourth_android_phone_xpath = "//android.widget.FrameLayout/ android.support.v7.widget.RecyclerView/ android.widget.RelativeLayout[4]/ android.widget.TextView";
	String AndroidPhonesSortingButton_id = "com.zopperapp.dev:id/layout_product_sort";
	String PriceOfFirstProduct_id = "com.zopperapp.dev:id/tv_product_listing_price";
	String AndroidPhonesSortingButton_name = "Sort By";
	String Android_Phone_text = "Android Phones";

	// Calling tablet page
	String CallingTabletTitle_text = "Calling Tablet";
	String CallingTbalets_text = "Calling Tablet";

	// Product details page

	String BuyNow_button_text = "Buy Now";
	String Product_details_page_text = "Product Details";
	String SecondViewDetailsLink_xpath = "//android.widget.FrameLayout /android.widget.ScrollView /android.widget.RelativeLayout[1] /android.widget.TextView[1]";
	String SamsungProductSimilarProductIssue_text = "Samsung Galaxy Grand Neo 8GB Black";
	String SamsungProductSimilarProductIssue_text1 = "Samsung Z1 Dual Sim Red";
	String EurekaForbesEasyCleanVacuumCleaner_text = "Eureka Forbes Easy Clean Vacuum Cleaner";
	String FirstSimilarProduct_id = "com.zopperapp.dev:id/iv_product_image_first";
	String SecondSimilarProduct_id = "com.zopperapp.dev:id/iv_product_image_second";
	String ThirdSimilarProduct_id = "com.zopperapp.dev:id/iv_product_image_third";
	String FourthSimilarProduct_id = "com.zopperapp.dev:id/iv_product_image_fourth";
	String FirstProductSimilarName_id = "com.zopperapp:id/tv_first_product_name";
	String SecondProductSimilarName_id = "com.zopperapp:id/tv_second_product_name";
	String ThirdProductSimilarName_id = "com.zopperapp:id/tv_third_product_name";
	String FourthProductSimilarName_id = "com.zopperapp:id/tv_fourth_product_name";
	String ProductDetailsBackbutton_class = "android.widget.ImageButton";
	String FirstSimilarProductPagination_id = "com.zopperapp.dev:id/tv_product_title";
	String GetPricesButton_id = "com.zopperapp.dev:id/tv_get_prices";

	// Product Reviews Page
	String ProductReviewsPencilIcon_id = "com.zopperapp.dev:id/menu_write_review";
	String ProductReviewsAddedTitle_id = "com.zopperapp.dev:id/review_title";
	String ProductReviewsBackbutton_class = "android.widget.ImageButton";

	// Review Product Page
	String ReviewProductFiveStarRating_text = "5";
	String ReviewProductText = "Review Product";
	String ReviewProductSubmitButton = "SUBMIT";
	String ReviewProductTitle_ID = "com.zopperapp.dev:id/review_title";
	String ReviewProductDescription_ID = "com.zopperapp.dev:id/review_content";

	// Search page
	String Search_product_text = "Search Product";
	String Search_list_view = "android.widget.ListView";
	String SuggestedProductForSubmitReviewScenario = "//android.widget.FrameLayout /android.widget.ListView /android.widget.LinearLayout /android.widget.TextView";

	// Select Location
	String DetectAutomatically_name = "Detect Automatically";
	String DetectAutomaticallyDisabled_popup_cancelButton_id = "android:id/button2";

	String DelhiLocation_text = "Delhi";
	String DelhiSubLocation_AnandLok_text = "Anand Lok";

	// Excel path
	String Path_TestData = "D:\\Zopper\\zopperapp\\src\\testData\\";
	String File_TestData = "testdata.xlsx";

	// Prompt

	String DeleteCartItemPrompt_id = "android:id/button1";

	// Overflow menu
	String OFMyOrders_name = "My Orders";
	String ShareApp_name = "Share App";

	// Order Success page

	String ShopMore_id = "com.zopperapp.dev:id/tv_payment_next_step";

	// Constant other than app

	String WhatsApp_name = "WhatsApp";
	String JustOnceButton_id = "android:id/button1";

	// Sort By prompt
	String LTH = "Prices: Low to High";
	String HTL = "Prices: High to Low";

}