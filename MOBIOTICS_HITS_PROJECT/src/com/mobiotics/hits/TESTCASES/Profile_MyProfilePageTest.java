package com.mobiotics.hits.TESTCASES;

import org.testng.annotations.Test;

import com.mobiotics.hits.commompages.HomePage;
import com.mobiotics.hits.constants.BaseTest;
import com.mobiotics.hits.profile_MyProfile.MyProfilePage;

public class Profile_MyProfilePageTest extends BaseTest
{
  @Test
  public void testProfile_MyProfilePageTest() throws InterruptedException
  {
	  MyProfilePage homePage = new HomePage().navigateToProfileMenu_MyProfile();
	  
	  homePage.changeMyProfile();
  }
}
