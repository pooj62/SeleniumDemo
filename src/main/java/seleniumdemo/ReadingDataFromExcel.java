package seleniumdemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		//excel file->workbook->sheet->row->cells

		 String filePath = (System.getProperty("user.dir")+"\\TestData\\Selenium.xlsx");

	        // Open the file using FileInputStream
	        FileInputStream file = new FileInputStream(filePath);

	        XSSFWorkbook workbook = new XSSFWorkbook(file);

	        XSSFSheet sheet = workbook.getSheet("sheet1");

	        int totalrows = sheet.getLastRowNum();

	        int totalCells = sheet.getRow(0).getLastCellNum();

	        System.out.println("Number of rows :"+ totalrows);

	        System.out.println("Number of column:"+totalCells);

	        for (int r = 0; r <= totalrows; r++) {

	            XSSFRow currentRow = sheet.getRow(r);

	            // Check if the row is null (it might be empty)
	            if (currentRow != null) {
	                // Loop through cells
	                for (int c = 0; c < totalCells; c++) {

	                    XSSFCell cell = currentRow.getCell(c);

	                    // Check if the cell is null
	                    if (cell != null) {
	                        System.out.print(cell.toString()+  "\t");
	                    } else {
	                        System.out.print("Empty cell\t");
	                    }
	                }
	            } 	else {
	                System.out.println("Empty row");
	            }
	            	System.out.println();
	        }

	        workbook.close();
	        file.close();
	}
}
