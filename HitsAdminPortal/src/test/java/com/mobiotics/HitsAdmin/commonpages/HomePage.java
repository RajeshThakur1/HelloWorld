package com.mobiotics.HitsAdmin.commonpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HitsAdmin.Banks.AdminBanks_ListBanksPage;
import com.mobiotics.HitsAdmin.BulkActivation.AdminBulkActivation_AddonsPage;
import com.mobiotics.HitsAdmin.BulkActivation.AdminBulkActivation_BasePackPage;
import com.mobiotics.HitsAdmin.BulkActivation.AdminBulkActivation_CreateCustomerPage;
import com.mobiotics.HitsAdmin.BulkActivation.AdminBulkActivation_ExpiredRenewPage;
import com.mobiotics.HitsAdmin.BulkActivation.AdminBulkActivation_ExpiryRenewPage;
import com.mobiotics.HitsAdmin.BulkHardware.AdminBulkHardware_DisconnectPage;
import com.mobiotics.HitsAdmin.BulkHardware.AdminBulkHardware_HardwareReplacementPage;
import com.mobiotics.HitsAdmin.BulkHardware.AdminBulkHardware_ReconnectPage;
import com.mobiotics.HitsAdmin.BulkHardware.AdminBulkHardware_RetrackPage;
import com.mobiotics.HitsAdmin.BulkHardware.AdminBulkHardware_SendOSDPage;
import com.mobiotics.HitsAdmin.DashBoard.AdminDashBoard_AnalyticsPage;
import com.mobiotics.HitsAdmin.Message.AdminMessage_ListMessage;
import com.mobiotics.HitsAdmin.Operators_LCO.DPOListPage;
import com.mobiotics.HitsAdmin.Operators_LCO.LCOListPage;
import com.mobiotics.HitsAdmin.Operators_LCO.MSOListPage;
import com.mobiotics.HitsAdmin.ReportsCore.AdminReportCore_ListConnectionPage;
import com.mobiotics.HitsAdmin.ReportsCore.AdminReportCore_ListCustomerPage;
import com.mobiotics.HitsAdmin.ReportsCore.AdminReportCore_ListDevicesPage;
import com.mobiotics.HitsAdmin.ReportsCore.AdminReportsCore_JobReportsPage;
import com.mobiotics.HitsAdmin.ReportsCore.AdminReportsCore_ListActivationPage;
import com.mobiotics.HitsAdmin.ReportsCore.AdminReportsCore_ListSuspensionPage;
import com.mobiotics.HitsAdmin.ReportsFinance.AdminReportsFinance_ListPaymentPage;
import com.mobiotics.HitsAdmin.ReportsFinance.AdminReportsFinance_PayForBoxPage;
import com.mobiotics.HitsAdmin.Subuser.AdminSubUser_ModifySubUserPage;
import com.mobiotics.HitsAdmin.Subuser.AdminSubuser_AddSubUserPage;

