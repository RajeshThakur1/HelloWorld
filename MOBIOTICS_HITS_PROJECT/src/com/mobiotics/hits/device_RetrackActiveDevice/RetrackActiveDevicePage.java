package com.mobiotics.hits.device_RetrackActiveDevice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class RetrackActiveDevicePage extends BasePage {
	public RetrackActiveDevicePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "serialno")
	private WebElement enterCustSerialNum;

	@FindBy(id = "submit_btn")
	private WebElement clickOnSendButton;

	@FindBy(id = "retrack_error")
	private WebElement invalidData;

	@FindBy(id = "retrack_error")
	private WebElement errorMsg;

	@FindBy(id = "customerName")
	private WebElement customerName;

	@FindBy(id = "retrack_success")
	private WebElement successMsg;

	String Datapath = "C:\\Users\\sande\\Desktop\\Copy of Hits_Data_sheet.xlsx";
	int rowCount = Excel.getRowCount(Datapath, "Sheet1");

	public void retarckActiveService() throws InterruptedException {

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
			waitTillElementIsVisible(clickOnSendButton);
			clickOnSendButton.click();
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
