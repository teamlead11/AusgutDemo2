package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Configure webdriver,launch browser and load url
		//to set the path of the driver for the respective browser you will need the system.setProperty.
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// to maximize
		driver.manage().window().maximize();

		// to find the locator of Username and insert the values
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='u_0_j']"));
		FirstName.sendKeys("Saro");

		// to find the locator of Surname and insert the values
		WebElement Surname = driver.findElement(By.xpath("//input[@id='u_0_l']"));
		Surname.sendKeys("Bhaskar");

		// to find the locator of Mobileno and insert the values
		WebElement Mobileno = driver.findElement(By.id("u_0_o"));
		// WebElement Mobileno=driver.findElement(By.name("reg_email__"));
		//WebElement Mobileno=driver.findElement(By.xpath("input[@id='u_0_o']"));
		Mobileno.sendKeys("123456789");

		// to find the locator of Password and insert the values
		WebElement Password = driver.findElement(By.id("u_0_v"));
		Password.sendKeys("123456");

		// to find the locator of birthday and insert the values
		// WebElement bdaydropdwn=driver.findElement(By.xpath("//input[@value='21']"));
		WebElement bdaydropdwn = driver.findElement(By.name("birthday_day"));
		bdaydropdwn.sendKeys("21");
		WebElement bmonthdropdwn=driver.findElement(By.name("birthday_month"));
		bmonthdropdwn.sendKeys("Feb"); 
		WebElement byeardropdwn=driver.findElement(By.name("birthday_year"));
		byeardropdwn.sendKeys("1985");
		 
		// to find the locator of remote button and insert the values
		WebElement Rem_btn = driver.findElement(By.xpath("//input[@value='1']"));
		Rem_btn.click();
		
		// to find the locator of Signin button and click
		WebElement SignUp_btn = driver.findElement(By.id("u_0_11"));
		SignUp_btn.click();

	}

}
