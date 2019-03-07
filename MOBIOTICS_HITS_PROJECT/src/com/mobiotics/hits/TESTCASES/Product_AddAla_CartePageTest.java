package com.mobiotics.hits.TESTCASES;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.product_AddAla_carte.AddAla_CartePage;

public class Product_AddAla_CartePageTest extends BaseTest
{
  @Test
  public void testProduct_AddAla_CartePageTest() throws InterruptedException, IOException
  {
	  AddAla_CartePage homePage = new HomePage().navigateToProductMenu_AddAlaCartePage();
	  
	  homePage.Add_AlaCartePage();
  }
}
