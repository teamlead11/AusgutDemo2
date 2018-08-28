package com.gt.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");

	//to maximize
		driver.manage().window().maximize();
	
	//selecting drop down values
		WebElement Selenium=driver.findElement(By.id("selenium_commands"));
		Select s=new Select(Selenium);
		s.selectByIndex(0);
		s.selectByIndex(2);
		//s.selectByValue(arg0);
		s.selectByVisibleText("Navigation Commands");
		List <WebElement> se_op=s.getAllSelectedOptions();
		for (int i=0;i<se_op.size();i++) {
			System.out.println(se_op.get(i).getText());
		}
		boolean a=s.isMultiple();
		System.out.println(a);
		WebElement b=s.getFirstSelectedOption();
		System.out.println(b.getText());
		
		List<WebElement>all=s.getAllSelectedOptions();
		
		
		//s.deselectAll();
		//s.deselectByIndex(1);.
		
	/*//selecting drop down values using loop	-by index
		List <WebElement> all_options=s.getOptions();
		for (int i=0;i<all_options.size();i++) {
			s.selectByIndex(i);
		}
		
		//selecting drop down values using loop	-by get attribute
		for (int i=0;i<all_options.size();i++) {
			s.selectByValue(all_options.get(i).getAttribute("value"));
			
	//selecting drop down values using foreach loop	
		for (WebElement x : all_options) {
			s.selectByVisibleText(x.getText());
		}
		
		//selecting drop down values using loop	-by get attribute
		for (int i=0;i<all_options.size();i++) {
			s.selectByValue(all_options.get(i).getAttribute("value"));
		}*/
		
	}

}
