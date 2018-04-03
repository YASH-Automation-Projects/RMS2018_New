package com.yash.RMS.ExporttoExcel;

import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("deprecation")
public class FormatExl {

	public static void createCell(XSSFWorkbook wb, Cell cell, short halign,
			short valign) {
		// - Cell cell = row.createCell(column);
		// cell.setCellValue("Align It");
		CellStyle cellStyle = wb.createCellStyle();
		cellStyle.setAlignment(halign);
		cellStyle.setVerticalAlignment(valign);
		cell.setCellStyle(cellStyle);
	}

	public static void drawBroder(XSSFWorkbook wb, Cell cell) {

		CellStyle style = wb.createCellStyle();
		style.setBorderBottom(CellStyle.BORDER_MEDIUM);
		style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		style.setBorderLeft(CellStyle.BORDER_MEDIUM);
		style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		style.setBorderRight(CellStyle.BORDER_MEDIUM);
		style.setRightBorderColor(IndexedColors.BLACK.getIndex());
		style.setBorderTop(CellStyle.BORDER_MEDIUM);
		style.setTopBorderColor(IndexedColors.BLACK.getIndex());
		cell.setCellStyle(style);
	}

	public static void fillColor(XSSFWorkbook wb, Cell cell, String Result) {
		CellStyle style = wb.createCellStyle();
		if (Result.equals("Fail")) {
			style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style.setBorderBottom(CellStyle.BORDER_MEDIUM);
			style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
			style.setBorderTop(CellStyle.BORDER_MEDIUM);
			style.setTopBorderColor(IndexedColors.BLACK.getIndex());
			cell.setCellStyle(style);
		}

		else if (Result.equals("Pass")) {

			style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style.setBorderBottom(CellStyle.BORDER_MEDIUM);
			style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
			style.setBorderTop(CellStyle.BORDER_MEDIUM);
			style.setTopBorderColor(IndexedColors.BLACK.getIndex());
			cell.setCellStyle(style);

		} else {
			return;
		}

	}

	public static void cellMearge(XSSFSheet sheet, int first_row, int Last_row,
			int first_column, int last_column) {

		sheet.addMergedRegion(new CellRangeAddress(first_row, Last_row,
				first_column, last_column));

	}

}
