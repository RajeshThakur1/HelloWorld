package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.customer_ListCustomers.ListCustomerPage;

public class Customer_ListCustomerPageTest extends BaseTest
{
  @Test
  public void testCustomer_ListCustomerPageTest() throws InterruptedException
  {
	  ListCustomerPage homePage = new HomePage().navigateToCustomerMenu_ListCustomerPage();
	  
	  homePage.ListCustomer();
  }
}
