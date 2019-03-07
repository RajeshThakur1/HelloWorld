package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.porfilemenu.lcoportal.imcl.ProfileMenu_ChangeCustomerDetails;

public class ProfileChangingPageTest extends BaseTest
{
   @Test
   public void testChangingProfilePageTest() throws InterruptedException
   {
	   ProfileMenu_ChangeCustomerDetails homepage = new HomePage().NavigateToProfileMenu_ChangeProfile();
	   
	   homepage.ChangeProfileDetails();
	}
}
