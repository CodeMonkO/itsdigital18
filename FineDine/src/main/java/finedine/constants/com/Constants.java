package main.java.finedine.constants.com;

public class Constants {
	public enum Constant {
//360000
		VERIFICATIONCODE("VERIFICATION_CODE"), 
		EMAIL("EMAIL"), 
		AUTHENTICATEUSER("AUTHENTICATE_USER"),
		THREADSLEEPINTERVAL("scheduledtrigger.interval"),
		SCHEDULEDTRIGGERFMT("scheduledtrigger.timeformat"),
		SESSIONTIMEOUT("session.timeout"),
		CACHETIMEOUT("cache.timeout"),
		CACHEACTIVETIMEMS("CACHEACTIVETIMEMS"),
		PASSWORD("PASSWORD"),
		MENU("menu"),
		ITEMSLIST("items"),
		RESTAURANTUUID("RESTAURANTUUID"),
		RESTAURANTNAME("RESTAURANTNAME"),
		RESTAURANTADDRESS("RESTAURANTADDRESS"),
		RESTAURANTCITY("RESTAURANTCITY"),
		RESTAURANTSTATE("RESTAURANTSTATE"),
		RESTAURANTZIPCODE("RESTAURANTZIPCODE"),
		RESTAURANTCOUNTRY("RESTAURANTCOUNTRY"),
		BOOKINGFORM("bookingform"),
		BILLINGFORM("billingform"),
		CUSTOMERFORM("customerform"),
		SIGNINFORM("signinform"),
		SIGNUPFORM("signupform"),
		UPDATEPROFILEFORM("updateprofileform"),
		CACHE("CACHE"),
		UPLOADFILE("/IM2/?/"),
		BILLPDF("/IM2/Bills/"),
		BILLPDFEXTENSTION(".pdf"),
		COUNTRYCSVPATH("countrylist.path"),
		COUNTRYNAME("countrylist.CountryName"),
		COUNTRYCODE("countrylist.CountryCode"),
		STATECSVPATH("statelist.path"),
		STATENAME("statelist.StateName"),
		STATECODE("statelist.StateCode"),
		JPASS("jpass.alphastring"),
		JPASSPASSWORDLEN("jpass.password.length");

		private String value;

		private Constant(String s) {
			value = s;
		}

		public String getConstantValue() {
			return value;
		}

	}

	public enum Views {

		HOME("home"),
		RESTROFRAME("restroframe"),
		SIGNIN("signin"),
		SIGNUP("signup"),
		UPDATEPROFILE("updateprofile"),
		FORGOTPASSWORD("forgotpassword"),
		RESETPASSWORD("resetpassword");

		private String value;

		private Views(String s) {
			value = s;
		}

		public String getViewName() {
			return value;
		}

	}
	
	public enum SqlQueries {

		RESTAURANTLIVEENTITY("booking.restaurantliveentity"),
		RESETRESTAURANTLIVEENTITY("reset.booking.restaurantliveentity"),
		USERSTABLE("users.update"),
		CUSTOMERTABLE("customer.usersentity"),
		SIGNINTABLE("signin.restaurantsignupformentity"),
		SIGNUPTABLE("signup.restaurantsignupformentity"),
		GETFROMRESTAURANTTABLE("getfrom.restaurantsignupformentity"),
		UPDATERESTAURANTTABLE("updateprofile.restaurantdetails"),
		RESETUPDATE("reset.update");

		private String value;

		private SqlQueries(String s) {
			value = s;
		}

		public String getSqlQueries() {
			return value;
		}

	}
	
	public enum MidnightCycle {

		MNC1("midnightcycle.mnc1"),
		MNC2("midnightcycle.mnc2"),
		MNC3("midnightcycle.mnc3"),
		MNC4("midnightcycle.mnc4"),
		MNC5("midnightcycle.mnc5");

		private String value;

		private MidnightCycle(String s) {
			value = s;
		}

		public String getMidnightCycle() {
			return value;
		}

	}
}