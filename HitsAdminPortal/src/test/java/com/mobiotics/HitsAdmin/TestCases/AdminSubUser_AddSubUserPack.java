package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.Subuser.AdminSubuser_AddSubUserPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminSubUser_AddSubUserPack extends BaseTest
{
	@Test
	public void subUserAddSubuserTestPage() throws InterruptedException
	{
		AdminSubuser_AddSubUserPage homepage = new HomePage().navigateToAdminSubUser_AddSubUserPage();
		homepage.adminSubUser_AddSubUser();
	}
}
