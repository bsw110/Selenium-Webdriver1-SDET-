package datadriventest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RDFE {

	public static void main(String[] args) throws Exception {
		
		File src=new File("C:\\Users\\User\\Desktop\\test data excel\\test data 1.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowcount =sheet1.getLastRowNum();
		System.out.println("total row count "+rowcount);
		
		int colcount =sheet1.getRow(0).getLastCellNum();
		System.out.println("total coloumn count "+colcount);
	
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<=colcount;j++)
			{	
			String data0=sheet1.getRow(i).getCell(j).toString();
			System.out.println("test data from excel is "+data0);
			}
		}
		
	}

}
