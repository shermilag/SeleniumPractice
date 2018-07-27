package com.practice.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id='highlight-addons']"))).build().perform();
		Thread.sleep(3000);
		
				
		driver.findElement(By.linkText("SpiceMax")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
