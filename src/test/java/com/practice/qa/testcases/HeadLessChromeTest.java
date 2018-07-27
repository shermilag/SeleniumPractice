package com.practice.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		// chrome version should be greater than 60 on windows
		//window size =1400,800
		// below 4lines of code can be used for headless test
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		
		System.out.println("login page title =="+driver.getTitle());
		
		
		driver.findElement(By.name("username")).sendKeys("shermilag");
		driver.findElement(By.name("password")).sendKeys("cutesharmi1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("home page title =="+driver.getTitle());
		
		
		

	}

}
