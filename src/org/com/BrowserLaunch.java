package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch {

	public static void main(String[] args) {
		
		//Configure a driver
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\IEDriverServer.exe");
		//System.setProperty("webdriver.gecko.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\geckodriver.exe");
		
		//Launch a browser
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new InternetExplorerDriver();
		//WebDriver driver=new FirefoxDriver();
		
		//URL
		driver.get("https://www.thehindu.com/");
		
		//to maximixe
		driver.manage().window().maximize();
		
		//to navigate
		driver.navigate().to("http://www.greenstechnologys.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
				
		//To get the title,current url
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		//to quit the browser
		driver.quit();
		

	}

}
