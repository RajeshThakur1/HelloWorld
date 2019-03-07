package com.mobiotics.hits.paymentmenu_AddPayment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

public class AddPaymentPage extends BasePage 
{
 public AddPaymentPage() 
 {
	PageFactory.initElements(driver, this);
 }
 
 @FindBy(xpath="//h1[@class='pull-leftinput']")
 private WebElement textIsPresent;
 
 @FindBy(xpath="//input[@class='form-control']")
 private WebElement enterAmountToPay;
 
 @FindBy(xpath="//button[@type='submit']")
 private WebElement payButton;
 
 
 public CitrusPaymentPage payment_EnterValues()
 {
	 enterAmountToPay.sendKeys("1");
	 payButton.click();
	 return new CitrusPaymentPage();
 }
 
 
}
