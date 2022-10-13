package com.inetbanking.TestCases;

import java.io.IOException;
import java.io.InterruptedIOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.AddCustomerPage;
import com.inetbanking.PageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException  
	{
	LoginPage lp=new LoginPage(driver);
	lp.fillusername(username);
	logger.info("username is provided");
	lp.fillpassword(password);
	logger.info("password is provided");
	lp.clickbtn();
	
	Thread.sleep(3000);
	AddCustomerPage addcust=new AddCustomerPage(driver);
	addcust.clickAddNewCustomer();
	logger.info("providing customer details");
	
	addcust.custName( "jyoti");
	addcust.custGender("female");
	addcust.custdob("10","15","1985");
	Thread.sleep(5000);
	addcust.custaddress("USA");
	addcust.custcity("NC");
	addcust.custstate("NC");
	addcust.custpinno("5000074");
	addcust.custtelephoneno("11111111111");
	
	String email=randomestring()+"@gmail.com";
	addcust.custemailid(email);
	addcust.custpassword("abcdef");
	addcust.custsubmit();
	
	Thread.sleep(3000);
	logger.info("validation is started");
	
	boolean res=driver.getPageSource().contains("Customer Registered Successfully");
	
	System.out.println();
	System.out.println("after boolean");
	
	if(res == true)
	{
	Assert.assertTrue(true);
	logger.info("test case pass");
	
	}
	else
	{
	logger.info("test case failed");
	
	captureScreen(driver,"addNewCustomer");
	Assert.assertTrue(false);
	}
	}
	

}
