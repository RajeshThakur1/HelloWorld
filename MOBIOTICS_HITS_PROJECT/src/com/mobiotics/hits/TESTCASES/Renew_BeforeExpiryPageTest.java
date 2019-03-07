package com.mobiotics.hits.TESTCASES;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.renew_BeforeExpiry.BeforeExpiryPage;

public class Renew_BeforeExpiryPageTest extends BaseTest
{
  @Test
  public void testRenew_BeforeExpiryPageTest() throws InterruptedException, IOException
  {
	  BeforeExpiryPage homePage=new HomePage().navigateToRenewMenu_BeforeExpiryPage();
	  
	  homePage.renewBeforeExpiry();
  }
}
