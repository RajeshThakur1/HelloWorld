package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.credits.cardpayments.lcoportal.imcl.Credits_AddCreditsFromCards;
import com.lcoportal.pages.HomePage;

public class AddCreditFromCardToTheAccountPlanPageTest extends BaseTest{
	
	@Test
	public void testAddCreditToTheAccountPlanPageTest() throws Exception
	{
     	Credits_AddCreditsFromCards homepage = new HomePage().NavigateToCredits_AddCreditsFromCards();
		homepage.GotoPaymentsPage();
	}

}