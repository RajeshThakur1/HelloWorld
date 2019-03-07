package com.mobiotics.HitsAdmin.commonpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage extends BasePage{
	public NavigationPage() {
		
		PageFactory.initElements(driver, this);
	}

//--------------this is to click on Operators Menu-----------------------------
	
	
	@FindBy(xpath="//a[.='LCO']")
	public WebElement operators_Lco;
	
	@FindBy(xpath="//a[.='MSO']")
	public WebElement operators_MSO;
	
	@FindBy(xpath="//a[.='DPO']")
	public WebElement operators_DPO;
	
//--------------this is to click on Bulk Menu Hardware-----------------------------------
	
	@FindBy(id="hardwareheader")
	public WebElement bulk_hardware;
	
	@FindBy(xpath="//a[.='Retrack']")
	public WebElement bulk_hardware_Retrack;
		
	@FindBy(xpath="//a[.='Reconnect']")
	public WebElement bulk_hardware_Reconnect;
	
	@FindBy(xpath="//a[.='Disconnect']")
	public WebElement bulk_hardware_Disconnect;
	
	@FindBy(xpath="//a[.='Hardware Replacement']")
	public WebElement bulk_hardware_HardwareReplacement;
	
	@FindBy(xpath="//a[.='Send OSD']")
	public WebElement bulk_hardware_SendOSD;
	
//---------------this is to click on Bulk Menu Activation---------------------------------------	
	@FindBy(id="activationheader")
	public WebElement bulk_Activation;
	
	@FindBy(xpath="//a[.='Add-ons']")
	public WebElement bulk_activation_Addons;
	
	@FindBy(xpath="//a[.='Basepack']")
	public WebElement bulk_activation_Basepack;
	
	@FindBy(xpath="//a[.='Expiry Renew']")
	public WebElement bulk_activation_ExpiryRenew;
	
	@FindBy(xpath="//a[.='Expired Renew']")
	public WebElement bulk_activation_ExpiredRenew;
	
	@FindBy(xpath="//a[.='Create Subscriber']")
	public WebElement bulk_activation_CreateCustomer;
	
//--------------------this is to click on reports Menu Core Menu Listing---------------------------------------------
	
	@FindBy(id="coreheader")
	public WebElement report_Core;
	
	@FindBy(xpath="//a[.='List Customer']")
	public WebElement report_Core_ListCust;
	
	@FindBy(xpath="//a[.='List Devices']")
	public WebElement report_Core_ListDevices;
	
	@FindBy(xpath="//a[.='List Connections']")
	public WebElement report_Core_Listconnections;
	
	@FindBy(xpath="//a[.='List Activations']")
	public WebElement report_Core_ListActivations;
	
	@FindBy(xpath="//a[.='List Suspension']")
	public WebElement report_Core_ListSuspension;
	
	@FindBy(xpath="//a[.='Job Report']")
	public WebElement report_Core_jobreport;

//---------------this is for clicking on Report Menu Finance ------------------------------------------	
	
	@FindBy(id="financeheader")
	public WebElement report_Finance;
	
	@FindBy(xpath="//a[.='List Payments']")
	public WebElement report_finance_ListPayments;
	
	@FindBy(xpath="//a[.='Pay For Box']")
	public WebElement report_financial_payForBox;
	
	@FindBy(xpath="//a[.='Pay For Box']")
	public WebElement report_financial_GSTreport;
	
//---------------this is for clicking on Report Menu Schedule ------------------------------------------
	
	@FindBy(id="scheduleheader")
	public WebElement report_Schedule;
	
	@FindBy(xpath="//a[.='List Auto Renew']")
	public WebElement report_Schedule_Listautorenew;
	
	@FindBy(xpath="//a[.='List Pre Activations']")
	public WebElement report_Schedule_ListPreActivations;
	
//----------------this is for clicking on the message-------------------------------------------------	
	@FindBy(xpath="//a[.='List Message']")
	public WebElement message_ListMessage;
	
	@FindBy(xpath="//a[.='Add Scroll']")
	public WebElement message_AddScroll;
	
//-----------------this is for clicking on Due Date Menu-----------------------------------------------	
	
	@FindBy(xpath="//a[.='Set DueDate']")
	public WebElement dueDate_SetDueDate;
	
//-----------------this is for clicking on SubUser menu-------------------------------	
	
	@FindBy(xpath="//a[.='Add Subuser']")
	public WebElement subuser_AddsubUser;
	
	@FindBy(xpath="//a[.='Modify Subuser']")
	public WebElement subuser_ModifySubuser;
	
//-------------------this is for clicking on the Bank Menu-------------------------------------------	
	@FindBy(xpath="//a[.='List Banks']")
	public WebElement bank_ListBanks;
	
//	@FindBy(id="")
//	public WebElement ;
//	
//	@FindBy(id="")
//	public WebElement ;
//	
//	@FindBy(id="")
//	public WebElement ;
//	
//	@FindBy(id="")
//	public WebElement ;
//	
//	@FindBy(id="")
//	public WebElement ;
//	
//	@FindBy(id="")
//	public WebElement ;
}
