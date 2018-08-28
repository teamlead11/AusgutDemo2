package com.gt.scroll;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");

	//to maximize
		//driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		driver.manage().window().setPosition(new Point(4,9));
		System.out.println("Done");
		//Thread.sleep(8000);
		/*WebElement Sub_link=driver.findElement(By.xpath("//a[text()='Subscribe in a reader']"));

	//Scroll using Javascript executor js.execute script("arguments[0].scrollIntoView(true)", )
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", Sub_link);
		Sub_link.click();*/
		
	//Scroll using Robot class 
/*		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);*/
		
	//Scroll using Javascript js.executescript("scroll(0,123);")	
		//Scroll down
/*		js.executeScript("scroll(0, 950)");
		
		//Scroll up
		js.executeScript("scroll(0, -950)");*/
	}

}
