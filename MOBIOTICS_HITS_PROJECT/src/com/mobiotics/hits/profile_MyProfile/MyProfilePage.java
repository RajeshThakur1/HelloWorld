package com.mobiotics.hits.profile_MyProfile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

public class MyProfilePage extends BasePage
{
   public MyProfilePage()
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath="//input[@name='email']")
   private WebElement emailId;
   
   @FindBy(xpath="//input[@name='gstno']")
   private WebElement gstNum;
   
   @FindBy(xpath="//input[@name='mobileno']")
   private WebElement mobileNum;
   
   @FindBy(xpath="//input[@type='submit']")
   private WebElement submitButton;
   
   @FindBy(xpath="//div[@id='mypopmessage']//div//p")
   private WebElement errorMsg;
   
   @FindBy(xpath="//div[@id='mypopmessage']//div//button[contains(text(),'Ok')]")
   private WebElement clickOkToExitErrorMsg;
   
  
   
   public void changeMyProfile() throws InterruptedException
   {
	   Thread.sleep(4000);
	   emailId.clear();
	   emailId.sendKeys("santhosh.shiva@mobiotics.com");
	   Thread.sleep(4000);	   
	   waitTillElementIsVisible(mobileNum);
	   mobileNum.clear();
	   mobileNum.sendKeys("9535985980");
	   Thread.sleep(4000);
	   waitTillElementIsVisible(submitButton);
	   submitButton.click();
	   Thread.sleep(4000);
	   waitTillElementIsVisible(errorMsg);
	   String string = errorMsg.getText();
	   System.out.println(string);
	   Thread.sleep(4000);
	   waitTillElementIsVisible(clickOkToExitErrorMsg);
	   clickOkToExitErrorMsg.click();
   }
}
