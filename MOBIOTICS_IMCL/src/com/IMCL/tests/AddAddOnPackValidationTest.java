package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.subscriber.list.lcoprotal.imcl.ActivateAddOnPage;

public class AddAddOnPackValidationTest extends BaseTest
{
	@Test
	   public void testIsBulkActivateButtonPresent() throws Exception
	   {
		
		ActivateAddOnPage homePage1 = new HomePage().navigateToSubscribeMenu_ActivateAddOnPack();
		  
		   homePage1.EnterDataForAddingAlaCarte();
	    }
}
