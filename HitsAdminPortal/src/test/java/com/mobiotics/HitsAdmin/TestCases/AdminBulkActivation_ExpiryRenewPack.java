package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.BulkActivation.AdminBulkActivation_ExpiryRenewPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkActivation_ExpiryRenewPack extends BaseTest
{
	@Test
	  public void bulkExpiryRenewTestPage() throws IOException, InterruptedException
	  {
		  AdminBulkActivation_ExpiryRenewPage homepage = new HomePage().navigateToBulkActivation_ExpiryRenewPage();
		  homepage.bulkProductSubscription_ExpiryRenewTest();
	  }
}
