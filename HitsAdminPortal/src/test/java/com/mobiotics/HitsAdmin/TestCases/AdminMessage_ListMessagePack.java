package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.Message.AdminMessage_ListMessage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminMessage_ListMessagePack extends BaseTest
{
	@Test
	public void listMessageTestPage() throws InterruptedException
	{
		AdminMessage_ListMessage homepage = new HomePage().navigateToAdminMessage_ListMessagePage();
		homepage.adminListMsgTest();
	}
}
