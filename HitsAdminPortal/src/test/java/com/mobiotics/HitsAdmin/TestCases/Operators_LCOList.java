package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.Operators_LCO.LCOListPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class Operators_LCOList extends BaseTest {
	@Test
	public void getLCOListTest() throws InterruptedException {
		LCOListPage homePage = new HomePage().navigateToOperatorsMenu_LCO();
		homePage.getLCOList_Operators();

	}
}
