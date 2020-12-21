package headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHtmlUnitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("current url of the page:"+driver.getCurrentUrl());

	}

}
