package com.smoke;

import org.testng.annotations.Test;

import com.generic.DriverScript;

public class ApplicationStatus {
	
	@Test
	public  void setup() {
		
	// int a=

	//DriverScript obj= new DriverScript();
	//	obj.getdriver();
	
		new DriverScript().getdriver("URL");
	
}
}