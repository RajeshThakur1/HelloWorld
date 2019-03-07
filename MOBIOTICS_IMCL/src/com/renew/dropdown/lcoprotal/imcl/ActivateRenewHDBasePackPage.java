package com.renew.dropdown.lcoprotal.imcl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.lcoportal.pages.BasePage;

public class ActivateRenewHDBasePackPage extends BasePage
{
	
	public ActivateRenewHDBasePackPage() 
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
	private WebElement enterCANNumber;
	
	@FindBy(xpath="//button[@id='subscriberid']")
	private WebElement cliclOnGoButton;
	
	@FindBy(xpath="//div[@class='row plans']//td")
	private WebElement checkForTheTextPresence;
	
	
	public void EnterCanNumberToVerifyTheRenwenHDPack()
	{
		waitTillElementIsVisible(enterCANNumber);
		enterCANNumber.sendKeys("CAN20227054");
		
		cliclOnGoButton.click();
	}
	
	public void CheckWhetherTheCustomerDetailsIsPresentOrNot()
	{
		log.info("is this method is called");
		
		waitTillElementIsVisible(checkForTheTextPresence);
			if(checkForTheTextPresence.isDisplayed())
			{
				String text=checkForTheTextPresence.getText();
				System.out.println(text);
				
			}
			else 
			{
			   System.out.println("got some problem inn.....");
			}
	}
}


