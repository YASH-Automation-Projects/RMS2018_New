package com.yash.RMS.Testcase.Dashboard;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.Admin.Action_Resources;
import com.yash.RMS.TestAction.Dashboard.Action_EditProperty;

public class ProfileEdit {

	public static List<String> EditProfileData = new ArrayList<String>();

	@Test
	public static void Editing_Profile_Updating() throws Throwable {
		Report.TableEnd();
		Report.Report_section_Name("Scenario 2 _ Updating Prfoile");
		Report.ReporterOutputHeader();
	
		@SuppressWarnings("EditProfile")
		
	//	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		//XSSFSheet NewSheet = ObjWorkBook.getSheet("Edit_Profile");
		//Workbook TestWorkbook = new XSSFWorkbook(fileInp);
		String sheetName = "test";
		@SuppressWarnings("rawtypes")

	    Sheet NewSheet = ObjWorkBook.getSheet("Edit_Profile");

		ArrayList<String> Data = new ArrayList<String>();
		DataFormatter formatter = new DataFormatter(Locale.US);

		for (int i = 1; i <= 1; i++) {

			Row row = NewSheet.getRow(i);

			for (int j = 0; j < 3; j++) {

				String text = formatter.formatCellValue(NewSheet.getRow(i).getCell(j));
				Data.add(text);

			}

			System.out.println(Data.get(0) + "----" + Data.get(1) + "----" + Data.get(2));
			Action_EditProperty.EditProfile_UpdatingData(Data.get(0), Data.get(1), Data.get(2));
		}

		ObjWorkBook = null;
		ObjExcelApp.close();
		Report.TableEnd();

	}

	@Test
	public static void Editing_Profile_Searching() throws Throwable {
		Report.TableEnd();
		Report.Report_section_Name("Scenario 1 _ Searching Prfoile");
		Report.ReporterOutputHeader();
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		@SuppressWarnings("EditProfile")
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet NewSheet = ObjWorkBook.getSheet("Edit_Profile");
		DataFormatter formatter = new DataFormatter(Locale.US);
		
		ArrayList<String> Data = new ArrayList<String>();
		for (int i = 1; i <= 1; i++) {

			Row row = NewSheet.getRow(i);

			for (int j = 7; j <=8; j++) {

				String text = formatter.formatCellValue(NewSheet.getRow(i).getCell(j));
				Data.add(text);

			}

			System.out.println(Data.get(0) + "----" + Data.get(1));
			Action_EditProperty.EditProfile_Searching(Data.get(0), Data.get(1));
			//Action_EditProperty.EditProfile_Searching("Automation Testing", "ASP");
			
		}
		
		
		//Action_EditProperty.EditProfile_Searching("Automation Testing", "ASP");

		ObjWorkBook = null;
		ObjExcelApp.close();
		Report.TableEnd();

	}

}
