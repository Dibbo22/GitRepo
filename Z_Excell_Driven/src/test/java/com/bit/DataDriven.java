package com.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("/Users/sanchitapodder/Desktop/DemoData.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		int sheetNum=workbook.getNumberOfSheets();
		for(int i=0;i<sheetNum;i++) {
		 if(workbook.getSheetName(i).equals("TestData")) {
			// sheet is collection of rows
			  XSSFSheet sheet= workbook.getSheetAt(i);
			  Iterator<Row> rows=sheet.iterator();
			  Row ro=rows.next();
			  Iterator<Cell> ce=ro.cellIterator();
			  
			 int k=0;
			 int colloum =0;
			  
			while(ce.hasNext()) {
			  
				Cell celValue=ce.next();
				
				if(celValue.getStringCellValue().equals("Data2")){
					
				colloum=k;
				}
				k++;
			}
			  System.out.println(colloum);
				}
			
			
		}

	}

}
