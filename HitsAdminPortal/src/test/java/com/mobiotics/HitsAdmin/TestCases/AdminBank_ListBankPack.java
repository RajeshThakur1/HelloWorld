package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.Banks.AdminBanks_ListBanksPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBank_ListBankPack extends BaseTest
{
	@Test
	  public void adminBanklistBankTestPage() throws InterruptedException
	  {
		AdminBanks_ListBanksPage homepage = new HomePage().navigateToAdminBank_ListBankPage();
		  homepage.adminBanks_ListBankPage();
		  
	  }
}
