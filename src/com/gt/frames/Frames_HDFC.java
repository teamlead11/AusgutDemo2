package com.gt.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_HDFC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

	//to maximize
		driver.manage().window().maximize();
		List<WebElement> emp=driver.findElements(By.tagName("iframe"));
		System.out.println(emp.size());
	
		driver.switchTo().frame("login_page");
		WebElement id_btn=driver.findElement(By.name("fldLoginUserId"));
		id_btn.sendKeys("Saro123");
		
		//Thread.sleep(6000);
		WebElement Continue_btn=driver.findElement(By.xpath("//img[@alt='continue']"));
		Continue_btn.click();
		
		WebElement Pwd_btn=driver.findElement(By.name("fldPassword"));
		Pwd_btn.sendKeys("123456");
		
		WebElement Login_link=driver.findElement(By.xpath("//img[@alt='Login']"));
		Login_link.click();
		
		
	}

}
