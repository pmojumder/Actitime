package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class EnterTimeTrack extends BasePage{
	
	//Declaration
	@FindBy(id="logoutLink")
	private WebElement logoutBTN;
	
	//Initialization
	public EnterTimeTrack(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	} 
	
	//utilization
		public void clickLogout() 
		{
			logoutBTN.click();
		} 
	

}
