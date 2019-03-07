package com.lcoportal.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.constant.lcoportal.imcl.BaseTest;
import com.credits.cardpayments.lcoportal.imcl.Credits_AddCreditsFromCards;
import com.credits.walletpayments.lcoportal.imcl.Credits_WalletPayments;
import com.downloadsmenu.lcoportal.imcl.DownLoadMenuPage;
import com.hardwaremenu.lcoportal.imcl.ActivateHardWareMenuRetrack;
import com.plans.dropdown.lcoportal.imcl.Plans_DisconnectPlanPage;
import com.plans.dropdown.lcoportal.imcl.Plans_ReconnectPlanPage;
import com.porfilemenu.lcoportal.imcl.ProfileMenu_ChangeCustomerDetails;
import com.porfilemenu.lcoportal.imcl.ProfileMenu_ChangePasswordPage;
import com.postpaidmenu.lcoportal.imcl.PostPaidMenu_BillsPage;
import com.postpaidmenu.lcoportal.imcl.PostPaidMenu_PostPaidPaymentReportPage;
import com.renew.dropdown.lcoprotal.imcl.ActivateRenewChangeBasePackPlanPage;
import com.renew.dropdown.lcoprotal.imcl.ActivateRenewChangeValidityPlanPage;
import com.renew.dropdown.lcoprotal.imcl.ActivateRenewHDBasePackPage;
import com.renew.dropdown.lcoprotal.imcl.ActivateRenewPlanPage;
import com.renew.dropdown.lcoprotal.imcl.Renew_ActivateScheduleAutoRenewPlanPage;
import com.reports_menu.lcoportal.imcl.Reports_ActivationReport;
import com.subscriber.list.lcoprotal.imcl.ActivateAddBasePackPage;
import com.subscriber.list.lcoprotal.imcl.ActivateAddOnPage;
import com.subscriber.list.lcoprotal.imcl.ActivateSchemBasedPlanPage;
import com.subscriberMenu.lcoportol.imcl.SubscriberMenu_ModifyCustomer;
import com.subscriberMenu.lcoportol.imcl.SubscriberMenu_TicketsPage;

public class HomePage extends Navigation_Menu{
	
	@FindBy(xpath="//li[@class='']")
	private WebElement dashboard_Menu;
		
	@FindBy(xpath="//div//ul[2]//li[2]//a[@role='button']")
	private WebElement  subscribe_Menu;
	
	@FindBy(xpath="//div//ul[2]//li[3]//a[@role='button']")
	private WebElement  renew_Menu;
	
	@FindBy(xpath="//div//ul[2]//li[4]//a[@role='button']")
	private WebElement  plan_Menu;
	
	@FindBy(xpath="//div//ul[2]//li[5]//a[@role='button']")
	private WebElement credit_Menu;
	
	@FindBy(xpath="//div//ul[2]//li[6]//a[@role='button']")
	private WebElement report_Menu;
	
	@FindBy(xpath="//div//ul[2]//li[7]//a[@role='button']")
	private WebElement postPaid_Menu;
	
	@FindBy(xpath="//div//ul[2]//li[8]//a[@role='button']")
	private WebElement hardWare_Menu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(), 'Subscriber')]")
	private WebElement subscriber_Menu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(), 'Download ')]")
	public WebElement downLoad_Menu;
	
	@FindBy(linkText="Profile")
	private WebElement profile_Menu;
	
	public HomePage() 
	{
		PageFactory.initElements(BaseTest.driver,this);
	}

	
	
	
	
	
//---------------------------------This is to add base packs in Subscriber DropDown-------------------------------
	public ActivateAddBasePackPage navigateToSubscribeMenu_ActivateBasepack()
	   {
		subscribe_Menu.click();
		waitTillElementIsVisible(addBasePAck);
		addBasePAck.click();
		return new ActivateAddBasePackPage();
	   }

