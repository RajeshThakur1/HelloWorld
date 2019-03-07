package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.DashBoard.AdminDashBoard_AnalyticsPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminDashBoardPack extends BaseTest
{
	@Test
	  public void adminDashBoardTestPage() throws IOException, InterruptedException
	  {
		  AdminDashBoard_AnalyticsPage homepage = new HomePage().navigateToDashBoard_DashBoard();
		  homepage.adminDashBoardTest();
	  }
}
