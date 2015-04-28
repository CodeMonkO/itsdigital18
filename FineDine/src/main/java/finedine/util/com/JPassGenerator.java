package main.java.finedine.util.com;

public class JPassGenerator {

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_+-&&||!(){}[]./^\"~*?:\\abcdefghijklmnopqrstuvwxyz";

	private static JPassGenerator jPassGenerator = null;

	public static JPassGenerator getInstance() {
		synchronized (jPassGenerator) {
			if (jPassGenerator == null) {
				synchronized (jPassGenerator) {
					jPassGenerator = new JPassGenerator();
				}
			}
		}
		return jPassGenerator;
	}

	public String verificationCodeGenerator(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING
					.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
}
