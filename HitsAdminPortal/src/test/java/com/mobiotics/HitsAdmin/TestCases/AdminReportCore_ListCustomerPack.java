package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.ReportsCore.AdminReportCore_ListCustomerPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminReportCore_ListCustomerPack extends BaseTest
{
	@Test
	public void reportsCoreListCustomerTestPage() throws InterruptedException
	{
		AdminReportCore_ListCustomerPage homepage = new HomePage().navigateToReportsCore_ListCustomerPage();
		homepage.reportsCore_ListCustomer();
	}
}
