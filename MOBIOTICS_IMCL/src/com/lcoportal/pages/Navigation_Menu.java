package com.lcoportal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.constant.lcoportal.imcl.BaseTest;

public class Navigation_Menu extends BasePage
{
  public Navigation_Menu()
  {
	  PageFactory.initElements(BaseTest.driver, this);
  }
  
  @FindBy(xpath=".//*[@id='bs-example-navbar-collapse-1']/ul[2]/li[2]/a")
  public WebElement subscribe_Menu;

  @FindBy(xpath=".//*[@id='bs-example-navbar-collapse-1']/ul[2]/li[2]/ul/li[1]/a")
  public WebElement addBasePAck;
  
  
  @FindBy(xpath="//a[contains(@href, 'addplan')]")
  public WebElement addAddons;
  
  
  @FindBy(xpath="//a[contains(@href, 'schemebased')]")
  public WebElement addSchemeBasedPlane;
  
  
  @FindBy(xpath=".//*[@id='bs-example-navbar-collapse-1']/ul[2]/li[12]/a")
	public WebElement logout;
  
  // ------------------------------This is Renew_Menu DropDown-------------------
 
  
  @FindBy(xpath="//div//ul[2]//li[3]//a[@role='button']")
	public WebElement  renew_Menu;
	
	
	@FindBy(xpath="//a[@href='plans']")
	public WebElement renewPlan;
	
	@FindBy(xpath="//a[@href='renewhdbasepack']")
	public WebElement renewHDBasePack;
	
	@FindBy(xpath="//a[@href='changevalidity']")
	public WebElement renewChangeValidity;
	
	@FindBy(xpath="//a[@href='changebase']")
	public WebElement renewChangeBasePack;
	
	@FindBy(xpath="//a[@href='scheduleautorenew']")
	public WebElement renewScheduleAutoRenew;


 //--------------------------------This is Plans_Menu DropDown--------------------------------------------------
	
	@FindBy(xpath="//a[@href='disconnect']")
	public WebElement plansDisconnect;
	
	@FindBy(xpath="//a[@href='reconnect']")
	public WebElement plansReConnect;
	
//----------------------------------This is Credit_Menu DropDown-------------------------------------------------
	
	@FindBy(xpath="//a[@href='addcredit']")
	public WebElement addCredit;
	
//----------------------------------This is Hardware_Menu DropDown-----------------------------------------------
	
	@FindBy(xpath="//a[@href='retrack']")
	public WebElement hardwareRetrack;
  
	@FindBy(xpath="//a[@href='swap']")
	public WebElement hardwareSTBReplacement;
	
	
//---------------------------------This is PostPaid_Menu DropDown-------------------------------------------------
	
	@FindBy(xpath="//a[@href='postpaidbills']")
	public WebElement clickOnBills_PostPaid;
	
	@FindBy(xpath="//a[@href='postpaidreport']")
	public WebElement paymentReport_PostPaid;
	
//----------------------------------This is Reports_menu DropDown-----------------------------------------------
	
	@FindBy(linkText="Activation Report")
	public WebElement activationReport;
	
	@FindBy(linkText="Expiry Report")
	public WebElement expiryReport;
	
	@FindBy(linkText="Expired Report")
	public WebElement expiredReport;
	
	@FindBy(linkText="Bills")
	public WebElement bills;
	
	@FindBy(linkText="Refund Report")
	public WebElement refundReport;
	
	@FindBy(linkText="Payment Report")
	public WebElement paymentReport;
	
	@FindBy(linkText="Scheduled Report")
	public WebElement scheduledReport;
	
	@FindBy(linkText="STB Replacement Report")
	public WebElement stbReplacementReport;
	
	@FindBy(linkText="Ekyc Report")
	public WebElement ekycReport;
	
	
//----------------------------------This is customer Menu DropDown-------------------------------------------
	
	@FindBy(linkText="Modify Customer")
	public WebElement modifyCustomer;
	
	@FindBy(linkText="Tickets")
	public WebElement tickets;
	
	
//-----------------------------------This to download the recipts from download Menu DropDown-------------------
	
	@FindBy(xpath="//a[@href='assets/FREQUENTLY_ASKED_QUESTIONS_GST.pdf']")
	public WebElement gSTDownload;
	
	@FindBy(xpath="//a[@href='axiseasypayslip.pdf']")
	public WebElement axisBankEasyPaySlip;
	
	@FindBy(linkText="LCO Portal User Guide")
	public WebElement lcoPortalUserGuide;
	
	@FindBy(linkText="MIB Letter")
	public WebElement mibLetter; 
	
	@FindBy(linkText="MIB Advisory")
	public WebElement mibAdvisory;
	
	@FindBy(linkText="Axis Bank Branch Deatils")
	public WebElement axisBankBranchDetails;
	
	@FindBy(linkText="Third Party Deposit Authorization")
	public WebElement thirdPartyDepositeAuthorization;
	
	@FindBy(linkText="Bank Authorization Annexure")
	public WebElement bankAuthorizationAnnexure;
	
	@FindBy(linkText="Axis EasyPay Circular")
	public WebElement axisEasyPayCircular;
	
}