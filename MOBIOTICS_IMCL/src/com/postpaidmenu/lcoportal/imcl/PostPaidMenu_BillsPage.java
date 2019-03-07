package com.postpaidmenu.lcoportal.imcl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;

import generics.DateHelper;

public class PostPaidMenu_BillsPage extends BasePage
{
   public PostPaidMenu_BillsPage() {
	   PageFactory.initElements(driver, this);
}
   
   
   @FindBy(linkText="Bills")
   private WebElement postPaidBills;
   
   @FindBy(xpath="//input[@name='custid']")
   private WebElement enterCanForPostPaidBillpayment;
   
   @FindBy(xpath="//form[@id='searchCustomerid']//button[@class='btn btn-default']")
   private WebElement clickOnGoButtonToCheckWithCan;
   
   @FindBy(xpath="//form[@id='searchInvoice']//input")
   private WebElement searchByInvoiceID;
   
   @FindBy(xpath="//form[@id='searchInvoice']//button")
   private WebElement clickOnGoButtonToSearchByInvoiceID;
   
   @FindBy(xpath="//form[@id='searchPlan']//input")
   private WebElement searchByPlanName;
   
   @FindBy(xpath="//form[@id='searchPlan']//button")
   private WebElement clickOnGOButtonToSearchByPlanName;
   
   @FindBy(xpath="//table[@class='table table-striped']//tbody//td[10]")
   private WebElement clickToPay;
   
   @FindBy(xpath="//button[@id='confirm-payment']")
   private WebElement clickOnconfirmButtonToPay;
   
   @FindBy(xpath="//button[@class='btn btn-danger pull-right']")
   private WebElement clickOnBillDownLoadButton;
   
   @FindBy(xpath="//span[@class='input-group-addon']")
   private WebElement clickToChooseTheDate;
   
   @FindBy(xpath="//button[@id='refresh']")
   private WebElement clickOnGoButtonToSearchDateWise;
   
   @FindBy(xpath="//h4[@id='myModalLabel' and contains(text(), 'Confirm')]")
   private WebElement confirmPaymentPage;
   
   @FindBy(xpath="//button[@id='payment-confirm']")
   private WebElement clickOnPayButton;
   
   @FindBy(xpath="//tbody[@id='bulk-progress']//tr//td[3]")
   private WebElement statusConifmation;
   
   @FindBy(xpath="//tbody[@id='bulk-progress']//tr//td[4]")
   private WebElement reasonForTheStatus;
    
   
   
   @FindBy(xpath="//button[@id='confirm-payment']")
   private WebElement payButton;
   
   @FindBy(xpath="//h4[contains(text(), 'Total Amount')]")
   private WebElement totalAmount;
 
   @FindBy(xpath="//label[@id='amount']")
   private WebElement price;
   
   @FindBy(xpath="//h4[contains(text(), 'Total Bill')]")
   private WebElement totalBills;
   
   @FindBy(xpath="//label[@id='totalrow']")
   private WebElement counts;
   
   @FindBy(xpath="//div[@class='form-group status-text']//label[1]")
   private WebElement sucessMsg;
   
   @FindBy(xpath="//div[@class='form-group status-text']//label[2]")
   private WebElement count;
   
   @FindBy(xpath="//div[@class='form-group status-text']//label[3]")
   private WebElement status;
   
   @FindBy(xpath="//div[@class='form-group status-text']//label[4]")
   private WebElement count1;
   
   @FindBy(xpath="//div[@class='form-group status-text']//label[5]")
   private WebElement amountDeducted;
   
   @FindBy(xpath="//div[@class='form-group status-text']//label[6]")
   private WebElement price1;
   
   @FindBy(xpath="//tbody[@id='bulk-progress']//td[3]")
   private WebElement status2;
   
   @FindBy(xpath="//tbody[@id='bulk-progress']//td[4]")
   private WebElement reason;
   
   @FindBy(xpath="//button[@id='payment-confirm']")
   private WebElement pay2;
   
   @FindBy(xpath="//button[@id='close-confirm']")
   private WebElement closeButton1;
   
   public void PayPostPaidBillsPage() throws InterruptedException
   {
	   waitTillElementIsVisible(searchByPlanName);
	   searchByPlanName.sendKeys("PreBase CRYSTAL Pack*");
	   waitTillElementIsVisible(clickOnGOButtonToSearchByPlanName);
	   clickOnGoButtonToSearchByInvoiceID.click();
	   Thread.sleep(2000);
	   DateHelper datepicker = new DateHelper();
		  
		  
		  
		  if(clickOnBillDownLoadButton.isEnabled())
		  {
			  datepicker.selectMonth("May");
			  datepicker.selectDate("1");
			  driver.findElement(By.xpath("//button[@id='refresh']")).click();
			  clickOnBillDownLoadButton.click();  
		  		  
		  List<WebElement> list =driver.findElements(By.xpath("//div[@class='postpaidbills table-responsive']//tbody//tr//td//input"));
		  for(WebElement ele : list)
		  {
			  ele.click();
			  if(payButton.isEnabled())
			  {
				  payButton.click();
				  waitTillElementIsVisible(pay2);
				  if(pay2.isEnabled())
				  {
					  pay2.click();
					  
					  waitTillElementIsVisible(totalAmount);
					  String string1 = totalAmount.getText();
					  String string2 = price.getText();
					  String string3 = totalBills.getText();
					  String string4 = counts.getText();
					  
					  String string5 = status2.getText();
					  String string6 = reason.getText();
					  System.out.println(string1 + string2+","+ string3 + string4 + " Status is "+ string5 + " and the reason is " +string6);
					  Thread.sleep(2000);
					  closeButton1.click();
					  }
				  }
			  break;}
		  }
	 
			  else
			  {
				  String stringn=driver.findElement(By.xpath("//div[@class='postpaidbills table-responsive']//tbody//tr//td")).getText();
				  System.out.println(stringn);
			  }
		  }
		  

}
