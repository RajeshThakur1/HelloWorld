package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.hardwaremenu.lcoportal.imcl.ActivateHardWareMenuRetrack;
import com.lcoportal.pages.HomePage;

public class HardWareMenu1_RetrackTest extends BaseTest{

	 @Test
	   public void testHardWareMenu_RetrackTest() throws Exception
	   {
		
		   ActivateHardWareMenuRetrack homePage = new HomePage()
				                                  .NavigateToHardware_Retrack();
		   
		   homePage.thisMethodIsForRetracking();
	   }
		   
}
