package com.mobiotics.hits.device_ListDevice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

import generics.DateHelper;
import generics.Excel;

public class ListDevicePage extends BasePage {
	public ListDevicePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement deviceDownLoad;

	@FindBy(id = "refresh")
	private WebElement clickOnDate;

	@FindBy(xpath = "//form[@id='customeridsearch']//input")
	private WebElement searchByCustomerID;

	@FindBy(id = "customerid_btn")
	private WebElement clickOnCustomerID;

	@FindBy(name = "customerid")
	private WebElement searchByCustID;

	@FindBy(xpath = "//td[.='No Data Found']")
	private WebElement noData;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody//td[5]")
	private WebElement elePresent;

	public void listDevice() throws InterruptedException {
		String Datapath = "C:\\Users\\sande\\Desktop\\Copy of Hits_Data_sheet.xlsx";
		int rowCount = Excel.getRowCount(Datapath, "Sheet1");
		DateHelper datePicker = new DateHelper();

		datePicker.selectMonth("April");
		datePicker.selectDate("1");
		clickOnDate.click();

		for (int i = 1; i <= rowCount; i++) {
			waitTillElementIsVisible(searchByCustID);
			searchByCustID.clear();
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
				searchByCustID.sendKeys(num);
			} else {
				Thread.sleep(3000);
				System.out.println("False");
				searchByCustID.sendKeys(data);
			}
			waitTillElementIsVisible(clickOnCustomerID);
			clickOnCustomerID.click();
			Thread.sleep(3000);
			if (elePresent.isDisplayed()) {
				System.out.println(elePresent.getText());
				waitTillElementIsVisible(deviceDownLoad);
				deviceDownLoad.click();
				break;
			} else {
				waitTillElementIsVisible(noData);
				System.out.println(noData.getText());
				Thread.sleep(4000);
				continue;
			}
		}
	}
}