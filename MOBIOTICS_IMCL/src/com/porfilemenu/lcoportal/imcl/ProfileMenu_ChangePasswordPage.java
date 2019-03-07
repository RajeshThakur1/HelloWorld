package com.porfilemenu.lcoportal.imcl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;

public class ProfileMenu_ChangePasswordPage extends BasePage
{
  public ProfileMenu_ChangePasswordPage() 
  {
	 PageFactory.initElements(driver, this);
   }
  
  @FindBy(partialLinkText="Change password")
  private WebElement clickToChangePswrd;
  
  @FindBy(id="oldpassword")
  private WebElement enterOldPswrd;
  
  @FindBy(id="newpassword")
  private WebElement enterNewPswrd;
  
  @FindBy(xpath="//div[@class='form-group']//input[@class='btn btn-lg btn-danger']")
  private WebElement clickToUpdatePswrd;
  
  @FindBy(xpath="html/body/div[6]")
  private WebElement sucessMsg;
  
  @FindBy(xpath="html/body/div[7]")
  private WebElement errorMsg;
  
  public void changePasswordPage() throws InterruptedException
  {
	  clickToChangePswrd.click();
	  
	  waitTillElementIsVisible(enterOldPswrd);
	  enterOldPswrd.sendKeys("Test@123");
	  
	  waitTillElementIsVisible(enterNewPswrd);
	  enterNewPswrd.sendKeys("test@123");
	  
	  Thread.sleep(2000);
	  waitTillElementIsVisible(clickToUpdatePswrd);
	  clickToUpdatePswrd.click();
	  
	  //Thread.sleep(5000);
	  
	  //String strin = sucessMsg.getText();
	  
	  //if(strin.contentEquals("LCO Data updated successfully."))
	  
	  if(sucessMsg.isDisplayed())
	    {
		  waitTillElementIsVisible(sucessMsg);
		  String stringn = sucessMsg.getText();
		  System.out.println(stringn);
	    }
	  else
	  {
		  waitTillElementIsVisible(errorMsg);
		  String string1 = errorMsg.getText();
		  System.out.println(string1);
	  }
  }
}
