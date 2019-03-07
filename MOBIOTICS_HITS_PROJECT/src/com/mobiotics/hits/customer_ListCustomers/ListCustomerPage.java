 package com.mobiotics.hits.customer_ListCustomers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.hits.commompages.BasePage;

import generics.DateHelper;

public class ListCustomerPage extends BasePage
{
   public ListCustomerPage() 
   {
	 PageFactory.initElements(driver, this);
   }
   
   
   @FindBy(xpath="//form[@id='customeridsearch']//input")
   private WebElement searchByCustomerId;
   
   @FindBy(xpath="//form[@id='customeridsearch']//button")
   private WebElement clickToSearchByCustId;
   
   @FindBy(xpath="//form[@id='firstnamesearch']/input")
   private WebElement searchByFirstName;
   
   @FindBy(xpath="//form[@id='firstnamesearch']/button")
   private WebElement clickToSearchByFirstName;
   
   @FindBy(xpath="//form[@id='mobilenosearch']/input ")
   private WebElement searchByMobileNumber;
   
   @FindBy(xpath="//form[@id='mobilenosearch']/button")
   private WebElement clickToSearchByPhoneNumber;
   
   @FindBy(xpath="//form[@id='deviceserialnosearch']/input")
   private WebElement searchByDeviceSerialNum;
   
   @FindBy(xpath="//form[@id='deviceserialnosearch']/button")
   private WebElement clickToSearchByDeviceSerialNum;
   
   @FindBy(xpath="//select[@id='customerstatus']")
   private WebElement selectByCustomerStatus;
   
   @FindBy(xpath="//select[@id='kycstatus']")
   private WebElement selectByKycStatus;
   
   @FindBy(xpath="//button[@id='refresh']")
   private WebElement clickToSearchByDates;
   
   @FindBy(xpath="html/body/div[2]/div[1]/div[2]/button[1]")
   private WebElement clickForCustomerDownLoad;
   
   @FindBy(xpath="html/body/div[2]/div[1]/div[2]/button[2]")
   private WebElement clickForActivationDownLoad;
   
   @FindBy(xpath="//button[@id='activationsButton']")
   private WebElement clickOnActivations;
   
   @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tr//td[1]")
   private WebElement contractId;
   
   @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tr//td[7]")
   private WebElement statusOfPlans;
   
   @FindBy(xpath="//form[@id='download']//button")
   private WebElement customerDownloadConfirmation;
   
   
   public void selectValue(WebElement element, String value)
   {
	   Select selectValue = new Select(element);
	   selectValue.selectByVisibleText(value);
   }
   
   
   public void ListCustomer() throws InterruptedException
   {
	   DateHelper datePicker = new DateHelper();
	   
	   selectValue(selectByCustomerStatus, "ACTIVE");
	   selectValue(selectByKycStatus, "VERIFIED");
	   
	   
	   datePicker.selectMonth("May");
	   datePicker.selectDate("1");
	   waitTillElementIsVisible(clickToSearchByDates);
	   clickToSearchByDates.click();
	   
	   
	   List<WebElement> list = driver.findElements(By.xpath("//button[@id='activationsButton']"));
	   
		Thread.sleep(3000);

		System.out.println(list.size());
		if (list.size() != 0) {
			System.out.println(list);
			log.info("enter if loop");
			for (WebElement ele : list) {
				log.info("enter for loop");
				Thread.sleep(3000);
				ele.click();

				log.info("I clicked");
				// clickOnActivations.click();
				waitTillElementIsVisible(contractId);
				Thread.sleep(2000);
				String activationContractId = contractId.getText();
				String activationStatusOfPlan = statusOfPlans.getText();
				System.out.println("Product Activations Contract Id " + activationContractId
						+ " and the Ststus of the plans are " + activationStatusOfPlan);
				driver.findElement(By.id("close")).click();

				waitTillElementIsVisible(clickForCustomerDownLoad);
				Thread.sleep(2000);
				clickForCustomerDownLoad.click();
				waitTillElementIsVisible(customerDownloadConfirmation);
				customerDownloadConfirmation.click();
				Thread.sleep(2000);
				waitTillElementIsVisible(clickForActivationDownLoad);
				clickForActivationDownLoad.click();
				Thread.sleep(2000);
				customerDownloadConfirmation.click();
				Thread.sleep(2000);
			}
		}

		else {
			String string = driver.findElement(By.xpath("//table[@class='table table-striped']//tbody//td")).getText();
			System.out.println(string);
		}
	 }
}
