package com.regression;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.TakeAppScreenShot;



public class  TestCaseOne {

	static WebDriver driver;
	
	
	
	public static WebDriver  setup() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/habib/Desktop/chromedriver");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		 driver = new ChromeDriver();
		
		
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// WebDriverWait wait = new WebDriverWait(driver, 60);
		
		 driver.get("https://www.cnn.com/BUSINESS");
		
		 System.out.println(driver.getTitle());
		
		 
		 TakeAppScreenShot.captureScreenShot(driver,"HomePage" );
		 
		 
		
		return driver;
	}
	
	
	
	
	
}
