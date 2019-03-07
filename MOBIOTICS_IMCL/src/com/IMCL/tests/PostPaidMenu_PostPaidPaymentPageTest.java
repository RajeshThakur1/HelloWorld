package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.postpaidmenu.lcoportal.imcl.PostPaidMenu_PostPaidPaymentReportPage;

public class PostPaidMenu_PostPaidPaymentPageTest extends BaseTest
{

	@Test
	public void testPostPaidMenu_PastPaidPaymentPageTest() throws InterruptedException
	{
		PostPaidMenu_PostPaidPaymentReportPage homepage= new HomePage().NavigateToPostPaidPayment_PaymentReports();
		
		homepage.PostPaidPaymentPageMenu();
	}
}
