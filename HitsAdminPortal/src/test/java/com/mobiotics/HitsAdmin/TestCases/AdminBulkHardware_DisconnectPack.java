package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.BulkHardware.AdminBulkHardware_DisconnectPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkHardware_DisconnectPack extends BaseTest
{
	@Test
	  public void bulkDisconnectTestPage() throws IOException, InterruptedException
	  {
		  AdminBulkHardware_DisconnectPage homepage = new HomePage().navigateToBulkHardware_DisconnectPage();
		  homepage.bulkHardware_DisconnectTest();
	  }
}
