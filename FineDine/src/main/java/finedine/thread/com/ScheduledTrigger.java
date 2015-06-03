package main.java.finedine.thread.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import main.java.finedine.cache.com.Caching;
import main.java.finedine.constants.com.Constants.Constant;
import main.java.finedine.services.com.IM2_Dbservice;
import main.java.finedine.util.com.CustomUtils;

public class ScheduledTrigger implements Runnable {

	private static ScheduledTrigger scheduledTrigger = null;
	public static IM2_Dbservice consumer = null;
	public static Properties messages = null;

	public static ScheduledTrigger getInstance() {
		synchronized (ScheduledTrigger.class) {
			if (scheduledTrigger == null) {
				synchronized (ScheduledTrigger.class) {
					scheduledTrigger = new ScheduledTrigger();
				}
			}
		}
		return scheduledTrigger;
	}

	private List<String> splitString(String offset) {
		String str[] = messages.getProperty("countrycode." + offset).split(",");
		List<String> list = Arrays.asList(str);
		return list;
	}

	private Map<String, Object> updateMapThread(String offset) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> countryCodeList = splitString(offset);
		Map<String, Object> cachedMap = Caching.getUpdateProfileMap();
		if (cachedMap != null && cachedMap.size() > 0) {
			for (Map.Entry<String, Object> mapEntry : cachedMap.entrySet()) {
				String uuid = mapEntry.getKey();
				for (String countryCode : countryCodeList) {
					if (offset.equalsIgnoreCase("0200")) {
						if (uuid.contains(countryCode)) {
							map.put(uuid, mapEntry.getValue());
						}
					}
				}
			}
		}
		return map;
	}

	@Override
	public void run() {
		while (!Thread.interrupted()) {

			try {
				String formattedDate = CustomUtils.getInstance().currentDate("HHmm");
				/*String cycles[] = { messages.getProperty("cycleOne"), messages.getProperty("cycleTwo"), messages.getProperty("cycleThree"), messages.getProperty("cycleFour"), messages.getProperty("cycleFive") };*/
				switch (formattedDate) {
				case "0200":
					BackgroundDbOperations.getInstance().resetBookingTable(consumer, +5, +8);
					BackgroundDbOperations.getInstance().updateProfile(consumer, updateMapThread("0200"));
					break;
				case "0730":
					BackgroundDbOperations.getInstance().resetBookingTable(consumer, +0, +2);
					BackgroundDbOperations.getInstance().updateProfile(consumer, updateMapThread("0730"));
					break;
				case "1130":
					BackgroundDbOperations.getInstance().resetBookingTable(consumer, -3, -5);
					BackgroundDbOperations.getInstance().updateProfile(consumer, updateMapThread("1130"));
					break;
				case "1730":
					BackgroundDbOperations.getInstance().resetBookingTable(consumer, -6, -10);
					BackgroundDbOperations.getInstance().updateProfile(consumer, updateMapThread("1730"));
					break;
				case "2230":
					BackgroundDbOperations.getInstance().resetBookingTable(consumer, +9, +12);
					BackgroundDbOperations.getInstance().updateProfile(consumer, updateMapThread("2230"));
					break;
				default:
					System.out.println("Midnight Trigger Scheduled ");
				}
				Thread.sleep(Long.parseLong(Constant.THREADSLEEPINTERVAL.getConstantValue())); // 1
																								// min
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void trigger(IM2_Dbservice consumer, Properties messages) {
		ScheduledTrigger.consumer = consumer;
		ScheduledTrigger.messages = messages;
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Runnable runnable = new ScheduledTrigger();
		executor.execute(runnable);
	}
}
