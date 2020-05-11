/**
 * 
 */
package com.orangehrm.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseMethods;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testutils.DriverFactory;

/**
 * @author dharmendra.h
 *
 */
public class Demo {

	@Test
	public void tableHandle() throws IOException {
		WebDriver driver = DriverFactory.inItDriver();

		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.login();

		WebElement admin = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
		WebElement userManegement = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));

		Actions action = new Actions(driver);
		action.moveToElement(admin).build().perform();
		action.moveToElement(userManegement).build().perform();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();

		// Table code
		
		List<WebElement> thCount = driver.findElements(By.xpath("//table[@id='resultTable']//tbody//tr/td"));
		System.out.println(thCount.size());
		
		for(int index=1; index <= thCount.size(); index++)
		{
			if (thCount.get(index).getText().equalsIgnoreCase("jasmine.morgan"))
			{
				System.out.println(thCount.get(index+1).getText());
			}
		}
		//System.out.println(thCount.get(index).getText());
		
		

	}
}