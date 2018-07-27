package com.practice.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();//launch Chrome
    driver.get("http://www.google.com");//enter URL
    
    String title = driver.getTitle();//get title
    System.out.println(title);
    
    if(title.equals("Google")) {
    	System.out.println("correct title");
    }
    else {
    	System.out.println("in-correct title");
    }
	System.out.println(driver.getCurrentUrl());
	
	driver.quit();
	}

}
