package com.practice.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderByJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		driver.get("http://www.spicejet.com/");
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal = "07-08-2018";
		
	    selectDateByJS(driver, date, dateVal);
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
		
		
	}

}
