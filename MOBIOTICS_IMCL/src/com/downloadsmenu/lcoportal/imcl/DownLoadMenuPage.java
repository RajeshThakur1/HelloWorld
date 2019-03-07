package com.downloadsmenu.lcoportal.imcl;

import com.lcoportal.pages.BasePage;
import com.lcoportal.pages.HomePage;
import com.lcoportal.pages.Navigation_Menu;

public class DownLoadMenuPage extends BasePage{

	public void ClickToDownload() throws InterruptedException
	{
		
		Navigation_Menu navigate= new Navigation_Menu();
		
		HomePage hp=new HomePage();
				
		
	    
	    //hp.downLoad_Menu.click();
		navigate.axisBankEasyPaySlip.click();
		
		Thread.sleep(2000);
		hp.downLoad_Menu.click();
		navigate.lcoPortalUserGuide.click(); 
		
		Thread.sleep(2000);
		hp.downLoad_Menu.click();
		navigate.mibLetter.click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		hp.downLoad_Menu.click();
		navigate.mibAdvisory.click();
		Thread.sleep(2000);
		
	/*	Thread.sleep(2000);
		hp.downLoad_Menu.click();
		navigate.axisBankBranchDetails.click();
		driver.findElement(By.linkText("Click here for Axis Bank Branch Details to Access CDM")).click();
		
		Thread.sleep(2000);*/
		
		Thread.sleep(2000);
		hp.downLoad_Menu.click();
		navigate.thirdPartyDepositeAuthorization.click();
		Thread.sleep(2000);
		
		/*Thread.sleep(2000);
		hp.downLoad_Menu.click();
		navigate.bankAuthorizationAnnexure.click();
		Thread.sleep(2000);*/
		
		Thread.sleep(2000);
		hp.downLoad_Menu.click();
		navigate.axisEasyPayCircular.click();
		Thread.sleep(2000);
		
		hp.downLoad_Menu.click();
	    navigate.gSTDownload.click();

		
		
	}
}