//---------------------------------This is to activate AddOn's in Subscriber DropDown---------------------------------
	public ActivateAddOnPage navigateToSubscribeMenu_ActivateAddOnPack()
	{
		subscribe_Menu.click();
		waitTillElementIsVisible(addAddons);
		addAddons.click();
		return new ActivateAddOnPage();
		
	}
	
//-------------------------------This is to add schemedBasedPlans in Subscriber DropDown-------------------------------	
	public ActivateSchemBasedPlanPage navigateToSubscribeMenu_ActivateSchemeBasedPack()
	{
		subscribe_Menu.click();
		waitTillElementIsVisible(addSchemeBasedPlane);
		addSchemeBasedPlane.click();
		return new ActivateSchemBasedPlanPage();
	  }
	
	
//--------------------------------This is to Renew the plans in Renew DropDown.-------------------------------------
	public ActivateRenewPlanPage navigateToRenewMenu_ActivateRenewPlan()
	{
       renew_Menu.click();
       waitTillElementIsVisible(renewPlan);
       renewPlan.click();
	   return new ActivateRenewPlanPage();
	}
	
	
//-------------------------------This is to Renew HD Base Plan in Renew DropDown.--------------------------------------
	public ActivateRenewHDBasePackPage NavigateToRenewMenu_ActivatRenewHDBasePackPlan()
	{
		renew_Menu.click();
		waitTillElementIsVisible(renewHDBasePack);
		renewHDBasePack.click();
		return new ActivateRenewHDBasePackPage();
	  }
	
	
//---------------------------This is to change the validity of the Renew DropDown.-------------------------------------
	public ActivateRenewChangeValidityPlanPage NavigateToRenewMenu_ActivateChangeValidityPlan()
	{
		renew_Menu.click();
		waitTillElementIsVisible(renewChangeValidity);
		renewChangeValidity.click();
		return new ActivateRenewChangeValidityPlanPage();
	}
	
	
//-----------------------This is to change Base Pack in Renew dropdown.---------------------------------------------
	public ActivateRenewChangeBasePackPlanPage NavigateToRenew_ActivateChangeBasePackPlanPage()
	{
		renew_Menu.click();
		waitTillElementIsVisible(renewChangeBasePack);
		renewChangeBasePack.click();
		return new ActivateRenewChangeBasePackPlanPage();
	}
	
	
//------------------------This is to schedule Auto Renew in Renew dropdown.-----------------------------------------
	public Renew_ActivateScheduleAutoRenewPlanPage NavigateToRenew_ActivatescheduleAutoRenewPagePlane()
	{
		renew_Menu.click();
		waitTillElementIsVisible(renewScheduleAutoRenew);
		renewScheduleAutoRenew.click();
		return new Renew_ActivateScheduleAutoRenewPlanPage();
	}
	
	
//---------------------------------This is to Disconnect the Plans from Plans DropDown.----------------------------
	public Plans_DisconnectPlanPage NavigateToPlans_DisconnectPlanPage()
	{
		plan_Menu.click();
		waitTillElementIsVisible(plansDisconnect);
		plansDisconnect.click();
		return new Plans_DisconnectPlanPage();
	}
	
	
//------------------------------This is to ReConect the Plans from plan DropDown.--------------------------------
	public Plans_ReconnectPlanPage NavigateToPlans_ReconnectPlans()
	{
		plan_Menu.click();
		waitTillElementIsVisible(plansReConnect);
		plansReConnect.click();
		return new Plans_ReconnectPlanPage();
	}
	
	
//----------------------------This is to add credit to the account credits dropdown.--------------------------------
	public Credits_AddCreditsFromCards NavigateToCredits_AddCreditsFromCards()
	{
		credit_Menu.click();
		waitTillElementIsVisible(addCredit);
		addCredit.click();
		return new Credits_AddCreditsFromCards();
	}
	
//----------------------------This is to add credit form Wallet-----------------------------------------------------
	public Credits_WalletPayments NavigateToCredits_AddCreditsFromWallet()
	{
		credit_Menu.click();
		waitTillElementIsVisible(addCredit);
		addCredit.click();
		return new Credits_WalletPayments();
	}
	
