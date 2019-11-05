package org.laun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public void chromeLaunch() {

	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\LaunchingBrowser\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.quit();
}
public static void main(String[] args) {
	LaunchBrowser l = new LaunchBrowser();
    l.chromeLaunch();
}

}
