package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.Operators_LCO.MSOListPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class Operators_MSOList extends BaseTest{
	@Test
	public void getMSOListTest() throws InterruptedException {
		MSOListPage homePage = new HomePage().navigateToOperatorsMenu_MSO();
		homePage.getMSOList_Operators();
	}
}
