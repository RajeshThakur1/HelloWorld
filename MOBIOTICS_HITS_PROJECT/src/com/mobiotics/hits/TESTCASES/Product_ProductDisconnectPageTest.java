package com.mobiotics.hits.TESTCASES;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.product_ProductDisconnect.ProductDisconnectPage;

public class Product_ProductDisconnectPageTest extends BaseTest
{
	 @Test
	 public void testProduct_ProductDisconnectPageTest() throws InterruptedException, IOException
	 {
		 ProductDisconnectPage homePage = new HomePage().navigateToProductMenu_ProductDisconnectPage();
		 
		 homePage.disconnectPlan();
	 }

}
