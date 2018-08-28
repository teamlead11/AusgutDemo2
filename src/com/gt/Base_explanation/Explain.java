package com.gt.Base_explanation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Explain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		WebDriver driver=b.launchbrowser("https://www.facebook.com/");
		
		WebElement UserName_btn = driver.findElement(By.id("email"));
		b.sendtext(UserName_btn,"GREENS");
		
		WebElement Password_btn = driver.findElement(By.id("pass"));
		b.sendtext(Password_btn,"GREENS");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
		b.btnclick(btnLogin);
		//b.quitbrowser(driver);
	
		
	}
	}


