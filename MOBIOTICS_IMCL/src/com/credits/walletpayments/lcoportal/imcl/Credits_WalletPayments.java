package com.credits.walletpayments.lcoportal.imcl;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.lcoportal.pages.BasePage;

	public class Credits_WalletPayments extends BasePage
	{
		
		public Credits_WalletPayments() 
		{
			PageFactory.initElements(driver, this);
		}
		   
	   
	   @FindBy(xpath="//span[@id='balance']")
		private WebElement availableBalance;
		
		@FindBy(xpath="//input[@name='amount']")
		private WebElement enterTheAmountToBeCredited;
		
			
		@FindBy(xpath="//input[@value='wallet']")
		private WebElement payFromWallet;
		
		@FindBy(xpath="//button[@class='btn btn-info' and contains(text(), 'Pay')]")
		private WebElement clickOnPayButton;
		
		
		@FindBy(xpath="//input[@id='walletamount']")
		private WebElement mobikwikAmountDetails;
		
		
		@FindBy(xpath="//input[@id='email']")
		private WebElement mobikwikEmailDetails;
		
		@FindBy(xpath="//input[@id='mobileno']")
		private WebElement mobikwikPhoneNumber;
		
		@FindBy(xpath="//button[@class='btn btn-danger walletpay']")
		private WebElement clickOnMobikwikPayButton;
		
		@FindBy(xpath="//button[@id='close']")
		private WebElement clickOnButtonmobikwikClose;
		
		@FindBy(xpath="//h4[@id='myModalLabel' and contains(text(), 'Mobikwik')]")
		private WebElement isMobikwikWalletBoxIsPresent;
		
		   
		//input[@class='btn btn-primary big dpBlk']
	   
	   
	   public PayUsingMobikwikWalletpage GoToMobikiwkWalletPayment() throws InterruptedException
	   {
		   waitTillElementIsVisible(enterTheAmountToBeCredited);
		   
		   enterTheAmountToBeCredited.sendKeys("1");
	       
		   payFromWallet.click();
		   
	       clickOnPayButton.click();
		   
		   //Thread.sleep(1000);
		   
		   waitTillElementIsVisible(mobikwikEmailDetails);

		   Thread.sleep(1000);

		   mobikwikEmailDetails.clear();

		   mobikwikEmailDetails.sendKeys("santhosh.shiva@mobiotics.com");


		   Thread.sleep(1000);

		   mobikwikPhoneNumber.clear();

		   mobikwikPhoneNumber.sendKeys("9513007215");


		   Thread.sleep(1000);

		   clickOnMobikwikPayButton.click();
		   
		   
		  return new PayUsingMobikwikWalletpage();
	   }
	}


