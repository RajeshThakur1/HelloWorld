package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.renew.dropdown.lcoprotal.imcl.ActivateRenewChangeValidityPlanPage;

public class AddRenewChangeValidityPlanPageValidationTest extends BaseTest 
{
	
	@Test
  	public void testAddRenewChangeValidityPlanPageValidationTest() throws Exception
	{
		ActivateRenewChangeValidityPlanPage homepage=new HomePage()
				                                .NavigateToRenewMenu_ActivateChangeValidityPlan();
		
		Thread.sleep(3000);
		homepage.EnterCanNumberToChangeValidity();
		//homepage.IsMyCheckBoxesAreChecked();
		Thread.sleep(3000);
	}
  
}
