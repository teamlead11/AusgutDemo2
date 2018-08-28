package gitpack1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasad\\eclipse-workspace\\AusgutDemo2\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement d=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		d.click();
		WebElement w=driver.findElement(By.className("LM6RPg"));
		w.sendKeys("iphone x");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
		
		List<WebElement> elements = driver.findElements(By.className("_1UoZlX"));
		elements.get(4).click();
		
		String parent=driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String s:child) {
			if(!parent.equals(s)) {
				driver.switchTo().window(s);
			}
		}
		
		WebElement t=driver.findElement(By.className("_3X4tVa"));
		t.sendKeys("600097");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		
		WebElement e=driver.findElement(By.className("_3oJBMI"));
		e.click();
		
		
		
		
		
		
	}

}
