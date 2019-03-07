package com.mobiotics.hits.device_OSD;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class OSDMessageServicePage extends BasePage {
	public OSDMessageServicePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "serialno")
	private WebElement enterCustSerialNum;

	@FindBy(id = "messagetemplate")
	private WebElement selectMessage;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-info']")
	private WebElement clickOnSendButton;

	@FindBy(xpath = "//form[@id='osd']/p[1]")
	private WebElement successMsg;

	@FindBy(id = "customerName")
	private WebElement customerName;

	@FindBy(xpath = "//form[@id='osd']/p[2]")
	private WebElement errorMsg;

	String Datapath = "C:\\Users\\sande\\Desktop\\Copy of Hits_Data_sheet.xlsx";
	int rowCount = Excel.getRowCount(Datapath, "Sheet1");

	public void osdMsgService() throws InterruptedException, AWTException {
		for (int i = 1; i <= rowCount; i++) {
			enterCustSerialNum.clear();
			waitTillElementIsVisible(enterCustSerialNum);
			String data = Excel.getCellValue(Datapath, "Sheet1", i, 0);

			String custId = data;

			if (custId.contains(".")) {
				System.out.println("contains decimal points->true");
				String s = data;
				long convert = Double.valueOf(s).longValue();
				String num = Long.toString(convert);
				System.out.println(num);
				enterCustSerialNum.sendKeys(num);
			} else {
				System.out.println("False");
				enterCustSerialNum.sendKeys(data);
			}

			enterCustSerialNum.sendKeys(Keys.TAB);
			waitTillElementIsVisible(customerName);
			if (customerName.isDisplayed()) {
				// waitTillElementIsVisible(customerName);
				System.out.println("Customer Name is " + customerName.getText());

				Select select = new Select(selectMessage);
				select.selectByVisibleText("1 - Welcome to NXTDigital");
				clickOnSendButton.click();
				Thread.sleep(25000);
				if (successMsg.isDisplayed()) {
					Thread.sleep(10000);
					log.info("success msg displayed");
					waitTillElementIsVisible(successMsg);
					String sucessMsg = successMsg.getText();
					System.out.println(sucessMsg);
					Thread.sleep(3000);

				} else if (errorMsg.isDisplayed()) {
					log.info("error msg displayed");
					Thread.sleep(10000);
					waitTillElementIsVisible(errorMsg);
					String failMsg = errorMsg.getText();
					System.out.println(failMsg);
					Thread.sleep(3000);

				}
				break;
			} else {
				System.out.println("Customer Name not displaying");
				Thread.sleep(5000);
				continue;
			}
		}

	}

}
