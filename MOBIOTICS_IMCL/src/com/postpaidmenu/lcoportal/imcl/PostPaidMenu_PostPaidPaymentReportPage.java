package com.postpaidmenu.lcoportal.imcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;

import generics.DateHelper;

public class PostPaidMenu_PostPaidPaymentReportPage extends BasePage{

	public PostPaidMenu_PostPaidPaymentReportPage() {

       PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='end']")
	private WebElement dataPicker;
	
	@FindBy(xpath="//input[@name='custid']")
	private WebElement searchByCanNumber;
	
	@FindBy(xpath="//input[@name='invid']")
	private WebElement searchByInvoiceId;
	
	@FindBy(xpath="//input[@name='planname']")
	private WebElement searchByPlanName;
	
	@FindBy(xpath="//button[@id='refresh']")
	private WebElement clickOnGobuttonToSelecetTheDate;
	
	@FindBy(xpath="//button[@class='btn btn-danger pull-right']")
	private WebElement clickOnBillDownLoadButton;
	
	
	public void PostPaidPaymentPageMenu() throws InterruptedException
	{
		 DateHelper datepicker = new DateHelper();
		  
		  datepicker.selectMonth("May");
		  datepicker.selectDate("1");

		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@id='refresh']")).click();
		  waitTillElementIsVisible(clickOnBillDownLoadButton);
		  
		  if(clickOnBillDownLoadButton.isEnabled())
		  {
			  clickOnBillDownLoadButton.click();  
		  }
		  else{
			  String stringn=driver.findElement(By.xpath("//div[@class='postpaidreport table-responsive']//tr//td")).getText();
			  System.out.println(stringn);
		  }
       
	}
	}
