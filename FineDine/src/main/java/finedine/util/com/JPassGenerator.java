package main.java.finedine.util.com;

import java.util.Properties;

import main.java.finedine.constants.com.Constants.Constant;

public class JPassGenerator {
	private String ALPHA_NUMERIC_STRING = null;
	private int PASSWORD_LENGTH = 0;
	private static JPassGenerator jPassGenerator = null;

	private JPassGenerator(){
		
	}
	
	public static JPassGenerator getInstance() {

		if (jPassGenerator == null) {
			{
				jPassGenerator = new JPassGenerator();
			}
		}
		return jPassGenerator;
	}

	public String verificationCodeGenerator(Properties messages) {
		ALPHA_NUMERIC_STRING = messages.getProperty(Constant.JPASS.getConstantValue());
		PASSWORD_LENGTH = Integer.parseInt(messages.get(Constant.JPASSPASSWORDLEN.getConstantValue()).toString());
		int count = PASSWORD_LENGTH;
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
}
