package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lakshmivilas_Bank_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");

//to maximize
		driver.manage().window().maximize();
		
		//to find the locator of Login button and insert the values
		WebElement login_btn = driver.findElement(By.id("fldLoginUserId"));
		login_btn.sendKeys("Saro123456");
		
		//to find the locator of Password button and insert the values
		WebElement Pwd_btn = driver.findElement(By.id("fldPassword"));
		Pwd_btn.sendKeys("Saro123456");
		
		//to find the locator of submit button and click
		WebElement submit_btn = driver.findElement(By.xpath("//input[@name='imageField']"));
		submit_btn.click();
		
		
	}

}
