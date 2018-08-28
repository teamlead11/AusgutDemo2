package jul30.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		
//to maximize
		driver.manage().window().maximize();
		
		//body[@class='vanilla-modal']
		//div[@class='sprint-app']
		Thread.sleep(2000);
		WebElement Sprint_btn = driver.findElement(By.xpath("//span[text()='My Sprint']"));
		Actions act=new Actions(driver);
		act.moveToElement(Sprint_btn).perform();
		
		Thread.sleep(500);
		WebElement PayBill = driver.findElement(By.xpath("//a[text()='Pay bill']"));
		act.moveToElement(PayBill).perform();
		PayBill.click();
		
		Thread.sleep(2000);
/*		WebElement UserNme = driver.findElement(By.xpath("//input[@id='loginHeaderUsername']"));
		UserNme.sendKeys("Saro");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='loginHeaderPassword']"));
		Password.sendKeys("Saro1234");*/
		
		WebElement SignIn = driver.findElement(By.xpath("//button[@id='loginHeaderButton']"));
		SignIn.click();
		
		
	}

}
