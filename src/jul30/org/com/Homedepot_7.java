package jul30.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homedepot_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");

//to maximize
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement All_dep_btn = driver.findElement(By.xpath("//a[@data-id='departmentsFlyout']"));
		Actions act=new Actions(driver);
		act.moveToElement(All_dep_btn).perform();
		
		Thread.sleep(500);
		WebElement Hardware = driver.findElement(By.xpath("//a[@href='//www.homedepot.com/b/Hardware/N-5yc1vZc21m']"));
		act.moveToElement(Hardware).perform();
		
		Thread.sleep(500);
		WebElement GateHardware = driver.findElement(By.xpath("//a[@title='Gate Hardware']"));
		act.moveToElement(GateHardware).perform();
		
		Thread.sleep(500);
		WebElement ViewAllGAte = driver.findElement(By.xpath("//a[@title='View All Gate Hardware']"));
		act.moveToElement(ViewAllGAte).perform();
		ViewAllGAte.click();
		
		Thread.sleep(500);
		WebElement Pickup = driver.findElement(By.xpath("//div[@class='checkbox-btn__label']"));
		Pickup.click();

		
		
	}

}
