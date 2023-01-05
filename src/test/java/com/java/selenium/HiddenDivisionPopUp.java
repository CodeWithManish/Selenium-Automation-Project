package com.java.selenium;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HiddenDivisionPopUp {
	
	@Test
	public void hidden_DivisionPopUp() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Browser name:");
		String Browser = scanner.nextLine();
		System.out.println("User has Entered the Browser name "+Browser);
		
		WebDriver driver = null;
		
		if(Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.cleartrip.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
			driver.findElement(By.linkText("24")).click();
		}
		else if(Browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver",
					"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		driver.findElement(By.linkText("24")).click();
		
	}else {
		System.out.println("Invalid Browser!");
		}
		Thread.sleep(2000);
		driver.close();
	}
	

}
