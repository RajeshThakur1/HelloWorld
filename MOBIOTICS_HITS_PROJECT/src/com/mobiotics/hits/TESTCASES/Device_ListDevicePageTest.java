package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.device_ListDevice.ListDevicePage;

public class Device_ListDevicePageTest extends BaseTest
{
  @Test
  public void testDevice_ListDevicePageTest() throws InterruptedException
  {
	  ListDevicePage homePage = new HomePage().navigateToDeviceMenu_ListDevicePage();
	  
	  homePage.listDevice();
  }
}
