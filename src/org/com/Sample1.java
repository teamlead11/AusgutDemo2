package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Configure webdriver,launch browser and load url
				System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.demoqa.com/registration/");

		//to maximize
				driver.manage().window().maximize();
				
		//to find the locator of FirstName and insert the values
				WebElement FirstName=driver.findElement(By.id("name_3_firstname"));
				FirstName.sendKeys("Saro");
				
		//to find the locator of LastName and insert the values
				WebElement LastName=driver.findElement(By.id("name_3_lastname"));
				LastName.sendKeys("123456");
				
		//to find the locator of Phoneno and insert the values
				WebElement Phoneno=driver.findElement(By.id("phone_9"));
				Phoneno.sendKeys("4567678912");
				
		//to find the locator of Username and insert the values
				WebElement Username=driver.findElement(By.id("username"));
				Username.sendKeys("Saradha");
				
		//to find the locator of Email and insert the values
				WebElement Email=driver.findElement(By.id("email_1"));
				Email.sendKeys("j.saro@gmail.com");
				
		//to find the locator of About and insert the values
				WebElement About=driver.findElement(By.id("description"));
				About.sendKeys("My name is Saro. I love reading.");
				
		//to find the locator of Password and insert the values
				WebElement Password=driver.findElement(By.id("password_2"));
				Password.sendKeys("@@@12345***");
				
		//to find the locator of ConfirmPwd and insert the values
				WebElement ConfirmPwd=driver.findElement(By.id("confirm_password_password_2"));
				ConfirmPwd.sendKeys("@@@12345***");
	}

}
