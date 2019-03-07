package com.mobiotics.hits.commompages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mobiotics.hits.constants.AutomationConstants;
import com.mobiotics.hits.constants.BaseTest;

import generics.Property;
//import generics.Utility;

public class BasePage
{
  public Logger log=Logger.getLogger(this.getClass());
  public WebDriver driver;
  public String configFile;
  public long timeout;
  
  public BasePage()
  {
	  this.driver=BaseTest.driver;
	  configFile=AutomationConstants.CONFIG_PATH+AutomationConstants.CONFIG_FILE;
	  timeout=Long.parseLong(Property.getPropertyValue(configFile, "EXPLICIT"));
  }
  
  public void waitTillElementIsVisible(WebElement element){
	  new WebDriverWait(driver,timeout)
	  .until(ExpectedConditions.visibilityOf(element));
  }
  
  public void verifyURLis(String expectedUrl){
	  new WebDriverWait(driver,timeout).until(ExpectedConditions.urlToBe(expectedUrl));
  }
  
  public boolean verifyURLhas(String expectedUrl){
	  return new WebDriverWait(driver,timeout).until(ExpectedConditions.urlContains(expectedUrl));
  }
  

  public void moveToElement(WebElement element){
	  Actions actions=new Actions(driver);
	  actions.moveToElement(element).perform();
  }
  
}

