package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.product_ActivatePendingPlanPage.ActivatePendingPlanPage;

public class Product_ActivatePendingPlanPageTest extends BaseTest
{
   @Test
   public void testProduct_ActivatePendingPlanPageTest() throws Exception
   {
	   ActivatePendingPlanPage homePage = new HomePage().navigateToProductMenu_ActivatePendingPlans();
	   homePage.activatePendingPlans();
   }
}
