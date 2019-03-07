package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.reports_ExpiryReport.ExpiryReportPage;

public class Report_ExpiryReportPageTest extends BaseTest
{
	@Test
	public void testReport_ExpiryReportPageTest() throws InterruptedException
	{
		ExpiryReportPage homePage = new HomePage().navigateToReportMenu_ExpiryReportPage();
		
		homePage.downloadExpiryReport();
	}

}
