package com.plans.dropdown.lcoportal.imcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;

public class Plans_ReconnectPlanPage extends BasePage{

	public Plans_ReconnectPlanPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	 @FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
	 private WebElement enterCANNumberToReconnectThePlan;
	
	 @FindBy(xpath="//button[@id='subscriberid']")
	 private WebElement clickOnGoButtonToReconnectThePlan;
	
	@FindBy(xpath="//h1[@class='pull-leftinput']")
	private WebElement isTheReconnectPlansTextIsPresent; 
	
	@FindBy(xpath="//button[@id='41438551disconnect']")
	private WebElement clickHereToReConnectThePlans;
	
	@FindBy(xpath="//tbody[@class='plan-list']//td[1]")
	private WebElement thisAreThePlansNameToReconnet;
	
	@FindBy(xpath="//tbody[@class='plan-list']//td[4]")
	private WebElement statusOfThePlanIs;
	
	@FindBy(xpath="//div[@class='alert alert-success top-success text-center']")
	private WebElement planSucessfullMsg;
	
	@FindBy(xpath="//tbody[@class='plan-list']//h4")
	private WebElement errorMsgIsDisplayed;
	
	@FindBy(xpath="//tbody[@class='plan-list']//td[4]")
	private WebElement status;
	
	//tbody[@class='plan-list']//td[4]
	
	@FindBy(xpath="//button[@id='40943830reconnect']")
	private WebElement statusOf;
	
	public void EnterCanNumberToReconnectThePlan() throws Exception
	   {
		   waitTillElementIsVisible(enterCANNumberToReconnectThePlan);
		   enterCANNumberToReconnectThePlan.clear();
		   enterCANNumberToReconnectThePlan.sendKeys("can20227054");
		   
		   clickOnGoButtonToReconnectThePlan.click();
		   Thread.sleep(2000);
		   
		   try {
			   
			   if(!(driver.findElements(By.xpath("//tbody[@class='plan-list']//tr//td[5]")).isEmpty()))
			
			   {
				log.info("in 1st if");
				waitTillElementIsVisible(clickHereToReConnectThePlans);
			    clickHereToReConnectThePlans.click();
			    String string = errorMsgIsDisplayed.getText();
			    System.out.println(string);
			   }
			    
			   else if(errorMsgIsDisplayed.isDisplayed())
			    {
				   log.info("in 2nd if");
				   waitTillElementIsVisible(errorMsgIsDisplayed);
				   String string1 = errorMsgIsDisplayed.getText();
				   System.out.println(string1);
			   }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   } 
			
}