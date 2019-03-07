package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.paymentmenu_ListPayments.ListPaymentPage;

public class Payment_ListPaymentPageTest extends BaseTest
{
  @Test
  public void testPayment_ListPaymentPageTest() throws InterruptedException
  {
	ListPaymentPage homePage=new HomePage().navigateToPaymentMenu_ListPayment();
	
	homePage.DownloadListPaymentReport();
  }
}
