package gitpack1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test case1");
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Project\\jyothi\\AusgutDemo2\\driver\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/registration/");
	driver.manage().window().maximize();
	WebElement dropdown = driver.findElement(By.id("dropdown_7"));
	Select s= new Select(dropdown);
	String s1= s.getFirstSelectedOption().getText();
	String s2= "Afghanistan";
	if(s1.equals(s2)) {
		System.out.println("testcase passed");
		
	}else {
		System.out.println("testcase fail");
	}
	
	
	
	
	
	
	
	}

}
