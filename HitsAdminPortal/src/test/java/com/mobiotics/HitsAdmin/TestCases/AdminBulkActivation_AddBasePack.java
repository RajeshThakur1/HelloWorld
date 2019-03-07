package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.BulkActivation.AdminBulkActivation_BasePackPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkActivation_AddBasePack extends BaseTest	
	{
	  @Test
	  public void bulkAddBasePackTestPage() throws IOException, InterruptedException
	  {
		  AdminBulkActivation_BasePackPage homepage = new HomePage().navigateToBulkActivation_AddBasePack();
		  homepage.bulkProductSubscription_AddBasePackTest();
		  
	  }
	}