package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Locators
 * id              xpath                cssSelector      
 * Name            relative xpath       Tag and ID
 * LinkText        absolute xpath       Tag and Class
 *                                      Tag,Class and attribute 
 *                                      Inner Text
 *                                      Tag and attribute
 */

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement image=driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']"                  
		+ "/div[@id='divLogin']/div[@id='divLogo']/img[1]"));
		if(image.isDisplayed())
		{
			System.out.println("image is here");
		}
		else
		{
			System.out.println("image is not present");
		}
		WebElement username=driver.findElement(By.xpath("*//.@[id='txtUsername']"));
			

	}

}
