package com.Project_7AM;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel_Data {

	public static void writeExcel() throws IOException {

		File f = new File("C:\\Users\\prabu\\eclipse-workspace\\Project_7AM\\ExcelData\\ProjectStudent.xlsx");

		Workbook wb = new XSSFWorkbook();

		Sheet sheet = wb.createSheet("Students");

		Row row = sheet.createRow(0);

		Cell cell = row.createCell(0);

		cell.setCellValue("S.No");

		wb.getSheet("Students").createRow(1);
		wb.getSheet("Students").createRow(2);
		wb.getSheet("Students").createRow(3);
		wb.getSheet("Students").createRow(4);

		//Header
		wb.getSheet("Students").getRow(0).createCell(1).setCellValue("Names");

		wb.getSheet("Students").getRow(0).createCell(2).setCellValue("Address");
		
		
		
		//1st row
		wb.getSheet("Students").getRow(1).createCell(0).setCellValue("1");

		wb.getSheet("Students").getRow(1).createCell(1).setCellValue("Prabu");
		
		wb.getSheet("Students").getRow(1).createCell(2).setCellValue("Chennai");
		
		

		wb.getSheet("Students").getRow(2).createCell(0).setCellValue("2");

		wb.getSheet("Students").getRow(2).createCell(1).setCellValue("Ajith");
		
		wb.getSheet("Students").getRow(2).createCell(2).setCellValue("Chennai");

		
		
		

		wb.getSheet("Students").getRow(3).createCell(0).setCellValue("3");

		wb.getSheet("Students").getRow(3).createCell(1).setCellValue("Pradeep");
		
		wb.getSheet("Students").getRow(3).createCell(2).setCellValue("Kovai");

		

		wb.getSheet("Students").getRow(4).createCell(0).setCellValue("4");

		wb.getSheet("Students").getRow(4).createCell(1).setCellValue("saravanan");
		
		wb.getSheet("Students").getRow(4).createCell(2).setCellValue("Vellore");




		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

	}

}
