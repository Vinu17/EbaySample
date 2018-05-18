package com.mob.ebaySample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputFile {
	
	@SuppressWarnings("resource")
	public Object[][] readExcel() throws IOException{
		Object[][] obj = new Object[10][10];
		//Create an object of File class to open xlsx file
	    File file = new File("DataSheet.xlsx");

	    //Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook wb = null;

	    wb = new XSSFWorkbook(inputStream);
	    
	    //Read sheet inside the workbook by its name
	    Sheet sh = wb.getSheetAt(0);

	    //Find number of rows in excel file
	    int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it
	    for (int i = 0; i < rowCount+1; i++) {
	        Row row = sh.getRow(i);
	        //Create a loop to print cell values in a row
	        for (int j = 0; j < row.getLastCellNum(); j++) {
	            obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
	        }
	        System.out.println();
	    }
		return obj;
	}

}
