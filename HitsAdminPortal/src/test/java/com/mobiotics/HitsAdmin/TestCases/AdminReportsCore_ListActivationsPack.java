package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.ReportsCore.AdminReportsCore_ListActivationPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminReportsCore_ListActivationsPack extends BaseTest
{
	@Test
	public void reportsCoreListActivationTestPage() throws InterruptedException
	{
		AdminReportsCore_ListActivationPage homepage = new HomePage().navigateToReportsCore_ListActivationPage();
		homepage.reportsCore_ListActivation();	
	}
}
