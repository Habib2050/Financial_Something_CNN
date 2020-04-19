package com.generic;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;



public class DriverScript {
     // create a return method get driver
     //how to open a browser
	 //implicit wait
	 //max browser
	 //any other browser capabilities
	
	
	
	WebDriver  driver;
	
	public WebDriver getdriver(String URL) {
		
    System.setProperty("webdriver.chrome.driver", "/Users/habib/Desktop/chromedriver");
	
    
    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
    Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

    //WebDriver driver = new ChromeDriver();// upcasting
		
    
    //driver.get(URL);
		driver = new ChromeDriver();
		
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		
		driver.get(URL);
		
		
		System.out.println("Browser Open");
		
		return driver;

		
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
