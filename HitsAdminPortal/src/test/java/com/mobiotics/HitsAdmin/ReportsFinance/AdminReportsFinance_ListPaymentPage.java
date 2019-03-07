package com.mobiotics.HitsAdmin.ReportsFinance;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

import generics.DatePicker;

public class AdminReportsFinance_ListPaymentPage extends BasePage
{
	public AdminReportsFinance_ListPaymentPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="paymentstatus")
	private WebElement paymentStatus;
		
	@FindBy(id="initiatortype")
	private WebElement initiatorType;
	
	@FindBy(id="paymentmode")
	private WebElement paymentMode;
	
	@FindBy(id="type")
	private WebElement type;
	
	@FindBy(id="refresh")
	private WebElement goButton;
	
	@FindBy(id="download_btn")
	private WebElement downloadButton;
	
//	@FindBy()
//	private WebElement ;
	
	public void AdminReportsFinance_ListPayment() throws InterruptedException{
		
		DatePicker date = new DatePicker();
		date.selectYear("2016");
		System.out.println("Year is 2016");
		date.selectMonth("August");
		System.out.println("month is August");
		date.selectDate("1");
		System.out.println("date is 1st");
		Thread.sleep(5000);
		waitTillElementIsVisible(goButton);
		goButton.click();
		Thread.sleep(5000);
		Select select = new Select(paymentStatus);
		Select select1 = new Select(initiatorType);
		Select select2 = new Select(paymentMode);
		Select select3 = new Select(type);
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
		List<WebElement> list3 = select3.getOptions();
		int size3 = list3.size();
		System.out.println(size3);
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
					for (int d = 1; d < size3; d++) {
						select3.selectByIndex(d);
						String value3 = list3.get(d).getText();
						System.out.println(value3);
						Thread.sleep(3000);
						//waitTillElementIsVisible(totalCount);
						//System.out.println(value + " count = " + totalCount.getText());
						//String string1 = totalCount.getText();
						//int num1 = Integer.valueOf(string1);
						//total = num1 + total;
					}
				}
			}
		}Thread.sleep(5000);
		
	}
	
}
