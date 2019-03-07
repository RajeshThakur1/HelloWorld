package com.credits.cardpayments.lcoportal.imcl;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;

public class Credits_AddCreditsFromCards extends BasePage{

	

	public Credits_AddCreditsFromCards() {
		PageFactory.initElements(driver, this);
	}
	
	
//----------------------credits details----------------------------------------------------------
	@FindBy(xpath="//span[@id='balance']")
	private WebElement availableBalance;
	
	@FindBy(xpath="//input[@name='amount']")
	private WebElement enterTheAmountToBeCredited;
	
	@FindBy(xpath="//input[@value='normal']")
	private WebElement netBankingUsingCards; 
		
	@FindBy(xpath="//button[@class='btn btn-info' and contains(text(), 'Pay')]")
	private WebElement clickOnPayButton;
	
//---------------------------PayTM GateWay-------------------------------------------------------------
	
	@FindBy(id="TL01")
	private List<WebElement> creditCardPayment;
	
	@FindBy(id="cardNumber")
	private WebElement enterCreditCardNumber;
	
//-------------------------This is INDUSIND MEDIA COMM LTD--------------------------------------------------
		
	@FindBy(xpath="//div[@id='merchantlogo']")
	private WebElement indusIndPaymentGateWay;
		
	@FindBy(xpath="//a[@id='TL00']")
	private WebElement cardsPayment;
		
    @FindBy(xpath="//input[@id='L01']")
	private WebElement creditCardPayButton;
		
	@FindBy(xpath="//input[@id='L02']")
	private WebElement debitCardPayButton;
		
    @FindBy(xpath="//select[@id='selectCreditCard']")
	private WebElement selectCardType;
	
	@FindBy(xpath="//input[@id='credit_submit']")
	private WebElement payFromCreditCard;
	
	@FindBy(xpath="//input[@id='cardNumber']")
	private WebElement mobikwikAmountDetails;
	
	
	public void GotoPaymentsPage() throws Exception
	{
		enterTheAmountToBeCredited.sendKeys("1");
		netBankingUsingCards.click();
		waitTillElementIsVisible(clickOnPayButton);
		clickOnPayButton.click();
		if(driver.getTitle().contains("TechProcess Payment"))
		{
			IndusIndPaymentGateWay indusPay = new IndusIndPaymentGateWay();
			indusPay.goToIndusIndPaymentGateWay();
		}
		else 
		  {
			PaytmPaymentsPage paytm = new PaytmPaymentsPage();
			 paytm.goToPaytmPaymentGateWay();			
		   }
	}
  
}
