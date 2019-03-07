package com.mobiotics.HitsAdmin.ReportSchedule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminReportSchedule_ListAutoRenewPage extends BasePage
{
	public AdminReportSchedule_ListAutoRenewPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="status")
	private WebElement autoRenewStatus;
	
	@FindBy(id="initiatortype")
	private WebElement initiatorType;
	
	@FindBy(id="tag")
	private WebElement tag;
	
	@FindBy(id="schedulebtn")
	private WebElement scheduleAutoRenewBtn;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement downloadAutoRenewButton;
	
	@FindBy(id="refresh")
	private WebElement goButton;
	
	@FindBy(xpath="bulkmodalsubscribe")
	private WebElement bulkActivaties;
	
	@FindBy(xpath="//h4[.='Schedule for autorenew']")
	private WebElement schedulePopUp;
	
	@FindBy(id="customerno")
	private WebElement custName;
	
	@FindBy(id="validationselect")
	private WebElement selectValidity;
	
	@FindBy(id="tagselect")
	private WebElement selectTag;
	
	@FindBy(xpath="(//button[@id='submit'])[1]")
	private WebElement submitButton;
	
	@FindBy(xpath="(//button[@id='close'])[1]")
	private WebElement closeButton;
	
	@FindBy(xpath="(//h4[@id='myModalLabel'])[3]")
	private WebElement bulkSchedulePopUp;
	
	@FindBy(id="bulkactivity")
	private WebElement selectBulkActivaity;
	
	@FindBy(xpath="(//button[.='Close'])[3]")
	private WebElement closeButtonOfBulkActivity;
}
