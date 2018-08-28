package com.gt.Base_explanation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver launchbrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		return driver;
	}
	public void sendtext(WebElement element, String name) {
		element.sendKeys(name);
	}
	public void btnclick (WebElement element) {
		element.click();
	}
	public void quitbrowser(WebDriver driver) {
		driver.quit();
	}
	}

