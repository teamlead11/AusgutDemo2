package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens_Selenium_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");

		//to maximize
		driver.manage().window().maximize();
		
		// to find the locator of download link and click
		WebElement dwnld_btn = driver.findElement(By.xpath("//a[@data-target='#download']"));
		dwnld_btn.click();		

		// to find the locator of close button and click
		//WebElement close_btn = driver.findElement(By.xpath("//button[@class='btn btn-default"));
		//WebElement close_btn = driver.findElement(By.xpath("//button[@data-dismiss='modal']"));
		//WebElement close_btn = driver.findElement(By.xpath("//button[@class='close'][1]"));
		//close_btn.click();	

	}

}
