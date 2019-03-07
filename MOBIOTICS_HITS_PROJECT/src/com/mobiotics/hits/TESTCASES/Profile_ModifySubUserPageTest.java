package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.profile_ModifySubUser.Profile_ModifySubUserPage;

public class Profile_ModifySubUserPageTest extends BaseTest
{
  @Test
  public void testProfile_ModifySubUserPageTest()
  {
	  Profile_ModifySubUserPage homePage = new HomePage().navigateToProfileMenu_ModifySubUser();
	  
	  homePage.modifySubUser();
  }
}
