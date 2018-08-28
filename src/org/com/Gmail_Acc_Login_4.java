package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Acc_Login_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		//to maximize
		driver.manage().window().maximize();
		
		//to find the locator of Email and insert the values
		WebElement Email = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
		Email.sendKeys("Saro123456");
		
		//to find the locator of Nextbtn and click
		WebElement Nextbtn = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		Nextbtn.click();
		
		//to wait for 3000ms
		Thread.sleep(3000);
		//to find the locator of Phoneno and insert the values
		WebElement Phoneno = driver.findElement(By.id("recoveryIdentifierId"));
		Phoneno.sendKeys("999666888");
		
		//to find the locator of Nextbtn and click
		WebElement Nextbtn1 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		Nextbtn1.click();
		
		//to wait for 2000ms
		Thread.sleep(2000);
		
		//to find the locator of FirstName and insert the values
		//WebElement FirstName = driver.findElement(By.id("firstName"));
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		FirstName.sendKeys("Saro123456");
		
		//to find the locator of LastName and insert the values
		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("Bhaskar");
		
		//to find the locator of Nextbtn and click
		WebElement Nextbtn2 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		Nextbtn2.click();
		
		//to quit the driver operations
		//driver.quit();
		
	}

}
