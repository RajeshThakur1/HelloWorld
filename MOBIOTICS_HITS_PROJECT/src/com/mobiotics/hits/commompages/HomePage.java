package com.mobiotics.hits.commompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.coustomer_CreateCustomer.CreateCustomerPage;
import com.mobiotics.hits.customer_CoustomerModification.CustomerModificationPage;
import com.mobiotics.hits.customer_ListCustomers.ListCustomerPage;
import com.mobiotics.hits.customer_SubscriberCorner.SubscriberCronerPage;
import com.mobiotics.hits.device_HardWareReplacement.HardWareReplacementPage;
import com.mobiotics.hits.device_ListDevice.ListDevicePage;
import com.mobiotics.hits.device_OSD.OSDMessageServicePage;
import com.mobiotics.hits.device_RetrackActiveDevice.RetrackActiveDevicePage;
import com.mobiotics.hits.device_RetrackDeactive.RetrackDeActiveDevicePage;
import com.mobiotics.hits.paymentmenu_AddPayment.AddPaymentPage;
import com.mobiotics.hits.paymentmenu_ListPayments.ListPaymentPage;
import com.mobiotics.hits.paymentmenu_PayForBox.PayForBoxPage;
import com.mobiotics.hits.product_ActivatePendingPlanPage.ActivatePendingPlanPage;
import com.mobiotics.hits.product_AddAla_carte.AddAla_CartePage;
import com.mobiotics.hits.product_AddBasePackPage.AddBasePackPage;
import com.mobiotics.hits.product_ProductDisconnect.ProductDisconnectPage;
import com.mobiotics.hits.product_ProductReconnectPage.ProductReconnectPage;
import com.mobiotics.hits.profile_ChangePassword.Profile_ChangePasswordPage;
import com.mobiotics.hits.profile_ModifySubUser.Profile_ModifySubUserPage;
import com.mobiotics.hits.profile_MyProfile.MyProfilePage;
import com.mobiotics.hits.profile_SubUser.Profile_SubUserPage;
import com.mobiotics.hits.renew_AfterExpiry.AfterExpiryPage;
import com.mobiotics.hits.renew_BeforeExpiry.BeforeExpiryPage;
import com.mobiotics.hits.reports_ExpiryReport.ExpiryReportPage;
import com.mobiotics.hits.reports_JobReports.JobReportPage;
import com.mobiotics.hits.ticket_CreateTicket.CreateTicketPage;
import com.mobiotics.hits.tickets_ListTicket.ListTicketPage;

public class HomePage extends Navigation_Menu
{
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="Dashboard")
	private WebElement dashboardMenu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(), 'Payment')]")
	private WebElement paymentsMenu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(), 'Customer')]")
	private WebElement customersMenu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(), 'Product')]")
	private WebElement productMenu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(), 'Renew')]")
	private WebElement renewMenu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(), 'Report')]")
	private WebElement reportMenu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(), 'Device')]")
	private WebElement deviceMenu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(), 'Ticket')]")
	private WebElement ticketMenu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(), 'Profile')]")
	private WebElement profileMenu;

	@FindBy(partialLinkText="Logout")
	private WebElement logout;
	
	
//--------------------------------------this is Dash-Board Menu-------------------------------------------------------
	
	public void navigateToDashBoard_DashBoard()
	{
		dashboardMenu.click();
	}
	
//------------------------------------this is Payment_menu Add Payment-------------------------------------------------
	
	public AddPaymentPage navigateToPaymentMenu_AddPayment()
	{
		paymentsMenu.click();
		waitTillElementIsVisible(payment_AddPayment);
		payment_AddPayment.click();
		return new AddPaymentPage();
	}

//-----------------------------------------this is Payment_List Payment------------------------------------------------
	
	public ListPaymentPage navigateToPaymentMenu_ListPayment()
	{
		paymentsMenu.click();
		waitTillElementIsVisible(payment_ListPayments);
		payment_ListPayments.click();
		return new ListPaymentPage();
	}
	
//-----------------------------------------this is Payment_menu PayForBox----------------------------------------------
	
	public PayForBoxPage navigateToPaymentMenu_PayForBoxPage()
	{
		paymentsMenu.click();
		waitTillElementIsVisible(payment_PayForBox);
		payment_PayForBox.click();
		return new PayForBoxPage();
	}
	
