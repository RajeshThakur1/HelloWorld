package com.lcoportal.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.constant.lcoportal.imcl.BaseTest;


public class LoginPage extends BaseTest
{
	
	
	
	@FindBy(xpath="//div[@class='login-form well']//input[@name='frcode']")
	private WebElement frCode;
	
	@FindBy(xpath="//div[@class='login-form well']//input[@name='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath=".//*[@id='login']/button")
	private WebElement btnLogin;
	
		
	
	
	public LoginPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	
	
	
	public void setUserName(String unString)
	{
		frCode.sendKeys("FR5125");
	}

	
	public void setPassword(String pwString)
	{
		txtPassword.sendKeys("test@123");
	}
	
	
	public void clickToProceed()
	{
		btnLogin.click();
	}
	
	public void login(String un, String pw)
	{
		setUserName(un);
		setPassword(pw);
		clickToProceed();
		//return new HomePage();
		
	}
}