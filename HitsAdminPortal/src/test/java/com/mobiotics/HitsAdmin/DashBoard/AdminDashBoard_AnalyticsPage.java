package com.mobiotics.HitsAdmin.DashBoard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminDashBoard_AnalyticsPage extends BasePage
{
	public AdminDashBoard_AnalyticsPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="//*[.='Admin Dashboard']")
	private WebElement adminDashboard;
	
	@FindBy(xpath="//*[.='Total LCOs']")
	private WebElement totalLCO;
	
	@FindBy(id="total_lco")
	private WebElement totalNumOfLco;
	
	@FindBy(xpath="//*[.='Total Customer']")
	private WebElement totalCust;
	
	@FindBy(id="total_customer")
	private WebElement totalNumOfCust;
	
	@FindBy(xpath="//*[.='Total Activation']")
	private WebElement totalActivation;
	
	@FindBy(id="total_activation")
	private WebElement totalNumOfActivation;
	
	@FindBy(xpath="//*[.='Total MSOs']") 
	private WebElement totalMso;
	
	@FindBy(id="total_mso")
	private WebElement totalNumOfMso;
	
	@FindBy(xpath="//*[.='Total DPOs']")
	private WebElement totalDpo;
	
	@FindBy(id="total_dpo")
	private WebElement totalNumOfDpo;
	
	@FindBy(xpath="//*[.='Total Payments']")
	private WebElement totalPayments;
	
	@FindBy(id="total_payments")
	private WebElement totalNoOfPayment;
	
	@FindBy(xpath="//p[contains(text(),'Request : ')]")
	private WebElement request;
	
	@FindBy(id="totalhansenrequest")
	private WebElement totalRequest;
	
	@FindBy(xpath="//p[contains(text(),'Timeout : ')]")
	private WebElement timeOuts;
	
	@FindBy(id="totalhansentimeout")
	private WebElement totalTimeOuts;
//	
//	@FindBy()
//	private WebElement ;
//	
//	@FindBy()
//	private WebElement ;
	
	public void adminDashBoardTest()
	{
		waitTillElementIsVisible(adminDashboard);
		System.out.println(adminDashboard.getText());
		
		waitTillElementIsVisible(request);
		System.out.println("Total "+request.getText()+ totalRequest.getText());
		
//		waitTillElementIsVisible(totalRequest);
//		System.out.println(totalRequest.getText());
//		
		waitTillElementIsVisible(timeOuts);
		System.out.println("Total "+ timeOuts.getText()+ totalTimeOuts.getText());
		
//		waitTillElementIsVisible(totalTimeOuts);
//		System.out.println();
		
		waitTillElementIsVisible(totalLCO);
		System.out.println("Total "+totalLCO.getText()+" are "+totalNumOfLco.getText());
		
//		waitTillElementIsVisible(totalNumOfLco);
//		System.out.println();
		
		waitTillElementIsVisible(totalCust);
		System.out.println("Total "+totalCust.getText()+" are "+totalNumOfCust.getText());
		
//		waitTillElementIsVisible(totalNumOfCust);
//		System.out.println();
			
		waitTillElementIsVisible(totalActivation);
		System.out.println("Total "+totalActivation.getText()+" are "+totalNumOfActivation.getText());
//		System.out.println(.getText());
//		
//		waitTillElementIsVisible(totalNumOfActivation);
//		System.out.println(totalNumOfActivation.getText());
		
		waitTillElementIsVisible(totalMso);
		System.out.println("Total "+totalMso.getText()+" are "+totalNumOfMso.getText());
//		System.out.println(.getText());
//		
//		waitTillElementIsVisible(totalNumOfMso);
		
		//System.out.println(.getText());
		
		waitTillElementIsVisible(totalDpo);
		System.out.println("Total "+totalDpo.getText()+" are "+totalNumOfDpo.getText());
		//System.out.println(.getText());
		
//		waitTillElementIsVisible(totalNumOfDpo);
//		System.out.println(.getText());
		
		waitTillElementIsVisible(totalPayments);
		System.out.println("Total "+totalPayments.getText()+" are "+totalNoOfPayment.getText());
//		System.out.println(.getText());
//		
//		waitTillElementIsVisible(totalNoOfPayment);
//		System.out.println(.getText());
	}
	
}