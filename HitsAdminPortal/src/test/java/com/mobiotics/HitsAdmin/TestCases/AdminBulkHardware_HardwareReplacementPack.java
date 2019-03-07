package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.BulkHardware.AdminBulkHardware_HardwareReplacementPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkHardware_HardwareReplacementPack extends BaseTest
{
	@Test
	  public void bulkHardwareReplacementTestPage() throws IOException, InterruptedException
	  {
		  AdminBulkHardware_HardwareReplacementPage homepage = new HomePage().navigateToBulkHardware_HardwareReplacementPage();
		  homepage.bulkHardware_HardwareReplacementTest();
	  }
}
