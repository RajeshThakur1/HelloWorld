package com.mobiotics.HitsAdmin.BulkHardware;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkHardware_SendOSDPage extends BasePage
{
	public AdminBulkHardware_SendOSDPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="msoosdselect")
	  private WebElement fileUpload;
	  
	  @FindBy(id="msoosdupload")
	  private WebElement uploadButton;
	  
	  @FindBy(id="msoosd-upload-status")
	  private WebElement statusMsg;
	  
	  @FindBy(id="initiateMsoOsdButton")
	  private WebElement sendOSDButton;
	  
	  private String bulkfile = "C:\\Users\\sande\\Desktop\\AutoITforHITS\\AdminbulkSendOSD.exe";

	  public void bulkHardware_SendOSDTest() throws IOException, InterruptedException
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
		  waitTillElementIsVisible(sendOSDButton);
		  sendOSDButton.click();
		  Thread.sleep(5000);
		  waitTillElementIsVisible(statusMsg);
		  System.out.println(statusMsg.getText());
		  Thread.sleep(7000);
	  }  
}
