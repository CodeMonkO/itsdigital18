package main.java.finedine.util.com;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class CustomUtils {

	private static CustomUtils customUtils = null;

	public static CustomUtils getInstance() {
		if (customUtils == null) {
			customUtils = new CustomUtils();
		}
		return customUtils;
	}

	public List<String> getListFromMap(Map<String, String> map, String kv) {
		List<String> list = new ArrayList<String>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (kv.equalsIgnoreCase("k")) {
				list.add(entry.getKey());
			} else {
				list.add(entry.getValue());
			}
		}
		return list;
	}
	
	public List<String> getListFromString(String string, String delim) {
		List<String> list = new ArrayList<String>();
		StringTokenizer stringTokenizer = new StringTokenizer(string,delim);
		while(stringTokenizer.hasMoreElements()){
			list.add(stringTokenizer.nextToken());
		}
		return list;
	}
	
	public String currentDate(String format){
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.format(date).toString();
	}
}
