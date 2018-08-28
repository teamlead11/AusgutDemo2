package com.gt.Aug24_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/");
		
		//Thread.sleep(2000);
		WebElement Testing_ST=driver.findElement(By.id("java_technologies"));
		System.out.println(Testing_ST.getText());
		
		/*WebElement QTP=driver.findElement(By.xpath("//a[@title='QTP (Quick Test Professional)']"));
		System.out.println(QTP.getText());
		
		WebElement Selenium=driver.findElement(By.xpath("//a[@title='Learn Selenium']"));
		System.out.println(Selenium.getText());
		
		WebElement Mobile=driver.findElement(By.xpath("//a[@title='Learn Mobile App Testing']"));
		System.out.println(Mobile.getText());
		
		WebElement Cucum=driver.findElement(By.xpath("//a[@title='Learn Cucumber Testing']"));
		System.out.println(Cucum.getText());
		
		WebElement Soap=driver.findElement(By.xpath("//a[@title='Learn SoapUI']"));
		System.out.println(Soap.getText());
		
		WebElement Agile=driver.findElement(By.xpath("//a[@title='Learn Agile Testing']"));
		System.out.println(Agile.getText());
		
		WebElement JUnit=driver.findElement(By.xpath("//a[@title='Learn JUnit Tutorial']"));
		System.out.println(JUnit.getText());*/
		
	}

}
