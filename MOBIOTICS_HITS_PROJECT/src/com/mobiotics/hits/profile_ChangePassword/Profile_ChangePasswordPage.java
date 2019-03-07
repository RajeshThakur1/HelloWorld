package com.mobiotics.hits.profile_ChangePassword;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

public class Profile_ChangePasswordPage extends BasePage
{
  public Profile_ChangePasswordPage() 
  {
	 PageFactory.initElements(driver, this);
  }
  
  @FindBy(partialLinkText="Change Password")
  private WebElement clickOnChangePswd;
  
  @FindBy(id="newpassword")
  private WebElement enterNewPswd;
  
  @FindBy(id="confirmpassword")
  private WebElement confirmPswd;
  
  @FindBy(xpath="//button[@class='btn btn-lg btn-info']")
  private WebElement clickToProceed;
  
  @FindBy(xpath=".//*[@id='changepassword']/p")
  private WebElement confirmMsg;
  
  
  
  public void changePassword()
  {
	  clickOnChangePswd.click();
	  
	  waitTillElementIsVisible(enterNewPswd);
	  enterNewPswd.sendKeys("Grant@1234");
	  
	  waitTillElementIsVisible(confirmPswd);
	  confirmPswd.sendKeys("Grant@1234");
	  
	  waitTillElementIsVisible(clickToProceed);
	  clickToProceed.click();
	  
	  waitTillElementIsVisible(confirmMsg);
	  String string = confirmMsg.getText();
	  System.out.println(string);
	  
	  clickToProceed.click();
  }
}
