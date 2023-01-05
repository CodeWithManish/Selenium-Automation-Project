package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeLink {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/kmani/OneDrive/Desktop/ActiTime.html");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("username")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("Manish");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("manish123");
	Thread.sleep(2000);
	driver.close();
	
	}
}
