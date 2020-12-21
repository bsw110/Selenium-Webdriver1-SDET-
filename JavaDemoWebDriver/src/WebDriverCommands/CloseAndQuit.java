package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Browser Commands
 * close()
 * quit()
 */

public class CloseAndQuit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
        
        
         //driver.close();  // close the window
           driver.quit();  //  close all the window which open by url pop and other also
        
        
        
	}

}
