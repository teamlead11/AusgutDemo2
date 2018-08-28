package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Vel_11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

		//to maximize
		driver.manage().window().maximize();
		
		// to find the locator of textbox and insert the values
		WebElement txtbox = driver.findElement(By.id("lst-ib"));
		txtbox.sendKeys("greens Velmurugan");
		Thread.sleep(1000);
		
		// to find the locator of search and insert the values
		WebElement search = driver.findElement(By.name("btnK"));
		//WebElement search = driver.findElement(By.xpath("//input[@name='btnK']"));
		search.click();
		
		// to find the locator of selenium link and click
		WebElement sel_link = driver.findElement(By.xpath("//a[@href='http://www.greenstechnologys.com/selenium-course-content.html\']"));
		sel_link.click();
	}

}
