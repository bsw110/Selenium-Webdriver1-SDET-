package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeadLessFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver","C:\\Users\\User\\Downloads\\SOFTWARE\\new firefox exe\\Firefox Setup 46.0.exe");
		/*FirefoxOptions options=new FirefoxOptions();*/
		/*options.addArguments("headless");
		*/
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
