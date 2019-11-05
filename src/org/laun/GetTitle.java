package org.laun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public void gettingTitle() {

	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\LaunchingBrowser\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);

}
public static void main(String[] args) {
	GetTitle g = new GetTitle();
	g.gettingTitle();
}
}
