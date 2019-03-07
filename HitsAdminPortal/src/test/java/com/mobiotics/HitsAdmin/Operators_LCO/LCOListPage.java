package com.mobiotics.HitsAdmin.Operators_LCO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

import generics.DatePicker;

public class LCOListPage extends BasePage{
	
	public LCOListPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(name="username")
	private WebElement searchByName;
	
	@FindBy(id="username_btn")
	private WebElement goBtn1;
	
	@FindBy(name="firstname")
	private WebElement searchByFirstName;
	
	@FindBy(id="bigcitysearch")
	private WebElement searchByBigCity;
	
	@FindBy(id="businessunitidsearch")
	private WebElement searchByBusinessId;
	
	@FindBy(id="lcostatus")
	private WebElement selectStatusOfLCO;
	
	@FindBy(id="registered")
	private WebElement selectRegistrationStatus;
	
	@FindBy(id="totalcount")
	private WebElement totalCount;
	
	@FindBy(xpath="//button[.='LCO Download']")
	private WebElement clickToDownloadLCO;
	
	@FindBy(id="refresh")
	private WebElement dateGoBtn;
	
	public void getLCOList_Operators() throws InterruptedException{
		DatePicker date = new DatePicker();
		
		//Thread.sleep(3000);
		date.selectYear("2014");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//div[@id='startdatepicker']//span)[1]")).click();
		date.selectMonth("January");
		//Thread.sleep(3000);
		date.selectDate("12");
		waitTillElementIsVisible(dateGoBtn);
		dateGoBtn.click();
		Thread.sleep(3000);
		waitTillElementIsVisible(totalCount);
		System.out.println("Total LCO count is "+ totalCount.getText());
		
		Select select = new Select(selectStatusOfLCO);
		Select select1 = new Select(selectRegistrationStatus);
		Thread.sleep(5000);
		select.selectByVisibleText("ACTIVE");
		select1.selectByVisibleText("YES");
		Thread.sleep(5000);
		waitTillElementIsVisible(totalCount);
		System.out.println("Total Active LCO count is "+ totalCount.getText());
		
		Thread.sleep(5000);
		select.selectByVisibleText("INACTIVE");
		select1.selectByVisibleText("YES");
		Thread.sleep(3000);
		waitTillElementIsVisible(totalCount);
		Thread.sleep(5000);
		System.out.println("Total INACTIVE LCO count is "+ totalCount.getText());
		
				
		select.selectByVisibleText("VERIFY");
		select1.selectByVisibleText("YES");
		Thread.sleep(3000);
		waitTillElementIsVisible(totalCount);
		Thread.sleep(5000);
		System.out.println("Total VERIFY LCO count is "+ totalCount.getText());
		Thread.sleep(5000);
				
		select.selectByVisibleText("REGISTERED");
		select1.selectByVisibleText("YES");
		Thread.sleep(3000);
		waitTillElementIsVisible(totalCount);
		Thread.sleep(5000);
		System.out.println("Total REGISTERED LCO count is "+ totalCount.getText());
		
		select.selectByVisibleText("ACTIVE");
		select1.selectByVisibleText("NO");
		Thread.sleep(3000);
		waitTillElementIsVisible(totalCount);
		Thread.sleep(5000);
		System.out.println("Total ACTIVE LCO count is "+ totalCount.getText());
		
		Thread.sleep(5000);	
		select.selectByVisibleText("INACTIVE");
		select1.selectByVisibleText("NO");
		Thread.sleep(3000);
		waitTillElementIsVisible(totalCount);
		Thread.sleep(5000);
		System.out.println("Total INACTIVE LCO count is "+ totalCount.getText());
		
		Thread.sleep(5000);	
		select.selectByVisibleText("VERIFY");
		select1.selectByVisibleText("NO");
		Thread.sleep(3000);
		waitTillElementIsVisible(totalCount);
		Thread.sleep(7000);
		System.out.println("Total VERIFY LCO count is "+ totalCount.getText());
		
		Thread.sleep(5000);	
		select.selectByVisibleText("REGISTERED");
		select1.selectByVisibleText("NO");
		Thread.sleep(3000);
		waitTillElementIsVisible(totalCount);
		Thread.sleep(7000);
		System.out.println("Total REGISTERED LCO count is "+ totalCount.getText());
		
		Thread.sleep(5000);
	}

}
