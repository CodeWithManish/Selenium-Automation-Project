package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookLogin {

	@Test
	public void facebook_login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("manish123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void facebook_signup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//*[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("firstname")).sendKeys("Manish");
		Thread.sleep(2000);
		driver1.findElement(By.name("lastname")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver1.findElement(By.name("reg_email__")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.name("reg_email_confirmation__")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.name("reg_passwd__")).sendKeys("manish123");
		Thread.sleep(2000);
		WebElement dateElement= driver1.findElement(By.name("birthday_day"));
		Thread.sleep(2000);
		WebElement monthElement = driver1.findElement(By.name("birthday_month"));
		Thread.sleep(2000);
		WebElement yearElement = driver1.findElement(By.name("birthday_year"));
		Thread.sleep(2000);
		
		Select dateDropdown = new Select(dateElement); 
		Select monthDropdown = new Select(monthElement);
		Select yearDropdown = new Select(yearElement);
		
		dateDropdown.selectByVisibleText("12");
		monthDropdown.selectByVisibleText("May");
		yearDropdown.selectByVisibleText("2002");
		Thread.sleep(2000);
		
		//driver1.findElement(By.xpath("//label[text()='Male']")).click();
		driver1.findElements(By.name("sex")).get(1).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("websubmit")).click();
		driver1.close();
		
	}

}
