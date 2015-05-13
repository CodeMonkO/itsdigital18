package main.java.finedine.thread.com;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import main.java.finedine.services.com.IM2_Dbservice;

public class ScheduledTrigger implements Runnable {

	private static ScheduledTrigger scheduledTrigger = null;
	private static IM2_Dbservice consumer;

	public static ScheduledTrigger getInstance() {
		if (scheduledTrigger == null) {
			scheduledTrigger = new ScheduledTrigger();
		}
		return scheduledTrigger;
	}

	@Override
	public void run() {
		while (!Thread.interrupted()) {

			try {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
				String formattedDate = sdf.format(date);
				if (formattedDate.equalsIgnoreCase("0042")) {
					System.out.println("Thread loop ");
					BackgroundDbOperations.getInstance().dbOperations(consumer);
				}
				Thread.sleep(60000); // 1 min
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void trigger(IM2_Dbservice consumer) {
		ScheduledTrigger.consumer = consumer;
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Runnable runnable = new ScheduledTrigger();
		executor.execute(runnable);
	}

}
