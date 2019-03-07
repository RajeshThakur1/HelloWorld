package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.renew.dropdown.lcoprotal.imcl.ActivateRenewPlanPage;

public class AddRenewPlanPageValidationTest extends BaseTest
{
	@Test
	public void testAddRenewPlanPageValidation() throws Exception
	{
		ActivateRenewPlanPage homepage = new HomePage()
				                         .navigateToRenewMenu_ActivateRenewPlan();
	
		Thread.sleep(2000);		
		homepage.EnterCanNumberToRenewPlan();
		
		//Thread.sleep(2000);
		//homepage.IsMyCheckBoxesAreCheckedInRenewPlanPage();
	}

}
