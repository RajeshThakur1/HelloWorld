package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.reports_JobReports.JobReportPage;

public class Report_JobReportPageTest extends BaseTest
{
   @Test
   public void testReport_JobReportPageTest() throws InterruptedException
   {
	   JobReportPage homePage = new HomePage().navigateToReportMenu_JobReportPage();
	   homePage.jobReportsDownLoad();
   }
}
