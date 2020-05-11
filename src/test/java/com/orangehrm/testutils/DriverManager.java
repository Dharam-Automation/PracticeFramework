package com.orangehrm.testutils;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	private static WebDriver driver;

	private DriverManager(WebDriver driver) {
		this.driver = driver;

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverManager.driver = driver;
	}

}
