package com.renew.dropdown.lcoprotal.imcl;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.HomePage;



public class ActivateRenewPlanPage extends HomePage
{
	
 boolean isCheckBoxChecked=false;
  public ActivateRenewPlanPage() 
  {
	PageFactory.initElements(driver, this); 
  }
  
    
  @FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
  private WebElement enterCanNumberForValidatingRenewPlanPage;
  
  @FindBy(xpath="//button[@id='subscriberid']")
  private WebElement clickOnGoButtonToValidateRenewPlanPage;
  
  @FindBy(xpath="//input[@type='checkbox']")
  private List<WebElement> checkIfCheckBoxesAreCheckedinRenewPlanPage;
  
  @FindBy(xpath="//button[@id='confirm-subscribe']")
  private WebElement clickOnConfirmButtonToRenewPlanPage;
  
  @FindBy(xpath="//h1[@class='pull-left' and contains(text(), 'Selected')]")
  private WebElement ckeckWhetherTheTextIsPresentInRenewPlanPage;
  
  @FindBy(xpath="//button[@id='confirmcart']")
  private WebElement clickOnSubscribeButtonToSubscribePlanOnRenewPlanPage;
  
  @FindBy(xpath="//tbody[@id='individual-progress']//td[4]")
  private WebElement showTheStatusOnSubscribingTheRenewPlanPage;
  
  @FindBy(xpath="//tbody[@id='individual-progress']//td[5]")
  private WebElement showTheStatusReasonOnRenewPlanPage;
  
  @FindBy(xpath="//tbody[@class='plan-list']")
  private WebElement showThisErrorMsgOnRenewPlanPage;
  
  @FindBy(xpath=".//*[@id='error-modal']/div/div/div[2]/p")
  private WebElement IGotThisErrorOnClickingEmptyConfirmButtonOnRenewPlanPage;
  
  @FindBy(xpath="//button[@class='btn btn-info']")
  private WebElement IamClickingOnCloseButtonOfErrorPopInRenewPlanPage;
  
   
  
  public void EnterCanNumberToRenewPlan() throws InterruptedException {
	  
  	waitTillElementIsVisible(enterCanNumberForValidatingRenewPlanPage);
  	enterCanNumberForValidatingRenewPlanPage.sendKeys("can20227054");
  	    	    	
  	waitTillElementIsVisible(clickOnGoButtonToValidateRenewPlanPage);
  	clickOnGoButtonToValidateRenewPlanPage.click();
  	Thread.sleep(2000);	   	
  	   
  
  
 // public void IsMyCheckBoxesAreCheckedInRenewPlanPage() throws Exception {
	  
	  
  	  List<WebElement> list = checkIfCheckBoxesAreCheckedinRenewPlanPage;
  		
  	 	 	
  	 	for(WebElement elements :list) {
				
  	 		 if(elements.isEnabled()) {
  	 			
  	 			   //log.info("first if loop");
  	 			   elements.click();
  	 			   isCheckBoxChecked=true; 
  	 			   break;} }
			
			
  	 	         if(isCheckBoxChecked) {
  	 		
  	 		          //  log.info("second if loop");
  	 		            clickOnConfirmButtonToRenewPlanPage.click();
  	 		            System.out.println("customer is checked");
  	 		            //log.info("after clicking on 1st confirm button");
  	 		            Thread.sleep(2000);
  	 		            WebElement textIsDisplayed= ckeckWhetherTheTextIsPresentInRenewPlanPage;
				        Thread.sleep(2000);
  	 		            System.out.println(textIsDisplayed.getText());
  	 		            Thread.sleep(2000);
  	 		           // log.info("I have clicked and waiting for status info");
  	 		            clickOnSubscribeButtonToSubscribePlanOnRenewPlanPage.click();
  	 		
  	 		            Thread.sleep(2000);
  	 		          //  log.info("this is used to show the status of the plan");
  	 		            WebElement showTheStatus= showTheStatusOnSubscribingTheRenewPlanPage;
  	 		
  	 		            Thread.sleep(2000);
  	 		            WebElement showTheStatusReason = showTheStatusReasonOnRenewPlanPage;
  	 	                System.out.println("The Status Of the Plan for change validity is "+showTheStatus.getText()+  
  	 	                		           " and The Reason for the status "+showTheStatusReason.getText()); }
  	 	
  	 	
  	 	
  	 	             else if(showThisErrorMsgOnRenewPlanPage.isDisplayed() && checkIfCheckBoxesAreCheckedinRenewPlanPage.isEmpty()) {
  	 		
  	 		                   //  log.info("this is else if loop");
  	 		                     WebElement showErrorMsg = showThisErrorMsgOnRenewPlanPage;
  	 		                     System.out.println(showErrorMsg.getText());}
  	 	
  	 	
  	 	                    else {
  	 		  
  	 		  //                      log.info("this is else loop");
  	 		                        clickOnConfirmButtonToRenewPlanPage.click();
					
			                        log.info("I'm clicking 2nd confirm button");
			                        WebElement getThisMsg = IGotThisErrorOnClickingEmptyConfirmButtonOnRenewPlanPage;
			                        waitTillElementIsVisible(getThisMsg);
			                        System.out.println(getThisMsg.getText());
					
			                     //   log.info("i clicked here");
			                        IamClickingOnCloseButtonOfErrorPopInRenewPlanPage.click(); } } }
  

