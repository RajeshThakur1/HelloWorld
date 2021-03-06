package com.mobiotics.HitsAdmin.BulkActivation;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkActivation_BasePackPage extends BasePage
{
	public AdminBulkActivation_BasePackPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	  @FindBy(id="productsubscriptionselect")
	  private WebElement fileUpload;
	  
	  @FindBy(id="productsubscriptionupload")
	  private WebElement uploadButton;
	  
	  @FindBy(id="productsubscription-upload-status")
	  private WebElement statusMsg;
	  
	  @FindBy(id="initiateSubscriptionButton")
	  private WebElement initiateButton;
	  
	  private String bulkfile = "C:\\Users\\sande\\Desktop\\AutoITforHITS\\AdminWrongPAge.exe";

	  public void bulkProductSubscription_AddBasePackTest() throws IOException, InterruptedException
	  {
		  fileUpload.click();
		  Thread.sleep(5000);
		  Runtime.getRuntime().exec(bulkfile);
		  Thread.sleep(5000);
		  
		  if(statusMsg.isDisplayed())
		  {
			  Thread.sleep(5000);
			  System.out.println(statusMsg.getText());
			  
		  }else{
		  waitTillElementIsVisible(uploadButton);
		  uploadButton.click();
		  Thread.sleep(5000);	
		  
			  //Thread.sleep(5000);
		  waitTillElementIsVisible(statusMsg);
		  System.out.println(statusMsg.getText());
		  Thread.sleep(5000);
		  waitTillElementIsVisible(initiateButton);
		  initiateButton.click();
		  Thread.sleep(5000);
		  }
		  Thread.sleep(7000);
	  }  
}
