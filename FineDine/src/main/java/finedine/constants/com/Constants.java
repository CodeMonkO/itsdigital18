package main.java.finedine.constants.com;

public class Constants {
	public enum Constant {

		VERIFICATIONCODE("VERIFICATION_CODE"), 
		EMAIL("EMAIL"), 
		AUTHENTICATEUSER("AUTHENTICATE_USER"),
		SESSIONTIMEOUT("300000"),
		CACHETIMEOUT("86400000"),
		CACHEACTIVETIMEMS("CACHEACTIVETIMEMS"),
		PASSWORD("PASSWORD"),
		MENU("MENU"),
		ITEMSLIST("ITEMSLIST"),
		RESTAURANTUUID("RESTAURANTUUID"),
		BOOKINGFORM("bookingform"),
		BILLINGFORM("billingform"),
		CUSTOMERFORM("customerform"),
		SIGNINFORM("signinform"),
		CACHE("CACHE"),
		UPLOADFILE("/IM2/?/"),
		BILLPDF("/IM2/Bills/"),
		BILLPDFEXTENSTION(".pdf");

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
}