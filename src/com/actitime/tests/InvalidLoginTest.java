package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class InvalidLoginTest extends BaseTest
{
	@Test(priority=2)
	public void testInvalidLogin() throws InterruptedException
	{
		String logintitle=ExcelData.getData(file_path,"TC01",1,2);
		String errormsg=ExcelData.getData(file_path,"TC02",1,2);
		String username=ExcelData.getData(file_path,"TC02",1,0);
		String password=ExcelData.getData(file_path,"TC02",1,1);
		
		LoginPage lp=new LoginPage(driver);
		   lp.verifypage(logintitle);
		Thread.sleep(3000);
		    lp.enterUsername(username); 
			Thread.sleep(3000);

		    lp.enterPassword(password);
			Thread.sleep(3000);

		    lp.clickLogin();
			Thread.sleep(3000);

		   String actualErrorMessage =lp.verifyErrorMessage();
		   Reporter.log("Actual Errormsg:"+ actualErrorMessage,true);
		   Reporter.log("Expected Errormsg:"+ errormsg,true);
		   Assert.assertEquals(actualErrorMessage, errormsg);
		    
	}

}
