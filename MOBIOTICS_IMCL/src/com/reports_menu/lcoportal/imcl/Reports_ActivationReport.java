package com.reports_menu.lcoportal.imcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lcoportal.pages.BasePage;

import generics.DateHelper;

public class Reports_ActivationReport extends BasePage 
{
  public Reports_ActivationReport() {
	
	  PageFactory.initElements(driver, this);
}
  
  @FindBy(id="status")
  private WebElement status;
  
  @FindBy(id="type")
  private WebElement type;
  
  @FindBy(xpath="//input[@class='form-control search']")
  private WebElement enterCanNumber;
  
  @FindBy(xpath="//button[@type='submit' and contains(text(), 'Go')]")
  private WebElement clickOnGoButtonForCan;
  
  @FindBy(xpath="//input[@name='start']")
  private WebElement startDate;
  
  @FindBy(xpath="//button[@id='refresh']")
  private WebElement clickOnGoForResult;
  
  @FindBy(xpath=".//*[@id='download']/button")
  private WebElement clickOnDownloadButton;
  
  @FindBy(xpath="//select[@class='form-control filter']")
  private WebElement ecpiryReportSelect;
  
  @FindBy(xpath="//form[@id='download']//button")
  private WebElement expiryReportDownload;
  
  @FindBy(xpath="//a[@href='#' and contains(text(), 'Report')]")
  private WebElement reportsMenu;
  
  @FindBy(xpath="//select[@class='expiry form-control filter']")
  private WebElement expireReportsOn;
  
  @FindBy(id="year")
  private WebElement billsSelectYears;
  
  @FindBy(id="month")
  private WebElement billsSelectMonth;
  
  @FindBy(id="status")
  private WebElement paymentsPaid;
  
  @FindBy(id="gwprovider")
  private WebElement selectByPaymentGateWay;
  
  @FindBy(id="paymentmode")
  private WebElement byChequeOrCash;
  //------------------------------------------------------------------
  @FindBy(id="status")
  private WebElement schudelReportStatus;
  
  @FindBy(xpath="//input[@class='form-control search']")
  private WebElement enterCanforSchudelReport;
  
  @FindBy(xpath="//select[@id='status']")
  private WebElement scheduleReportStatus;
  
  @FindBy(xpath="//input[@class='form-control search']")
  private WebElement scheduleReportCanNum;
  
  @FindBy(xpath="//button[@type='submit' and contains(text(), 'Go')]")
  private WebElement clickOnGoButtonForScheduleReport;
  
  @FindBy(xpath="//input[@name='start']")
  private WebElement startDateForScheduleReport;
  
  @FindBy(xpath="//button[@id='refresh']")
  private WebElement clickOnGoForDateSelector;
  
  @FindBy(xpath="//button[@type='submit' and contains(text(), 'Schedule')]")
  private WebElement clickOnScheduleDownloadButton;
  
  
  
  private void ActivationReports(WebElement element, int text) 
  {
	Select select = new Select(element);
	select.selectByIndex(text);
   }
  
  private void SelectClass(WebElement element1, String text1)
  {
	  Select select1 = new Select(element1);
	  select1.selectByVisibleText(text1);
  }
  
  
 public void ActivationsReportsData() throws Exception
  {
	  waitTillElementIsVisible(status);
	  ActivationReports(status, 1);
	  waitTillElementIsVisible(type);
	  ActivationReports(type, 2);
	  waitTillElementIsVisible(enterCanNumber);
	  enterCanNumber.clear();
	  enterCanNumber.sendKeys("can20227054");
	  waitTillElementIsVisible(clickOnGoButtonForCan);
	  clickOnGoButtonForCan.click();
	  DateHelper date = new DateHelper();
	  date.selectMonth("May");
	  date.selectDate("10");
	  waitTillElementIsVisible(clickOnGoForResult);
	  clickOnGoForResult.click();
	  Thread.sleep(2000);
	  waitTillElementIsVisible(clickOnDownloadButton);
	  clickOnDownloadButton.click();
	  Thread.sleep(5000);
  }
  
  
 public void ExpiryReportData() throws Exception
  {
	 
	  reportsMenu.click();
	  driver.findElement(By.linkText("Expiry Report")).click();
	  SelectClass(ecpiryReportSelect, "Next 7 days");
	  Thread.sleep(5000);
	  if(expiryReportDownload.isEnabled())
	    {
		  Thread.sleep(2000);
		  expiryReportDownload.click();
	    }
	  else
	   {
		  Thread.sleep(2000);
		 System.out.println("there is no data to download");
	   }Thread.sleep(5000);
  }
 
 
 public void ExpiredReportData() throws Exception
 {
	 reportsMenu.click();
	 driver.findElement(By.linkText("Expired Report")).click();
	 waitTillElementIsVisible(expireReportsOn);
	 SelectClass(expireReportsOn, "Last 7 days");
	 Thread.sleep(5000);
	 if(driver.findElement(By.id("download")).isEnabled())
	  {
		 Thread.sleep(2000);
	    driver.findElement(By.id("download")).click();
	  }
	 else
	   {
		 Thread.sleep(2000);
		 System.out.println("no data to download");
	    }Thread.sleep(5000);
  }
 
 
 
 
 public void BillsReportData() throws Exception 
 {
	 reportsMenu.click();
	 driver.findElement(By.linkText("Bills")).click();
	 Thread.sleep(50000);
	 waitTillElementIsVisible(billsSelectYears);
	 SelectClass(billsSelectYears, "2017");
	 Thread.sleep(2000);
	 SelectClass(billsSelectMonth, "APR");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//a[@id='prepaiddownload']")).click();
	 Thread.sleep(2000);
 }
 
 
 public void RefundReportData() throws Exception
 {
	 reportsMenu.click();
	 driver.findElement(By.linkText("Refund Report")).click();
	 DateHelper date = new DateHelper();
	 date.selectMonth("January");
	 date.selectDate("10");
	 clickOnGoForResult.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@type='submit' and contains(text(),'Refund')]")).click();
	 Thread.sleep(2000);
 }
 
 
 public void PaymentReportData() throws Exception
 {
	 reportsMenu.click();
	 driver.findElement(By.linkText("Payment Report")).click();
	 waitTillElementIsVisible(paymentsPaid);
     SelectClass(paymentsPaid, "FAILED");
     waitTillElementIsVisible(selectByPaymentGateWay);
     SelectClass(selectByPaymentGateWay, "PAYTM");
     waitTillElementIsVisible(byChequeOrCash);
     SelectClass(byChequeOrCash, "CA");
	 DateHelper date = new DateHelper();
	 date.selectMonth("January");
	 date.selectDate("10");
	 clickOnGoForResult.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(2000);	 
  }
 
 
 public void ScheduleReportData() throws Exception
 {
	 reportsMenu.click();
	 driver.findElement(By.linkText("Scheduled Report")).click();
	 waitTillElementIsVisible(scheduleReportStatus);
	 SelectClass(scheduleReportStatus, "ACTIVE");
	 	
	 DateHelper date = new DateHelper();
	 date.selectMonth("March");
	 date.selectDate("10");
	 
	 waitTillElementIsVisible(clickOnGoForDateSelector);
	 clickOnGoForDateSelector.click();
	 
	 waitTillElementIsVisible(clickOnScheduleDownloadButton);
	 clickOnScheduleDownloadButton.click();
	 Thread.sleep(2000);	 
 }
}