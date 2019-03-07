package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.profile_SubUser.Profile_SubUserPage;

public class Profile_SubUserPageTest extends BaseTest
{
  @Test
  public void testProfile_SubUserPageTest()
  {
	  Profile_SubUserPage homePage = new HomePage().navigateToPofileMenu_SubUser();
	  
	  homePage.addingSubUser();
  }
}
