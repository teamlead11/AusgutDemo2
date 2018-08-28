package com.gt.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");

	//to maximize
		driver.manage().window().maximize();
		TakesScreenshot tc=(TakesScreenshot)driver;
		
		File f=tc.getScreenshotAs(OutputType.FILE);
		//boolean a=f.isFile();
		//System.out.println(a);
		//System.out.println(f);

		File samplefile=new File("Z:\\SeleniumTraining\\BrowserDetails\\Screen\\SampleScreen.jpeg");
		
		FileUtils.copyFile(f, samplefile);
	}

}
