package main.java.finedine.thread.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import main.java.finedine.constants.com.Constants.Constant;
import main.java.finedine.services.com.IM2_Dbservice;
import main.java.finedine.util.com.CustomUtils;

public class ScheduledTrigger implements Runnable {

	private static ScheduledTrigger scheduledTrigger = null;
	private IM2_Dbservice consumer;

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

	@Override
	public void run() {
		while (!Thread.interrupted()) {

			try {
				String formattedDate = CustomUtils.getInstance().currentDate("HHmm");
				switch (formattedDate) {
				case "0200":
					BackgroundDbOperations.getInstance().dbOperations(consumer, +5, +8);
					break;
				case "0730":
					BackgroundDbOperations.getInstance().dbOperations(consumer, +0, +2);
					break;
				case "1130":
					BackgroundDbOperations.getInstance().dbOperations(consumer, -3, -5);
					break;
				case "1730":
					BackgroundDbOperations.getInstance().dbOperations(consumer, -6, -10);
					break;
				case "2230":
					BackgroundDbOperations.getInstance().dbOperations(consumer, +9, +12);
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

	public void trigger(IM2_Dbservice consumer) {
		this.consumer = consumer;
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Runnable runnable = new ScheduledTrigger();
		executor.execute(runnable);
	}

}
