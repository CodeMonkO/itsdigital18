package main.java.finedine.util.com;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.finedine.pojo.com.Bill;

import com.csvreader.CsvReader;

public class ReadCSVFile {
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
			items.add(bill.getItem() + "|" + bill.getAmount() + "|" + bill.getDiscount());
		}
		return items;
	}

	public Map<String, String> getMapOfCSV(String path, String colA, String colB) {
		Map<String, String> map = null;
		try {

			CsvReader csvReader = new CsvReader(path);
			map = new HashMap<String, String>();
			csvReader.readHeaders();
			boolean skipHeader = true;
			while (csvReader.readRecord()) {
				if (skipHeader) {
					skipHeader = false;
					continue;
				} else {
					map.put(csvReader.get(colA), csvReader.get(colB));
				}
			}
			csvReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}

	public List<String> getList(Map<String, String> map, String kv) {
		List<String> list = new ArrayList<String>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (kv.equalsIgnoreCase("k"))
				list.add(entry.getKey());
			else
				list.add(entry.getValue());
		}
		return list;
	}
}
