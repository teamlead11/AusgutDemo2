package jul30.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");

//to maximize
		driver.manage().window().maximize();
		
		WebElement Electronics_btn = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(Electronics_btn).perform();
		
		WebElement Cooler_btn = driver.findElement(By.xpath("//span[text()='Coolers']"));
		act.moveToElement(Cooler_btn).perform();
		Cooler_btn.click();
		
		WebElement Pincode_txtbox = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
		//Pincode_txtbox.click();
		Pincode_txtbox.sendKeys("638009");
		
		WebElement check_link = driver.findElement(By.xpath("//button[@class='pincode-check']"));
		check_link.click();
		
		
	}

}
