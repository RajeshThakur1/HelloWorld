package com.subscriberMenu.lcoportol.imcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;

public class SubscriberMenu_ModifyCustomer extends BasePage 
{
   public SubscriberMenu_ModifyCustomer() {
	
	   PageFactory.initElements(driver, this);
}
   
   @FindBy(id="customerno")
   private WebElement enterCanToModifyCustomer;
   
   @FindBy(id="check")
   private WebElement clickToModify;
   
   @FindBy(id="mobileno")
   private WebElement enterPhoneNumberToModify;
   
   @FindBy(id="email")
   private WebElement emial;
   
   @FindBy(id="aadharno")
   private WebElement aadharNum;
   
   @FindBy(id="update")
   private WebElement clickOnUpdateButton;
   
   @FindBy(xpath="//p[@class='text-error error']")
   private WebElement failureMsg;
   
   @FindBy(xpath="//p[@class='text-success success']")
   private WebElement sucessMsg;
   
   
   
   public void ModifyCustmomer1() throws InterruptedException
   {
	   
	   enterCanToModifyCustomer.clear();
	   enterCanToModifyCustomer.sendKeys("can20109349");
	   clickToModify.click();
	   Thread.sleep(5000);
	   if(enterPhoneNumberToModify.isDisplayed())
	   {
	   waitTillElementIsVisible(enterPhoneNumberToModify);
	   enterPhoneNumberToModify.clear();
	   enterPhoneNumberToModify.sendKeys("9535985980");
	   
	   waitTillElementIsVisible(emial);
	   emial.clear();
	   emial.sendKeys("santhosh.shiva@mobiotics.com");
	   
	   waitTillElementIsVisible(aadharNum);
	   aadharNum.clear();
	   aadharNum.sendKeys("123456781234");
	   
	   waitTillElementIsVisible(clickOnUpdateButton);
	   clickOnUpdateButton.click();
	   Thread.sleep(5000);
	   
	   try {
		   if(sucessMsg.isDisplayed())
		      {
			    String succesMsg = sucessMsg.getText();
			    System.out.println(succesMsg);
		       }
		      else
		         {
			      String failMsg = failureMsg.getText();
			      System.out.println(failMsg);
		         }
	        }
	    catch (Exception e) 
	        {
		     e.printStackTrace();
	        }
        }
        else
          {
	       String string = driver.findElement(By.xpath(".//*[@id='modifycustomer']/div/p[2]")).getText();
	       System.out.println(string);
          }
     } 
}
