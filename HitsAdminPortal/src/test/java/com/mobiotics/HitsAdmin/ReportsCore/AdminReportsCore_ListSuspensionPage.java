package com.mobiotics.HitsAdmin.ReportsCore;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

import generics.DatePicker;

public class AdminReportsCore_ListSuspensionPage extends BasePage
{
	public AdminReportsCore_ListSuspensionPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="activitystatus")
	private WebElement activityStatus;
	
	@FindBy(id="devicestatus")
	private WebElement deviceStatus;
	
	@FindBy(id="download_btn")
	private WebElement suspensionDownload;
	
	@FindBy(id="refresh")
	private WebElement goButton;
	
	public void reportsCore_ListSuspension() throws InterruptedException
	{
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
		Select select1 = new Select(activityStatus);
		Select select2 = new Select(deviceStatus);
		Thread.sleep(5000);
		List<WebElement> list1 = select1.getOptions();
		int size1 = list1.size();
		System.out.println(size1);
		Thread.sleep(5000);
		List<WebElement> list2 = select2.getOptions();
		int size2 = list2.size();
		System.out.println(size2);
		Thread.sleep(5000);
		//int total = 0;
		for (int i = 1; i <size1; i++) {
			select1.selectByIndex(i);
			Thread.sleep(3000);
			for(int a = 1; a< size2; a++){
				select1.selectByIndex(a);
				Thread.sleep(3000);
				waitTillElementIsVisible(suspensionDownload);
				suspensionDownload.click();
				Thread.sleep(3000);
			}
			
		}Thread.sleep(5000);
		
	}
}
