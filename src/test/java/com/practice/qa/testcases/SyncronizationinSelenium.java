package com.practice.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncronizationinSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement mobilenumber = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		
		sendkeys(driver,firstname,10,"Tom");
		sendkeys(driver,lastname,5,"David");
		sendkeys(driver,mobilenumber,5,"3013009876");
		sendkeys(driver,password,5,"pwd");
		
		WebElement forgotAccount = driver.findElement(By.linkText("Forgot account?"));
		
		clickOn(driver, forgotAccount, 5);
		
	}
	
	public static void sendkeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout)
		.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
