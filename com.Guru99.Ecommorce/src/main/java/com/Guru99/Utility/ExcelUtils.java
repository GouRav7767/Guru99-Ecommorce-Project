package com.Guru99.Utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
	FileInputStream fis;
	Workbook wb;
	Sheet sh;
	Cell c;
	
	public String getCellData(String filepath, String name, int row, int colm ) {
		DataFormatter df = new DataFormatter();
		
		try {
			fis =new FileInputStream(filepath);
			wb = WorkbookFactory.create(fis);
			} catch (Exception e) {
				
		e.printStackTrace();
		}
		sh = wb.getSheet(name);
		c = sh.getRow(row).getCell(colm);
		
		return df.formatCellValue(c);
		
		
	}
	
	
	 
}
