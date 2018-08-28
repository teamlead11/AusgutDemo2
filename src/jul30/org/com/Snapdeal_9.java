package jul30.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal_9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");

//to maximize
		
		driver.manage().window().maximize();
		
		WebElement All_Offers_link = driver.findElement(By.xpath("//span[text()='All Offers']"));
		Actions act=new Actions(driver);
		act.moveToElement(All_Offers_link).perform();
		
		Thread.sleep(1000);
		WebElement Sun_Glasses_Link = driver.findElement(By.xpath("//span[text()='Sunscreens']"));
		act.moveToElement(Sun_Glasses_Link).perform();
		Sun_Glasses_Link.click();
		
		WebElement Pincode_txtbox = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
		Pincode_txtbox.sendKeys("638009");
		
		WebElement check_link = driver.findElement(By.xpath("//button[@class='pincode-check']"));
		check_link.click();
		
	}

}
