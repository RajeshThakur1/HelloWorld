package com.renew.dropdown.lcoprotal.imcl;

import java.util.List;

//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;


public class ActivateRenewChangeValidityPlanPage extends BasePage
{
    public ActivateRenewChangeValidityPlanPage() 
    {
	   PageFactory.initElements(driver, this);
	}
    
    @FindBy(xpath="//button[@id='subscriberid']")
    private WebElement clickOnGoButtonToChangeValidity;
    
    @FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
    private WebElement enterCANNumberToChangeValidity;
       
    @FindBy(xpath="//button[@id='confirm-subscribe']")
    private WebElement clickOnConfirmButtonToChangeValidity;
       
    @FindBy(xpath="//tbody[@class='plan-list']")
    private WebElement showThisErrorMsg;
    
    @FindBy(xpath="//button[@id='confirmcart']")
    private WebElement clickOnSubscribeButtonToChangeValidity;
    
    @FindBy(xpath="//tbody[@id='individual-progress']//td[4]")
    private WebElement showTheStatusOfThePlan;
    
    @FindBy(xpath="//h1[@class='pull-left' and contains(text(),'Selected')]")
    private WebElement showTheTextPresentInTheCurrentPage;
    
    @FindBy(xpath=".//*[@id='error-modal']/div/div/div[2]/p")
    private WebElement iHaveGotAnErrorPopUp;
    
    @FindBy(xpath="//button[@class='btn btn-info']")
    private WebElement iClickedOnCloseButtonOfErrorTable;
    
    @FindBy(xpath="//input[@type='checkbox']")
    private List<WebElement> isCheckBoxesArePresentInChangeValidtyPage;
    
    
    public void EnterCanNumberToChangeValidity() throws InterruptedException {
    	waitTillElementIsVisible(enterCANNumberToChangeValidity);
    	enterCANNumberToChangeValidity.sendKeys("CAN20227054");
    	    	    	
    	waitTillElementIsVisible(clickOnGoButtonToChangeValidity);
    	clickOnGoButtonToChangeValidity.click();
    	Thread.sleep(2000);
    	
    	  List<WebElement> list = isCheckBoxesArePresentInChangeValidtyPage;
    		
    	 	 	
    	  boolean isCheckBoxChecked=false;
    	 
			for(WebElement elements :list) {
				
    	 		if(elements.isEnabled()) {
    	 			
    	 			//log.info("first if loop");
    	 			elements.click(); }
    	 		
    	 		
    	 		isCheckBoxChecked=true; 
    	 		
    	 	
    	 	    if(isCheckBoxChecked) {
    	 		
    	 		//log.info("second if loop");
    	 		clickOnConfirmButtonToChangeValidity.click();
    	 		//System.out.println("customer is checked");
    	 		//log.info("after clicking on 1st confirm button");
    	 		Thread.sleep(2000);
    	 		WebElement textIsDisplayed= showTheTextPresentInTheCurrentPage;
				Thread.sleep(2000);
    	 		System.out.println(textIsDisplayed.getText());
    	 		
    	 		Thread.sleep(2000);
    	 		//log.info("I have clicked and waiting for status info");
    	 		clickOnSubscribeButtonToChangeValidity.click();
    	 		
    	 		Thread.sleep(2000);
    	 		//log.info("this is used to show the status of the plan");
    	 		WebElement showTheStatus= showTheStatusOfThePlan;
    	 		
    	 		Thread.sleep(2000);
    	 		System.out.println("The Status Of the Plan for change validity is "+showTheStatus.getText()); }
    	 	
    	 	    else if(showThisErrorMsg.isDisplayed()) {
    	 	    	
    	 		//log.info("this else if loop");
    	 		WebElement showErrorMsg = showThisErrorMsg;
    	 		System.out.println(showErrorMsg.getText()); }
    	 	
    	 	
    	 	         else {
    	 		
    	 		           try {
    	 		        	   
    	 			//             log.info("this else loop");
					             clickOnConfirmButtonToChangeValidity.click();
					
					  //           log.info("I'm clicking 2nd confirm button");
					             WebElement getThisMsg = iHaveGotAnErrorPopUp;
					             waitTillElementIsVisible(getThisMsg);
					             System.out.println(getThisMsg.getText());
					
					    //         log.info("i clicked here");
					             iClickedOnCloseButtonOfErrorTable.click(); }
    	 		           
    	 		            catch (Exception e) {
    	 		            	
					              e.printStackTrace(); } } } } }