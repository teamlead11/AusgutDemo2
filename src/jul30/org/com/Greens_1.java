package jul30.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");

//to maximize
		driver.manage().window().maximize();
		
		WebElement Careers_btn = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions act=new Actions(driver);
		act.moveToElement(Careers_btn).perform();
		
		WebElement Stest=driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
		act.moveToElement(Stest).perform();
		
		WebElement Selenium=driver.findElement(By.xpath("//span[text()='Selenium']"));
		act.moveToElement(Selenium).perform();
		Selenium.click();
	}

}
