package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@id='txtUsername']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	private WebElement loginButton;
	

	
      public void login()
      
      {
	      userName.sendKeys("Admin");
	      password.sendKeys("admin123");
	      loginButton.click();
      }
      
}
