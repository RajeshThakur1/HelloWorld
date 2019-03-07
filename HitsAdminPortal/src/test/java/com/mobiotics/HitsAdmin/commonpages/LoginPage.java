package com.mobiotics.HitsAdmin.commonpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HitsAdmin.constants.BaseTest;

public class LoginPage extends BaseTest {

	@FindBy(name = "adminid")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement txtPassword;

	@FindBy(name = "passphrase")
	private WebElement passPhrase;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickToLogin;
	

	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	

	public void setUserName(String enterUser) {
		userName.sendKeys("1111");
	}

	public void setPassword(String pwString) {
		txtPassword.sendKeys("test");
	}

	public void setPassphrase(String enterPassPhrase) {
		passPhrase.sendKeys("indigital123");
	}

	public void clickToProceed() {
		clickToLogin.click();
	}

	public void login(String un, String pw, String paphr) {
		setUserName(un);
		setPassword(pw);
		setPassphrase(paphr);
		clickToProceed();
		// return new HomePage();

	}
}