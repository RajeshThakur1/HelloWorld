package com.IMCL.tests;


import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.subscriber.list.lcoprotal.imcl.ActivateSchemBasedPlanPage;


public class AddSchemeBasedPackValidationTest extends BaseTest
{
	
	@Test
public void testAddSchemeBasedPackValidationTest() throws InterruptedException
{
	
	
	ActivateSchemBasedPlanPage homePage = new HomePage()
			                              .navigateToSubscribeMenu_ActivateSchemeBasedPack();
	
	   homePage.goToSchemBasedPlan();
	  //Assert.assertTrue(homePage.isBulkActivate_Button3_Present());
}
}