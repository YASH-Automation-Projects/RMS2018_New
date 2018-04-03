package com.yash.RMS.CustomProperties;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static List<String> x = new ArrayList<String>();
	
	public static void main(String args[]) throws Throwable
	{
		XML.ExcelRead();
		XML.XMLRead(Constant.XmlFileName);
	}
}
