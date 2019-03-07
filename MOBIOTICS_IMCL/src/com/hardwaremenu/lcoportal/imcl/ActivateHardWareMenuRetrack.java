package com.hardwaremenu.lcoportal.imcl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;

public class ActivateHardWareMenuRetrack extends BasePage{

	public ActivateHardWareMenuRetrack() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//form[@id='retrack']//h4")
	private WebElement isThisTextPresent;
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement enterCanNumToRetrack;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickOnSendButton;
	
	@FindBy(xpath="//p[@class='text-error error message']")
	private WebElement thisIsErrorMsg;
	
	@FindBy(xpath="//form[@id='retrack']//p[@class='text-success success message']")
	private WebElement thisIsSucessMsg;
	
	@FindBy(xpath="//P[@style='opacity: 1;']")
	private WebElement commonMsg;
	
	public void thisMethodIsForRetracking() throws Exception
	{
		waitTillElementIsVisible(isThisTextPresent);
		String text= isThisTextPresent.getText();
		System.out.println(text);
		
		enterCanNumToRetrack.clear();
		enterCanNumToRetrack.sendKeys("can20227054");
		
		clickOnSendButton.click();
			
		if(thisIsSucessMsg.isDisplayed())
		{
			
			String sucessMsg = thisIsSucessMsg.getText();
			System.out.println(sucessMsg);
		}
		else
		{
			
			String errorMsg = thisIsErrorMsg.getText();
			waitTillElementIsVisible(thisIsErrorMsg);
			System.out.println(errorMsg);
		}
	}
}

