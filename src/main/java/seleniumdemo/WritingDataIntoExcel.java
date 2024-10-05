package seleniumdemo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {

		//excel file->workbook->sheet->row->cells

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\TestData\\myfile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("Data");

		XSSFRow row1= sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(1234);
		row1.createCell(2).setCellValue("Automation1");

		XSSFRow row2= sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(2345);
		row2.createCell(2).setCellValue("Automation2");

		XSSFRow row3= sheet.createRow(2);
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue(3456);
		row3.createCell(2).setCellValue("Automation3");

		XSSFRow row4= sheet.createRow(3);
		row4.createCell(0).setCellValue("Php");
		row4.createCell(1).setCellValue(4567);
		row4.createCell(2).setCellValue("Automation4");

		XSSFRow row5= sheet.createRow(4);
		row5.createCell(0).setCellValue("Ruby");
		row5.createCell(1).setCellValue(5678);
		row5.createCell(2).setCellValue("Automation5");

		workbook.write(file);
		workbook.close();
		file.close();

		System.out.println("File is created----");
	}


}
