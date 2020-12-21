package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Get Commands
 * get()
 * getTitle()
 * getPageSource()
 * getCurrentUrl()
 * getText()
 */


public class GetCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // open url of the page
		
		System.out.println("Title of the page:"+driver.getTitle()); // return title of page
		//Syestem.out.println(driver.getTitle());
		
		System.out.println("current url of the page:"+driver.getCurrentUrl());// Returns current url of page
		// System.out.println(driver.getCurrentUrl());
		
		String Text=driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[2]/span[1]")).getText();
		System.out.println(Text);
		
		//driver.close(); // close current window
		
		driver.quit();  // close multiple window
		
	}

}
