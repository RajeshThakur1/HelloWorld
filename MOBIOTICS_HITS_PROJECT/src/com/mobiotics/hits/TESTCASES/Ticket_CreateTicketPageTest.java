package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.ticket_CreateTicket.CreateTicketPage;

public class Ticket_CreateTicketPageTest extends BaseTest
{
  @Test
  public void testTicket_CreateTicketPageTest() throws InterruptedException
  {
	  CreateTicketPage homePage = new HomePage().navigateToTicketMenu_CreateTicketPage();
	  homePage.raiseTicket();
  }
}
