package gitpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasad\\eclipse-workspace\\AusgutDemo2\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		driver.manage().window().maximize();
		
		WebElement w=driver.findElement(By.id("dropdown_7"));
		Select s=new Select(w);
		WebElement selectedOption = s.getFirstSelectedOption();
		String name=selectedOption.getText();
		System.out.println(name);
		

	}

}
