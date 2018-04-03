package com.yash.RMS.CustomProperties;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ToDate {
	
	
	public static String SelectToDate(){
				 
	     @SuppressWarnings("unused")
		int day, month, year;
	   
	     SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
	     Calendar c = Calendar.getInstance();
	        c.setTime(new Date()); // Now use today date.
	        c.add(Calendar.DATE, 15); // Adding 7 days from current date 
	        String CheckInDate = sdf.format(c.getTime());
	        System.out.println(CheckInDate);
	        return CheckInDate;}
	
}
