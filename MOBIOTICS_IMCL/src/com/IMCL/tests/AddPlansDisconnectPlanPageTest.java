package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.plans.dropdown.lcoportal.imcl.Plans_DisconnectPlanPage;

public class AddPlansDisconnectPlanPageTest extends BaseTest{

	@Test
	public void testAddPlansDisconnectPlanPageTest() throws Exception
	{
		Plans_DisconnectPlanPage homepage=new HomePage()
				                          .NavigateToPlans_DisconnectPlanPage();
		
		homepage.EnterCanNumberToDisconnectThePlan();
	}
}
