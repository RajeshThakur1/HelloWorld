package com.mobiotics.HitsAdmin.BulkHardware;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkHardware_ReconnectPage extends BasePage
{
	public AdminBulkHardware_ReconnectPage() 
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
	  private WebElement reconnectButton;
	  
	  private String bulkfile = "C:\\Users\\sande\\Desktop\\AutoITforHITS\\Adminbulkreconnect.exe";

	  public void bulkHardware_ReconnectTest() throws IOException, InterruptedException
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
		  waitTillElementIsVisible(reconnectButton);
		  reconnectButton.click();
		  Thread.sleep(5000);
		  waitTillElementIsVisible(statusMsg);
		  System.out.println(statusMsg.getText());
		  Thread.sleep(7000);
	  }  
}
