package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.ReportsCore.AdminReportsCore_ListSuspensionPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminReportsCore_ListSuspensionPack extends BaseTest
{
	@Test
	public void reportsCoreListSuspensionTestPage() throws InterruptedException
	{
		AdminReportsCore_ListSuspensionPage homepage = new HomePage().navigateToReportsCore_ListSuspensionPage();
		homepage.reportsCore_ListSuspension();
	}
}
