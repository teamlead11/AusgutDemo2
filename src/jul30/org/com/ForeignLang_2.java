package jul30.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ForeignLang_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Configure webdriver,launch browser and load url
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");

//to maximize
		driver.manage().window().maximize();
		
		WebElement Courses_btn = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions act=new Actions(driver);
		act.moveToElement(Courses_btn).perform();
		
		WebElement ForeignLang_btn = driver.findElement(By.xpath("//span[text()='Foreign Languages']"));
		act.moveToElement(ForeignLang_btn).perform();
		
		WebElement GremanLang_btn = driver.findElement(By.xpath("//span[text()='German']"));
		act.moveToElement(GremanLang_btn).perform();
		GremanLang_btn.click();

	}

}
