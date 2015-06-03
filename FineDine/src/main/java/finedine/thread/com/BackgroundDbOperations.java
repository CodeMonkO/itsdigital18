package main.java.finedine.thread.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.java.finedine.cache.com.Caching;
import main.java.finedine.entitypojo.com.UpdateProfileFormEntity;
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

	public void resetBookingTable(IM2_Dbservice consumer, int lower, int upper) {
		List<String> list = new ArrayList<String>();
		while (lower != upper) {
			list.add(Integer.toString(lower));
			if (lower > 0)
				++lower;
			else
				--lower;
		}
		if (lower == upper) {
			list.add(Integer.toString(lower));
		}
		consumer.resetBookingTable(list);
	}

	public void updateProfile(IM2_Dbservice consumer, Map<String, Object> map) {
		if (map != null && map.size() > 0) {
			for (Map.Entry<String, Object> mapEntry : map.entrySet()) {
				UpdateProfileFormEntity updateProfileFormEntity = (UpdateProfileFormEntity) mapEntry.getValue();
				consumer.updateRestaurantDetailsFromTable(updateProfileFormEntity, mapEntry.getKey());
				Caching.getUpdateProfileMap().remove(mapEntry.getKey());
			}
		}
	}
}
