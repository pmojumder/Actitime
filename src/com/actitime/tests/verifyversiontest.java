package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

import junit.framework.Assert;

public class verifyversiontest extends BaseTest 
{
  @Test(priority=3)
  public void testverifyversion()
  {
	  String logintitle=ExcelData.getData(file_path, "TC01", 1, 2);
	  String version=ExcelData.getData(file_path, "TC03",1,0);
	  LoginPage lp=new LoginPage(driver);
	  lp.verifypage(logintitle);
	  String actualversion=lp.verifyversion();
	  Reporter.log("actual version "+actualversion);
	  Reporter.log("Expected Version "+version);
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(version, actualversion);
	  sa.assertAll();
	  Reporter.log("Version is Matching:....");
  }
}
