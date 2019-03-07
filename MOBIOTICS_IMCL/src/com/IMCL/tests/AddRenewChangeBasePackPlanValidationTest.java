package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.renew.dropdown.lcoprotal.imcl.ActivateRenewChangeBasePackPlanPage;

public class AddRenewChangeBasePackPlanValidationTest extends BaseTest{

	
	@Test
	 public void testAddRenewChangeBasePackPlanValidationTest() throws Exception
	   {
		
		   
		  ActivateRenewChangeBasePackPlanPage homepage= new HomePage()
				                                        .NavigateToRenew_ActivateChangeBasePackPlanPage();
		   
		  //Thread.sleep(3000);
		  homepage.EnterCanNumberToChangeBasePack_Validity();
		  
		 /* Thread.sleep(2000);
		  homepage.IsMyCheckBoxesAreChecked();*/
		   
		  
		  
		 }
}