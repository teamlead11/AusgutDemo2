package org.train.testgit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kous\\eclipse-workspace\\gayu\\Greens Training\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    WebElement btn=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	    btn.click();
	    WebElement srch=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	    srch.sendKeys("Iphone x");
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        
        Thread.sleep(2000);
	   // WebElement lnk=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
	   // lnk.click();
	    
	    List<WebElement> iphne = driver.findElements(By.xpath("//div[@class='_3wU53n']")); 
	    System.out.println(iphne.size());
	    iphne.get(4).click();
	    

	}


}
