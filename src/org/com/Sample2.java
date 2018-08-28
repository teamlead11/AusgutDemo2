package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/Hotelapp/");

//to maximize
		driver.manage().window().maximize();
		
		//to find the locator of Username and insert the values
		WebElement FirstName=driver.findElement(By.id("username"));
		FirstName.sendKeys("Saro");
		
//to find the locator of Password and insert the values
		WebElement LastName=driver.findElement(By.id("password"));
		LastName.sendKeys("123456");

	}

}
