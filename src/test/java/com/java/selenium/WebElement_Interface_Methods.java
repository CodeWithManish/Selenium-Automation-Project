package com.java.selenium;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class WebElement_Interface_Methods {

	@Test
	public void verifyInstagram_GetLocationMethod() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement unTB = driver.findElement(By.xpath("//input[@type='text']"));
		// get the y-coordinate of username field
		int username_Ycordinate = unTB.getLocation().getY();
		System.out.println(username_Ycordinate);
		WebElement pwdTB = driver.findElement(By.xpath("//input[@type='password']"));
		// get the y-coordinate of password field
		int password_Ycordinate = pwdTB.getLocation().getY();
		System.out.println(password_Ycordinate);
		// check whether the Y-coordinate of username and password field are same
		if (username_Ycordinate == password_Ycordinate) {
			System.out.println("Both username and password fields are displayed in the same row");
		} else {
			System.out.println("username and password fields are NOT aligned in the same row");
		}
	}

	@Test
	public void verifyInstagram_UNandPassword_HeightAndWidth() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement unTB = driver.findElement(By.xpath("//input[@type='text']"));
		// store the height of username
		int username_height = unTB.getSize().getHeight();
		// store the width of username
		int username_width = unTB.getSize().getWidth();
		System.out.println(username_height);
		System.out.println(username_width);

		WebElement pwdTB = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
		int passwordHeight = pwdTB.getSize().getHeight();
		int passwordWidth = pwdTB.getSize().getWidth();

		System.out.println(passwordHeight);
		System.out.println(passwordWidth);

		if (username_height == passwordHeight && username_width == passwordWidth) {
			System.out.println("Username and password fields are aligned");
		} else {
			System.out.println("Username and password fields are NOT aligned");

		}
	}

	@Test
	public void verifyInstagram_Usernamefield_lessthanMobileNumberField() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement unTB = driver.findElement(By.xpath("//input[@name='username']"));
		// WebElement unTB = driver.findElement(By.xpath("//span[text()='Phone number,
		// username or email address']"));
		int username_width = unTB.getSize().getWidth();
		System.out.println(username_width);

		WebElement mobileNumTB = driver.findElement(By.xpath("//input[@name='username']"));
		// WebElement mobileNumTB =
		// driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number,
		// username or email address')]"));
		int mobNumWidth = mobileNumTB.getSize().getWidth();
		System.out.println(mobNumWidth);

		if (username_width == mobNumWidth) {
			System.out.println(
					"Size of Both username and password fields are same" + username_width + " = " + mobNumWidth);
		} else {
			System.out.println("Size of username and password fields are NOT same that is : " + username_width
					+ " Not equals to " + mobNumWidth);
		}
	}

	@Test
	public void addValueInTextBox_AndRemove() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// entering text into the focussed element
		driver.switchTo().activeElement().sendKeys("admin");
	}

	@Test
	public void removeElementFromTextBox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manish@gmail.com");
		Thread.sleep(2000);
		String value = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		System.out.println("Value present inside the text box is : " + value);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("againEntered Manish");
		Thread.sleep(2000);
//		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);  
//		 this line will actually delete the value if there is no space in the text entered
//		 if there is a space between two words in the username field, we have to use the below lines of code

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);
	}

	@Test
	public void deleteWithoutUsingClear() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aman");
		Thread.sleep(2000);
		String value = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		System.out.println("Value present inside the text box is : " + value);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("againEnteredAman");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
	}

	@Test
	public void check_ToolTip() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Checkbox = driver.findElement(By.xpath("//input[@type='text']"));
		// get the tooltip text using getAttribute() method and store in a variable
		String tooltipText = Checkbox.getAttribute("title");
		System.out.println(tooltipText);
		// driver.close();
	}

	@Test
	public void check_IsSelected() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement KeepMeLogIN_Checkbox = driver
				.findElement(By.xpath("//label[contains(text(),'Person With Disability Concession')]"));
		KeepMeLogIN_Checkbox.click();
		if (KeepMeLogIN_Checkbox.isSelected()) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is NOT selected");
		}
	}

	@Test
	public void check_IsEnable() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
		if (UN.isEnabled()) {
			System.out.println("Username text box is enabled");
		} else {
			System.out.println("Username text box is disabled");
		}
		//driver.close();
	}

	@Test
	public void check_GetText() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String tagName = driver.findElement(By.xpath("//input[@type='text']")).getTagName();
		if (tagName.equals("a")) {
			System.out.println("View LIcence is a link");
		} else {
			System.out.println("View LIcence is NOT a link");
		}
		driver.close();
	}

	@Test
	public void check_GetAttribute() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		;
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String elementType = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("Manish@gmail.com");

		System.out.println(elementType);
		if (elementType.equalsIgnoreCase("checkbox")) {
			System.out.println("it is a checkbox");
		} else {
			System.out.println("it is NOT a checkbox");
		}
	}

	@Test
	public void verify_GetCssValue() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// click on Login button
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		// find the error message element
		WebElement errMsg = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		// get the text of the error message
		String errtext = errMsg.getText();
		// print the error message
		System.out.println("error message is :" + errtext);
		// get the value of color and store in a variable
		String c = errMsg.getCssValue("color");
		// convert the color from string type to hexa form
		String ColorasHex = Color.fromString(c).asHex();
		System.out.println("hexadecimal format : " + ColorasHex);
		if (ColorasHex.equals("#ce0100")) {
			System.out.println("Error message is in red color");
		} else {
			System.out.println("Error message is in red color");
		}
		// get the size of the font of error message
		String fontSize = errMsg.getCssValue("font-size");
		// get the weight of the font of error message
		String fontWeight = errMsg.getCssValue("font-weight");
		System.out.println("Size of the font is :" + fontSize);
		System.out.println("Weight of the font is :" + fontWeight);
		driver.close();

	}

	@Test
	public void diffWaysOfClickingOnAButton() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Bridgelabz Program\\TestingAPI\\Selenium-Automation-Projects\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String xp = "//button[@type='submit']";

		// 1. using click() method
		driver.findElement(By.xpath(xp)).click();

		// 2. using sendkeys
		driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
		/*
		 * 3. using submit() method this method will work only and only if if the
		 * element has an attribute called type= 'submit'
		 */
		driver.findElement(By.xpath(xp)).submit();

	}

}
