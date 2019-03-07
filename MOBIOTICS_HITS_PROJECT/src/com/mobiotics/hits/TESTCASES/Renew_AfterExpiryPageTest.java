package com.mobiotics.hits.TESTCASES;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.renew_AfterExpiry.AfterExpiryPage;

public class Renew_AfterExpiryPageTest extends BaseTest
{
	@Test
	public void testRenew_AfterExpiryPageTest() throws InterruptedException, IOException
	{
       AfterExpiryPage homePage = new HomePage().navigateToRenewMenu_AfterExpiryPage();
       homePage.renewExpiryReport();
	}
 
}
