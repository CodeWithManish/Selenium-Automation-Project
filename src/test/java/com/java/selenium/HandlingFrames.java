package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingFrames {
	@Test
	public void frame() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/kmani/OneDrive/Desktop/page2.html");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
//			using index of the frame - [ int value] [ index of frames starts with zero]
//			driver.switchTo().frame(0);
//			driver.findElement(By.id("t1")).sendKeys("Aman");
//			driver.switchTo().defaultContent(); 
//			driver.findElement(By.id("t2")).sendKeys("Rahul");
//			Thread.sleep(2000);
			
			
//			using id attribute of the frame -string
//			driver.switchTo().frame("f1"); 
//			driver.findElement(By.id("t1")).sendKeys("manish"); 
//			driver.switchTo().defaultContent(); 
//			driver.findElement(By.id("t2")).sendKeys("manish");
//			Thread.sleep(2000);
			
//			using name attribute of the frame -string
//			driver.switchTo().frame("n1"); 
//			driver.findElement(By.id("t1")).sendKeys("hello"); 
//			driver.switchTo().defaultContent(); 
//			driver.findElement(By.id("t2")).sendKeys("hello");
//			Thread.sleep(2000);
			
//			using address of the frame -webelement
			WebElement f = driver.findElement(By.className("c1")); 
			driver.switchTo().frame(f); 
			driver.findElement(By.id("t1")).sendKeys("d"); 
			driver.switchTo().defaultContent(); 
			driver.findElement(By.id("t2")).sendKeys("d"); 
			Thread.sleep(2000);
			driver.close();
	}

}
