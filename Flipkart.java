package com.gt.Aug24_Assign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");

//to maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Close_btn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		Close_btn.click();
		
		WebElement Search=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		Search.sendKeys("Iphone");
		Search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		List<WebElement> Product1=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	if(!Product1.isEmpty()) {
		//System.out.println(Product1.get(4));
		Product1.get(4).click();
	}
	else
	{
		System.out.println("No items available!");
	}
	}
			
	}
