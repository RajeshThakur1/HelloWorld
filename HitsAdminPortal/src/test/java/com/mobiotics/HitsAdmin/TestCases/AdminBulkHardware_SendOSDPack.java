package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.BulkHardware.AdminBulkHardware_SendOSDPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkHardware_SendOSDPack extends BaseTest
{
	@Test
	  public void bulkSendOSDTestPage() throws IOException, InterruptedException
	  {
		  AdminBulkHardware_SendOSDPage homepage = new HomePage().navigateToBulkHardware_SendOSDPage();
		  homepage.bulkHardware_SendOSDTest();
	  }
}
