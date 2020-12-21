package seleniumintroprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");  
		WebDriver driver =new ChromeDriver();    //  Invoke browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/");  //open url
		
		driver.manage().window().maximize();   // maximize url
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");    // find element put username
	
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");  // find element put password

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();  //  click on login button
		
		String exptitle ="OrangeHRM";
		String acttitle = driver.getTitle();
		if (exptitle.equals(acttitle))
		{
		     System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is failed");
			
		}
		driver.close();
				

	}

}
