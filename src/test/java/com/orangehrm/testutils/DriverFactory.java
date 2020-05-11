package com.orangehrm.testutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverFactory {

	public static WebDriver driver;

	public static WebDriver inItDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"E:\\Automation Frameworks\\src\\test\\resources\\PropertyFiles\\config.properties");

		prop.load(fis);
		String browser = prop.getProperty("broswerName");
		String url = prop.getProperty("url");
		// System.out.println(browser);

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Selenium Drivers\\New folder\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\Selenium Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(); 
			 driver.get(url); 
			 } 
		
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		return driver;

	}
}
