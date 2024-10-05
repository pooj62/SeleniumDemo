package seleniumdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WriteDynamicExcelData {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\dynamicwritedata.xlsx");

		XSSFWorkbook workbook= new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("Dynamic Data");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter How many rows");
		int noofrows=scanner.nextInt();

		System.out.println("Enter How many colums");
		int noofcells = scanner.nextInt();
		
		//row started from 0
		for(int r=0;r<noofrows;r++) {
			
			XSSFRow currentRow = sheet.createRow(r);
			//create xssf row 
			for(int c=0; c<noofcells;c++) {
				
				XSSFCell cell =currentRow.createCell(c);
				cell.setCellValue(scanner.next());
			}
			
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created----");

	}

}
