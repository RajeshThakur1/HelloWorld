package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.subscriberMenu.lcoportol.imcl.SubscriberMenu_ModifyCustomer;

public class ModifyCustomerPageTest extends BaseTest{
	
	
	@Test
	public void testModifyCustomerPageTest() throws InterruptedException
	{
		SubscriberMenu_ModifyCustomer homepage   = new HomePage().NavigateToSubscriberMenu_ModifyCustomer();
	
		homepage.ModifyCustmomer1();
	}

	 
}
