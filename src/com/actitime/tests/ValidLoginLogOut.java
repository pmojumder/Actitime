package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrack;
import com.actitime.pages.LoginPage;

public class ValidLoginLogOut extends BaseTest 
{
  @Test(priority=1)
  public void testValidLoginLogout()
  {
	String username=ExcelData.getData(file_path,"TC01",1,0);
	String password=ExcelData.getData(file_path,"TC01",1,1);
	String logintitle=ExcelData.getData(file_path,"TC01",1,2);
	String entertimetracktitle=ExcelData.getData(file_path,"TC01",1,3);
    
    LoginPage lp=new LoginPage(driver);
    EnterTimeTrack cp=new EnterTimeTrack(driver);
    
    lp.enterUsername(username);
    lp.enterPassword(password);
    lp.clickLogin();
    lp.VerifyTitle(entertimetracktitle);
    
    cp.clickLogout(); 

  }
}
