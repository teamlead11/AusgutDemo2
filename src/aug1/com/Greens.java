package aug1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");

//to maximize
		driver.manage().window().maximize();
		Actions Act=new Actions(driver);
		
		WebElement Courses_Link = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Act.moveToElement(Courses_Link).perform();
		
		WebElement STest_Link = driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
		Act.moveToElement(STest_Link).perform();
		
		//Thread.sleep(2000);
		WebElement Selenium_Link = driver.findElement(By.xpath("//span[text()='Selenium']"));
		Act.moveToElement(Selenium_Link).perform();
		Selenium_Link.click();
		
		WebElement Testimonial1 = driver.findElement(By.xpath("//span[@class='testimonial-content']"));
		String Content1=Testimonial1.getText();
		System.out.println(Content1);
	}

}
