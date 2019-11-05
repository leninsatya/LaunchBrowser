package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public void xPathLocators() {

	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LaunchingBrowser\\driver\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	driver.manage().window().maximize();
	
	WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	firstName.sendKeys("sathya");
	
	WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	lastName.sendKeys("lenin");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	address.sendKeys("chennai");
	
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("esathyalenin@gmail.com");
	
	WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
	phone.sendKeys("9092994667");
	
	WebElement passwordSet = driver.findElement(By.xpath("//input[@id='firstpassword']"));
	passwordSet.sendKeys("qwerty");
	
	WebElement passwordConfirm = driver.findElement(By.xpath("//input[@id='secondpassword']"));
	passwordConfirm.sendKeys("qwerty");
	
	WebElement signIn = driver.findElement(By.xpath("//button[@type='submit']"));
	signIn.click();
	
	}
	public static void main(String[] args) {
		XPath x = new XPath();
		x.xPathLocators();
		
	}
}
