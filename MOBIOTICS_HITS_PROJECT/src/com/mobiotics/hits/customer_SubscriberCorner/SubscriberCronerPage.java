package com.mobiotics.hits.customer_SubscriberCorner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class SubscriberCronerPage extends BasePage {

	public SubscriberCronerPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "Customer Id")
	private WebElement enterCustID;

	@FindBy(id = "customerIdBtn")
	private WebElement clickButton;

	@FindBy(xpath = "//div[@class='errorPart']/center")
	private WebElement invalidErrorMsg;

	@FindBy(id = "deviceid")
	private WebElement deviceID;

	@FindBy(id = "serialno")
	private WebElement serialNum;

	@FindBy(id = "macaddress")
	private WebElement SMCNum;

	@FindBy(xpath = "//div[@id='paymentsactivelist_filter']//input")
	private WebElement paymentSerach;

	@FindBy(xpath = "//div[@class='panel-heading' and contains(text(),'Customer Details')]")
	private WebElement customerDetails;

	@FindBy(xpath = "//div[@class='panel-heading' and contains(text(),'CPE')]")
	private WebElement CPEdetails;
	//
	@FindBy(xpath = "//div[@class='alert alert-danger top-error text-center']")
	private WebElement invalidCust;
	//
	// @FindBy()
	// private WebElement ;

	public void selectValue(WebElement element, String value) {
		Select selectValue = new Select(element);
		selectValue.selectByVisibleText(value);
	}

	public void subscribercorner() throws InterruptedException {
		String Datapath = "C://users//sande//Documents//Hits_Data_sheet.xlsx";
		int rowCount = Excel.getRowCount(Datapath, "Sheet2");
		for (int i = 1; i <= rowCount; i++) {
			String data = Excel.getCellValue(Datapath, "Sheet2", i, 1);
			waitTillElementIsVisible(enterCustID);
			enterCustID.sendKeys(data);		
			waitTillElementIsVisible(clickButton);
			clickButton.click();
			String invalid = invalidCust.getText();

			Thread.sleep(10000);
			if (invalid.contentEquals("Invalid customer details")) {
				log.info("if part");
				System.out.println(invalidCust.getText());
				waitTillElementIsVisible(enterCustID);
				enterCustID.clear();
				continue;

			} else {

				log.info("Inside else");
				waitTillElementIsVisible(CPEdetails);
				Assert.assertEquals(CPEdetails.getText(), "CPE");
				System.out.println(CPEdetails.getText());
				
				waitTillElementIsVisible(deviceID);
				String deviceDetails = deviceID.getText();
				
				waitTillElementIsVisible(serialNum);
				String serialnumber = serialNum.getText();
				
				waitTillElementIsVisible(SMCNum);
				String smcnum = SMCNum.getText();
				
				System.out.println(" DeviceID = "+deviceDetails+"\n SerialNumber = "+
				serialnumber+"\n SMCNumber = "+smcnum);
			}
			break;
		}
	}
}
