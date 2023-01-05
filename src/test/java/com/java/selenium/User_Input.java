package com.java.selenium;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class User_Input {
	@Test
	public void Alert_Promptpopup() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Browser name:");
		String Browser = scanner.nextLine();
		System.out.println("User has Entered the Browser name : " + Browser);
		
		WebDriver driver = null;

		if (Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			//Implicit Waits
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@id='alertButton']")).click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} else if (Browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@id='alertButton']")).click();
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} else if (Browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@id='alertButton']")).click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} else {
			System.out.println("Invalid Browser!");
		}
		//Thread.sleep(2000);
		// driver.close();
	}

}
