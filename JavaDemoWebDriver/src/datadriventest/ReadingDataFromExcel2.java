package datadriventest;// MUKESHOTWANI

import java.io.File;
import java.io.FileInputStream;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel2 {

	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Users\\User\\Desktop\\test data excel\\test data 1.xlsx");
		
		FileInputStream fis=new FileInputStream(src);  // getting data from excel sheet
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);  // get wrokbook instance for XLS file
		
		XSSFSheet sheet1=wb.getSheetAt(0); // get the first sheet from workbook  
		
		String data1=sheet1.getRow(1).getCell(1).getStringCellValue();  
		System.out.println("data from excel is "+data1);
		
		String data2=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("data from excel is "+data2);
		
		
		
		wb.close();

	}

}
