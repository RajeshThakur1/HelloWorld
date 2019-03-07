package com.credits.walletpayments.lcoportal.imcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;

public class CardConfirmationPage extends BasePage
{
  public CardConfirmationPage() 
  {
	PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath=".//*[@id='d954841a591abe72b9537a34be87e78efdb09bbbf52e4ce1f6be63227d1dfc32cvv']")
  private WebElement enterCVV;
  
  @FindBy(xpath=".//*[@id='paymentdivbutton']")
  private WebElement clickOnPayNow;
  
  @FindBy(xpath="//div[@class='alert alert-danger']//span")
  private WebElement getErrorText;
  
  public void cardConfirmations()
  {
	  driver.findElement(By.xpath(".//*[@id='d954841a591abe72b9537a34be87e78efdb09bbbf52e4ce1f6be63227d1dfc32cvv']")).sendKeys("568");
		 //waitTillElementIsVisible(enterCVV);
		 //enterCVV.sendKeys("568");
		 
		 clickOnPayNow.click();
  }
}
