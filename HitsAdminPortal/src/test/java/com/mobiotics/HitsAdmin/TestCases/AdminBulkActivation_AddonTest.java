package com.mobiotics.HitsAdmin.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.BulkActivation.AdminBulkActivation_AddonsPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBulkActivation_AddonTest extends BaseTest
{
  @Test
  public void bulkAddOnTestPage() throws IOException, InterruptedException
  {
	  AdminBulkActivation_AddonsPage homepage = new HomePage().navigateToBulkActivation_AddOn();
	  homepage.bulkProductSubscription_AddonTest();
	  
  }
}
