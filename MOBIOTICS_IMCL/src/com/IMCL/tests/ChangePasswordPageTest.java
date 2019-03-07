package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.porfilemenu.lcoportal.imcl.ProfileMenu_ChangePasswordPage;

public class ChangePasswordPageTest extends BaseTest
{
  @Test
  public void testChangePasswordPageTest() throws InterruptedException
  {
	  ProfileMenu_ChangePasswordPage homePage = new HomePage().NavigateToProfileMenu_ChangePassword();
	  
	  homePage.changePasswordPage();
  }
}
