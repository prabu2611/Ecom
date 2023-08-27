package com.Project_7AM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	// Data Driven -> Framework

	// Excel - Read and Write

	// Excel Sheet

	// Workbook -> Interface

	// Sheet -> Row -> Cell

	// HSSF - Before 2007

	// XSSF - 2007 and After

	// ENUM -> WebElement

	// STRING , NUMERIC - > CellType

	// poi ,poi ooxml,poi ooxml schema 4.1.2

	public static void particularData() throws IOException {

		System.out.println("Particular Data:");

		System.out.println("========================");

		File f = new File("C:\\Users\\prabu\\eclipse-workspace\\Project_7AM\\ExcelData\\LoginDetails.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sh = wb.getSheetAt(0);

		Row row = sh.getRow(4);

		Cell cell = row.getCell(1);

		CellType ct = cell.getCellType();

		// System.out.println(ct);

		if (ct.equals(CellType.STRING)) {

			String value = cell.getStringCellValue();

			System.out.println(value);

		}

		else if (ct.equals(CellType.NUMERIC)) {

			double value = cell.getNumericCellValue();

			int val = (int) value;

			System.out.println(val);
		}

	}

	public static void allData() throws IOException {

		String fileLocation = ".\\ExcelData\\LoginDetails.xlsx";

		File f = new File(fileLocation);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheetAt(0);

		int nor = sheet.getPhysicalNumberOfRows();

		System.out.println();

		System.out.println("No.of Rows : " + nor);

		System.out.println();

		System.out.println("ALL Data:");

		System.out.println("==============");

		for (int i = 0; i < nor; i++) {

			Row row = sheet.getRow(i);

			int noc = row.getPhysicalNumberOfCells();

			// System.out.println("No.of Cells: "+noc);

			for (int j = 0; j < noc; j++) {

				Cell cell = row.getCell(j);

				CellType ct = cell.getCellType();

				if (ct.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();

					System.out.println(value);

				}

				else if (ct.equals(CellType.NUMERIC)) {

					double val = cell.getNumericCellValue();

					int value = (int) val;

					System.out.println(value);

				}

			}

		}

	}

	public static void rowData() throws IOException {
		
		System.out.println();

		System.out.println("Row Data:");

		System.out.println("==============");

		File f = new File("C:\\Users\\prabu\\eclipse-workspace\\Project_7AM\\ExcelData\\LoginDetails.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sh = wb.getSheetAt(0);

		Row row4 = sh.getRow(4);

		int noc = row4.getPhysicalNumberOfCells();

		for (int i = 0; i < noc; i++) {

			Cell cell = row4.getCell(i);

			CellType ct = cell.getCellType();

			if (ct.equals(CellType.STRING)) {

				String value = cell.getStringCellValue();

				System.out.print(value + "   ");

			}

			else if (ct.equals(CellType.NUMERIC)) {

				double val = cell.getNumericCellValue();

				int value = (int) val;

				System.out.print(value + "  ");

			}
			
		}
		
	}	

		public static void colData() throws IOException {
			
			System.out.println();

			System.out.println("Col Data:");

			System.out.println("==============");

			File f = new File("C:\\Users\\prabu\\eclipse-workspace\\Project_7AM\\ExcelData\\LoginDetails.xlsx");

			FileInputStream fis = new FileInputStream(f);

			Workbook wb = new XSSFWorkbook(fis);

			Sheet sh = wb.getSheetAt(0);
			
			
			int nor = sh.getPhysicalNumberOfRows();
			
			
			for (int i = 1; i < nor; i++) {
				
				
				Row row = sh.getRow(i);
				
				Cell cell = row.getCell(1);
				
				CellType ct = cell.getCellType();
				

				if (ct.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();

					System.out.println(value);

				}

				else if (ct.equals(CellType.NUMERIC)) {

					double val = cell.getNumericCellValue();

					int value = (int) val;

					System.out.println(value);

				}
			
			}
				
			}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//				if (ct.equals(CellType.STRING)) {
//
//					String value = cell.getStringCellValue();
//
//					System.out.print(value + "   ");
//
//				}
//
//				else if (ct.equals(CellType.NUMERIC)) {
//
//					double val = cell.getNumericCellValue();
//
//					int value = (int) val;
//
//					System.out.print(value + "  ");
//
//				}
//			
			
			

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

