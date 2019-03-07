package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.credits.walletpayments.lcoportal.imcl.CardConfirmationPage;
import com.credits.walletpayments.lcoportal.imcl.Credits_WalletPayments;
import com.credits.walletpayments.lcoportal.imcl.PayUsingMobikwikWalletpage;
import com.lcoportal.pages.HomePage;

public class AddCreditFromWalletToAccountPlanPage extends BaseTest
{
   @Test
   public void testAddCreditFromWalletToAccountPlanPage() throws InterruptedException
   {
	   Credits_WalletPayments homepage = new HomePage().NavigateToCredits_AddCreditsFromWallet();
	   
	   homepage.GoToMobikiwkWalletPayment();
	   
	   PayUsingMobikwikWalletpage walletPage = new PayUsingMobikwikWalletpage();
	   
	   walletPage.MobikiwkPaymentGateWayPage();
	   
	   CardConfirmationPage card = new CardConfirmationPage();
	   
	   card.cardConfirmations();
	   
   }
}
