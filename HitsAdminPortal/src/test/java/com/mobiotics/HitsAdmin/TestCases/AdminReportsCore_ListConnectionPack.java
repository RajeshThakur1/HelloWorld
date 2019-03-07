package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.ReportsCore.AdminReportCore_ListConnectionPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminReportsCore_ListConnectionPack extends BaseTest
{
	@Test
	public void reportsCoreListConnectionTestPage() throws InterruptedException
	{
		AdminReportCore_ListConnectionPage homepage = new HomePage().navigateToReportsCore_ListConnectionPage();
		homepage.reportsCore_ListConnection();
	}
}
