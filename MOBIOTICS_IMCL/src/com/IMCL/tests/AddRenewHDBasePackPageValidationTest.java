package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.renew.dropdown.lcoprotal.imcl.ActivateRenewHDBasePackPage;

public class AddRenewHDBasePackPageValidationTest extends BaseTest
{
	@Test
    public void testAddRenewHDBasePackPageValidationTest() throws InterruptedException 
    {
		ActivateRenewHDBasePackPage homepage= new HomePage()
				                               .NavigateToRenewMenu_ActivatRenewHDBasePackPlan();
		
		Thread.sleep(3000);
		homepage.EnterCanNumberToVerifyTheRenwenHDPack();
		Thread.sleep(3000);
		homepage.CheckWhetherTheCustomerDetailsIsPresentOrNot();
	}
    
}