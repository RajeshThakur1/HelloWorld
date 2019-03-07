package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.BulkHardware.AdminBulkHardware_RetrackPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkHardware_RetrackPack extends BaseTest
{
	@Test
	  public void bulkCreateCustomerTestPage() throws IOException, InterruptedException
	  {
		  AdminBulkHardware_RetrackPage homepage = new HomePage().navigateToBulkHardware_RetrackPage();
		  homepage.bulkHardware_RetrackTest();
	  }
}
