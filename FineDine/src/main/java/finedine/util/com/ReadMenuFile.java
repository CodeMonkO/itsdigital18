package main.java.finedine.util.com;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import main.java.finedine.pojo.com.Bill;

import com.csvreader.CsvReader;

public class ReadMenuFile {
	public List<Bill> getListOfMenuItems(String path) {
		List<Bill> billList = null;
		try {

			CsvReader csvReader = new CsvReader(path);
			billList = new ArrayList<Bill>();
			csvReader.readHeaders();
			boolean skipHeader = true;
			while (csvReader.readRecord()) {
				Bill bill = new Bill();
				if (skipHeader) {
					skipHeader = false;
					continue;
				} else {
					bill.setItem(csvReader.get("Item"));
					bill.setAmount(csvReader.get("Amount"));
					bill.setDiscount(csvReader.get("Discount"));
					billList.add(bill);
				}
			}
			csvReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return billList;
	}

	public List<String> getListOfItems(List<Bill> billList) {
		List<String> items = new ArrayList<String>();
		for (Bill bill : billList) {
			items.add(bill.getItem()+"|"+bill.getAmount()+"|"+bill.getDiscount());
		}
		return items;
	}
}
