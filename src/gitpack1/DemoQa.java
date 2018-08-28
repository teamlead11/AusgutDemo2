package gitpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		driver.manage().window().maximize();
		WebElement web = driver.findElement(By.id("dropdown_7"));
		Select s= new Select(web);
		String w1 = s.getFirstSelectedOption().getText();
		String w2="Afghanistan";
		if (w1.equals(w2)) 
		{
			System.out.println("Pass");
		}
		else {
			
			System.out.println("Fail");
		}
	}

}
