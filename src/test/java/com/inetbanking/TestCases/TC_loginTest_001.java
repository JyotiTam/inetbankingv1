package com.inetbanking.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.LoginPage;

public class TC_loginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws IOException
	{
		
		System.out.println("Inside Login Test");
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		//method 1 from loginpage ggggg
		
		System.out.println("test GIT");
		
		lp.fillusername(username);
		logger.info("Entered username");
		
		//second method from loginpage
		lp.fillpassword(password);
		logger.info("Entered password");
		
		//third method
		lp.clickbtn();
		
		if(driver.getTitle(). equals("Guru99 Bank Manager HomePage"))
		{
		Assert.assertTrue(true);
		logger.info("Login test passed");
		}
		else
		{
		System.out.println(" inside else");
		captureScreen(driver,"loginTest");
		AssertJUnit.assertTrue(false);
		logger.info("Login test failed");
		
		
	    }
	
	}
	
	}
