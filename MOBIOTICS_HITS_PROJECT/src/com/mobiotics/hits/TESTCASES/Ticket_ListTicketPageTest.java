package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.tickets_ListTicket.ListTicketPage;

public class Ticket_ListTicketPageTest extends BaseTest
{
  @Test
  public void testTicket_ListTicketPageTest() throws InterruptedException
  {
	  ListTicketPage homePage=new HomePage().navigateToTicketMenu_ListTicketPage();
	  
	  homePage.listTicketPage();
  }
}
