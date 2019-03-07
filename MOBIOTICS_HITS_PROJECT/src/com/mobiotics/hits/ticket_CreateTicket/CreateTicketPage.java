package com.mobiotics.hits.ticket_CreateTicket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.hits.commompages.BasePage;

public class CreateTicketPage extends BasePage
{
  public CreateTicketPage() 
  {
	PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//select[@id='categoryid']")
  private WebElement selectCategory;
  
  @FindBy(xpath="//select[@id='subcategoryid']")
  private WebElement selectSubCategory;
  
  @FindBy(xpath="//select[@id='subcategoryid2']")
  private WebElement selectSubCategory2;
  
  @FindBy(id="contactmethod")
  private WebElement selectContactMethod;
  
  @FindBy(id="description")
  private WebElement writeDescription;
  
  @FindBy(xpath="//button[@class='btn btn-lg btn-info']")
  private WebElement clickToCreateTicket;
  
  @FindBy(xpath=".//*[@id='ticketcreate']/p[1]")
  private WebElement sucessMsg;
  
  @FindBy(xpath=".//*[@id='ticketcreate']/p[2]")
  private WebElement errorMsg;
  
  public void selectValue(WebElement element, String value)
  {
	  Select select= new Select(element);
	  select.selectByVisibleText(value);
  }
  
  public void raiseTicket() throws InterruptedException
  {
	  Thread.sleep(5000);
	  selectValue(selectCategory, "CUSTOMER COMPLAINT");
	  selectValue(selectSubCategory, "BILLING");
	  selectValue(selectSubCategory2, "BILL NOT RECEIVED");
	  selectValue(selectContactMethod, "Email");
	  writeDescription.sendKeys("Signal Issues");
	  clickToCreateTicket.click();
	  Thread.sleep(2000);
	  
	  try {
		if(sucessMsg.isDisplayed())
		  {
			  waitTillElementIsVisible(sucessMsg);
			  String pass = sucessMsg.getText();
			  System.out.println(pass);
		  }
		  else if(errorMsg.isDisplayed())
		  {
			  waitTillElementIsVisible(sucessMsg);
			  String fail = errorMsg.getText();
			  System.out.println(fail);
		  }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
