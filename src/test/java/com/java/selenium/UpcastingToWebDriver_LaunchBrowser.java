package com.java.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpcastingToWebDriver_LaunchBrowser {

	@Test
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println("the title of the page is :" + title);
		Thread.sleep(3000);
		
		String currentUrl = driver.getCurrentUrl(); 
		System.out.println("the URL of the page is :"+ currentUrl);
		Thread.sleep(3000);
		
		String pageSource = driver.getPageSource(); 
		System.out.println("the source code of the page is :"+ pageSource);
		Thread.sleep(3000);
		
		/*Browser Navigation*/
		
		driver.navigate().to("https://www.myntra.com/");
		String Mtitle = driver.getTitle();
		System.out.println("the title of the page is:"+Mtitle);
		//driver.navigate().back();
		//Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}
}
