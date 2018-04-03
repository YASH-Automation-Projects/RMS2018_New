package com.yash.RMS.ExporttoExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CustomizedReport 
{
	public static XSSFWorkbook workbook = new XSSFWorkbook();
	public static CellStyle cellStyle1 = workbook.createCellStyle();
	public static Font font = workbook.createFont();
	public static Cell cell = null;
	public static XSSFSheet sheet = workbook.createSheet("Report");
	public static File c_file = new File("src\\test\\resources\\Customized_Report.xlsx");	

	
	public static void meargeRow(String text, int first_row, int Last_row,int first_column, int last_column) 
	{
		CellStyle cellStyle2 = workbook.createCellStyle();
		Font font1 = workbook.createFont();
		Cell cell2 = null;
		Row row = sheet.createRow((short) first_row);
		cell2 = row.createCell((short) first_row);
		cell2.setCellValue(text);
		FormatExl.cellMearge(sheet, first_row, Last_row, first_column,last_column);
		FormatExl.createCell(workbook, cell2, CellStyle.ALIGN_CENTER,CellStyle.VERTICAL_CENTER);

		font1.setFontHeightInPoints((short) 18);
		// font.setFontName("Courier New");
		font1.setBold(true);
		cellStyle2.setFont(font1);
		cell2.setCellStyle(cellStyle2);
	}

	public static void reportHeader(@SuppressWarnings("rawtypes") List reportValueList, int i)throws FileNotFoundException, IOException 
	{
		Row row = sheet.createRow(i);

		for (int k = 0; k < reportValueList.size(); k++) 
		{
			cell = row.createCell(k);
			String d = (String) reportValueList.get(k);
			FormatExl.createCell(workbook, cell, CellStyle.ALIGN_LEFT,CellStyle.VERTICAL_CENTER);
			FormatExl.drawBroder(workbook, cell);
			// FormatExl.fillColor(workbook, cell, d);

			cell.setCellValue(d);

			sheet.autoSizeColumn(k);
			cellStyle1.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
			cellStyle1.setFillPattern(CellStyle.SOLID_FOREGROUND);
			cellStyle1.setBorderBottom(CellStyle.BORDER_MEDIUM);
			cellStyle1.setBottomBorderColor(IndexedColors.BLACK.getIndex());
			cellStyle1.setBorderTop(CellStyle.BORDER_MEDIUM);
			cellStyle1.setTopBorderColor(IndexedColors.BLACK.getIndex());
			cellStyle1.setBorderLeft(CellStyle.BORDER_MEDIUM);
			cellStyle1.setLeftBorderColor(IndexedColors.BLACK.getIndex());
			cellStyle1.setBorderRight(CellStyle.BORDER_MEDIUM);
			cellStyle1.setRightBorderColor(IndexedColors.BLACK.getIndex());

			font.setFontHeightInPoints((short) 14);
			// font.setFontName("Courier New");
			font.setBold(true);
			cellStyle1.setFont(font);
			cell.setCellStyle(cellStyle1);

		}

		FileOutputStream out = new FileOutputStream(c_file);
		workbook.write(out);

	}

	@SuppressWarnings("rawtypes")
	public static void writeReportToExcel(List reportValueList, int rowOfExcel)throws FileNotFoundException, IOException, InterruptedException 
	{
		Row row = sheet.createRow(rowOfExcel);
		Thread.sleep(1000);
		for (int k = 0; k < reportValueList.size(); k++) 
		{
			cell = row.createCell(k);
			String d = (String) reportValueList.get(k);
			FormatExl.createCell(workbook, cell, CellStyle.ALIGN_LEFT,CellStyle.VERTICAL_TOP);
			FormatExl.drawBroder(workbook, cell);

			if (d.equals("Pass")) 
			{
				FormatExl.fillColor(workbook, cell, "Pass");
			} 
			else if (d.equals("Fail")) 
				{
					FormatExl.fillColor(workbook, cell, "Fail");
				} 
				else 
				{
					FormatExl.fillColor(workbook, cell, d);
				}
			cell.setCellValue(d);
			sheet.autoSizeColumn(k);
		}

		FileOutputStream out = new FileOutputStream(c_file);
		Thread.sleep(1000);
		workbook.write(out);
		Thread.sleep(4000);
		System.out.println((rowOfExcel - 1)+" record added");
	}

}
