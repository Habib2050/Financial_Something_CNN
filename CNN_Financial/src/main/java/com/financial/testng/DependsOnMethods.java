package com.financial.testng;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void setupMethod() {
		System.out.println("This is setupMethod");
		
	}
	@Test(dependsOnMethods= {"setupMethod"} )
	public void method2() {
		System.out.println("This is login test");
	}

	
	
	

}
