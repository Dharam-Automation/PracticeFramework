package com.orangehrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.testutils.DriverFactory;

public class Login extends DriverFactory {

	@Test
	public void loginTest() throws IOException {

		WebDriver driver = DriverFactory.inItDriver();

		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);

		lp.login();

	}
}
