package com.mobiotics.hits.TESTCASES;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.product_ProductReconnectPage.ProductReconnectPage;

public class Product_ProductReconnectPageTest extends BaseTest
{ 
  @Test
  public void testProduct_ProductReconnectPageTest() throws InterruptedException, IOException
  {
	  ProductReconnectPage homePage = new HomePage().navigateToProductMenu_ProductReconnectPage();
	  homePage.reconnectPlan();
	  
  }
}
