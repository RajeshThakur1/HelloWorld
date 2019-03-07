package com.mobiotics.hits.tickets_ListTicket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mobiotics.hits.commompages.BasePage;

public class ListTicketPage extends BasePage
{
  public ListTicketPage()
  {
	  PageFactory.initElements(driver, this);
  }
  
   @FindBy(name="ticketid")
   private WebElement enterTickeId;

   @FindBy(id="ticketid_btn")
   private WebElement clickToSearch;
   
   @FindBy(xpath="//button[@class='btn btn-danger closeticketbutton']")
   private WebElement closeTicket;
   
   @FindBy(xpath=".//*[@id='myModalLabel']")
   private WebElement closeTicketPopUp;
   
   @FindBy(xpath="//button[@class='btn btn-danger colseconfirm']")
   private WebElement clickYesButton;
   
   @FindBy(xpath="//button[@id='close']")
   private WebElement clickCloseButton;
   
   @FindBy(xpath="//div[@class='modal-body']/p[1]")
   private WebElement errorText;
   
   @FindBy(xpath="//div[@class='modal-body']/p[2]")
   private WebElement sucessText;
   
   
   public void listTicketPage() throws InterruptedException
   {
	   Thread.sleep(10000);
	   waitTillElementIsVisible(enterTickeId);
	   enterTickeId.sendKeys("1344394");
	   waitTillElementIsVisible(clickToSearch);
	   clickToSearch.click();
	   
	   Thread.sleep(10000);
	   
	   if(closeTicket.isEnabled() && closeTicket.isDisplayed())
	   {
		   Thread.sleep(10000);
		   waitTillElementIsVisible(closeTicket);
		   closeTicket.click();
		   Thread.sleep(10000);
		   waitTillElementIsVisible(closeTicketPopUp);
		   String string = closeTicketPopUp.getText();
		   //Assert.assertEquals(string, "Close Ticket");		   
		   Assert.assertEquals(string, "Close Ticket", "No PopUp shown");
		   Thread.sleep(10000);
		   waitTillElementIsVisible(clickYesButton);	
		   clickYesButton.click();
		   Thread.sleep(5000);
		   
		   if(sucessText.isDisplayed())
		   {
			   Thread.sleep(10000);
			   waitTillElementIsVisible(sucessText);
			   String pass=sucessText.getText();
			   System.out.println(pass);
		   }
		   else
		   {
			   
			   waitTillElementIsVisible(errorText);
			   Thread.sleep(10000);
			   String fail=errorText.getText();
			   System.out.println(fail);
		   }
		   
		   clickCloseButton.click();
	   }
   }
   
}