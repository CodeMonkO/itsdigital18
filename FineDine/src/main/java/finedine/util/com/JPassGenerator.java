package main.java.finedine.util.com;

public class JPassGenerator {

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_+-&&||!(){}[]./^\"~*?:\\abcdefghijklmnopqrstuvwxyz";

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING
					.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println(randomAlphaNumeric(10));
	}
}
