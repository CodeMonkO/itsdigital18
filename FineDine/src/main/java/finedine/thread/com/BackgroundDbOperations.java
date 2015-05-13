package main.java.finedine.thread.com;

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

	public void dbOperations(IM2_Dbservice consumer) {
		consumer.resetBookingTable("IN");
	}
}
