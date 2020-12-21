package datadriventest;//SDET

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculationTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator"
				+ "-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		FileInputStream file=new FileInputStream("C:\\Users\\User\\Desktop\\test data excel\\test data 2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++)     // fetch data from excel sheet
		{
			XSSFRow row=sheet.getRow(i);
			
			XSSFCell princeplecell=row.getCell(0);   // row values changes by loop and cell number putting manually.
			int princ=(int)princeplecell.getNumericCellValue();
	        System.out.println(""+princ);
	        
			XSSFCell roi=row.getCell(1);
			int RateofInterest=(int)roi.getNumericCellValue();
			
			
			XSSFCell period1=row.getCell(2);
			int period=(int)period1.getNumericCellValue();
			
			XSSFCell Freq=row.getCell(3);
			String frequency=Freq.getStringCellValue();
			
			XSSFCell MaturityValue=row.getCell(4);
			int Exp_mvalue =(int)MaturityValue.getNumericCellValue();
			
			
		
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String.valueOf(""+princ));
			
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(String.valueOf(""+RateofInterest));
		
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(String.valueOf(""+period));
			
			Select peroidcombo=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			peroidcombo.selectByValue("1");
			
			Select frequencybo=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			frequencybo.selectByValue("0");
			
			
			driver.findElement(By.xpath("//body/div[@id='mc_mainWrapper']/div[2]/div[1]/div[5]/div[1]"
					+ "/div[1]/div[3]/form[1]/div[2]/a[1]/img[1]")).click();
			
			String actual_mvalue=driver.findElement(By.xpath("//body/div[@id='mc_mainWrapper']/div[2]/div[1]/div[5]/div[1]/div"
					+ "[1]/div[4]/div[1]/div[2]/span[2]/strong[1]")).getText();
			
			if((Double.parseDouble(actual_mvalue))==Exp_mvalue)
			{
				System.out.println("Test Pass");
			}
			else
			{
				System.out.println("Test is Fail");
			}
			driver.findElement(By.xpath("//body/div[@id='mc_mainWrapper']/div[2]/div[1]/div[5]/div[1]/div[1]"
					+ "/div[3]/form[1]/div[2]/a[2]/img[1]")).click();  
		}
		
		
		
		

	}

}

