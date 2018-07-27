package com.practice.qa.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.get("http://popuptest.com/goodpopups.html");
    
    driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
    
    Thread.sleep(2000);
    
    
    Set<String> handler = driver.getWindowHandles();
    
    Iterator<String> it = handler.iterator();
    
    String parentWindowId = it.next();
    	
    System.out.println("parent window id:"+ parentWindowId);
    
    
    String childWindowId = it.next();
    System.out.println("child window id:"+ childWindowId);
    
    driver.switchTo().window(childWindowId);
    
    Thread.sleep(2000);
    
    System.out.println("child window popup titile"+driver.getTitle());
    
    driver.close();
    
    driver.switchTo().window(parentWindowId);
    
    Thread.sleep(2000);
    
    System.out.println("parent window titile"+driver.getTitle());
    
   
    
    

	}

}
