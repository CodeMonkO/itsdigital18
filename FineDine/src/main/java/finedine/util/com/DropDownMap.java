package main.java.finedine.util.com;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DropDownMap {

	private static DropDownMap dropDownMap = null;

	public static DropDownMap getInstance() {
		if (dropDownMap == null) {
			dropDownMap = new DropDownMap();
		}
		return dropDownMap;
	}

	public List<String> getDorpDownList(String string) {
		StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
		List<String> list = new ArrayList<String>();
		while (stringTokenizer.hasMoreElements()) {
			list.add(stringTokenizer.nextElement().toString());
		}
		return list;
	}
}
