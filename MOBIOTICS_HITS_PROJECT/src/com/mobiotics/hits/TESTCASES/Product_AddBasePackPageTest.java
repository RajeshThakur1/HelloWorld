package com.mobiotics.hits.TESTCASES;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.product_AddBasePackPage.AddBasePackPage;

public class Product_AddBasePackPageTest extends BaseTest
{
   @Test
   public void testProduct_AddBasePackPageTest() throws InterruptedException, IOException
   {
	   AddBasePackPage homePage = new HomePage().navigateToProductMenu_AddBasePackPage();
	   
	   homePage.addBasePack();
   }
}
