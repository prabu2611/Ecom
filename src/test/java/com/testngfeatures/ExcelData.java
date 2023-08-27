package com.testngfeatures;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	// TDD - Test Driven Development

	public static String[][] ReadData() throws IOException {

		File f = new File("C:\\Users\\prabu\\eclipse-workspace\\Project_7AM\\Excel\\Adactin_LoginDetails.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet1 = wb.getSheetAt(0);

		int nor = sheet1.getPhysicalNumberOfRows();

		int lnr = sheet1.getLastRowNum();

		Row row = sheet1.getRow(0);

		int noc = row.getPhysicalNumberOfCells();

		short lnc = row.getLastCellNum();

		String data[][] = new String[lnr][lnc];// 8 2

		for (int i = 1; i < nor; i++) {

			Row eachRow = sheet1.getRow(i);

			for (int j = 0; j < noc; j++) {

				Cell cell = eachRow.getCell(j);

				//System.out.println(cell);
				
				DataFormatter dft = new DataFormatter();
				
				String value = dft.formatCellValue(cell);
				
				data[i-1][j]=value;  // 1 0

			}

		}
		
		return data;

	}

}
