package com.gt.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Paytm {

	public static void main(String args[]) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");

	//to maximize
		driver.manage().window().maximize();
		driver.manage().window().getPosition();
		driver.manage().window().setPosition(new Point(9,3));
		WebElement id_btn=driver.findElement(By.xpath("//div[@class='_3ac-']"));
		id_btn.click();
		
		Thread.sleep(3000);
		//WebElement webpage=driver.findElement(By.xpath("//iframe[contains(@src, '/v1/api/login')]"));
		//WebElement webpage=driver.findElement(By.xpath("//iframe[contains(text(), '/v1/api/login')]"));
		WebElement webpage=driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&amp;theme=mp-web')]"));
		//<iframe src="/v1/api/login?isIframe=true&amp;theme=mp-web"></iframe>
		driver.switchTo().frame(webpage);
  
		//Actions act=new Actions(driver);
		WebElement login=driver.findElement(By.id("input_0"));
		//act.contextClick().perform();
		login.sendKeys("Saro");
		//act.contextClick().perform();

		WebElement Pwd=driver.findElement(By.id("input_1"));
		Pwd.sendKeys("Saro");
		
		WebElement Proceed=driver.findElement(By.xpath("//span[@class=ng-scope']"));
		Proceed.click();
		
		Thread.sleep(3000);
		
			}

	}


