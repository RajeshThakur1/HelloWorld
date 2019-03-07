package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.subscriber.list.lcoprotal.imcl.ActivateAddBasePackPage;

public class AddBasePackValidationTest extends BaseTest
{
   @Test
   public void testAddBasePackValidationTest() throws Exception
   {   
	   ActivateAddBasePackPage homePage = new HomePage().navigateToSubscribeMenu_ActivateBasepack();
	   
	  
	  homePage.EnterDataForAddingTheBasePack();
	  Thread.sleep(3000);
   }   
}
