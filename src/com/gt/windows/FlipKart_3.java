package com.gt.windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");

//to maximize
		driver.manage().window().maximize();

	Thread.sleep(3000);
		WebElement close_btn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close_btn.click();
		
		WebElement Search_box = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		Search_box.sendKeys("Iphonex");
		Search_box.sendKeys(Keys.ENTER);
		
	Thread.sleep(3000);
		WebElement IphoneX_btn = driver.findElement(By.xpath("//div[@class='col col-7-12']"));
		IphoneX_btn.click();
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
		Thread.sleep(5000);
		WebElement Add_cart = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		Add_cart.click();

		//System.out.println(Allwindows);

		Thread.sleep(3000);
 //WebElement Price_btn = driver.findElement(By.xpath("//span[@class='pMSy0p XU9vZa']"));
	WebElement Price_btn = driver.findElement(By.xpath("//div[@class='hJYgKM']"));
	String Price=Price_btn.getText();
	System.out.println(Price);
	
	}
}
