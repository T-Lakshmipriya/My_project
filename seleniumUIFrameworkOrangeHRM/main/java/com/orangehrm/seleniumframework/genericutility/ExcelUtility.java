package com.orangehrm.seleniumframework.genericutility;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtility {	

		 Workbook wb;
		 Sheet sh;
		
		//load Excel
		public void loadExcelFile(String filepath,String sheetName) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(filepath);
	         wb = WorkbookFactory.create(fis);
	         sh = wb.getSheet(sheetName);
	         System.out.println();

		}

		public String getDataFromSingleCell(int rowNum, int cellNum) {

		    if (sh == null) {
		        return "";
		    }

		    if (sh.getRow(rowNum) == null) {
		        return "";
		    }

		    if (sh.getRow(rowNum).getCell(cellNum) == null) {
		        return "";
		    }

		    CellType data = sh.getRow(rowNum).getCell(cellNum).getCellType();

		    String value = "";

		    if (data == CellType.STRING) {
		        value = sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		    } 
		    else if (data == CellType.NUMERIC) {
		        value = String.valueOf((int) sh.getRow(rowNum).getCell(cellNum).getNumericCellValue());
		    }

		    return value;
		}
}