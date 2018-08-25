package org.train.testgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kous\\eclipse-workspace\\gayu\\Greens Training\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/registration/");
	    driver.manage().window().maximize();
	    WebElement country=driver.findElement(By.id("dropdown_7"));
	    String w1=country.getText();
	    String w2="Afghanistan";
	    if(!w1.equals(w2)) {
	    	System.out.println("pass");
	    	
	    }else {
	    	System.out.println("fail");
	    }
	    

	}


}