public class HomePage extends NavigationPage
{
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//a[@href='admindashboard']")
private WebElement dashBoard;

@FindBy(id="operators")
private WebElement operators;

@FindBy(id="bulkheader")
private WebElement bulk;

@FindBy(id="reportheader")
private WebElement report;

@FindBy(id="messageheader")
private WebElement message;

@FindBy(id="duedateheader")
private WebElement dueDate;

@FindBy(id="subuserheader")
private WebElement subUser;

@FindBy(id="banksheader")
private WebElement bank;

@FindBy(id="maintenanceheader")
private WebElement maintenance;

@FindBy(id="logoutheader")
private WebElement logout;

//@FindBy(xpath="")
//private WebElement ;
//
//@FindBy(xpath="")
//private WebElement ;
//
//@FindBy(xpath="")
//private WebElement ;

//------------this is dash board/Home page-----------------------------------
public AdminDashBoard_AnalyticsPage navigateToDashBoard_DashBoard()
{
	dashBoard.click();
	return new AdminDashBoard_AnalyticsPage();
}

//------------this is for Operator LCO Page-----------------------------------------

public LCOListPage navigateToOperatorsMenu_LCO()
{
	operators.click();
	waitTillElementIsVisible(operators_Lco);
	operators_Lco.click();
	return new LCOListPage();
}

//-------------this is for Operators MSO Page--------------------------------------

public MSOListPage navigateToOperatorsMenu_MSO()
{
	operators.click();
	waitTillElementIsVisible(operators_MSO);
	operators_MSO.click();
	return new MSOListPage();
}

//-------------this is for Operators DPO Page--------------------------------------

public DPOListPage navigateToOperatorsMenu_DPO()
{
	operators.click();
	waitTillElementIsVisible(operators_DPO);
	operators_DPO.click();
	return new DPOListPage();
}

//----------------this is for AdminBulk AddOn--------------------------------------------

public AdminBulkActivation_AddonsPage navigateToBulkActivation_AddOn() throws InterruptedException
{	
	bulk.click();
	moveToElement(bulk_Activation);
	bulk_activation_Addons.click();
	return new AdminBulkActivation_AddonsPage();
}

//------------------this is for Admin Bulk AddBase Pack-----------------------

public AdminBulkActivation_BasePackPage navigateToBulkActivation_AddBasePack()
{	
	bulk.click();
	moveToElement(bulk_Activation);
	bulk_activation_Basepack.click();
	return new AdminBulkActivation_BasePackPage();
}

//-----------------this is for Admin Bulk ExpiryRenew Pack--------------------

public AdminBulkActivation_ExpiryRenewPage navigateToBulkActivation_ExpiryRenewPage()
{	
	bulk.click();
	moveToElement(bulk_Activation);
	bulk_activation_ExpiryRenew.click();
	return new AdminBulkActivation_ExpiryRenewPage();
}

//---------------this is for Admin Bulk ExpiredRenew Pack---------------------

public AdminBulkActivation_ExpiredRenewPage navigateToBulkActivation_ExpiredRenewPage()
{	
	bulk.click();
	moveToElement(bulk_Activation);
	bulk_activation_ExpiredRenew.click();
	return new AdminBulkActivation_ExpiredRenewPage();
}

//---------------this is for Admin Bulk CreateCustomer Pack---------------------

public AdminBulkActivation_CreateCustomerPage navigateToBulkActivation_CreateCustomerPage()
{	
	bulk.click();
	moveToElement(bulk_Activation);
	bulk_activation_CreateCustomer.click();
	return new AdminBulkActivation_CreateCustomerPage();
}

//---------------this is for Admin Bulk Hardware Retrack Pack---------------------

public AdminBulkHardware_RetrackPage navigateToBulkHardware_RetrackPage()
{	
	bulk.click();
	moveToElement(bulk_hardware);
	bulk_hardware_Retrack.click();
	return new AdminBulkHardware_RetrackPage();
}

//---------------this is for Admin Bulk Hardware Reconnect Pack---------------------

public AdminBulkHardware_ReconnectPage navigateToBulkHardware_ReconnectPage()
{	
	bulk.click();
	moveToElement(bulk_hardware);
	bulk_hardware_Reconnect.click();
	return new AdminBulkHardware_ReconnectPage();
}

//---------------this is for Admin Bulk Hardware Reconnect Pack---------------------

public AdminBulkHardware_DisconnectPage navigateToBulkHardware_DisconnectPage()
{	
	bulk.click();
	moveToElement(bulk_hardware);
	bulk_hardware_Disconnect.click();
	return new AdminBulkHardware_DisconnectPage();
}

//---------------this is for Admin Bulk Hardware Replacement Pack---------------------

public AdminBulkHardware_HardwareReplacementPage navigateToBulkHardware_HardwareReplacementPage()
{	
	bulk.click();
	moveToElement(bulk_hardware);
	bulk_hardware_HardwareReplacement.click();
	return new AdminBulkHardware_HardwareReplacementPage();
}

//---------------this is for Admin Bulk Hardware Send OSD Pack---------------------

public AdminBulkHardware_SendOSDPage navigateToBulkHardware_SendOSDPage()
{	
	bulk.click();
	moveToElement(bulk_hardware);
	bulk_hardware_SendOSD.click();
	return new AdminBulkHardware_SendOSDPage();
}

//---------------this is for Admin Reports List Customer Pack---------------------

public AdminReportCore_ListCustomerPage navigateToReportsCore_ListCustomerPage()
{	
	report.click();
	moveToElement(report_Core);
	report_Core_ListCust.click();
	return new AdminReportCore_ListCustomerPage();
}

//---------------this is for Admin Reports List Device Pack----------------------

public AdminReportCore_ListDevicesPage navigateToReportsCore_ListDevicePage()
{	
	report.click();
	moveToElement(report_Core);
	report_Core_ListDevices.click();
	return new AdminReportCore_ListDevicesPage();
}

//---------------this is for Admin Reports List Connection Pack----------------------

public AdminReportCore_ListConnectionPage navigateToReportsCore_ListConnectionPage()
{
	report.click();
	moveToElement(report_Core);
	report_Core_Listconnections.click();
	return new AdminReportCore_ListConnectionPage();
}

//---------------this is for Admin Reports List Connection Pack----------------------

public AdminReportsCore_ListActivationPage navigateToReportsCore_ListActivationPage()
{
	report.click();
	moveToElement(report_Core);
	report_Core_ListActivations.click();
	return new AdminReportsCore_ListActivationPage();
}

//---------------this is for Admin Reports List Suspension Pack----------------------

public AdminReportsCore_ListSuspensionPage navigateToReportsCore_ListSuspensionPage()
{
	report.click();
	moveToElement(report_Core);
	report_Core_ListSuspension.click();
	return new AdminReportsCore_ListSuspensionPage();
}

//---------------this is for Admin Reports Job Report Pack----------------------

public AdminReportsCore_JobReportsPage navigateToReportsCore_JobReportPage()
{
	report.click();
	moveToElement(report_Core);
	report_Core_jobreport.click();
	return new AdminReportsCore_JobReportsPage();
}

//---------------this is for Admin Reports Finance list payment Pack----------------------

public AdminReportsFinance_ListPaymentPage navigateToReportsFinance_ListPaymentPage()
{
	report.click();
	moveToElement(report_Finance);
	report_finance_ListPayments.click();
	return new AdminReportsFinance_ListPaymentPage();
}

//---------------this is for Admin Reports Finance payforbox Pack----------------------

public AdminReportsFinance_PayForBoxPage navigateToReportsFinance_PayForBoxPage()
{
	report.click();
	moveToElement(report_Finance);
	report_financial_payForBox.click();
	return new AdminReportsFinance_PayForBoxPage();
}

//---------------this is for Admin Reports Finance payforbox Pack----------------------

public AdminMessage_ListMessage navigateToAdminMessage_ListMessagePage()
{
	message.click();
	//moveToElement(report_Finance);
	message_ListMessage.click();
	return new AdminMessage_ListMessage();
}

//---------------this is for Admin Subuser Add SubUser Pack----------------------

public AdminSubuser_AddSubUserPage navigateToAdminSubUser_AddSubUserPage()
{
	subUser.click();
	//moveToElement(subUser);
	subuser_AddsubUser.click();
	return new AdminSubuser_AddSubUserPage();
}

//---------------this is for Admin Subuser Modify SubUser Pack----------------------

public AdminSubUser_ModifySubUserPage navigateToAdminSubUser_ModifySubUserPage()
{
	subUser.click();
	//moveToElement(subUser);
	subuser_ModifySubuser.click();
	return new AdminSubUser_ModifySubUserPage();
}

//---------------this is for Admin Bank LISTBank Page----------------------

public AdminBanks_ListBanksPage navigateToAdminBank_ListBankPage()
{
	bank.click();
	//moveToElement(subUser);
	bank_ListBanks.click();
	return new AdminBanks_ListBanksPage();
}
//---------------this is for loggout---------------------------------------
public HomePage clickLogout() 
{
  return new HomePage();
	
}
}