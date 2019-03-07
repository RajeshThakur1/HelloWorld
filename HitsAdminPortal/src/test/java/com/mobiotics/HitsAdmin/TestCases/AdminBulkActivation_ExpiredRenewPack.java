package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.BulkActivation.AdminBulkActivation_ExpiredRenewPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkActivation_ExpiredRenewPack extends BaseTest
{
	@Test
	  public void bulkExpiredRenewTestPage() throws IOException, InterruptedException
	  {
		  AdminBulkActivation_ExpiredRenewPage homepage = new HomePage().navigateToBulkActivation_ExpiredRenewPage();
		  homepage.bulkProductSubscription_ExpiredRenewTest();
	  }
}
