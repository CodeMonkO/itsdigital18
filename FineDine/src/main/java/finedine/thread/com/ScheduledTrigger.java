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
import main.java.finedine.constants.com.Constants.MidnightCycle;
import main.java.finedine.services.com.IM2_Dbservice;
import main.java.finedine.util.com.CustomUtils;

public class ScheduledTrigger implements Runnable {

	private static ScheduledTrigger scheduledTrigger = null;
	private static IM2_Dbservice Consumer = null;
	private static Properties Messages = null;

	public static ScheduledTrigger getInstance(IM2_Dbservice consumer, Properties messages) {
		synchronized (ScheduledTrigger.class) {
			if (scheduledTrigger == null) {
				synchronized (ScheduledTrigger.class) {
					scheduledTrigger = new ScheduledTrigger();
					Consumer = consumer;
					Messages = messages;
				}
			}
		}
		return scheduledTrigger;
	}

	private List<String> splitString(String propertyKey) {
		String str[] = Messages.getProperty("countrycode." + propertyKey).split(",");
		List<String> list = Arrays.asList(str);
		return list;
	}

	private Map<String, Object> updateMapThread(String propertyKey) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> countryCodeList = splitString(propertyKey);
		Map<String, Object> cachedMap = Caching.getUpdateProfileMap();
		if (cachedMap != null && cachedMap.size() > 0) {
			for (Map.Entry<String, Object> mapEntry : cachedMap.entrySet()) {
				String uuid = mapEntry.getKey();
				for (String countryCode : countryCodeList) {
					if (uuid.contains(countryCode)) {
						map.put(uuid, mapEntry.getValue()); 
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
				String formattedDate = CustomUtils.getInstance().currentDate(Messages.getProperty(Constant.SCHEDULEDTRIGGERFMT.getConstantValue()));

				if (null != formattedDate && formattedDate.equalsIgnoreCase(Messages.getProperty(MidnightCycle.MNC1.getMidnightCycle()))) {
					BackgroundDbOperations.getInstance().resetBookingTable(Consumer, +5, +8);
					//BackgroundDbOperations.getInstance().updateProfile(Consumer, updateMapThread(MidnightCycle.MNC1.getMidnightCycle()));
				} else if (null != formattedDate && formattedDate.equalsIgnoreCase(Messages.getProperty(MidnightCycle.MNC2.getMidnightCycle()))) {
					BackgroundDbOperations.getInstance().resetBookingTable(Consumer, +0, +2);
					//BackgroundDbOperations.getInstance().updateProfile(Consumer, updateMapThread(MidnightCycle.MNC2.getMidnightCycle()));
				} else if (null != formattedDate && formattedDate.equalsIgnoreCase(Messages.getProperty(MidnightCycle.MNC3.getMidnightCycle()))) {
					BackgroundDbOperations.getInstance().resetBookingTable(Consumer, -3, -5);
					//BackgroundDbOperations.getInstance().updateProfile(Consumer, updateMapThread(MidnightCycle.MNC3.getMidnightCycle()));
				} else if (null != formattedDate && formattedDate.equalsIgnoreCase(Messages.getProperty(MidnightCycle.MNC4.getMidnightCycle()))) {
					BackgroundDbOperations.getInstance().resetBookingTable(Consumer, -6, -10);
					//BackgroundDbOperations.getInstance().updateProfile(Consumer, updateMapThread(MidnightCycle.MNC4.getMidnightCycle()));
				} else if (null != formattedDate && formattedDate.equalsIgnoreCase(Messages.getProperty(MidnightCycle.MNC5.getMidnightCycle()))) {
					BackgroundDbOperations.getInstance().resetBookingTable(Consumer, +9, +12);
					//BackgroundDbOperations.getInstance().updateProfile(Consumer, updateMapThread(MidnightCycle.MNC5.getMidnightCycle()));
				} else {
					System.out.println("Midnight Trigger Scheduled ");
				}
				
				Thread.sleep(Long.parseLong(Messages.getProperty(Constant.THREADSLEEPINTERVAL.getConstantValue()))); // 1
				// min
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
	}

	public void trigger() {
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Runnable runnable = new ScheduledTrigger();
		executor.execute(runnable);
	}
}
