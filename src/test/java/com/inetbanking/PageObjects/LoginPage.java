package com.inetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public LoginPage(WebDriver rdriver)
	{
		WebDriver ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}	
		
		
	@FindBy(name="uid")	
	WebElement username;
		
	@FindBy(name="password")
	WebElement password;
		
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement lnklogout;

	public void fillusername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void fillpassword(String pname)
	{
	 password.sendKeys(pname);
	}
	public void clickbtn()
	{
		btnlogin.click();
	}
	
	public void clickLogout()
	{
		lnklogout.click();
	}
}
