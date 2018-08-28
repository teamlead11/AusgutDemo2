package jul31.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Adactin {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/");

//to maximize
		driver.manage().window().maximize();
		
		//Copying the usrname using Keyboard navigation
		WebElement User_Name =driver.findElement(By.id("username"));
		User_Name.sendKeys("SaroSaro");
		Actions Act=new Actions(driver);
		Act.doubleClick(User_Name).perform();
	
		Robot Rob=new Robot();
		Rob.keyPress(KeyEvent.VK_CONTROL);
		Rob.keyPress(KeyEvent.VK_A);
		Rob.keyRelease(KeyEvent.VK_CONTROL);
		Rob.keyRelease(KeyEvent.VK_A);
		
		Rob.keyPress(KeyEvent.VK_CONTROL);
		Rob.keyPress(KeyEvent.VK_C);
		Rob.keyRelease(KeyEvent.VK_CONTROL);
		Rob.keyRelease(KeyEvent.VK_C);

		//Entering values in Password field using Keyboard navigation -Robot class 		
		WebElement Pass_word =driver.findElement(By.id("password"));
		Pass_word.click();
		Rob.keyPress(KeyEvent.VK_CONTROL);
		Rob.keyPress(KeyEvent.VK_V);
		Rob.keyRelease(KeyEvent.VK_CONTROL);
		Rob.keyRelease(KeyEvent.VK_V);
		
		//Login using Keyboard
		WebElement Login_btn=driver.findElement(By.id("login"));
		Login_btn.sendKeys(Keys.ENTER);
	}

}
