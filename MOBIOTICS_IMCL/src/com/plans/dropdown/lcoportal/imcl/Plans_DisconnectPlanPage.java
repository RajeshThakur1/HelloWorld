package com.plans.dropdown.lcoportal.imcl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;

public class Plans_DisconnectPlanPage extends BasePage{

	
	public Plans_DisconnectPlanPage() {
		PageFactory.initElements(driver, this);
	}
	
	   @FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
	   private WebElement enterCANNumberToDisconnectThePlan;
	
	   @FindBy(xpath="//button[@id='subscriberid']")
	   private WebElement clickOnGoButtonToDisconnectThePlan;
	   
	   @FindBy(xpath="//tbody[@class='plan-list']//a")
	   private WebElement clickToDisconnectAllThePlans;
	 
	   @FindBy(xpath="//tbody[@class='plan-list']//td[4]")
	   private WebElement checkIfThePlanAreActive;
	   
	   @FindBy(xpath="//div[@class='alert alert-danger top-error text-center'][1]")
	   private WebElement dynamicAlertMsgIsDisplaying;
	  
	   @FindBy(xpath="//tbody[@class='plan-list']//td[1]")
	   private WebElement isAnyPlanIsPresent;

	   @FindBy(xpath="//tbody[@class='plan-list']//td[4]")   
	   private WebElement isTheStatusOfThePlanIsActive;
	   
	   @FindBy(xpath="//a[@class='btn btn-danger anchorstatus']")
	   private WebElement isDisconnectButtonIsPresent;
	   
	   @FindBy(xpath="html/body/div[4]/div[2]/table/tbody/tr/td/h4")
	   private WebElement iWantThisAlertMsg;
	   
	   @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12 plans']//tbody//td[5]")
	   private WebElement disconnectBoxes;
	   
	   public void EnterCanNumberToDisconnectThePlan() throws Exception
	   {
		   waitTillElementIsVisible(enterCANNumberToDisconnectThePlan);
		   enterCANNumberToDisconnectThePlan.clear();
		   enterCANNumberToDisconnectThePlan.sendKeys("can20227054");
		   waitTillElementIsVisible(clickOnGoButtonToDisconnectThePlan);
		   clickOnGoButtonToDisconnectThePlan.click();
		    
		   List<WebElement> button = driver.findElements(By.xpath("//tbody[@class='plan-list']//tr//td[5]"));
		   //boolean isCheckBoxChecked=false;
	    	 
			for(WebElement elements :button) {
				
   	 		if(elements.isEnabled()) {
   	 			
   	 			//log.info("first if loop");
   	 			      waitTillElementIsVisible(elements);
		    	      elements.click();	
		    	      Thread.sleep(3000);
				      waitTillElementIsVisible(iWantThisAlertMsg);
			          String string = iWantThisAlertMsg.getText();
			          System.out.println(string);
			    }
			    
		   } 
}	   }

