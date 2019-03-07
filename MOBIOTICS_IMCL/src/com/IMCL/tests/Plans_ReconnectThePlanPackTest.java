package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.plans.dropdown.lcoportal.imcl.Plans_ReconnectPlanPage;

public class Plans_ReconnectThePlanPackTest extends BaseTest{
	
	@Test
	public void testPlans_ReconnectThePlanPackTest() throws Exception
	{
		Plans_ReconnectPlanPage homepage= new HomePage()
				                          .NavigateToPlans_ReconnectPlans();
		
		homepage.EnterCanNumberToReconnectThePlan();
	}

}
