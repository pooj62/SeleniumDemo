package seleniumdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicExcelData {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\dynamicwritedata.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Dynamic Data");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many rows");
		
		int noofrows=scanner.nextInt();
		
		System.out.println("How many colums");
		
		int noofcolums = scanner.nextInt();

	}

}