//-------------------this is Customer_menu create Customer---------------------------------------
	
	public CreateCustomerPage navigateToCustomerMenu_CreateCustomer()
	{
		customersMenu.click();
		waitTillElementIsVisible(customer_CreateCustomer);
		customer_CreateCustomer.click();
		return new 	CreateCustomerPage();
		
	}
	
//---------------------this modification of customer---------------------------------------------
	
	public CustomerModificationPage navigateToCustomerMenu_ModifyCustomer()
	{
		customersMenu.click();
		waitTillElementIsVisible(customer_ModifyCustomer);
		customer_ModifyCustomer.click();
		return new CustomerModificationPage();
	}
	

//-------------------------------------------this is list customer page--------------------------------------------------
	public ListCustomerPage navigateToCustomerMenu_ListCustomerPage() 
	{
		customersMenu.click();
		waitTillElementIsVisible(customer_ListCustomer);
		customer_ListCustomer.click();
		return new ListCustomerPage();
	}
//--------------------------------------this is Customer_subscribercornerPage-----------------------------------------
	
	public SubscriberCronerPage navigateToCustomerMenu_SubscriberCornerPage()
	{
		customersMenu.click();
		waitTillElementIsVisible(customer_SubscriberCorner);
		customer_SubscriberCorner.click();
		return new SubscriberCronerPage();
	}
	
//--------------------------------------this is product_AddBasePackPage-----------------------------------------------
	
	public AddBasePackPage navigateToProductMenu_AddBasePackPage()
	{
		productMenu.click();
		waitTillElementIsVisible(product_AddBasePack);
		product_AddBasePack.click();
		return new AddBasePackPage();
	}
	
//----------------------------------------this is Product_AddAlaCarte--------------------------------------------------
	
	public AddAla_CartePage navigateToProductMenu_AddAlaCartePage()
	{
		productMenu.click();
		waitTillElementIsVisible(product_AddOns);
		product_AddOns.click();
		return new AddAla_CartePage();
	}
	
//-----------------------------------------this is Product_Disconnect Plan--------------------------------------------
	
	public ProductDisconnectPage navigateToProductMenu_ProductDisconnectPage()
	{
		productMenu.click();
		waitTillElementIsVisible(product_Disconect);
		product_Disconect.click();
		return new ProductDisconnectPage();
	}
	
//-------------------------------------this is Product_Reconnect Plan------------------------------------------------
	
	public ProductReconnectPage navigateToProductMenu_ProductReconnectPage()
	{
		productMenu.click();
		waitTillElementIsVisible(product_Reconnect);
		product_Reconnect.click();
		return new ProductReconnectPage();
	}
	
//------------------------------------------this is Product_ActivatePendingPlans--------------------------------------------
	
	public ActivatePendingPlanPage navigateToProductMenu_ActivatePendingPlans()
	{
		productMenu.click();
		waitTillElementIsVisible(product_ActivatePendingPlans);
		product_ActivatePendingPlans.click();
		return new ActivatePendingPlanPage();
	}
	
//-----------------------------------------this is Renew Menu_AfterExpiry-------------------------------------------
	
	public AfterExpiryPage navigateToRenewMenu_AfterExpiryPage()
	{
		renewMenu.click();
		waitTillElementIsVisible(renew_AfterExpiry);
		renew_AfterExpiry.click();
		return new AfterExpiryPage();
	}
	
//---------------------------------------this is RenewMenu_BeforeExpiry----------------------------------------------
	
	public BeforeExpiryPage navigateToRenewMenu_BeforeExpiryPage()
	{
		renewMenu.click();
		waitTillElementIsVisible(renew_BeforeExpiry);
		renew_BeforeExpiry.click();
		return new BeforeExpiryPage();
	}
	
//---------------------------------------this is Report_ExpiryReportPage----------------------------------------------
	
	public ExpiryReportPage navigateToReportMenu_ExpiryReportPage()
	{
		reportMenu.click();
		waitTillElementIsVisible(report_ExpiryReport);
		report_ExpiryReport.click();
		return new ExpiryReportPage();
	}
	
