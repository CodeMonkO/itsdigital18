package main.java.finedine.constants.com;

public class Constants {
	public enum Constant {

		VERIFICATIONCODE("VERIFICATION_CODE"), EMAIL("EMAIL"), AUTHENTICATEUSER(
				"AUTHENTICATE_USER");

		private String value;

		private Constant(String s) {
			value = s;
		}

		public String getConstantValue() {
			return value;
		}

	}
}