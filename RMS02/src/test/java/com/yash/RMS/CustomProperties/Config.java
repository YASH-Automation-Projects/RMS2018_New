package com.yash.RMS.CustomProperties;

public class Config {
	
		public static String index, TestCaseFileName, errorsnapshotforpass, errorsnapshotforfail, browser, resultdirectory, iedriver, chromedriver,error, errortype;
			
			public static String config() 
			{
				String TestCasePath = "src\\test\\resources\\Keyword.xlsx";
				//TestCaseFileName = "KapilTestCaseSheet.xlsx";
				index = "Index";
				chromedriver = "";
				return TestCasePath.toString();
			}
}
