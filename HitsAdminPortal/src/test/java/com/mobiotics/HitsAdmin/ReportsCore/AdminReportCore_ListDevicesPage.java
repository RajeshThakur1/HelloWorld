package com.mobiotics.HitsAdmin.ReportsCore;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

import generics.DatePicker;

public class AdminReportCore_ListDevicesPage extends BasePage {
	public AdminReportCore_ListDevicesPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(id = "postfix")
	private WebElement tableCount;

	@FindBy(id = "totalcount")
	private WebElement totalCount;

	@FindBy(id = "download_btn")
	private WebElement downloadButton;

	@FindBy(id = "entitytype")
	private WebElement entityType;

	@FindBy(id = "customertype")
	private WebElement customerType;

	@FindBy(id = "kycstatus")
	private WebElement kycStatus;

	@FindBy(id = "customerstatus")
	private WebElement customerStatus;

	@FindBy(id = "refresh")
	private WebElement clcikOnGoButton;

	public void reportsCore_ListDevice() throws InterruptedException {

		DatePicker date = new DatePicker();
		date.selectYear("2016");
		System.out.println("Year is 2016");
		date.selectMonth("August");
		System.out.println("month is August");
		date.selectDate("1");
		System.out.println("date is 1st");

		waitTillElementIsVisible(clcikOnGoButton);
		clcikOnGoButton.click();
		Thread.sleep(5000);
		waitTillElementIsVisible(tableCount);
		Select select = new Select(tableCount);
		
		List<WebElement> list = select.getOptions();
		int size = list.size();
		System.out.println(size);
		Thread.sleep(5000);
		int total = 0;
		for (int i = 1; i < size; i++) {
			select.selectByIndex(i);
			Thread.sleep(3000);
			waitTillElementIsVisible(totalCount);
			System.out.println("Table " + i + " count = " + totalCount.getText());
			String string = totalCount.getText();
			int num = Integer.valueOf(string);
			total = num + total;
			Thread.sleep(5000);
		}
		System.out.println("Total count of Devices are " + total);
		Thread.sleep(5000);
	}
}
