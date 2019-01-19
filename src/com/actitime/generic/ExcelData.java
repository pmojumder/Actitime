package com.actitime.generic;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ExcelData {
	
	public static String getData(String filepath,String sheet_name,int rn,int cn)
	{
		try
		{
			FileInputStream fis=new FileInputStream(filepath);
			Workbook wb=WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(sheet_name);
			Row rn1=sh.getRow(rn);
			org.apache.poi.ss.usermodel.Cell cn1=rn1.getCell(cn);
			
			String data=cn1.getStringCellValue();
			return data;
			
		}
		catch(Exception e)
		{
			return "";
		}
	}
	
	public static int getrownum(String filepath,String sheet_name)
	{
		try
		{
			FileInputStream fis=new FileInputStream(filepath);
			Workbook wb=WorkbookFactory.create(fis);
			int rc=wb.getSheet(sheet_name).getLastRowNum();
			return rc;
			
	}
		catch(Exception e)
		{
			return -1;
		}
	}
	
	public static int getcellnum(String filepath,String sheet_name,int rn)
	{
		try
		{
			FileInputStream fis=new FileInputStream(filepath);
			Workbook wb=WorkbookFactory.create(fis);
			int cc=wb.getSheet(sheet_name).getRow(rn).getLastCellNum();
			return cc;
			
	}
		catch(Exception e)
		{
			return -1;
		}
	}

}
