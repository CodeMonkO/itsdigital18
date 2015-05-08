package main.java.finedine.cache.com;

import java.util.HashMap;
import java.util.Map;

public class MostRecentlyLoggedInUsers {
	private static Map<String, Map<String, Object>> loggedInUsers = null;
	private static MostRecentlyLoggedInUsers mostRecentlyLoggedInUsers = null;

	private MostRecentlyLoggedInUsers() {

	}

	public static MostRecentlyLoggedInUsers getInstance() {
		if (null == mostRecentlyLoggedInUsers) {
			mostRecentlyLoggedInUsers = new MostRecentlyLoggedInUsers();
			loggedInUsers = new HashMap<String, Map<String, Object>>();
		}
		return mostRecentlyLoggedInUsers;
	}

	public static Map<String, Map<String, Object>> getLoggedInUsers() {
		return loggedInUsers;
	}

	public static void setLoggedInUsers(Map<String, Map<String, Object>> loggedInUsers) {
		MostRecentlyLoggedInUsers.loggedInUsers = loggedInUsers;
	}

}
