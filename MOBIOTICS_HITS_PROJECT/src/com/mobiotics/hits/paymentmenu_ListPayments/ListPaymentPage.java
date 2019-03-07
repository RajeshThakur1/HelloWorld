package com.mobiotics.hits.paymentmenu_ListPayments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.hits.commompages.BasePage;

import generics.DateHelper;

public class ListPaymentPage extends BasePage
{
   public ListPaymentPage() 
   {
	  PageFactory.initElements(driver, this);
   }

   
   @FindBy(id="status")
   private WebElement selectPaymentStatus;
   
   @FindBy(id="paymentmode")
   private WebElement selectPaymentMode;
   
   @FindBy(xpath="//button[@class='btn btn-success pull-right']")
   private WebElement clickToDownloadPaymentReport;
   
   @FindBy(id="refresh")
   private WebElement clickToSearchViaDates;
   
   @FindBy(xpath="//button[@id='refresh']")
   private WebElement clickOnGoButtonForDateSearch;
   
      
   private void selectValue(WebElement element, String value) 
	  {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	  }
   
   
   public void DownloadListPaymentReport() throws InterruptedException
   {
	  DateHelper datepicker = new DateHelper();
	  
	  selectValue(selectPaymentStatus, "PENDING");
	  selectValue(selectPaymentMode, "ALL");
	  
	  datepicker.selectMonth("June");
	  datepicker.selectDate("1");
	  waitTillElementIsVisible(clickOnGoButtonForDateSearch);
	  clickOnGoButtonForDateSearch.click();
	  
	  List<WebElement> list = driver.findElements(By.xpath("//div[@class='paymentlist table-responsive']//tbody//td[1]"));
	  if(list.size()!=0)
	  {
	  waitTillElementIsVisible(clickOnGoButtonForDateSearch);
	  clickOnGoButtonForDateSearch.click();
	  
	  waitTillElementIsVisible(clickToDownloadPaymentReport);
	  clickToDownloadPaymentReport.click(); 
	  Thread.sleep(4000);
	  }
	  else
	  {
		  String string = driver.findElement(By.xpath("//div[@class='paymentlist table-responsive']//tbody//td")).getText();
		  System.out.println(string);
	  }
    }
}