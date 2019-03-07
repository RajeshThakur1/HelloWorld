package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.Subuser.AdminSubUser_ModifySubUserPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminSubUser_ModifySubUserPack extends BaseTest
{
	@Test
	public void subUserModifySubuserTestPage() throws InterruptedException
	{
		AdminSubUser_ModifySubUserPage homepage = new HomePage().navigateToAdminSubUser_ModifySubUserPage();
		homepage.adminSubUser_ModifySubUser();
	}
}
