/*ALERTS:
 *  It is an interface
 *  In package alerts.com
 *  There is no locator for alerts
 *  Alert alrt=driver.switchTo().alert();
 *  alrt.accept();
 *  alrt.dismiss();
 *  alrt.sendkeys("");
 
 Simple alert:
 **************
OK button only

Confirm alert:
***************
OK and Cancel button
	
Prompt alert:
***************
Text data, OK and Cancel button*/

package alerts.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");

		//to maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts();
		
		WebElement Login_box = driver.findElement(By.name("proceed"));
		Login_box.click();
//alert	
		
		Alert alrt=driver.switchTo().alert();
		String a=alrt.getText();
		System.out.println(a);
		
		alrt.accept();

	}

}
