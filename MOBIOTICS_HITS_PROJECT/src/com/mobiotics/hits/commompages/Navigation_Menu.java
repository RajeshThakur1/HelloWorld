package com.mobiotics.hits.commompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation_Menu extends BasePage
{
	public Navigation_Menu() 
	{
		PageFactory.initElements(driver, this);
	}

//-------------------------------------this is Payment Menu--------------------------------------------------------	
	@FindBy(partialLinkText="Add Payment")
	public WebElement payment_AddPayment;
	
	@FindBy(partialLinkText="List Payments")
	public WebElement payment_ListPayments;
	
	@FindBy(partialLinkText="Pay for Box")
	public WebElement payment_PayForBox;

//-------------------------------------this is customer Menu----------------------------------------------------------
	@FindBy(partialLinkText="Create Customer")
	public WebElement customer_CreateCustomer;
	
	@FindBy(partialLinkText="List Customer")
	public WebElement customer_ListCustomer;
	
	@FindBy(partialLinkText="Modify Customer")
	public WebElement customer_ModifyCustomer;
	
	@FindBy(partialLinkText="Subscriber Corner")
	public WebElement customer_SubscriberCorner;
	
//----------------------------------------product Menu--------------------------------------------------------------
	@FindBy(partialLinkText="Add Basepack")
	public WebElement product_AddBasePack;
	
	@FindBy(partialLinkText="Add Add-ons")
	public WebElement product_AddOns;
	
	@FindBy(partialLinkText="Disconnect")
	public WebElement product_Disconect;
	
	@FindBy(partialLinkText="Reconnect")
	public WebElement product_Reconnect;
	
	@FindBy(partialLinkText="Know Your Basepack")
	public WebElement product_KnowYourBasePack;
	
	@FindBy(partialLinkText="Activate Pending Plans")
	public WebElement product_ActivatePendingPlans;
	
//-----------------------------------this is Renew Menu-------------------------------------------------------------------	
	@FindBy(partialLinkText="After Expiry")
	public WebElement renew_AfterExpiry;
	
	@FindBy(partialLinkText="Before Expiry")
	public WebElement renew_BeforeExpiry;
	
//--------------------------------------this is Report Menu---------------------------------------------------------------
	@FindBy(partialLinkText="Expiry Report")
	public WebElement report_ExpiryReport;
	
	@FindBy(partialLinkText="Job Report")
	public WebElement report_JobReport;
	
	@FindBy(partialLinkText="SMS Report")
	public WebElement report_SmsReport;
	
//---------------------------------------this is Device Menu-------------------------------------------------------------
	@FindBy(partialLinkText="List Devices")
	public WebElement device_ListDevices;
	
	@FindBy(partialLinkText="OSD") 
	public WebElement device_OSD;
	
	@FindBy(partialLinkText="Retrack ACTIVE")
	public WebElement device_RetrackActive;
	
	@FindBy(partialLinkText="Retrack DEACTIVE")
	public WebElement device_RetrackDeactive;
	
	@FindBy(partialLinkText="Hardware Replacement")
	public WebElement device_HardwareReplacement;
	
//----------------------------------this is Ticket Menu------------------------------------------------------------------
	@FindBy(partialLinkText="Create Ticket")
	public WebElement ticket_CreateTicket;
	
	@FindBy(partialLinkText="List Ticket")
	public WebElement ticket_ListTicket;
	
//------------------------------------this is Profile Menu---------------------------------------------------------
	@FindBy(partialLinkText="My Profile")
	public WebElement profile_MyProfile;
	
	@FindBy(partialLinkText="Add Subuser")
	public WebElement profile_AddSubuser;
	
	@FindBy(partialLinkText="Modify Subuser")
	public WebElement profile_ModifySubuser;
	
	/*@FindBy(partialLinkText="")
	public WebElement ;
	
	@FindBy(partialLinkText="")
	public WebElement ;*/
	
}
