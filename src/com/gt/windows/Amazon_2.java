package com.gt.windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

//to maximize
		driver.manage().window().maximize();
		
		WebElement Search_box = driver.findElement(By.id("twotabsearchtextbox"));
		Search_box.sendKeys("Iphone7");
		Search_box.sendKeys(Keys.ENTER);
		
		WebElement Iphone = driver.findElement(By.xpath("//h2[text()='Apple iPhone 7 (Black, 32GB)']"));
		Iphone.click();
		
		//Getting Parent window ID
		String ParentID=driver.getWindowHandle();
		//System.out.println(ParentID);
		
		Set<String> Allwindows=driver.getWindowHandles();
		//System.out.println(Allwindows);
		
		for (String x : Allwindows) {
			if(!ParentID.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		Thread.sleep(3000);
		WebElement Addtocart_btn = driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
		Addtocart_btn.click();
		
		Thread.sleep(3000);
		WebElement Amount = driver.findElement(By.xpath("//span[text()='49,999.00']"));
		String Price=Amount.getText();
	System.out.println(Price);
	}
	
	

}
