package com.java.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class CaptureScreenShot {
	
	@Test
	public void takeScreenShot() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("manishkumar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Manish123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./CaptureScreenShot/"+"facebookpage"+".png");
		FileHandler.copy(srcFile, destFile);
		
	}

}
