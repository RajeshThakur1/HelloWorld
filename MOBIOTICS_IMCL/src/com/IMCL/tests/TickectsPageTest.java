package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.subscriberMenu.lcoportol.imcl.SubscriberMenu_TicketsPage;

public class TickectsPageTest extends BaseTest
{
	@Test
  public void testTickectsPageTest() throws InterruptedException
  {
	  SubscriberMenu_TicketsPage homePage = new HomePage().NavigateToSubscriberMenu_TicketsPage();
	  
	  homePage.ticketStatusPage();
  }
}
