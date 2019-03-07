package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.ReportsCore.AdminReportsCore_JobReportsPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminReportCore_JobReportPack extends BaseTest
{
	@Test
	public void reportsCoreListDeviceTestPage() throws InterruptedException
	{
		AdminReportsCore_JobReportsPage homepage = new HomePage().navigateToReportsCore_JobReportPage();
		homepage.reportsCore_JobReports();
	}
}
