package com.gt.windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lvbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement Btn= driver.findElement(By.xpath("//a[text()='New User Activation']"));
Btn.click();

//Getting Parent window ID
String ParentID=driver.getWindowHandle();
System.out.println(ParentID);

//Getting All window ID
Set<String> allWin_ID=driver.getWindowHandles();
System.out.println(allWin_ID);

//To switch to child window
for (String v : allWin_ID) {
	if(!ParentID.equals(v)) {
		driver.switchTo().window(v);
	}
		}

//To switch to 8th child window using for each loop
/*int count=0;
for (String v : allWin_ID) {
	if(!ParentID.equals(v)) {
		if(count==8) {
		driver.switchTo().window(v);
	}
		count ++;
}
*/

//To switch to 8th child window using typecasting and convert set to list and get index
/*List<String> allWin_ID_typecast= (List<String>)driver.getWindowHandles();
driver.switchTo().window(allWin_ID_typecast.get(7));*/

//to switch to parent window
driver.switchTo().defaultContent();

WebElement NetBank_login=driver.findElement(By.id("fldUId"));
NetBank_login.sendKeys("Saro");

driver.switchTo().defaultContent();

	}

}
