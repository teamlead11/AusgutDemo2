package jul30.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

//to maximize
		driver.manage().window().maximize();
		WebElement Category_btn = driver.findElement(By.id("nav-shop"));
		Actions act=new Actions(driver);
		act.moveToElement(Category_btn).perform();
		
		WebElement Books_btn = driver.findElement(By.xpath("//span[@aria-label='Books']"));
		act.moveToElement(Books_btn).perform();
		
		WebElement AllBooks_btn = driver.findElement(By.xpath("//span[text()='All Books']"));
		act.moveToElement(AllBooks_btn).perform();
		AllBooks_btn.click();
	
	
	}

}
