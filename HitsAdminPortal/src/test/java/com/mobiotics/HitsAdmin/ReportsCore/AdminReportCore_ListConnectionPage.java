package com.mobiotics.HitsAdmin.ReportsCore;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

import generics.DatePicker;

public class AdminReportCore_ListConnectionPage extends BasePage {
	public AdminReportCore_ListConnectionPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(id = "totalcount")
	private WebElement totalCount;

	@FindBy(id = "download_btn")
	private WebElement downloadButton;

	@FindBy(id = "producttype")
	private WebElement productType;

	@FindBy(id = "connectiontype")
	private WebElement connectionType;

	@FindBy(id = "connectionstatus")
	private WebElement connectionStatus;

	@FindBy(id = "//input[@name='customerid']")
	private WebElement searchByCustID;

	@FindBy(id = "refresh")
	private WebElement clcikOnGoButton;

	@FindBy(xpath = "//input[@name='productname']")
	private WebElement searchByProductName;

	@FindBy(id = "productname_btn")
	private WebElement productNameButton;

	public void reportsCore_ListConnection() throws InterruptedException {

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
		waitTillElementIsVisible(totalCount);
		String string = totalCount.getText();
		int num = Integer.valueOf(string);
		System.out.println("total count is " + num);
		Select select = new Select(productType);
		Select select1 = new Select(connectionType);
		Select select2 = new Select(connectionStatus);

		List<WebElement> list = select.getOptions();
		int size = list.size();
		System.out.println(size);

		List<WebElement> list1 = select1.getOptions();
		int size1 = list1.size();
		System.out.println(size1);

		List<WebElement> list2 = select2.getOptions();
		int size2 = list2.size();
		System.out.println(size2);
		Thread.sleep(5000);
		int total = 0;
		for (int a = 1; a < size1; a++) {
			select1.selectByIndex(a);
			String value1 = list1.get(a).getText();
			System.out.println(value1);
			Thread.sleep(3000);
			for (int b = 1; b < size2; b++) {
				select2.selectByIndex(b);
				String value2 = list2.get(b).getText();
				System.out.println(value2);
				Thread.sleep(3000);
				for (int i = 1; i < size; i++) {
					select.selectByIndex(i);
					String value = list.get(i).getText();
					System.out.println(value);
					Thread.sleep(3000);
					waitTillElementIsVisible(totalCount);
					System.out.println(value + " count = " + totalCount.getText());
					String string1 = totalCount.getText();
					int num1 = Integer.valueOf(string1);
					total = num1 + total;
					Thread.sleep(5000);
				}
			}
		}
		System.out.println("Total count of Devices are " + total);
		Thread.sleep(5000);
	}
}
