package com.renew.dropdown.lcoprotal.imcl;


import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lcoportal.pages.BasePage;


public class Renew_ActivateScheduleAutoRenewPlanPage extends BasePage{

    public Renew_ActivateScheduleAutoRenewPlanPage() 
    {
	   PageFactory.initElements(driver, this);
	}
    
    @FindBy(xpath="//button[@id='subscriberid']")
    private WebElement clickOnGoButtonToChangeValidity;
    
    @FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
    private WebElement enterCANNumberToScheduleAutoRenew;
        
    @FindBy(xpath="//button[@id='confirm-subscribe']")
    private WebElement clickOnConfirmButtonToChangeValidity;
    
    @FindBy(xpath="//select[@id='MUM00130PP']")
    private WebElement isSelectDropDownIsPresentInAutoRenew;
    
    @FindBy(xpath="//button[@id='confirm-subscribe']")
    private WebElement clickOnConfirmSub;
    
    @FindBy(xpath="//tbody[@class='plan-list']")
    private WebElement showThisErrorMsg;
    
    @FindBy(xpath="//button[@id='confirmcart']")
    private WebElement clickOnSubscribeButtonToChangeValidity;
    
    @FindBy(xpath="//tbody[@id='individual-progress']//td[4]")
    private WebElement showTheStatusOfThePlan;
    
    @FindBy(xpath="//tbody[@id='individual-progress']//td[5]")
    private WebElement showTheReasonforTheStatus;
  
    
    @FindBy(xpath="//h1[@class='pull-left' and contains(text(),'Selected')]")
    private WebElement showTheTextPresentInTheCurrentPage;
    
    @FindBy(xpath=".//*[@id='error-modal']//div[2]/p")
    private WebElement iHaveGotAnErrorPopUp;
    
    @FindBy(xpath="//button[@class='btn btn-info']")
    private WebElement iClickedOnCloseButtonOfErrorTable;
    
    @FindBy(xpath="//input[@type='checkbox']")
    private List<WebElement> isCheckBoxesArePresentInChangeValidtyPage;
    
    @FindBy(xpath="//h4[@id='myModalLabel']")
    private WebElement errorPage;
  
   // List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='row plans']//tbody//td[6]"));
    
    @FindBy(xpath="//tbody[@class='selected-plan-list']//td[1]")
    private WebElement planName;
    
    @FindBy(xpath="//tbody[@class='selected-plan-list']//td[2]")
    private WebElement timePeriod;
    
    @FindBy(xpath="//button[@id='confirm_selection']")
    private WebElement scheduleButton;
    
    @FindBy(xpath="//button[@id='modal-close']")
    private WebElement closeButtonPopUP;
    
    @FindBy(xpath="//p[@id='validity_error_message']")
    private WebElement errorMsg;
    
    @FindBy(xpath=".//*[@id='confirm-modal']//div//label[1]")
    private WebElement sucessText;
    
    @FindBy(xpath="//label[@id='success-modal-number']")
    private WebElement sucessNum;
    
    @FindBy(xpath=".//*[@id='confirm-modal']//div//label[3]")
    private WebElement failed;
    
    @FindBy(xpath="//label[@id='failure-modal-number']")
    private WebElement failedNum;
    
    @FindBy(xpath="//button[@id='bulkmodalsubscribe']")
    private WebElement bulkButton;
    
    @FindBy(xpath="//tbody[@class='plan-list']//td//h4")
    private WebElement errorText1;
    
    private void selectClass(WebElement elem, String value)
    {
    	Select select = new Select(elem);
    	select.deselectByVisibleText(value);
    }
  
    
    public void EnterCanNumberToChangeBasePack_Validity() throws InterruptedException {
    	waitTillElementIsVisible(enterCANNumberToScheduleAutoRenew);
    	
    	enterCANNumberToScheduleAutoRenew.clear();
    	enterCANNumberToScheduleAutoRenew.sendKeys("can20774092");
    	    	    	
    	waitTillElementIsVisible(clickOnGoButtonToChangeValidity);
    	clickOnGoButtonToChangeValidity.click();
    	

    	if(!(bulkButton.isEnabled()))
    	{

    	List<WebElement> list = driver.findElements(By.xpath("//div[@class='row plans']//tbody//td[7]"));
    	
    	for(WebElement element : list)
    	{
    		if(element.isEnabled())
    		{
              element.click();
              selectClass(isSelectDropDownIsPresentInAutoRenew, "Quarterly");
              waitTillElementIsVisible(clickOnConfirmSub);
              clickOnConfirmSub.click();
              waitTillElementIsVisible(planName);
              String string = planName.getText();
              String string1 = timePeriod.getText();
              System.out.println("Plan Name is "+string+ " Auto Renew Period is "+string1);
              waitTillElementIsVisible(scheduleButton);
              scheduleButton.click();
              String string2 = sucessText.getText();
              String string3 = sucessNum.getText();
              String string4 = failed.getText();
              String string5 = failedNum.getText();
              
              System.out.println(string2 + string3 + string4 + string5 );
              
              if(errorMsg.isDisplayed())
              {
            	  String string6 = errorMsg.getText();
            	  System.out.println(string6);
              }
              
              else
              {
            	  closeButtonPopUP.click();
              }
               }
              break;}
    }
    	else
    	{
    		waitTillElementIsVisible(errorText1);
    		String stringn = errorText1.getText();
    		System.out.println(stringn);
    	}
  }
}