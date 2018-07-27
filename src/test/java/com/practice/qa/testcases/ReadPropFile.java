package com.practice.qa.testcases;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\raghu\\eclipse-workspace\\MySeleniumSessionsPracticeClasses"
				+ "\\src\\test\\java\\com\\practice\\qa\\testcases\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}else if(browserName.equals("FF")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if (browserName.equals("IE")) {
			
			System.setProperty("webdriver.internetexplorer.driver", "C:\\Selenium Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		
		driver.get(url);
		
		
			
		
		
		 
		
	
		

	}

}
