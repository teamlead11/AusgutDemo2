package org.train.testgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kous\\eclipse-workspace\\gayu\\Greens Training\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.guru99.com/");
	    driver.manage().window().maximize();
	    
	    WebElement lnk=driver.findElement(By.id("java_technologies"));
	    String name=lnk.getText();
	    System.out.println(name);

        
       
	}


}
