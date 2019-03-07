package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.customer_CoustomerModification.CustomerModificationPage;

public class Customer_ModifyCustomerPageTest extends BaseTest
{
 @Test
 public void testCustomer_ModifyCustomerPageTest() throws InterruptedException
 {
	 CustomerModificationPage homePage = new HomePage().navigateToCustomerMenu_ModifyCustomer();
	 
	 homePage.modifiyCustomer();
 }
}
