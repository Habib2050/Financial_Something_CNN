package com.regression;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.ObjectMap;
import com.excelManager.ExcelColumnMap;
import com.generic.DriverScript;
import com.masterpagefactory.MasterPageFactory;
import com.util.ExplicitWait;
import com.util.Highlighter;

public class MarketData {
	
	WebDriver driver;
	MasterPageFactory pf;
	
		Map<String,String> myMap;
	
	
	@BeforeTest
	public  void setUp() {
		
		
		driver= new DriverScript().getdriver(ObjectMap.getconfig("URL"));
		
		
		
		pf=PageFactory.initElements(driver, MasterPageFactory.class);

		//Thread.sleep(3000);
		
		
		// int a=
        //DriverScript obj= new DriverScript();
	
		//new DriverScript().getdriver(URL);

	
	
	
	}	
	

	

	@Test
	public void regression_tc02() {

		System.out.println(pf.getAllpage().size());
		for (int i = 0; i < pf.getAllpage().size(); i++) {
			
			
			ExplicitWait.getMyWait(driver, pf.getAllpage().get(i));
		//	Highlighter.getColor(driver, pf.getAllpage().get(i));
			pf.getAllpage().get(i).click();
			//new Actions(driver).moveToElement(pf.getAllpage().get(i)).click().perform();
			System.out.println("current page title: " + driver.getTitle());
			driver.navigate().back();
		}
		
	}
	//
	@Test(dependsOnMethods = { "regression_tc02" })
	public void regression_tc3() throws Throwable {

		myMap = new LinkedHashMap<>();
		new Actions(driver).moveToElement(pf.getAllpage().get(0)).click().perform();// 1
		

		for (int i = 0; i < pf.getTopname().size(); i++) {
			
			
			ExplicitWait.getMyWait(driver, pf.getTopname().get(0));
		//	Highlighter.getColor(driver, pf.getTopname().get(i));
			myMap.put(pf.getTopname().get(i).getAttribute("data-ticker-name"), pf.getTopname().get(i).getText());
		}
		System.out.println(myMap.toString());// whole map==> Key :: Value
//		System.out.println(myMap.keySet().toString());// keys
//		System.out.println(myMap.values().toString());// values=====> Test data
	}

	@Test(dependsOnMethods = { "regression_tc3" })
	public void regression_tc4() throws Throwable {
		 
		List<String>testDataList = new ArrayList<>();
		testDataList = ExcelColumnMap.returnExcel("/Test Data Financial.xlsx", "Market");
		System.out.println(testDataList.get(1));

		if (myMap.keySet().toString().trim().contains(testDataList.get(0).trim())) {

			System.out
					.println("Top section Name Validation Passed ....." + myMap.keySet() + " = " + testDataList.get(0));
//			Assert.assertEquals(myMap.keySet().toString().trim(), testDataList.get(0).trim(),
//					"Passed the name........");

		} else {

			System.out
					.println("Top section Name Validation Falied ....." + myMap.keySet() + " = " + testDataList.get(0));
//			Assert.assertEquals(myMap.keySet(), testDataList.get(0), "Failed the name........");
		}

		if (myMap.values().toString().trim().contains(testDataList.get(1).toString().trim())) {

			System.out.println(
					"Top section Value Validation Passed ....." + myMap.values() + " = " + testDataList.get(1));
//			Assert.assertEquals(myMap.values().toString().trim(), testDataList.get(1).toString().trim(),
//					"Passed the value........");
		} else {

			System.out.println(
					"Top section Value Validation Failed ....." + myMap.values() + " = " + testDataList.get(1));
//			Assert.assertEquals(myMap.values(), testDataList.get(1),"Failed the value........");
					
		}
	}
	
	@Test(dependsOnMethods = { "regression_tc4" })
	
	public void regression_tc5() {
		
	pf.getMarket().click();
	System.out.println(pf.getMostpopulerstock().size());
	for(int i=0;i<pf.getMostpopulerstock().size();i++) {
		
	//	Highlighter.getColor(driver, pf.getMostpopulerstock().get(i));
		System.out.println(pf.getMostpopulerstock().get(i).getText());
		
		System.out.println(pf.getTimeupdate().getText());
		
	}
		
	}
@Test(dependsOnMethods = { "regression_tc5" })
public void regression_tc6() {
	
	List<String> testdata =new ArrayList<>();
	testdata = ExcelColumnMap.returnExcel("/Test Data Financial.xlsx", "Most Popular Stocks");
	for(int i=0;i<testdata.size();i++) {
	//	Highlighter.getColor(driver, pf.getMostpopulerstock().get(i));
		System.out.println(testdata.get(i));
	}
}
	
	@AfterTest
	public void teardown() {
		driver.quit();

		// System.out.println("teardown");

	}

}