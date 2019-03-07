package com.mobiotics.hits.customer_CoustomerModification;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class CustomerModificationPage extends BasePage
{
   public CustomerModificationPage() 
   {
	  PageFactory.initElements(driver, this);
    }
   
   @FindBy(xpath="//div[@class='input-group pull-left']//input")
   private WebElement enterCustIdOrSerialNum;
   
   @FindBy(xpath="//div[@class='input-group pull-left']//button")
   private WebElement clickOnTOProceed;
   
   @FindBy(id="titleid")
   private WebElement selectTitle;
   
   @FindBy(xpath="//input[@name='firstname']")
   private WebElement customerName;
   
   @FindBy(xpath="//input[@name='surname']")
   private WebElement customerSurName;
   
   @FindBy(xpath="//input[@name='email']")
   private WebElement customerEmailId;
   
   @FindBy(xpath="//input[@name='mobileno']")
   private WebElement customerMobieNumber;
   
   @FindBy(xpath="//input[@name='address1']")
   private WebElement customerAddress1;
   
   @FindBy(xpath="//input[@name='address2']")
   private WebElement customerAddress2;
   
   @FindBy(xpath="//input[@type='submit']")
   private WebElement clickToSubmitTheForm;
   
   @FindBy(xpath="/html/body/div[1]")
   private WebElement alertMsg;
   
   @FindBy(xpath="//div[@class='alert alert-danger top-error text-center' and contains(text(),'Invalid Customer Id/Serial no')]")
   private WebElement invalidData;
   
   @FindBy(xpath="//div[@class='alert alert-danger top-error text-center' and contains(text(),'No KYC Document Found')]")
   private WebElement kycNotify;
   
	public void modifiyCustomer() throws InterruptedException {
		String Datapath = "C://users//sande//Documents//Hits_Data_sheet.xlsx";
		int rowcount = Excel.getRowCount(Datapath, "Sheet2");
		enterCustIdOrSerialNum.clear();

		for (int i = 1; i <= rowcount; i++) {
			String custSerial = Excel.getCellValue(Datapath, "Sheet2", i, 1);

			enterCustIdOrSerialNum.sendKeys(custSerial);

			waitTillElementIsVisible(clickOnTOProceed);
			clickOnTOProceed.click();
			String message = invalidData.getText();
			Thread.sleep(10000);
			log.info("before if");
			
			if (message.contentEquals("Invalid Customer Id/Serial no")) {

				log.info("inside 1st if");
				waitTillElementIsVisible(enterCustIdOrSerialNum);
				enterCustIdOrSerialNum.sendKeys(Keys.SHIFT);
				enterCustIdOrSerialNum.sendKeys(Keys.ALT);
				enterCustIdOrSerialNum.clear();
				continue;
			}
			else {
				waitTillElementIsVisible(kycNotify);;
				updateFunc();
			}

			break;
		}
	}
   
   public void updateFunc() throws InterruptedException
   {
	   waitTillElementIsVisible(selectTitle);
	   
	   Select select = new Select(selectTitle);
	   select.selectByVisibleText("Mr.");
	   
	   customerName.clear();
	   customerName.sendKeys("Sunil");
	   
	   customerSurName.clear();
	   customerSurName.sendKeys("Kumar");
	   
	   customerEmailId.clear();
	   customerEmailId.sendKeys("sunil.kumar@gmail.com");
	   
	   customerMobieNumber.clear();
	   customerMobieNumber.sendKeys("9535985981");
	   
	   customerAddress1.clear();
	   customerAddress1.sendKeys("Hsr lyt");
	   
	   customerAddress2.clear();
	   customerAddress2.sendKeys("Sector 2");
	   
	   clickToSubmitTheForm.click();
	   Thread.sleep(2000);
	   
	   waitTillElementIsVisible(alertMsg);
	   String msg = alertMsg.getText();
	   System.out.println(msg);
	   }
   
}
