package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript_Executor {
	@Test
	public void enterText_intoDisabledTextbox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kmani/OneDrive/Desktop/jsExcutor.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Typecast the driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		//enter "admin" in first textbox using javascript
		js.executeScript("document.getElementById('n1').value='admin'");
		Thread.sleep(2000);
		//clear the value in second textbox using javascript
		js.executeScript("document.getElementById('n2').value=''");
		//enter "manager" in second textbox using javascript
		js.executeScript("document.getElementById('n2').value='manager'");
		//change the second text box to button type using Javascript
		js.executeScript("document.getElementById('n2').type='button'");
		}
	
	@Test
	public void check_ForScroll_UpAndDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//typecasting driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
		//scroll down on the webpage
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(3000);
		}
		for (int i = 1; i < 10; i++) {
		//scroll up on the webpage
		js.executeScript("window.scrollBy(0, -1000)");
		Thread.sleep(3000);
		}
	}
	
	@Test
	public void check_ScrollDownTo_SpecificElemnt() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//click on the close icon of the yellow color background pop up 
		//driver.findElement(By.id("close")).click();
		// find the Applitools element on the webpage
		WebElement ele = driver.findElement(By.xpath("//img[@class='product-image _deals-shoveler-v2_style_dealImage__3nlqg'][@alt='iQOO Z6 44W | Starting 13499 | Extra 1000 off with IBD']"));
		// get the X-coordinate and store in a variable
		int x = ele.getLocation().getX();
		// get the Y-coordinate and store in a variable
		int y = ele.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll to Applitools element’s x and y coordinate
		js.executeScript("window.scrollBy("+x+", "+y+")");
		Thread.sleep(3000);
		}
	
	@Test
	public void ScroolDownToBottomOfPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//select an element which is present at the bottom of the page
		WebElement element = driver.findElement(By.xpath("//a[@href='/ref=footer_logo']"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		element.click();
		}
}
