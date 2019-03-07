package com.mobiotics.HitsAdmin.BulkActivation;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkActivation_CreateCustomerPage extends BasePage 
{
	public AdminBulkActivation_CreateCustomerPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="createcustselect")
	private WebElement fileUpload;
	
	@FindBy(id="createcustupload")
	private WebElement uploadButton;
	
	@FindBy(id="create-cust-upload-status")
	private WebElement statusMsg;
	
	@FindBy(id="createcustbutton")
	private WebElement createButton;
	

   private String bulkfile = "C:\\Users\\sande\\Desktop\\AutoITforHITS\\Adminbulkcreatecustomer.exe";

   public void bulkProductSubscription_CreateCustomerTest() throws IOException, InterruptedException
   {
	fileUpload.click();
	  Thread.sleep(5000);
	  Runtime.getRuntime().exec(bulkfile);
	  Thread.sleep(5000);
	  waitTillElementIsVisible(uploadButton);
	  uploadButton.click();
	  Thread.sleep(5000);
	  waitTillElementIsVisible(statusMsg);
	  System.out.println(statusMsg.getText());
	  Thread.sleep(5000);
	  waitTillElementIsVisible(createButton);
	  createButton.click();
	  Thread.sleep(5000);
	  waitTillElementIsVisible(statusMsg);
	  System.out.println(statusMsg.getText());
	  Thread.sleep(7000);
   }
}
