package Ashwil_mavenGroup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashwil\\Desktop\\MyTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int testnum = workbook.getSheet("Sheet1").getRow(1).getLastCellNum();
		System.out.println(testnum);
		
		if(workbook.getSheetName(0).equalsIgnoreCase("sheet1")){
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			Iterator<Row> exRows = sheet.iterator();
					
			System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
			Row firstRow = exRows.next();
			Iterator<Cell> exCell = firstRow.cellIterator();
			Cell strValue;
			while(exCell.hasNext()) {
				
				strValue = exCell.next();
				if (strValue.getStringCellValue().equalsIgnoreCase("testcases")) {
					System.out.println("Column : " + strValue.getStringCellValue());
				}
				
			}
			
		}			
		
		workbook.close();
	}

}
