package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Configure webdriver,launch browser and load url
				System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.greenstechnologys.com/");

		//to maximize
				driver.manage().window().maximize();
		
		//to find the locator of Hostel button and click		
				WebElement Hostel_btn = driver.findElement(By.xpath("//a[@href='food-plus-accommodation-greens-womens-hostel-adyar.html']"));
				Hostel_btn.click();		
				
	}

}
