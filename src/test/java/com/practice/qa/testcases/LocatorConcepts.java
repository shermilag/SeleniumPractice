package com.practice.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver", "c:\\Selenium Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
      
      driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("rbil9772");
      driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Riyriv1320");
      
      
    		  
      
    		  

	}

}
