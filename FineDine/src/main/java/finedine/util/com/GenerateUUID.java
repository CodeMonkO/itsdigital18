package main.java.finedine.util.com;

import java.util.Map;

import main.java.finedine.pojo.com.SignUp;

public class GenerateUUID {

	public String getGeneratedUUID(SignUp signupform, Map<String, String> countryMap, Map<String, String> stateMap) {
		StringBuffer stringBuffer = new StringBuffer();
		/*stringBuffer.append(countryMap.get(signupform.getCountry()).toUpperCase());*/
		stringBuffer.append(stateMap.get(signupform.getState()).toUpperCase());
		stringBuffer.append(signupform.getZipcode());
		stringBuffer.append("TS");
		stringBuffer.append(CustomUtils.getInstance().currentDate("yyyyMMddHHmmssSSS"));
		System.out.println(stringBuffer.toString());
		return stringBuffer.toString();

	}
}
