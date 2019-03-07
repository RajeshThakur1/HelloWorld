package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.ReportsCore.AdminReportCore_ListDevicesPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminReportCore_ListDevicePack extends BaseTest
{
	@Test
	public void reportsCoreListDeviceTestPage() throws InterruptedException
	{
		AdminReportCore_ListDevicesPage homepage = new HomePage().navigateToReportsCore_ListDevicePage();
		homepage.reportsCore_ListDevice();
	}
}
