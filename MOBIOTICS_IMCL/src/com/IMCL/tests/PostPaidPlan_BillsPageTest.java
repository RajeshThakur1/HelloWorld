package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.lcoportal.pages.HomePage;
import com.postpaidmenu.lcoportal.imcl.PostPaidMenu_BillsPage;

public class PostPaidPlan_BillsPageTest extends BaseTest

{
    @Test
    public void testPostPaidPlan_BillsPageTest() throws InterruptedException
    {
    	PostPaidMenu_BillsPage homepage= new HomePage().NavigateToPostMenu_Bills();
    	
    	homepage.PayPostPaidBillsPage();
    }
}
