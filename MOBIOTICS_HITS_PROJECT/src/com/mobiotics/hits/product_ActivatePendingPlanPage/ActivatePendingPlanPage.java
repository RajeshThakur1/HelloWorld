package com.mobiotics.hits.product_ActivatePendingPlanPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class ActivatePendingPlanPage extends BasePage
{
   public ActivatePendingPlanPage() 
   {
	  PageFactory.initElements(driver, this);
   }
   
//   @FindBy(xpath="//input[@name='customerid']")
//   private WebElement enterCustomerSerialNumber;
//   
//   @FindBy(xpath="//button [@id='customerid']")
//   private WebElement clickToSearchCustomer;
//   
   @FindBy(xpath="//div[@class='productsubscription table-responsive']//tbody//td[8]")
   private WebElement checkBox;
   
   @FindBy(xpath="//button[@id='confirm-subscribe']")
   private WebElement clickToConfirmSelect;
   
   @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//tr[1]//td[1]")
   private WebElement packageName;
   
   @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//tr[1]//td[2]")
   private WebElement price;
   
   @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//tr[1]//td[3]")
   private WebElement contractId;
   
   @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//tr[1]//td[4]")
   private WebElement expiryDate;
   
   @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//tr[2]//td[1]")
   private WebElement totalAmount;
   
   @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//tr[1]//td[2]")
   private WebElement amount;
   
   @FindBy(xpath="//button[@id='confirmcart']")
   private WebElement clickToDisconnectThePlan;
   
   @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//td[1]")
   private WebElement ProductId;
   
   @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//td[2]")
   private WebElement productName;
   
   @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//td[3]")
   private WebElement statusOfPlan;
   
   @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//td[4]")
   private WebElement error;
   
   @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//td[5]")
   private WebElement errorCode;
   
   @FindBy(xpath="//input[@name='customerid']")
   private WebElement enterCustomerSerialNum;
   
   @FindBy(xpath="//button [@id='customerid']")
   private WebElement clickToSearchCustomer;
   
   @FindBy(id="click-confirm")
   private WebElement errorButton;
   
   @FindBy(xpath="//div[@id='mypopmessage']//p")
   private WebElement errorMsg;
   
   private String Datapath = "C://users//sande//Documents//Hits_Data_sheet.xlsx";
   private int rowCount = Excel.getRowCount(Datapath, "Sheet2");
   
   public void activatePendingPlans() throws Exception
   {
	   
	   for(int i = 1; i<=rowCount; i++)
		  {
			  waitTillElementIsVisible(enterCustomerSerialNum);
			  String data=Excel.getCellValue(Datapath, "Sheet2", i, 1);
		  enterCustomerSerialNum.sendKeys(data);
		  waitTillElementIsVisible(clickToSearchCustomer);
		  clickToSearchCustomer.click();
		  
		  Thread.sleep(15000);
	  
			  
		  if(errorButton.isDisplayed())
		  {
			  waitTillElementIsVisible(errorMsg);
			  System.out.println(errorMsg.getText());
			  errorButton.click();
			  enterCustomerSerialNum.clear();
			  Thread.sleep(2000);
			  continue;
		  }
		  
		  else{
			  WebElement name = driver.findElement(By.id("customerName"));
			  waitTillElementIsVisible(name);
			  
		   if(clickToConfirmSelect.isEnabled())
		   {
		     clickToConfirmSelect.click();
				  
			  Thread.sleep(3000);
		 		  
			System.out.println("Selected Package Summary's ProductName is " + packageName.getText() + 
						  " Contract Id is "+contractId.getText()+ " and Expiry Date is On " +expiryDate.getText());
			Thread.sleep(2000);
			clickToDisconnectThePlan.click();
				  
			Thread.sleep(2000);
			waitTillElementIsVisible(ProductId);
				  
			System.out.println("Product Id is "+ProductId.getText()+ " ProductName is "+ productName.getText() + 
				  " Status Of The Plan is "+statusOfPlan.getText()+ " ErrorMsg is "+error.getText()+
			    	  " ErrorCode is "+errorCode.getText());
			  }
	else
			  {
				List<WebElement> list = driver.findElements(By.xpath("//div[@class='alert alert-danger top-error text-center fixed-top']"));
				  
				  for(WebElement element:list)
				  {
					  System.out.println(element.getText());
					  break;
				  }
			  }
   }
}
}}