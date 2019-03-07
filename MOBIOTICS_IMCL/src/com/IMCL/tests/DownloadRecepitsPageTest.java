package com.IMCL.tests;

import org.testng.annotations.Test;

import com.constant.lcoportal.imcl.BaseTest;
import com.downloadsmenu.lcoportal.imcl.DownLoadMenuPage;
import com.lcoportal.pages.HomePage;

public class DownloadRecepitsPageTest extends BaseTest

{
   @Test
   public void testDownloadRecepitsPageTest() throws InterruptedException
   {
	   DownLoadMenuPage homepage = new HomePage().NavigateToDownloadMenu_ClickAllTheLinks();
	   
	   homepage.ClickToDownload();
   }
}
