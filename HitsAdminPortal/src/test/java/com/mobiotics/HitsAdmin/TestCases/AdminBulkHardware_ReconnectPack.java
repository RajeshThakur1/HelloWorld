package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.BulkHardware.AdminBulkHardware_ReconnectPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkHardware_ReconnectPack extends BaseTest
{
	@Test
	  public void bulkReconnectTestPage() throws IOException, InterruptedException
	  {
		  AdminBulkHardware_ReconnectPage homepage = new HomePage().navigateToBulkHardware_ReconnectPage();
		  homepage.bulkHardware_ReconnectTest();
	  }
}
