package com.yash.RMS.CustomProperties;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentDate {
	
	@SuppressWarnings("unused")
	public static void SelectCurrentDate(){
		
		 int day, month, year;
	     GregorianCalendar date = new GregorianCalendar();{
	     day = date.get(Calendar.DAY_OF_MONTH);
	     month = date.get(Calendar.MONTH)+1;
	     year = date.get(Calendar.YEAR);
	     String today = "a_"+year+"_"+month+"_"+day;
	     //System.out.println(today);
	}
	}
}