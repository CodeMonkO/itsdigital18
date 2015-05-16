package main.java.finedine.thread.com;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import main.java.finedine.services.com.IM2_Dbservice;

public class BackgroundDbOperations {

	private static BackgroundDbOperations backgroundDbOperations = null;

	private BackgroundDbOperations() {

	}

	public static BackgroundDbOperations getInstance() {
		if (backgroundDbOperations == null) {
			backgroundDbOperations = new BackgroundDbOperations();
		}
		return backgroundDbOperations;
	}

	public void dbOperations(IM2_Dbservice consumer, int lower, int upper) {
		List<String> list = new ArrayList<String>();
		while (lower != upper) {
			list.add(Integer.toString(lower));
			if (lower > 0)
				++lower;
			else
				--lower;
		}
		if(lower == upper){
			list.add(Integer.toString(lower));
		}
		System.out.println(list);
		consumer.resetBookingTable(list);
	}
}
