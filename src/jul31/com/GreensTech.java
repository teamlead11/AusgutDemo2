package jul31.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech {

	public static void main(String[] args) throws AWTException {
// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");

//to maximize
		driver.manage().window().maximize();

//Mouse hover to Certifications,Rightclick  
		Actions Act=new Actions(driver);
		WebElement Certification_link =driver.findElement(By.xpath("//a[text()='Certifications']"));
		
		Act.moveToElement(Certification_link).perform();
		Act.contextClick(Certification_link).perform();

//Keyboard navigation using Robot class
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
