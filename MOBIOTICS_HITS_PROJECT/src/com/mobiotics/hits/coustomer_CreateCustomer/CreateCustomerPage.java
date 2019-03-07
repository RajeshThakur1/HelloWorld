package com.mobiotics.hits.coustomer_CreateCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class CreateCustomerPage extends BasePage
{
   public CreateCustomerPage() 
   {
	  PageFactory.initElements(driver, this);
   }
   
   
   @FindBy(xpath="//input[@name='serialno']")
   private WebElement enterDeviceSerialNumber;
   
   @FindBy(xpath="//input[@name='postalcode']")
   private WebElement enterPostalCode;
   
   @FindBy(id="customertypeid")
   private WebElement selectCustomerType;
   
   @FindBy(id="hardwarelist")
   private WebElement selectHardWareList;
   
   @FindBy(id="basepacklist")
   private WebElement selectBasePackList;
   
   @FindBy(id="smallcity")
   private WebElement enterCityName;
   
   @FindBy(xpath="//input[@name='address1']")
   private WebElement enterAddress1;
   
   @FindBy(xpath="//input[@name='address2']")
   private WebElement enterAddress2;
   
   @FindBy(id="titleid")
   private WebElement selectTitleId;
   
   @FindBy(xpath="//input[@name='firstname']")
   private WebElement enterFirstName;
   
   @FindBy(xpath="//input[@name='surname']")
   private WebElement enterLastName;
   
   @FindBy(xpath="//input[@name='mobileno']")
   private WebElement enterMobileNumber;
   
   @FindBy(id="create")
   private WebElement clickOnCreate;
   
   @FindBy(id="postalcodeno-status")
   private WebElement postalCodeStatusMsg;
   
   @FindBy(xpath="//label[@id='deviceserialno-status']")
   private WebElement warringMsg;
   
   
   
   public void selectValue(WebElement element, String value)
   {
	   Select selectValue =  new Select(element);
	   selectValue.selectByVisibleText(value);
   }
   
   
   
   public void fillCustomerCreationForm() throws InterruptedException
   {
	 String Datapath = "C://users//sande//Documents//Hits_Data_sheet.xlsx";
	 waitTillElementIsVisible(enterDeviceSerialNumber);
	 int rowCount = Excel.getRowCount( Datapath,  "Sheet2");
	 System.out.println(rowCount);
	 log.info("Entered into excel");	   
	   
	  for( int i =1; i<=rowCount; i++)
	   {
		 String serialNum = Excel.getCellValue(Datapath, "Sheet2", i, 1);
		 log.info("1st for loop");
		 enterDeviceSerialNumber.sendKeys(serialNum);
		 enterDeviceSerialNumber.sendKeys(Keys.TAB);
		 waitTillElementIsVisible(warringMsg);
		 String errorText = warringMsg.getText();
		 log.info("ending 1st for loop");
		 waitTillElementIsVisible(warringMsg);
		 
	      if((errorText.contentEquals("Invalid Serial Number")) || (errorText.contentEquals("Already Subscribed Device Serial Number")))
	       {
	    	 log.info("Invalid serial number or Already in use");
	    	 selectCustomerType.sendKeys(Keys.SHIFT);
	    	 selectCustomerType.sendKeys(Keys.TAB);
	    	 enterDeviceSerialNumber.clear();
	    	 continue;
	       }
	      else
		   { 
			 log.info("Serial Num is Available");
			 waitTillElementIsVisible(enterPostalCode);
			 enterPostalCode.clear();
			 
			 for(int k=1; k<= rowCount; k++)
			 {
			   String postalCode = Excel.getCellValue(Datapath, "Sheet2", k, 2);
			   String s = postalCode;
			   int convert = Double.valueOf(s).intValue();
			   String num = Integer.toString(convert);
			   System.out.println(num);
			   enterPostalCode.sendKeys(num);
			   enterPostalCode.sendKeys(Keys.TAB);
			   waitTillElementIsVisible(postalCodeStatusMsg);
			   String postalStatus = postalCodeStatusMsg.getText();
			   
			   if(postalStatus.contentEquals("Please Enter Valid Pincode"))
			    {
			      log.info("Invalid serial Postal Code");
			      enterPostalCode.sendKeys(Keys.SHIFT);
			      enterPostalCode.sendKeys(Keys.ALT);
			      enterPostalCode.clear();
			      continue;
			    }
			    else{
			      log.info("Postal code is available");
			      waitTillElementIsVisible(selectCustomerType);	      
			      selectValue(selectCustomerType, "Normal");
			      
			      waitTillElementIsVisible(selectHardWareList);	      
			      selectValue(selectHardWareList, "Standard STB");
			      
			      waitTillElementIsVisible(selectBasePackList);	      
			      selectValue(selectBasePackList, "NXTPAC 03 - Rs. 0");
			      
			      waitTillElementIsVisible(enterCityName);
			      selectValue(enterCityName, "Mumbai");
			      
			      waitTillElementIsVisible(enterAddress1);
			      enterAddress1.sendKeys("no 9 srinivas");
			      
			      waitTillElementIsVisible(enterAddress2);
			      enterAddress2.sendKeys("Hoysala Nagar");
			      
			      selectValue(selectTitleId, "Mr.");
			      
			      waitTillElementIsVisible(enterFirstName);
			      enterFirstName.sendKeys("Santhosh");
			      
			      waitTillElementIsVisible(enterLastName);
			      enterLastName.sendKeys("Shiva");
			      
			      waitTillElementIsVisible(enterMobileNumber);
			      enterMobileNumber.sendKeys("9535985981");
			      
			      waitTillElementIsVisible(clickOnCreate);
			      clickOnCreate.click();
			      
			      Thread.sleep(3000);
			      String stringn = driver.findElement(By.xpath("html/body/div[5]")).getText();
			      System.out.println(stringn);
			      Thread.sleep(5000);
			      break;
			    }
			 }
		  }
	      break;
	   } 
    }
}


