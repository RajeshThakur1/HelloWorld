package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.ReportsFinance.AdminReportsFinance_ListPaymentPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminReportsFinance_ListPaymentPack extends BaseTest
{
	@Test
	public void reportsFinanceListPaymentTestPage() throws InterruptedException
	{
		AdminReportsFinance_ListPaymentPage homepage = new HomePage().navigateToReportsFinance_ListPaymentPage();
		homepage.AdminReportsFinance_ListPayment();
	}
}
