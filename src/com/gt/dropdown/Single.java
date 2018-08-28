package com.gt.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/registration/");

	//to maximize
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.id("dropdown_7"));
		Select s=new Select(country);
				
		List<WebElement> all_options=s.getOptions();
		//Using Get text
/*		for(int i=0;i<all_options.size();i++) {
			String name=all_options.get(i).getText();
			System.out.println(name);*/
			
		//Using get attribute("value")	
		for (WebElement x : all_options) {
				System.out.println(x.getAttribute("value"));
				
		/*WebElement a= s.getFirstSelectedOption();
				System.out.println(a);*/
			}
		}

	}


