package jul30.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");

//to maximize
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement Close_btn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		Close_btn.click();
		
		Thread.sleep(1000);
/*		//(li[@class='Wbt_B2 _1YVU3_'])[1]
 * 		//span[@class='_1QZ6fC _3Lgyp8'][1]
		//span[text()='Electronics']
		//WebElement Electronics_btn = driver.findElement(By.xpath("//(span[@class='_1QZ6fC _3Lgyp8'])[1]"));
		 *WebElement Electronics_btn = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/span"));
		//span[@class='_1QZ6fC _3Lgyp8'][1]*/
		
		WebElement Electronics_btn = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(Electronics_btn).perform();
		
		WebElement Mob_case_btn = driver.findElement(By.xpath("//a[text()='Mobile Cases']"));
		act.moveToElement(Mob_case_btn).perform();
		Mob_case_btn.click();
		
		WebElement Cover1_btn = driver.findElement(By.xpath("//a[@title='Flipkart SmartBuy Back Cover for Infinix Hot 6 Pro']"));
		Cover1_btn.click();
		
		
		

		
		
		
	}

}
