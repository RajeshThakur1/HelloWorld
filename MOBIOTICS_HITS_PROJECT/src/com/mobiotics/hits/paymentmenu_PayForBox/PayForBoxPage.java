package com.mobiotics.hits.paymentmenu_PayForBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.hits.commompages.BasePage;
import com.mobiotics.hits.paymentmenu_AddPayment.CitrusPaymentPage;

import generics.DateHelper;

public class PayForBoxPage extends BasePage
{
   public PayForBoxPage() 
   {
	PageFactory.initElements(driver, this);
   }
   
   @FindBy(id="boxtype")
   private WebElement selectBoxType;
   
   @FindBy(id="status")
   private WebElement selectStatus;
   
   @FindBy(id="model")
   private WebElement searchByModel;
   
   @FindBy(xpath="//button[@type='submit' and contains(text(), 'Go')]")
   private WebElement clickForSearchByModel;
   
   @FindBy(xpath="//button[@id='refresh']")
   private WebElement clickToSearchByDate;
   
   @FindBy(id="payfoboxpaymentbtn")
   private WebElement clickPayForBoxPaymentBtn;
   
   @FindBy(id="boxtypeselect")
   private WebElement selectByBoxType;
   
   @FindBy(id="modelinput")
   private WebElement enterModelType;
   
   @FindBy(id="quantity")
   private WebElement enterNumberOfQuntity;
   
   @FindBy(id="amount")
   private WebElement enterAmount;
   
   @FindBy(id="comment")
   private WebElement writeComment;
   
   @FindBy(id="submit")
   private WebElement clickOnPayForBoxSubmitBtn;
   
   /*@FindBy()
   private WebElement ;
   
   @FindBy()
   private WebElement ;*/
   
   
   public void SelectByValue(WebElement element, String value)
   {
	   Select select = new Select(element);
	   select.selectByVisibleText(value);
   }
   
   
   public void goTOPayForBoxReport() throws InterruptedException
   {
	   DateHelper date= new DateHelper();
	   
	   SelectByValue(selectBoxType, "SD");
	   SelectByValue(selectStatus, "PAID");
	   
	   //searchByModel.sendKeys("");
	   //clickForSearchByModel.click();
	   
	   date.selectMonth("June");
	   date.selectDate("1");
	   clickToSearchByDate.click();
	   
	   List<WebElement> list = driver.findElements(By.xpath("//div[@class='paymentlist table-responsive']//tbody//td[1]"));
	   if(list.size()!=0)
	   {
		 driver.findElement(By.xpath("//button[@class='btn btn-success pull-right']")).click();
	   }
	   
	   waitTillElementIsVisible(clickPayForBoxPaymentBtn);
	   clickPayForBoxPaymentBtn.click();
	   
	   waitTillElementIsVisible(selectBoxType);
	   SelectByValue(selectByBoxType, "SD-1.00");
	   
	   waitTillElementIsVisible(enterModelType);
	   enterModelType.sendKeys("abcd");
	   
	   waitTillElementIsVisible(enterNumberOfQuntity);
	   enterNumberOfQuntity.sendKeys("1");
	   
	   //waitTillElementIsVisible(enterAmount);
	   //enterAmount.sendKeys("");
	   
	   waitTillElementIsVisible(writeComment);
	   writeComment.sendKeys("Hello");
	   
	   clickOnPayForBoxSubmitBtn.click();
	   Thread.sleep(2000);
	   
	   CitrusPaymentPage citPay = new CitrusPaymentPage();
	   citPay.goToCirtusPaymentPage();
   }
}
