package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAuto_8 {
	public static void main(String[] args)  {
			
			//Configure webdriver,launch browser and load url
			System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");

			//to maximize
			driver.manage().window().maximize();
			
			//to find the locator of Firstname and insert the values
			WebElement FirstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			FirstName.sendKeys("Saro");

			//to find the locator of LastName and insert the values
			WebElement LastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			LastName.sendKeys("Bhaskar");
			
			//to find the locator of Address and insert the values
			WebElement Address=driver.findElement(By.xpath("//textarea[@rows='3']"));
			Address.sendKeys("234,hjdhfjhj street,Chennai.");
			
			//to find the locator of email and insert the values
			WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
			email.sendKeys("hhj@gmail.com");
			
			//to find the locator of phone and insert the values
			WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
			phone.sendKeys("123456789");
			
			// to find the locator of remote button and insert the values
			WebElement Rem_btn1 = driver.findElement(By.xpath("//input[@value='FeMale']"));
			Rem_btn1.click();
			
			//to find the locator of checkbox1 and insert the values
			WebElement checkbox1 = driver.findElement(By.id("checkbox3"));
			checkbox1.click();
			
			// to find the locator of lang and insert the values
			WebElement dropdwn1 = driver.findElement(By.xpath("//div[@id='msdd']"));//correct
		dropdwn1.click();
			//dropdwn1.sendKeys(Keys.CONTROL);
			//dropdwn1.sendKeys("Arabic");
			
/*			Select lang= new Select(dropdwn1);
			//lang.selectByVisibleText("Dutch");
			lang.getClass();*/
	
			//WebElement lngopt=driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect-item']"));
			//System.out.println(lngopt.getText());*/
			
			//dropdown.selectByIndex(0);*/
			//dropdwn1.selectbyIndex(0);
			/*		WebElement dropdwn1 = driver.findElement(By.xpath("//div[@id='msdd']")); //correct
			//WebElement dropdwn1 = driver.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']")); //correct
			//correct	//WebElement dropdwn1 = driver.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']")); //correct
			//WebElement dropdwn1 = driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget'])")); //correct
			dropdwn1.click();
			//Thread.sleep(2000);
			//WebElement Eng = driver.findElement(By.xpath("//a[@class='ui-corner-all']"));
			//WebElement Eng = driver.findElement("By.xpath("//a[@class='ng-scope ui-elemfocus']"));
			dropdwn1.sendKeys("Arabic");
	*/		
			//to find the locator of dropdwn2 and insert the values
			WebElement dropdwn2 = driver.findElement(By.id("Skills"));
			dropdwn2.sendKeys("C");
			
			//to find the locator of dropdwn3 and insert the values
			WebElement dropdwn3 = driver.findElement(By.id("countries"));
			dropdwn3.sendKeys("India");
					
		
			WebElement coun_try= driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
			coun_try.click();
			driver.switchTo().frame("google_osd_static_frame_4142718723950");
			//Select s=new Select(coun_try);
			WebElement option1=driver.findElement(By.xpath("//span[@title='South Africa']"));
			option1.click();
			//coun.click();
			//coun.sendKeys("Australia");
			//	WebElement dropdwn4 = driver.findElement(By.xpath("//span[@text()='select2-selection select2-selection--single']"));
			//WebElement dropdwn4 = driver.findElement(By.id("select2-country-container"));
			WebElement entercountry = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
			entercountry.sendKeys("India");
			entercountry.click();
			//title=India
			//coun.click();
			//coun.sendKeys("India");
			//class="select2-selection select2-selection--single"
			//id("select2-country-container")
		
			//to find the locator of yearbtn and insert the values
			WebElement yearbtn = driver.findElement(By.id("yearbox"));
			yearbtn.sendKeys("1985");
			
			//to find the locator of monthbtn and insert the values
			WebElement monthbtn = driver.findElement(By.xpath("//select[@placeholder='Month']"));
			monthbtn.sendKeys("March");
						
			//to find the locator of dayboxbtn and insert the values
			WebElement dayboxbtn = driver.findElement(By.id("daybox"));
			dayboxbtn.sendKeys("10");
				
			//to find the locator of firstpwd and insert the values
			WebElement firstpwd=driver.findElement(By.id("firstpassword"));
			firstpwd.sendKeys("123456789");
			
			//to find the locator of secpwd and insert the values
			WebElement secpwd=driver.findElement(By.id("secondpassword"));
			secpwd.sendKeys("123456789");
			
			//to find the locator of submit and click
			WebElement submit = driver.findElement(By.id("submitbtn"));
			submit.click();
			
			
}
}
