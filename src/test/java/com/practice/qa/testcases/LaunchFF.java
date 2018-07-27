package com.practice.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFF {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println(driver.getTitle());
		
	}

}