//---------------------------------------this is Report_JobReportPage--------------------------------------------------
	
	public JobReportPage navigateToReportMenu_JobReportPage()
	{
		reportMenu.click();
		waitTillElementIsVisible(report_JobReport);
		report_JobReport.click();
		return new JobReportPage();
	}
	
//----------------------------------------this is Device_ListDevicePage------------------------------------------------
	
	public ListDevicePage navigateToDeviceMenu_ListDevicePage()
	{
		deviceMenu.click();
		waitTillElementIsVisible(device_ListDevices);
		device_ListDevices.click();
		return new ListDevicePage();
	}
	
//-----------------------------------------this is Device_OSDMessageServicesPage---------------------------------------
	
	public OSDMessageServicePage navigateToDeviceMenu_OsdMesssageServicePage()
	{
		deviceMenu.click();
		waitTillElementIsVisible(device_OSD);
		device_OSD.click();
		return new OSDMessageServicePage();
	}
	
//-------------------------------------this is Device_RetrackActiveDevicePage------------------------------------------
	
	public RetrackActiveDevicePage navigateToDeviceMenu_RetrackActiveDevicePage()
	{
		deviceMenu.click();
		waitTillElementIsVisible(device_RetrackActive);
		device_RetrackActive.click();
		return new RetrackActiveDevicePage();
	}
	
//------------------------------------this is Device_RetrackDeactivePage-----------------------------------------------
	
	public RetrackDeActiveDevicePage navigateToDeviceMenu_RetrackDeActiveDevicePage()
	{
		deviceMenu.click();
		waitTillElementIsVisible(device_RetrackDeactive);
		device_RetrackDeactive.click();
		return new RetrackDeActiveDevicePage();
	}
	
//-------------------------------------this is Device_HardwareReplacementPage-------------------------------------------
	
	public HardWareReplacementPage navigateToDeviceMenu_HardWareReplacementPage()
	{
		deviceMenu.click();
		waitTillElementIsVisible(device_HardwareReplacement);
		device_HardwareReplacement.click();
		return new HardWareReplacementPage();
	}
	
//-------------------------------------this is Ticket_CreateTicketPage-------------------------------------------------
	
	public CreateTicketPage navigateToTicketMenu_CreateTicketPage()
	{
		ticketMenu.click();
		waitTillElementIsVisible(ticket_CreateTicket);
		ticket_CreateTicket.click();
		return new CreateTicketPage();
	}
	
//--------------------------------------this is Ticket_ListTicketPage---------------------------------------------------
	
	public ListTicketPage navigateToTicketMenu_ListTicketPage()
	{
		ticketMenu.click();
		waitTillElementIsVisible(ticket_ListTicket);
		ticket_ListTicket.click();
		return new ListTicketPage();
	}
	
//........................................this is Profile_MyProfilePage................................................
	
	public MyProfilePage navigateToProfileMenu_MyProfile()
	{
		profileMenu.click();
		waitTillElementIsVisible(profile_MyProfile);
		profile_MyProfile.click();
		return new MyProfilePage();
	}
	
//..........................................this is Profile_ChangePasswordPage........................................
	
	public Profile_ChangePasswordPage navigateToProfileMenu_ChangePassword()
	{
		profileMenu.click();
		waitTillElementIsVisible(profile_MyProfile);
		profile_MyProfile.click();
		return new Profile_ChangePasswordPage();
	}
	
//..........................................this is Profile_SubUserPage............................................
	
	public Profile_SubUserPage navigateToPofileMenu_SubUser()
	{
		profileMenu.click();
		waitTillElementIsVisible(profile_AddSubuser);
		profile_AddSubuser.click();
		return new Profile_SubUserPage();
	}
	
//...........................................this is Profile_ModifySubUserPage.....................................
	
	public Profile_ModifySubUserPage navigateToProfileMenu_ModifySubUser()
	{
		profileMenu.click();
		waitTillElementIsVisible(profile_ModifySubuser);
		profile_ModifySubuser.click();
		return new Profile_ModifySubUserPage();
	}
//---------------------------------------this is for logout---------------------------------------------------------	
		public HomePage clickLogout() 
		{
		  return new HomePage();
			
		}

		


}
