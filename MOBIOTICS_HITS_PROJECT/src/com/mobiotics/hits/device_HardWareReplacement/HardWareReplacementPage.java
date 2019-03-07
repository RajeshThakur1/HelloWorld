package com.mobiotics.hits.device_HardWareReplacement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.hits.commompages.BasePage;

public class HardWareReplacementPage extends BasePage
{
  public HardWareReplacementPage() 
  {
	PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//input[@id='old-sl-no']")
  private WebElement enterOldSerialNum;
  
  @FindBy(xpath="//input[@id='new-sl-no']")
  private WebElement enterNewSerialNum;
  
  @FindBy(xpath="//select[@id='swap-reason']")
  private WebElement selectReason;
  
  @FindBy(xpath="//button[@id='swap-device-submit']")
  private WebElement clickOnProceed;
  
  @FindBy(xpath="html/body/div[4]")
  private WebElement errorMsg;
  
  @FindBy(xpath="html/body/div[5]")
  private WebElement sucessMsg;
  
  //@FindBy(xpath="html/body/div[4]")
  //private WebElement dynamicErrorText;
 
  
  public void HardWareReplacement() throws InterruptedException
  {
	  enterOldSerialNum.sendKeys("380000000000098");
	  
	  enterNewSerialNum.sendKeys("380000000000115");
	  
	  Select select = new Select(selectReason);
	  
	  select.selectByVisibleText("Device is Faulty");
	  
	  clickOnProceed.click();
	  Thread.sleep(2000);
	  
	  try {
		  
		if(errorMsg.isDisplayed())
		  {
			waitTillElementIsVisible(errorMsg);
			  String fail = errorMsg.getText();
			  System.out.println(fail);  
		  }
		  else if(sucessMsg.isDisplayed())
		  {
			  waitTillElementIsVisible(sucessMsg);
			  String pass = sucessMsg.getText();
			  System.out.println(pass);
			  
		  }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
