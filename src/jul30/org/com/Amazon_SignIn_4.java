package jul30.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_SignIn_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

//to maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Hello_btn = driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
		Actions act=new Actions(driver);
		act.moveToElement(Hello_btn).perform();
		
		WebElement SignIn_btn = driver.findElement(By.xpath("//span[text()='Sign in']"));
		act.moveToElement(SignIn_btn).perform();
		SignIn_btn.click();
		
		WebElement LoginIn_btn = driver.findElement(By.id("ap_email"));
		LoginIn_btn.sendKeys("Saro@gmail.com");
		
		WebElement Continue_btn = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue_btn.click();
		
		
		
	}

}
