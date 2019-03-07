package com.mobiotics.HitsAdmin.ReportsFinance;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

import generics.DatePicker;

public class AdminReportsFinance_PayForBoxPage extends BasePage {
	public AdminReportsFinance_PayForBoxPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(id = "boxtype")
	private WebElement boxType;

	@FindBy(id = "status")
	private WebElement boxStatus;

	@FindBy(id = "gateway")
	private WebElement paymentGateWay;

	@FindBy(id = "download_btn")
	private WebElement downloadButton;

	@FindBy(id = "refresh")
	private WebElement goButton;
	//
	// @FindBy()
	// private WebElement ;
	//
	// @FindBy()
	// private WebElement ;
	//
	// @FindBy()
	// private WebElement ;

	public void AdminReportsFinance_PayForBox() throws InterruptedException {
		DatePicker date = new DatePicker();
		date.selectYear("2017");
		System.out.println("Year is 2017");
		date.selectMonth("August");
		System.out.println("month is August");
		date.selectDate("1");
		System.out.println("date is 1st");
		Thread.sleep(5000);
		waitTillElementIsVisible(goButton);
		goButton.click();
		Thread.sleep(5000);
		Select select = new Select(boxType);
		Select select1 = new Select(boxStatus);
		Select select2 = new Select(paymentGateWay);
		Thread.sleep(5000);
		List<WebElement> list = select.getOptions();
		int size = list.size();
		System.out.println(size);
		Thread.sleep(5000);
		List<WebElement> list1 = select1.getOptions();
		int size1 = list1.size();
		System.out.println(size1);
		Thread.sleep(5000);
		List<WebElement> list2 = select2.getOptions();
		int size2 = list2.size();
		System.out.println(size2);
		Thread.sleep(5000);
		for (int a = 1; a < size; a++) {
			select.selectByIndex(a);
			String value = list.get(a).getText();
			System.out.println(value);
			Thread.sleep(2000);

			for (int b = 1; b < size1; b++) {
				select1.selectByIndex(b);
				String value1 = list1.get(b).getText();
				System.out.println(value1);
				Thread.sleep(3000);
				
				for (int c = 1; c < size2; c++) {
					select2.selectByIndex(c);
					String value2 = list2.get(c).getText();
					System.out.println(value2);
					Thread.sleep(3000);
				}
			}
		}Thread.sleep(5000);
	}
}