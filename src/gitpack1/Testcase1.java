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
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mounika\\eclipse-workspace\\greens\\AusgutDemo2\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		WebElement user = driver.findElement(By.id("dropdown_7"));
		Select s= new Select(user);
		String s1= s.getFirstSelectedOption().getText();
		String s2= "Afghanistan";
		if(s1.equals(s2)) {
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
}}