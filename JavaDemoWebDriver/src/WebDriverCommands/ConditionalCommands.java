package WebDriverCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Conditional commands
 * isDisplayed
 * isEnabled
 * isSelected
 */

public class ConditionalCommands {



	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass= driver.findElement(By.xpath("//input[@id='pass']"));
		
		if (email.isDisplayed() && email.isEnabled() )
		{
			email.sendKeys("shail123");
		}
		if (pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("admin123");
		}
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		
		//female
		System.out.println(driver.findElement(By.id("u_3_4")).isSelected());  //false
		//male
		System.out.println(driver.findElement(By.id("u_3_5")).isSelected());  //false
		
		//male
		if (driver.findElement(By.id("u_3_5")).isSelected()==false)
		{
			driver.findElement(By.id("u_3_5")).click();
		}
		

	}

}
