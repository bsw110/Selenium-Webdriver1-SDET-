package seleniumintroprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogindemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated meth	
		
		driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("shailesh");
		
		driver.findElement(By.name("pass")).sendKeys("123");
		driver.findElement(By.name("login")).click();
	}

}
