package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.reports_menu.lcoportal.imcl.Reports_ActivationReport;

public class ToDownloadReportSchedulesButtonTest extends BaseTest
{
     @Test
     public void testToDownloadActivationButtonTest() throws Exception
     {
    	 Reports_ActivationReport homepage = new HomePage().NavigateToReports_ActivationReport();
    	 
    	 homepage.ActivationsReportsData();
    	 Thread.sleep(2000);
    	 homepage.ExpiryReportData();
    	 Thread.sleep(2000);
    	 homepage.ExpiredReportData();
    	 Thread.sleep(2000);
    	 homepage.BillsReportData();
    	 Thread.sleep(2000);
    	 homepage.RefundReportData(); 
    	 Thread.sleep(2000);
    	 homepage.PaymentReportData();
    	 Thread.sleep(2000);
    	 homepage.ScheduleReportData();
     }
}
