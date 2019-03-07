package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.coustomer_CreateCustomer.CreateCustomerPage;

public class Customer_CreateCustomerPageTest extends BaseTest
{
  @Test
  public void testCustomer_CreateCustomerPageTest() throws InterruptedException
  {
	  CreateCustomerPage homePage = new HomePage().navigateToCustomerMenu_CreateCustomer();
	  
	  homePage.fillCustomerCreationForm();
  }
}
