package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		//to maximize
		driver.manage().window().maximize();
			
		//to find the locator of EmailID and insert the values
		WebElement id=driver.findElement(By.xpath("//input[@class='_2zrpKA']"));
		id.sendKeys("j.saro@gmail.com");
		
		//to find the locator of password and insert the values
		WebElement pwd=driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']"));
		pwd.sendKeys("Saro123456");
		
		//to find the locator of submit button and click
		WebElement submit=driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		submit.click();
		
	}

}
