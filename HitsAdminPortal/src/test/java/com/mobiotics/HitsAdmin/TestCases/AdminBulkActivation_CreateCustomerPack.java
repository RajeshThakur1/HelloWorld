package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.BulkActivation.AdminBulkActivation_CreateCustomerPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkActivation_CreateCustomerPack extends BaseTest
{
	@Test
	  public void bulkCreateCustomerTestPage() throws IOException, InterruptedException
	  {
		  AdminBulkActivation_CreateCustomerPage homepage = new HomePage().navigateToBulkActivation_CreateCustomerPage();
		  homepage.bulkProductSubscription_CreateCustomerTest();
	  }
}
