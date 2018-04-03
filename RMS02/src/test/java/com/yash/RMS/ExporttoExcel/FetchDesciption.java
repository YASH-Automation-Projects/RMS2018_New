package com.yash.RMS.ExporttoExcel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDesciption {

	public static Map<String, String> FetchDataFromExcel() {
		String key = "";
		String value = "";
		Map<String, String> DescriptionMap = new LinkedHashMap<String, String>();
		List<String> keyList = new ArrayList<String>();
		List<String> ValueList = new ArrayList<String>();
		try {
			Thread.sleep(2000);
			FileInputStream file = new FileInputStream(new File(
					"src\\test\\resources\\ReportDescriptionData.xlsx"));
			Thread.sleep(100);
			// Create Workbook instance holding reference to .xlsx file
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);
			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				if (row.getRowNum() == 0) {
					continue; // just skip the rows if row number is 0 or 1
				}

				// For each row, iterate through each columns
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 0:
						key = cell.getStringCellValue();
						keyList.add(key);
						break;
					case 1:
						value = cell.getStringCellValue();
						ValueList.add(value);
						break;
					}
				}
			}
			// convert two lists into map
			for (int i = 0; i < keyList.size(); i++) {
				Thread.sleep(500);
				DescriptionMap.put(keyList.get(i), ValueList.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return DescriptionMap;
	}
}