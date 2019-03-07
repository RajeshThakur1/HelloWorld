package com.mobiotics.HitsAdmin.BulkHardware;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkHardware_HardwareReplacementPage extends BasePage
{
	public AdminBulkHardware_HardwareReplacementPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="hardwareselect")
	  private WebElement fileUpload;
	  
	  @FindBy(id="hardwareupload")
	  private WebElement uploadButton;
	  
	  @FindBy(id="hardware-upload-status")
	  private WebElement statusMsg;
	  
	  @FindBy(id="replacementbutton")
	  private WebElement hardwareReplaceButton;
	  
	  private String bulkfile = "C:\\Users\\sande\\Desktop\\AutoITforHITS\\Adminbulkhardwarereplacement.exe";

	  public void bulkHardware_HardwareReplacementTest() throws IOException, InterruptedException
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
		  waitTillElementIsVisible(hardwareReplaceButton);
		  hardwareReplaceButton.click();
		  Thread.sleep(5000);
		  waitTillElementIsVisible(statusMsg);
		  System.out.println(statusMsg.getText());
		  Thread.sleep(7000);
	  }  
}
