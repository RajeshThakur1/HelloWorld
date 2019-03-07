package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.paymentmenu_PayForBox.PayForBoxPage;

public class Payment_PayForBoxPageTest extends BaseTest
{
	@Test
	public void testPayment_PayForBoxPageTest() throws InterruptedException
	{
		PayForBoxPage homePage = new HomePage().navigateToPaymentMenu_PayForBoxPage();
		
		homePage.goTOPayForBoxReport();
	}

}
