package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.ReportsFinance.AdminReportsFinance_PayForBoxPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminReportsFinance_PayForBoxPack extends BaseTest
{
	@Test
	public void reportsFinancePayForBoxTestPage() throws InterruptedException
	{
		AdminReportsFinance_PayForBoxPage homepage = new HomePage().navigateToReportsFinance_PayForBoxPage();
		homepage.AdminReportsFinance_PayForBox();
	}
}
