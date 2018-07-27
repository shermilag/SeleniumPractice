package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("login Test");
		
	}

    @Test(dependsOnMethods="loginTest")
    public void HomepageTest() {
    	System.out.println("Home page");
    }
}
