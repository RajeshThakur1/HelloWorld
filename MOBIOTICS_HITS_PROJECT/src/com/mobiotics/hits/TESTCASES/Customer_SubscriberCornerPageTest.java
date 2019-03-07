package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.customer_SubscriberCorner.SubscriberCronerPage;

public class Customer_SubscriberCornerPageTest extends BaseTest {
	@Test
	public void testCustomer_SubscriberCornerPageTest() throws InterruptedException
	{
		SubscriberCronerPage homepage = new HomePage().navigateToCustomerMenu_SubscriberCornerPage();
		homepage.subscribercorner();
	}

}
