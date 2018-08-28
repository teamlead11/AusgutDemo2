package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_gettyimages_12 {

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
		txtbox.sendKeys("gettyimages.in");
		txtbox.sendKeys(Keys.ENTER);
		
		WebElement Getty_link = driver.findElement(By.xpath("//a[@href='https://www.gettyimages.in/']"));
		Getty_link.click();		
		
		WebElement Sign_In = driver.findElement(By.xpath("//span[text()='Sign In'][1]"));
		Sign_In.click();		

		WebElement Sign_In1 = driver.findElement(By.id("new_session_username"));
		Sign_In1.click();
		
		WebElement Pwd = driver.findElement(By.id("new_session_password"));
		Pwd.click();
		
		WebElement Sign_In2 = driver.findElement(By.id("sign_in"));
		Sign_In2.click();
		
		
		
		
		
	}

}
