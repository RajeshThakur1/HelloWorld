package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.device_RetrackActiveDevice.RetrackActiveDevicePage;

public class Device_RetrackActiveDevicePageTest extends BaseTest
{
  @Test
  public void testDevice_RetrackActiveDevicePageTest() throws InterruptedException
  {
	  RetrackActiveDevicePage homePage = new HomePage().navigateToDeviceMenu_RetrackActiveDevicePage();
	  
	  homePage.retarckActiveService();
  }
}
