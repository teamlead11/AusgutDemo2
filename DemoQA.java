package com.gt.Aug24_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoqa.com/registration");

		//to maximize
		driver.manage().window().maximize();
		
		// to find the locator of country and insert the values
		WebElement dropdwn1 = driver.findElement(By.xpath("//select[@id='dropdown_7']"));
		Select s=new Select(dropdwn1);
		String s1=s.getFirstSelectedOption().getText();
		String s2="Afghanistan";
		if(s1.equals(s2)) {
			System.out.println("Pass");
		}
		else
		{
				System.out.println("Fail");
			}
		}
		
		
	}

