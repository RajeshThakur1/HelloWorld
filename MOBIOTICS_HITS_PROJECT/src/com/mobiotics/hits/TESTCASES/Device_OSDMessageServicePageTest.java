package com.mobiotics.hits.TESTCASES;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.device_OSD.OSDMessageServicePage;

public class Device_OSDMessageServicePageTest extends BaseTest
{
   @Test
   public void testDevice_OSDMessageServicePageTest() throws InterruptedException, AWTException
   {
	   OSDMessageServicePage homePage = new HomePage().navigateToDeviceMenu_OsdMesssageServicePage();
	   
	   homePage.osdMsgService();
   }
}
