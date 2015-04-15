package main.java.com.restjersey.com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

/**
 * @author Crunchify.com
 * 
 */

public class CrunchifyRESTServiceClient {
	
	
	
	public static void main(String[] args) {
		String string = "";
		try {

			// Step1: Let's 1st read file from fileSystem
			InputStream crunchifyInputStream = new FileInputStream(
					"resources/1JSONFile.txt");
			InputStreamReader crunchifyReader = new InputStreamReader(
					crunchifyInputStream);
			BufferedReader br = new BufferedReader(crunchifyReader);
			String line;
			while ((line = br.readLine()) != null) {
				string += line + "\n";
			}
			br.close();
			JSONObject jsonObject = new JSONObject(string);
			string = jsonObject.toString();
			//System.out.println(jsonObject);

			// Step2: Now pass JSON File Data to REST Service
			try {
				URL url = new URL(
						"http://10.191.223.29:8080/RestWSJersey/service");
				URLConnection connection = url.openConnection();
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
				System.out.println("\nREST Service Invoked Successfully.."+string);
				in.close();
			} catch (Exception e) {
				System.out.println("\nError while calling REST Service");
				e.printStackTrace();
				System.out.println(e);
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}