//---------------------------/This is hardware retrack in hardware_menu dropdown.------------------------------------
	public ActivateHardWareMenuRetrack NavigateToHardware_Retrack()
	{
		hardWare_Menu.click();
		waitTillElementIsVisible(hardwareRetrack);
		hardwareRetrack.click();
		return new ActivateHardWareMenuRetrack();
	}
	
	
//-----------------------------------This is PostPaid Bills Menu.--------------------------------------------------
	public PostPaidMenu_BillsPage NavigateToPostMenu_Bills()
	{
		postPaid_Menu.click();
		waitTillElementIsVisible(clickOnBills_PostPaid);
		clickOnBills_PostPaid.click();
		return new PostPaidMenu_BillsPage();
	}
	
	
//-----------------------------------This is PostPaid Payment Dropdown-----------------------------------------------
	
	public PostPaidMenu_PostPaidPaymentReportPage NavigateToPostPaidPayment_PaymentReports()
	{
		postPaid_Menu.click();
		waitTillElementIsVisible(paymentReport_PostPaid);
		paymentReport_PostPaid.click();
		return new PostPaidMenu_PostPaidPaymentReportPage();
	}
	
//-----------------------------------This is Reports_Menu DropDown.------------------------------------------------
	public Reports_ActivationReport NavigateToReports_ActivationReport()
	{
		report_Menu.click();
		waitTillElementIsVisible(activationReport);
		activationReport.click();
		return new Reports_ActivationReport();
	}
	
	
//-----------------------------------This is to SubscriberMenu_CustomerModifiy drop down.-------------------------------------
	public SubscriberMenu_ModifyCustomer NavigateToSubscriberMenu_ModifyCustomer() 
	{
	  subscriber_Menu.click();
	  waitTillElementIsVisible(modifyCustomer);
	  modifyCustomer.click();
	  return new SubscriberMenu_ModifyCustomer();
	}
	
//------------------------------------this is SubscriberMenu_TicketsPage-------------------------------------------------
	
	public SubscriberMenu_TicketsPage NavigateToSubscriberMenu_TicketsPage() 
	{
	  subscriber_Menu.click();
	  waitTillElementIsVisible(tickets);
	  tickets.click();
	  return new SubscriberMenu_TicketsPage();
	}
	
//--------------------------This is to download recipts for download menu.---------------------------------------------
	public DownLoadMenuPage NavigateToDownloadMenu_ClickAllTheLinks()
	{
		downLoad_Menu.click();
		waitTillElementIsVisible(gSTDownload);
		waitTillElementIsVisible(axisBankEasyPaySlip);
		waitTillElementIsVisible(lcoPortalUserGuide);
		waitTillElementIsVisible(mibLetter);
		waitTillElementIsVisible(mibAdvisory);
		waitTillElementIsVisible(axisBankBranchDetails);
		waitTillElementIsVisible(thirdPartyDepositeAuthorization);
		waitTillElementIsVisible(bankAuthorizationAnnexure);
		waitTillElementIsVisible(axisEasyPayCircular);
		
		return new DownLoadMenuPage();
	}
	
	
//-----------------------------------This is to change Profile in Profile DropDown---------------------------------
	
	public ProfileMenu_ChangeCustomerDetails NavigateToProfileMenu_ChangeProfile()
	{
		profile_Menu.click();
		
		return new ProfileMenu_ChangeCustomerDetails();
	}
	
//-----------------------------------this is change password in profile--------------------------------------------
	
	public ProfileMenu_ChangePasswordPage NavigateToProfileMenu_ChangePassword()
	{
		profile_Menu.click();
		
		return new ProfileMenu_ChangePasswordPage();
	}
	
//--------------------------This is to logout from the Application.-------------------------------------------	
	public LoginPage clickLogout()
      {
		waitTillElementIsVisible(logout);
		logout.click();
		return new LoginPage();
	   }

}