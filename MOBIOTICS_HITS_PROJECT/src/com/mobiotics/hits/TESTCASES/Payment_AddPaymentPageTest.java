package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.paymentmenu_AddPayment.AddPaymentPage;
import com.mobiotics.hits.paymentmenu_AddPayment.CitrusPaymentPage;

public class Payment_AddPaymentPageTest extends BaseTest
{
  @Test
  public void testPayment_AddPaymentPageTest() throws InterruptedException
  {
	  AddPaymentPage home = new HomePage().navigateToPaymentMenu_AddPayment();
	  home.payment_EnterValues();
	  
	  CitrusPaymentPage citrus = new CitrusPaymentPage();
	  
	  citrus.goToCirtusPaymentPage();
  }
}
