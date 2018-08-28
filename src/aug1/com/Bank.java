package aug1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		Actions Act=new Actions(driver);
	WebElement To_Drag1= driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement To_Drop1= driver.findElement(By.xpath("//li[@class='placeholder']"));
	Act.dragAndDrop(To_Drag1, To_Drop1).perform();
	
	
	WebElement To_Drag2= driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement To_Drop2= driver.findElement(By.xpath("//ol[@id='loan']"));
	Act.dragAndDrop(To_Drag2, To_Drop2).perform();
	 
	WebElement To_Drag3= driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement To_Drop3= driver.findElement(By.xpath("//li[@class='placeholder']"));
	Act.dragAndDrop(To_Drag3, To_Drop3).perform();
	
	WebElement To_Drag4= driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement To_Drop4= driver.findElement(By.xpath("//li[@class='placeholder']"));
	Act.dragAndDrop(To_Drag4, To_Drop4).perform();
	
	WebElement Display_check= driver.findElement(By.xpath("//a[@class='button button-green']"));
	String text_item=Display_check.getText();
	System.out.println(text_item);
	
	String s1="Perfect!";
	if (text_item.equals(s1)) {
System.out.println("Transaction success");
	}
	else{
	System.out.println("Transaction failure");
	}
}
}
