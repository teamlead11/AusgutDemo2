package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//to maximize
		driver.manage().window().maximize();
		
		//to find the locator of username
		WebElement UserName=driver.findElement(By.id("email"));
		
		//to insert the values in username
		UserName.sendKeys("Saro");
		
		//to find the locator of password
		WebElement Password=driver.findElement(By.id("pass"));
		
		//to insert the values in password
		Password.sendKeys("123456");


	}

}
