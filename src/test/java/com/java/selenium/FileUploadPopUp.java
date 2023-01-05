package com.java.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadPopUp {

	public static WebDriver driver;

	@BeforeTest
	public void launchrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\kmani\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		  
//		driver = new FirefoxDriver();
	}

	@Test
	public void file_Upload() throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();

		// Explicit wait
		WebElement checkElement = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@multiple='']")));

		driver.findElement(By.xpath("//input[@multiple='']"))
				.sendKeys("C:\\Users\\kmani\\Downloads\\computer Science.pdf");
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[@ng-click=\\\"item.upload()\\\"]")).click();
		// Thread.sleep(2000);
	}

	@Test
	public void autoIt_UploadFile() throws InterruptedException, IOException {
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		driver.manage().window().maximize();
		// Explicit waits
		WebElement checkElement = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.elementToBeClickable(By.linkText("Choose PDF file")));

		driver.findElement(By.linkText("Choose PDF file")).click();
		// Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\kmani\\OneDrive\\Documents\\uploadfile.exe");
	}
	
	@Test
	public void cancelOnPrintWindowPopup() throws InterruptedException, AWTException, IOException {
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		//Press Control + P from keyboard using Robot class 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//Using Runtime class, to run the .exe file
		Runtime run = Runtime.getRuntime(); 
		run.exec("C:\\Users\\kmani\\OneDrive\\Documents\\CancelOnPrintWindowPopup.exe");
		//close the browser 
		driver.close();
	}
		
}
