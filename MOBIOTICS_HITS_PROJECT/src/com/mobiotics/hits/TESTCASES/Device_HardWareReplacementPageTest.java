package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.device_HardWareReplacement.HardWareReplacementPage;

public class Device_HardWareReplacementPageTest extends BaseTest
{
   @Test
   public void testDevice_HardWareReplacementPageTest() throws InterruptedException
   {
	   HardWareReplacementPage homePage = new HomePage().navigateToDeviceMenu_HardWareReplacementPage();
	   homePage.HardWareReplacement();
   }
}
