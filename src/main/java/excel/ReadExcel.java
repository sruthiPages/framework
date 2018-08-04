package excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadExcel {
	
	public Object[][] readExcel(String fileName) throws IOException   {
//	public static void main(String[] args) throws IOException {
		

		
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//XSSFWorkbook wBook = new XSSFWorkbook("./data/login.xlsx");
		//XSSFSheet sheet = wBook.getSheet("login");
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		int colNum = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowNum][colNum];
		for (int i=1; i<=rowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j=0; j<colNum; j++) {
				try {
					XSSFCell cell = row.getCell(j);
					data[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					data[i-1][j] = "";
				}
			}
		}
		wBook.close();
		return data;
	}

}
