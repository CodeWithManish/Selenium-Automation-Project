package com.java.selenium;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Js_HandlingPopUp {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\kmani\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void Alert_PromptPopup() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	

	@Test
	public void conformationPopUp() throws InterruptedException {
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		Thread.sleep(2000);
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("The alert test is: "+ alertText);
		confirmationAlert.accept();
				
	}
	
	
	@Test
	public void promptPopUp() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String xpString ="(//button[@id='promtButton'])";
		driver.findElement(By.xpath(xpString)).click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		promptAlert.sendKeys("Manish");
		Thread.sleep(2000);
		promptAlert.accept();
		
	}
	
	
	
}
