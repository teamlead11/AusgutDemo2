package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		//to maximize
		driver.manage().window().maximize();
		
		// to find the locator of textbox and insert the values
		WebElement FirstName = driver.findElement(By.id("twotabsearchtextbox"));
		FirstName.sendKeys("IphoneX");
		
		// to find the locator of search button and insert the values
		//WebElement Rem_btn = driver.findElement(By.class("nav-input"));
		WebElement Search_btn = driver.findElement(By.xpath("//input[@value='Go']"));
		Search_btn.click();

		// to find the locator of ApplePhoneX button and click
		WebElement AppleIphoneX1 = driver.findElement(By.xpath("//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal']"));
		AppleIphoneX1.click();
	}

}
