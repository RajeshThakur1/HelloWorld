package com.mobiotics.hits.device_RetrackDeactive;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class RetrackDeActiveDevicePage extends BasePage
{
  public RetrackDeActiveDevicePage() 
  {
	PageFactory.initElements(driver, this);
   }
  
  
  @FindBy(id="serialno")
  private WebElement enterCustSerialNum;
  
  @FindBy(id = "retrack_error")
  private WebElement errorMsg;
  
  @FindBy(id="retrack_success")
  private WebElement successMsg;
  
  @FindBy(id="submit")
  private WebElement sendButton;
  
  @FindBy(id="customerName")
  private WebElement customerName;
  
//  @FindBy()
//  private WebElement ;
  
//  @FindBy(xpath="//button[@class='btn btn-lg btn-info']")
//  private WebElement clickOnSendButton;
  
//  @FindBy(xpath="//form[@id='retrack']/p[1]")
//  private WebElement successMsg;
//  
//  @FindBy(xpath="//form[@id='retrack']/p[2]")
//  private WebElement errorMsg;
  
	String Datapath = "C:\\Users\\sande\\Desktop\\Copy of Hits_Data_sheet.xlsx";
	int rowCount = Excel.getRowCount(Datapath, "Sheet1");
  
  public void retrackDeactivateService() throws InterruptedException
  {
	  for (int i = 1; i <= rowCount; i++) {
			waitTillElementIsVisible(enterCustSerialNum);
			enterCustSerialNum.clear();
			String data = Excel.getCellValue(Datapath, "Sheet1", i, 0);

			String custId = data;
			Thread.sleep(3000);
			if (custId.contains(".")) {
				System.out.println("contains decimal points->true");
				String s = data;
				long convert = Double.valueOf(s).longValue();
				String num = Long.toString(convert);
				System.out.println(num);
				Thread.sleep(3000);
				enterCustSerialNum.sendKeys(num);
			} else {
				Thread.sleep(3000);
				System.out.println("False");
				enterCustSerialNum.sendKeys(data);
			}
			enterCustSerialNum.sendKeys(Keys.TAB);
			waitTillElementIsVisible(sendButton);
			sendButton.click();
			Thread.sleep(25000);
			if (customerName.isDisplayed()) {
				System.out.println("Customer Name is " + customerName.getText());
				if (successMsg.isDisplayed()) {
					Thread.sleep(10000);
					waitTillElementIsVisible(successMsg);
					String passMsg = successMsg.getText();
					System.out.println(passMsg);
					Thread.sleep(4000);
				} else {
					Thread.sleep(10000);
					waitTillElementIsVisible(errorMsg);
					String failMsg = errorMsg.getText();
					System.out.println(failMsg);
					Thread.sleep(4000);
				}
				break;
			} else {
				System.out.println("Invalid Customer");
				continue;
			}
		}
		Thread.sleep(4000);
   }
}  
