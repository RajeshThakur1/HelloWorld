package com.mobiotics.HitsAdmin.ReportsCore;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

import generics.DatePicker;

public class AdminReportCore_ListCustomerPage extends BasePage {
	public AdminReportCore_ListCustomerPage() {
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

	// @FindBy()
	// private WebElement ;

	public void reportsCore_ListCustomer() throws InterruptedException {

		DatePicker date = new DatePicker();
		date.selectYear("2016");
		System.out.println("Year is 2016");
		date.selectMonth("August");
		System.out.println("month is August");
		date.selectDate("1");
		System.out.println("date is 1st");
		Thread.sleep(5000);
		waitTillElementIsVisible(clcikOnGoButton);
		clcikOnGoButton.click();
		Thread.sleep(5000);
		waitTillElementIsVisible(tableCount);
		Select select = new Select(tableCount);
		Select select1 = new Select(customerStatus);
		List<WebElement> list = select.getOptions();
		int size = list.size();
		System.out.println(size);
		
		List<WebElement> list1 = select1.getOptions();
		int size1 = list1.size();
		System.out.println(size1);
		Thread.sleep(5000);
		int total = 0;
		for (int i = 1; i < size; i++) {
			select.selectByIndex(i);
			Thread.sleep(3000);
			waitTillElementIsVisible(totalCount);
			System.out.println("Table " + i + " count = " + totalCount.getText());
			for(int a=1; a<size1; a++){
				select1.selectByIndex(a);
				Thread.sleep(2000);
			String string = totalCount.getText();
			int num = Integer.valueOf(string);
			total = num + total;
			Thread.sleep(5000);
			}
		}
		System.out.println("Total count is =" + total);
		Thread.sleep(5000);
	}
}
