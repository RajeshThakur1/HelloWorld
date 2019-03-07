package com.subscriberMenu.lcoportol.imcl;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lcoportal.pages.BasePage;

import generics.DateHelper;

public class SubscriberMenu_TicketsPage extends BasePage 
{
  public SubscriberMenu_TicketsPage() 
  {
	PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//form[@id='ticketidsearch']//input")
  private WebElement searchByTicketId;
  
  @FindBy(xpath="//form[@id='ticketidsearch']//button")
  private WebElement ticketIdbutton;
  
  @FindBy(xpath="//form[@id='customernosearch']//input")
  private WebElement searchByCustomerNum;
  
  @FindBy(xpath="//form[@id='customernosearch']//button")
  private WebElement customerNumButton;
  
  @FindBy(xpath="//select[@id='status']")
  private WebElement select;
  
  @FindBy(xpath="//button[@id='refresh']")
  private WebElement dateButton;
  
  @FindBy(xpath="//table[@class='table table-striped']//tbody//tr//td[8]")
  private List<WebElement> closeTicketsButton;
  
  @FindBy(xpath="//div[@class='modal-body text-center']//p")
  private WebElement confirmPage;
  
  @FindBy(xpath="//div[@class='modal-footer']//button[contains(text(), 'Yes')]")
  private WebElement clickOnYesButton;
  
  @FindBy(xpath="//div[@class='modal-footer']//button[@class='btn btn-default' and contains(text(), 'Close')]")
  private WebElement clickOnCloseButton;
  
  @FindBy(xpath="html/body/div[7]")
  private WebElement sucessMsg;
  
  @FindBy(xpath="//table[@class='table table-striped']//tbody//tr//td[contains(text(), 'No Tickets available.')]")
  private WebElement errorMsg;
  
  
  private void selectStatus(WebElement element, String string) 
  {
	Select select = new Select(element);
	select.selectByVisibleText(string);
   }
  
  public void ticketStatusPage() throws InterruptedException
  {
	  
	DateHelper datePicker = new DateHelper();
	datePicker.selectMonth("May");
	datePicker.selectDate("1");
	dateButton.click();
	//waitTillElementIsVisible(searchByCustomerNum);
	//searchByCustomerNum.sendKeys("can20109349");
	waitTillElementIsVisible(select);
	selectStatus(select, "NEW");
	Thread.sleep(2000);
	if(closeTicketsButton.size() !=0)
	{
	 for(WebElement ele : closeTicketsButton)
	   {
		ele.click();
		String string1 = confirmPage.getText();
		System.out.println(string1);
		Thread.sleep(2000);
		clickOnYesButton.click();
		Thread.sleep(2000);
		String string2 = sucessMsg.getText();
		System.out.println(string2);
	   }
	}
	else
	{
		String string = errorMsg.getText();
		System.out.println(string);
	}
  }
}