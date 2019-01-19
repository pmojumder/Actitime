package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage
{
	//declaration
	@FindBy(id="username")
	private WebElement UsernameTB;
	
	@FindBy(name="pwd")
	private WebElement PasswordTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginBTN;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']")
	private WebElement errormsg;
	



	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}



	//utilization
	public void verifypage(String eTitle)
	{
		VerifyTitle(eTitle);
	}
	
	public void enterUsername(String un)
	{
		UsernameTB.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		PasswordTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		LoginBTN.click();
	}
	
	public String verifyErrorMessage()
	{
		VerifyElement(errormsg);
		String aErrormsg=errormsg.getText();
		return aErrormsg;
	}
	
	public String verifyversion()
	{
		VerifyElement(version);
		String aVersion=version.getText();
		return aVersion;
	}



	
	
}
