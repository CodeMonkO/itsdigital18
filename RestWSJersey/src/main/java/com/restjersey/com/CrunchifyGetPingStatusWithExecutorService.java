package main.java.com.restjersey.com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

/**
 * @author Crunchify.com
 * 
 */

public class CrunchifyGetPingStatusWithExecutorService implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6316939944261473870L;
	private static final int MYTHREADS = 80000;
	private static final int delay = 0;
	private static int servicecount = 0;
	private static int crunchifyservicecount = 0;

	public static void main(String args[]) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		String service = "http://10.191.223.29:8080/RestWSJersey/service";
		String crunchifyService = "http://10.191.223.29:8080/RestWSJersey/crunchifyService";
		String[] hostList = new String[MYTHREADS];
		for (int i = 0; i < hostList.length - 1; i = i + 2) {
			hostList[i] = service;
			hostList[i + 1] = crunchifyService;
		}

		for (int i = 0; i < hostList.length; i++) {

			String url = hostList[i];
			Runnable worker = new MyRunnable(url);
			executor.execute(worker);
			Thread.sleep(delay);
		}
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {

		}
		System.out.println("\nFinished all threads");
	}

	public static class MyRunnable implements Runnable {
		private final String url;

		MyRunnable(String url) {
			this.url = url;
		}

		public void run() {
			try {
				String string = "";
				InputStream crunchifyInputStream = null;
				if (url.endsWith("crunchifyService"))
					crunchifyInputStream = new FileInputStream(
							"resources/JSONFile.txt"); //This is REST Service Example by Crunchify.
				if (url.endsWith("service"))
					crunchifyInputStream = new FileInputStream(
							"resources/1JSONFile.txt"); //Himanshu 
				InputStreamReader crunchifyReader = new InputStreamReader(
						crunchifyInputStream);
				BufferedReader br = new BufferedReader(crunchifyReader);
				String line;
				while ((line = br.readLine()) != null) {
					string += line + "\n";
				}
				
				JSONObject jsonObject = new JSONObject(string);
				string = jsonObject.toString();

				URL siteURL = new URL(url);
				URLConnection connection = siteURL.openConnection();
				connection.setDoOutput(true);
				connection.setRequestProperty("Content-Type",
						"application/json");
				connection.setConnectTimeout(5000);
				connection.setReadTimeout(5000);
				OutputStreamWriter out = new OutputStreamWriter(
						connection.getOutputStream());
				out.write(string);
				out.close();

				BufferedReader in = new BufferedReader(new InputStreamReader(
						connection.getInputStream()));

				while (in.readLine() != null) {
					string += in + "\n";
				}
				JSONObject jsonObjectResponse = new JSONObject(string);
				string = jsonObjectResponse.getString("tutorials");
				jsonObjectResponse = new JSONObject(string);
				string = jsonObjectResponse.getString("description");

				if (string.equalsIgnoreCase("himanshu")) {
					crunchifyservicecount++;
					System.out.println("\nREST Service Invoked Successfully..");
					System.out.println("URL :" + url + " Response :" + string
							+ " : Count :" + crunchifyservicecount);
				} else {
					servicecount++;
					System.out.println("\nREST Service Invoked Successfully..");
					System.out.println("URL :" + url + " Response :" + string
							+ " : Count :" + servicecount);
				}
				br.close();
				in.close();
			} catch (Exception e) {
				System.out.println("\nError while calling REST Service");
				System.out.println(e);
			}
		}
	}
}
