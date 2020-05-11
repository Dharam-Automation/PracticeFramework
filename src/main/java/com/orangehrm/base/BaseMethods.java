/**
 * 
 */
package com.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author dharmendra.h
 *
 */
public class BaseMethods {
	
	
	public void mouseHover(WebElement element1, WebElement element2,String logMessage)
	{
	//Actions action = new Actions(driver);
	//action.moveToElement(element1).build().perform();
	element2.click();
	}

}
