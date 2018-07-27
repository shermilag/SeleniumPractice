package com.practice.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("shermilag");
		driver.findElement(By.name("password")).sendKeys("cutesharmi1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a
		
		
//		//method 1
////		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
////		String after_xpath = "]/td[2]/a";
////		
////		for(int i=4; i<=7; i++) {
////			String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
////			System.out.println(name);
////			if(name.contains("test2 test2")) {
////			 Thread.sleep(3000);
////				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
////				
//			}
//		}
		
		//method2
		
	driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td/input[@name='contact_id']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'ui uiii')]/parent::td//preceding-sibling::td/input[@name='contact_id']")).click();

	}

}
