package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Configure webdriver,launch browser and load url
				System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.adactin.com/Hotelapp/");

				//to maximize
				driver.manage().window().maximize();
				
				// to find the locator of Login button and insert the values
				driver.findElement(By.id("username")).sendKeys("SaradhaKK");
				//Login.sendKeys("SaradhaKK");
				
				// to find the locator of Password button and insert the values
				WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("Z99F69");
				
				// to find the locator of submitbtn button and click
				driver.findElement(By.id("login")).click();
				//submitbtn.click();
				
				// to find the locator of Location button and insert the values
				WebElement Location = driver.findElement(By.id("location"));
				Location.sendKeys("London");
				
				// to find the locator of Hotels button and insert the values
				WebElement Hotels = driver.findElement(By.id("hotels"));
				Hotels.sendKeys("Hotel Sunshine");
				
				// to find the locator of Roomtype button and insert the values
				WebElement Roomtype = driver.findElement(By.id("room_type"));
				Roomtype.sendKeys("Standard");
				
				// to find the locator of No_of_rooms button and insert the values
				WebElement No_of_rooms = driver.findElement(By.id("room_nos"));
				No_of_rooms.sendKeys("2-Two");
				
				// to find the locator of Check_In_Date button and insert the values
				WebElement Check_In_Date = driver.findElement(By.id("datepick_in"));
				Check_In_Date.sendKeys("30/07/2018");
				
				// to find the locator of Check_out_Date button and insert the values
				WebElement Check_out_Date = driver.findElement(By.id("datepick_out"));
				Check_out_Date.sendKeys("01/08/2018");
				
				// to find the locator of No of Adults button and insert the values
				WebElement Adults = driver.findElement(By.id("adult_room"));
				Adults.sendKeys("2-Two");
				
				// to find the locator of No of Child button and insert the values
				WebElement Child = driver.findElement(By.id("child_room"));
				Child.sendKeys("1-One");
				
				// to find the locator of search button and click
				WebElement Searchbtn = driver.findElement(By.id("Submit"));
				Searchbtn.click();
				
				// to find the locator of Select button and click
				WebElement Selectbtn = driver.findElement(By.id("radiobutton_0"));
				Selectbtn.click();
				
				// to find the locator of Continue button and click
				WebElement Continuebtn = driver.findElement(By.id("continue"));
				Continuebtn.click();
				
				// to find the locator of FirstName button and insert the values
				WebElement FirstName = driver.findElement(By.id("first_name"));
				FirstName.sendKeys("Sara");
				
				// to find the locator of LastName button and insert the values
				WebElement LastName = driver.findElement(By.id("last_name"));
				LastName.sendKeys("Bhas");
				
				// to find the locator of Address button and insert the values
				WebElement Address = driver.findElement(By.id("address"));
				Address.sendKeys("1,Medavakam,Chennai");
				
				// to find the locator of Credit_no button and insert the values
				WebElement Credit_no = driver.findElement(By.id("cc_num"));
				Credit_no.sendKeys("1234567890123456");
				
				// to find the locator of Credit_card_type button and insert the values
				WebElement Credit_card_type = driver.findElement(By.id("cc_type"));
				Credit_card_type.sendKeys("VISA");
				
				// to find the locator of Exp_Month button and insert the values
				WebElement Exp_Month = driver.findElement(By.id("cc_exp_month"));
				Exp_Month.sendKeys("March");
				
				// to find the locator of Exp_Year button and insert the values
				WebElement Exp_Year = driver.findElement(By.id("cc_exp_year"));
				Exp_Year.sendKeys("2019");
				
				// to find the locator of CVV button and insert the values
				WebElement CVV = driver.findElement(By.id("cc_cvv"));
				CVV.sendKeys("234");
				
				// to find the locator of BookNow button and insert the values
				WebElement BookNow = driver.findElement(By.id("book_now"));
				BookNow.click();
											
	}

}
