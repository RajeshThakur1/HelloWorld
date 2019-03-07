package com.mobiotics.HitsAdmin.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.HitsAdmin.Operators_LCO.DPOListPage;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class Operators_DPOList extends BaseTest{
	
	@Test
	public void getDPOListTest() throws InterruptedException {
		DPOListPage homePage = new HomePage().navigateToOperatorsMenu_DPO();
		homePage.getDPOList_Operators();
	}

}
