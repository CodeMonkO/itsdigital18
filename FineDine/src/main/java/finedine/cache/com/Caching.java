package main.java.finedine.cache.com;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Caching {
	private static Map<String, Map<String, Object>> loggedInUsers = null;
	private static Map<String, Object> updateProfileMap = null;
	private static Caching mostRecentlyLoggedInUsers = null;

	private Caching() {

	}

	public static Caching getInstance() {
		if (null == mostRecentlyLoggedInUsers) {
			mostRecentlyLoggedInUsers = new Caching();
			loggedInUsers = new ConcurrentHashMap<String, Map<String, Object>>();
			updateProfileMap = new ConcurrentHashMap<String, Object>();
		}
		return mostRecentlyLoggedInUsers;
	}

	public static Map<String, Map<String, Object>> getLoggedInUsers() {
		return loggedInUsers;
	}

	public static void setLoggedInUsers(Map<String, Map<String, Object>> loggedInUsers) {
		Caching.loggedInUsers = loggedInUsers;
	}

	public static Map<String, Object> getUpdateProfileMap() {
		return updateProfileMap;
	}

	public static void setUpdateProfileMap(Map<String, Object> updateProfileMap) {
		Caching.updateProfileMap = updateProfileMap;
	}

}
