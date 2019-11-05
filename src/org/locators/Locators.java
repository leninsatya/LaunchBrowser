package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public void locatingElements() {

	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\LaunchingBrowser\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	WebElement userNameText = driver.findElement(By.name("email"));
	userNameText.sendKeys("earcslenin@gmail.com");
	
	WebElement passWordText = driver.findElement(By.name("pass"));
	passWordText.sendKeys("qwertyuiop12");
	
	WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
	loginButton.click();
}
public static void main(String[] args) {
	Locators l = new Locators();
	l.locatingElements();
}
}
