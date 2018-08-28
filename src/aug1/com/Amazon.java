package aug1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

//to maximize
		driver.manage().window().maximize();
		
		WebElement Search_box = driver.findElement(By.id("twotabsearchtextbox"));
		Search_box.sendKeys("Iphone7");
		Search_box.sendKeys(Keys.ENTER);
		
	//WebElement Price = driver.findElement(By.xpath("//span[@class='a-size-base a-color-price s-price a-text-bold']"));
		WebElement Price = driver.findElement(By.xpath("//span[text()='49,990']"));
		//WebElement Price = driver.findElement(By.xpath("//span[@class='currencyINR']"));

		String Price_amt= Price.getText();
		System.out.println(Price_amt);
		
			
		
	}

}
