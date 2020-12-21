package datadriventest;//SDET

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
	File src=new File("C:\\Users\\User\\Desktop\\test data excel\\test data 1.xlsx");
		FileInputStream fis=new FileInputStream(src);  // // getting data from excel sheet
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);   // get workbook instance for XLS file
		
		XSSFSheet sheet=wb.getSheetAt(0);  // Providing sheet name or index 1st test data  
		
		int rowcount=sheet.getLastRowNum();   // return  row count
		System.out.println("THE ROW COUNT IS:"+rowcount);
		
		int colcount=sheet.getRow(0).getLastCellNum();  // return  column count 
		System.out.println("THE coloumn COUNT IS:"+colcount); 
		
		for(int i=0;i<=rowcount;i++)
		{
		   XSSFRow currentrow=sheet.getRow(i);  //Focused on current row
		  
		
		   for(int j=0;j<=colcount;j++)
		    {
			  String value=currentrow.getCell(j).toString();  // read the value from cell
			  System.out.print(""+value);
		     }	
		   System.out.println();
		}
		
	wb.close();
		
			
			
			
			
			
			
		
		
		

	}

}
