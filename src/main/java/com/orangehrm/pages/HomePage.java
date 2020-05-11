/**
 * 
 */
package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.orangehrm.base.BaseMethods;

/**
 * @author dharmendra.h
 *
 */
public class HomePage extends BaseMethods{
	
	@FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
	private WebElement user_management;
	
	@FindBy(xpath = "//a[@id='menu_admin_viewSystemUsers']")
	private WebElement user;	
	
	
	
	

	public void tableHandle() {
		
		//mouseHover(Dri, element1, element2, logMessage);
	
		
	}
	


}
