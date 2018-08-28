package jul30.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonUrList_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

//to maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement YourList_btn = driver.findElement(By.xpath("//span[text()='Your']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(YourList_btn).perform();
		
		WebElement CreateYourWishList_btn = driver.findElement(By.xpath("//span[text()='Create a Wish List']"));
		act.moveToElement(CreateYourWishList_btn).perform();
		CreateYourWishList_btn.click();
		
		WebElement Sign_In = driver.findElement(By.id("a-autoid-0-announce"));
		Sign_In.click();
		
		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		Email.sendKeys("Saro@gmail.com");
		
		//to check the entered data is correct
		String entered_data=Email.getAttribute("value");
		System.out.println(entered_data);
		
		WebElement Pwd = driver.findElement(By.id("ap_password"));
		Pwd.sendKeys("Saro123456");
		
		WebElement Login = driver.findElement(By.id("signInSubmit"));
		Login.click();
		
	}

}
