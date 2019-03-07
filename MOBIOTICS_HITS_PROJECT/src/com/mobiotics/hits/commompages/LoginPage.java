package com.mobiotics.hits.commompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.constants.BaseTest;

public class LoginPage extends BaseTest
{
	
	
	
	@FindBy(xpath="//div[@class='first form-group']//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath="//div[@class='form-group']//input[@name='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-info']")
	private WebElement btnLogin;
	
		
	
	
	public LoginPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	
	
	
	public void setUserName(String enterUser)
	{
		userName.sendKeys("LCO200000955.01");
	}

	
	public void setPassword(String pwString)
	{
		txtPassword.sendKeys("Grant@123");
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