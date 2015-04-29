package main.java.finedine.util.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MailTemplateReader {

	public static String readfile() {

		BufferedReader br = null;
		String sCurrentLine = "", str = "";
		try {

			br = new BufferedReader(
					new FileReader(
							""));

			while ((sCurrentLine = br.readLine()) != null) {
				str = str + sCurrentLine;
				if(str.contains("<td><pre>")){
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return str;
	}
}
