package com.subscriber.list.lcoprotal.imcl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.HomePage;
//import com.lcoportal.pages.Navigation_Menu;

public class ActivateSchemBasedPlanPage extends HomePage
{
	public ActivateSchemBasedPlanPage() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='subscriberid']")
	private WebElement enterCanNum;
	
	@FindBy(xpath="//button[@id='subscriberid']")
	private WebElement clickTheButton;
		
	@FindBy(xpath="//tbody[@class='plan-list']")
	private WebElement showTheMsg;
	
	@FindBy(id="bulkmodalsubscribe")
	 public WebElement isBulkbuttonPresent;
	
	
		
	
	public void goToSchemBasedPlan() throws InterruptedException
	{
		
		enterCanNum.clear();
		enterCanNum.sendKeys("can20227054");
		
		clickTheButton.click();
		//boolean notHDCustomer = false;
		
		Thread.sleep(2000);
		if(showTheMsg.isDisplayed())
		{
			waitTillElementIsVisible(showTheMsg);
			Thread.sleep(2000);
		   String errorMsg = showTheMsg.getText();
		   
			System.out.println(errorMsg);
		}
		waitTillElementIsVisible(isBulkbuttonPresent);
		System.out.println("button found");
		//return isBulkbuttonPresent.isDisplayed();
	}
	

	
	
	
}