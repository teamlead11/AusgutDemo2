package com.gt.windows;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class lvb_1 {
	public static void main(String[] args) throws InterruptedException, AWTException {

	System.setProperty("webdriver.chrome.driver","Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
	
	//WebElement Reset_link=driver.findElement(By.xpath("//a[@class='link3a'][0]"));
	//a[@class='link3a'][2]
		//WebElement Reset_link=driver.findElement(By.xpath("//a[contains(text()='Reset')]"));
	//WebElement Reset_link=driver.findElement(By.xpath("//a[contains(text(),'Login Password')])"));
	WebElement Reset_link=driver.findElement(By.xpath("//table[@id='Table10']"));
	Reset_link.click();
	
	String ParentID=driver.getWindowHandle();
	System.out.println(ParentID);
	
	Set<String> AllwindowsID=driver.getWindowHandles();
	System.out.println(AllwindowsID);
	
	for (String x : AllwindowsID) {
		if(!ParentID.equals(x)) {
			driver.switchTo().window(x);
		}
	}
	WebElement ResetLogin_link=driver.findElement(By.xpath("//a[text()='Reset Login password']"));
	ResetLogin_link.click();
	
	Set<String> AllwindowsID1=driver.getWindowHandles();
	System.out.println(AllwindowsID1);
	
	for (String x : AllwindowsID1) {
		if(!ParentID.equals(x)) {
			driver.switchTo().window(x);
		}
	}
	
	WebElement ResetLoginPwd_link=driver.findElement(By.id("fldUId"));
	ResetLoginPwd_link.sendKeys("12345");
	
	WebElement Submit=driver.findElement(By.xpath("//a[@onclick='return userSubmit();']"));
	Submit.click();
	
	WebElement EnterOTP_txtbox=driver.findElement(By.name("fldOTP1"));
	EnterOTP_txtbox.sendKeys("12345");
	
	WebElement Submit1=driver.findElement(By.id("fldSubmit"));
	Submit1.click();
	
	
/*	for(int i=0;i<=4;i++) {
	rob.keyPress(KeyEvent.VK_TAB);
	rob.keyRelease(KeyEvent.VK_TAB);
	}
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyPress(KeyEvent.VK_ENTER);*/
	
	}
}
