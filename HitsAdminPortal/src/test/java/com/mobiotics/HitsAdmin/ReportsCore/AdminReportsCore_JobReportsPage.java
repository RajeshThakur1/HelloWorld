package com.mobiotics.HitsAdmin.ReportsCore;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

import generics.DatePicker;

public class AdminReportsCore_JobReportsPage extends BasePage
{
	public AdminReportsCore_JobReportsPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="initiatortype")
	private WebElement initiatorType;
	
	@FindBy(id="jobstatus")
	private WebElement jobStatus;
	
	@FindBy(id="download_btn")
	private WebElement downloadButton;
	
	@FindBy(id="refresh")
	private WebElement goButton;
	
	public void reportsCore_JobReports() throws InterruptedException {

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
		waitTillElementIsVisible(initiatorType);
		Select select = new Select(initiatorType);
		Thread.sleep(5000);
		waitTillElementIsVisible(jobStatus);
		Select select1 = new Select(jobStatus);
		Thread.sleep(5000);
		List<WebElement> list = select.getOptions();
		int size = list.size();
		System.out.println(size);
		Thread.sleep(5000);
		List<WebElement> list1 = select1.getOptions();
		int size1 = list1.size();
		System.out.println(size1);
		Thread.sleep(5000);
		//int total = 0;
		for (int i = 1; i < size; i++) {
			select.selectByIndex(i);
			Thread.sleep(3000);
			for(int a=1; a<size1;a++){
				select1.selectByIndex(a);
				Thread.sleep(5000);
				waitTillElementIsVisible(downloadButton);
				downloadButton.click();
				Thread.sleep(3000);
			}
		}Thread.sleep(5000);
	}
}
