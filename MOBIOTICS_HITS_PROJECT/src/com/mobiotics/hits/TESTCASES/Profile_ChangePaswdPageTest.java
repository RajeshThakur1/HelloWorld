package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.profile_ChangePassword.Profile_ChangePasswordPage;

public class Profile_ChangePaswdPageTest extends BaseTest
{
   @Test
   public void testProfile_ChangePaswdPageTest()
   {
	   Profile_ChangePasswordPage homePage = new HomePage().navigateToProfileMenu_ChangePassword();
	   
          homePage.changePassword();
   }
}
