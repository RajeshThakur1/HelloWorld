package com.credits.cardpayments.lcoportal.imcl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lcoportal.pages.BasePage;

public class PaytmPaymentsPage extends BasePage 
{
  public PaytmPaymentsPage() {
	
	  PageFactory.initElements(driver, this);
  }
  
  
  @FindBy(linkText="Debit Card")
 private WebElement debitCard;
 
 @FindBy(xpath="//input[@id='cn1']")
  private WebElement enterCardNumber;
  
  @FindBy(xpath="//select[@id='dcExpMonth']")
  private WebElement selectDate;
  
  @FindBy(xpath="//select[@id='dcExpYear']")
  private WebElement selectYear;	
  
  @FindBy(xpath="//input[@id='dcCvvBox']")
  private WebElement enterCVVNumber;
  
  @FindBy(xpath="//input[@id='dcSubmit']")
  private WebElement clickOnPayButton;
  
  @FindBy(linkText="Cancel")
  private WebElement clickOnCancel;
  
  @FindBy(xpath="//input[@id='txnpassword']")
  private WebElement cardPassWord;
  
  @FindBy(xpath="//button[@id='pwd']")
  private WebElement clickOnSubmitPassWord;
  
  @FindBy(xpath="//div[@class='container-fluid plan-container plan-box']//h2")
  private WebElement getThisMsg;
  
  @FindBy(linkText="View Balance")
  private WebElement viewBalance;
  
  
  
  private void SelectValue(WebElement element, String value) 
  {
	Select select = new Select(element);
	select.selectByValue(value);
  }
  
  public void goToPaytmPaymentGateWay() throws InterruptedException
  {
	   debitCard.click();
	   enterCardNumber.sendKeys("4780740094138251");
	   SelectValue(selectDate, "12");
	   SelectValue(selectYear, "2021");
	   enterCVVNumber.sendKeys("568");
	   clickOnPayButton.click();
	   cardPassWord.click();
	   cardPassWord.sendKeys("Mobiotics@123");
	   clickOnSubmitPassWord.click();
	   Thread.sleep(2000);
       System.out.println(getThisMsg.getText());
	   viewBalance.click();
	
	}
}
  

