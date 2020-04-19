package com.regression;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.TitlePageValue;

public class CNN_Testt {
	
	 WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		
		driver=TestCaseOne.setup();
		
	}
	
	
	@Test
	public void pageTitle_02() {
		
		TestCaseTwo.getTitle(driver);
		
	}
	
//	@Test
//	public void Market_03() {
//		
//	}
	
	
	@Test
	public void Market_03() {
		
	}
	
	
	
	
	
	
	
	
	/*
	public static void main(String[] args) throws InterruptedException {

		// 1st Testcase =go to CNN

		driver=TestCaseOne.setup();

		// 2nd testcases = go to all page or Module and get title from there
		
		
		
		
		TestCaseTwo.getTitle(driver);
		
		
		*/
		
		
		
		
	}


	
			
	
	
	
	
	
	


