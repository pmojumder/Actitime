package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
 public void VerifyTitle(String eTitle)
 {
	 WebDriverWait wait=new WebDriverWait(driver, 30);
	 try
	 {
		 wait.until(ExpectedConditions.titleIs(eTitle));
		
		
		Reporter.log("Title is matching: "+eTitle,true);
	 }	
		catch(Exception e)
		{
			Reporter.log("title is not matching: "+eTitle,true);
			Reporter.log("Actual Title is: "+driver.getTitle(),true);
			Assert.fail();
		}
	 
 }
 
 public void VerifyElement(WebElement element)
 {
	 WebDriverWait wait=new WebDriverWait(driver, 30);
	 try
	 {
		 wait.until(ExpectedConditions.visibilityOf(element));
		
		
		Reporter.log("Element is present",true);
	 }	
		catch(Exception e)
		{
			Reporter.log("Element is not present",true);
			Assert.fail();
		}
	 
 }
}
