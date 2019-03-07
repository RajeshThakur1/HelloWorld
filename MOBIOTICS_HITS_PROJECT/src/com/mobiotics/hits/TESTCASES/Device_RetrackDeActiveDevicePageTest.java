package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.device_RetrackDeactive.RetrackDeActiveDevicePage;

public class Device_RetrackDeActiveDevicePageTest extends BaseTest
{
  @Test
  public void testDevice_RetrackDeActiveDevicePageTest() throws InterruptedException
  {
	  RetrackDeActiveDevicePage homePage = new HomePage().navigateToDeviceMenu_RetrackDeActiveDevicePage();
	  homePage.retrackDeactivateService();
  }
}
