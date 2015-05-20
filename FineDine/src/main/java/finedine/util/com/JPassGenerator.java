package main.java.finedine.util.com;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.finedine.constants.com.Constants.Constant;

public class JPassGenerator {
	@Autowired
	public Properties messages;
	private final String ALPHA_NUMERIC_STRING = messages.getProperty(Constant.JPASS.getConstantValue());
	private final int PASSWORD_LENGTH = Integer.parseInt(messages.get(Constant.JPASSPASSWORDLEN.getConstantValue()).toString());
	private static JPassGenerator jPassGenerator = null;

	public static synchronized JPassGenerator getInstance() {

		if (jPassGenerator == null) {
			{
				jPassGenerator = new JPassGenerator();
			}
		}
		return jPassGenerator;
	}

	public String verificationCodeGenerator() {
		int count = PASSWORD_LENGTH;
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
}
