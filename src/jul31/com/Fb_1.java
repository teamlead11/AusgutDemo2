package jul31.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fb_1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// Actions - Right click,double click in UserName field
		WebElement UserName_btn = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		UserName_btn.sendKeys("GREENS");
		Actions Act = new Actions(driver);
		Act.doubleClick(UserName_btn).perform();
		Act.contextClick(UserName_btn).perform();

		// Keyboard navigation using Robot class
		Robot rob = new Robot();
		for (int i = 0; i <= 1; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		// *Actions - Right click
		// *Keyboard navigation in Password field
		WebElement Password_btn = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		Act.contextClick(Password_btn).perform();
		for (int i = 0; i <= 1; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

}
