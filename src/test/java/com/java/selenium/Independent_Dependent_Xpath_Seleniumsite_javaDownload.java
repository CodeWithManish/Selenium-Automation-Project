package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Independent_Dependent_Xpath_Seleniumsite_javaDownload {

	@Test
	public void independentDependentXpathSeleniumsite_JavaDownload() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='Java']/..//a[='Download']")).click();

	}

}
