package com.credits.cardpayments.lcoportal.imcl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lcoportal.pages.BasePage;

public class IndusIndPaymentGateWay extends BasePage
{
   public IndusIndPaymentGateWay() {
	   PageFactory.initElements(driver, this);
   }
   
   
   @FindBy(xpath="//div[@id='merchantlogo']")
	private WebElement indusIndPaymentGateWay;
		
	@FindBy(xpath="//a[@id='TL00']")
	private WebElement cardPayButton;
	
	@FindBy(id="L01")
    private WebElement creditCardPayButton;
		
   	@FindBy(xpath="//input[@id='L02']")
	private WebElement debitCardPayButton;
		
    @FindBy(id="selectCreditCard")
	private WebElement selectCardType;
	
	@FindBy(xpath="//input[@id='credit_submit']")
	private WebElement payFromCreditCard;
	
	@FindBy(xpath="//input[@id='cardNumber']")
	private WebElement enterCardNumber;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement selectMonth;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement selectYear;
	
	@FindBy(xpath="//input[@id='CVVNumber']")
	private WebElement enterCVVNumber;
	
	@FindBy(xpath="//input[@id='txnpassword']")
	private WebElement enterPassWord;
	
	@FindBy(xpath="//button[@id='pwd']")
	private WebElement submitButton;
	
	@FindBy(xpath="//input[@id='credit_submit']")
	private WebElement clickOnPayButton;
	
	
   
	private void SelectValue(WebElement element, String value) 
	  {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	  }
	
	public void goToIndusIndPaymentGateWay() throws InterruptedException
	{
		//if(indusIndPaymentGateWay.isDisplayed())
		//{
			
		//cardPayButton.click();
		
		//creditCardPayButton.click();
		
		SelectValue(selectCardType, "VISA");
		  
		enterCardNumber.sendKeys("4780740094138251");
		
		SelectValue(selectMonth, "12");
		  
		SelectValue(selectYear, "2021");
		  
		enterCVVNumber.sendKeys("568");
		
		Thread.sleep(2000);
		clickOnPayButton.click();
		
		Thread.sleep(3000);
		}  
		//return new VerifyVisaPage(); 
	  }
//}
