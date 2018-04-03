package com.yash.RMS.ExporttoExcel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ReportDescription {
	public static int rowOfExcel = 1;
	public static Map<String, String> descriptionData;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void WriteReport(Map<String, List> myMapData)
			throws FileNotFoundException, IOException, InterruptedException {

		List<String> value = new LinkedList<String>();

		// get key and value and pass
		for (String key : myMapData.keySet()) {

			value = (myMapData.get(key));
			Thread.sleep(500);
			getDesc(key, value);
		}
	}

	@SuppressWarnings("unchecked")
	public static void getDesc(String key, List<String> value)
			throws FileNotFoundException, IOException, InterruptedException {
		@SuppressWarnings("rawtypes")
		List reportValueList = null;
		String valueOfDescription = "";
		descriptionData = FetchDesciption.FetchDataFromExcel();

		for (String keyOfDescription : descriptionData.keySet()) {

			if (keyOfDescription.equals(key)) {
				valueOfDescription = (descriptionData.get(keyOfDescription));
				rowOfExcel++;
			}
			reportValueList = new ArrayList<String>(value);
			reportValueList.add(valueOfDescription);
		}
		CustomizedReport.writeReportToExcel(reportValueList, rowOfExcel);
		Thread.sleep(500);
		

	}
	

}
