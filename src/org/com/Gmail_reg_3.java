package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_reg_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Configure webdriver,launch browser and load url
		//to set the path of the driver for the respective browser you will need the system.setProperty.
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

		//to maximize
		driver.manage().window().maximize();
		
		//to find the locator of FirstName and insert the values
		WebElement FirstName = driver.findElement(By.id("firstName"));
		FirstName.sendKeys("Saro123456");
		
		//to find the locator of LastName and insert the values
		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("123456");
		
		//to find the locator of UserName and insert the values
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("saro81153");
		
		//to find the locator of Password and click
		WebElement Pwd_btn = driver.findElement(By.xpath("//input[@name='Passwd']"));
		Pwd_btn.click();
		Pwd_btn.sendKeys("Saro123456789");
		
		//to find the locator of ConfirmPassword and insert the values
		WebElement Confirm_Pwd_btn = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		Confirm_Pwd_btn.click();
		Confirm_Pwd_btn.sendKeys("Saro123456789");
		
		//to find the locator of Next button and and click
		WebElement Next_btn = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		Next_btn.click();
		
		//to wait for 3000ms
		Thread.sleep(3000);
		
		//to find the locator of Phoneno and insert the values
		WebElement Phoneno = driver.findElement(By.id("phoneNumberId"));
		Phoneno.sendKeys("999444666");
		
		//to find the locator of Next button and and click
		WebElement Next_btn2 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		Next_btn2.click();
		
		}

}
