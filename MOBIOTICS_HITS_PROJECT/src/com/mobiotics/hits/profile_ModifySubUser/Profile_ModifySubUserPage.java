package com.mobiotics.hits.profile_ModifySubUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.hits.commompages.BasePage;

public class Profile_ModifySubUserPage extends BasePage
{
  public Profile_ModifySubUserPage() 
  {
	 PageFactory.initElements(driver, this);
  }
  
   @FindBy(xpath="//select[@id='subuser']")
   private WebElement selectSubUser;
   
   @FindBy(id="type")
   private WebElement selectType;
   
   @FindBy(xpath="//button[@class='multiselect dropdown-toggle btn btn-default']")
   private WebElement setPermission;
   
   @FindBy(xpath="//button[@class='btn btn-lg btn-info']")
   private WebElement clickToUpdate;
   
   @FindBy(xpath="//form[@id='updatesubuser']//p[2]")
   private WebElement errorMsg;
   
   @FindBy(xpath="html/body/div[4]")
   private WebElement sucessMsg;
   
   /*@FindBy(xpath="")
   private WebElement ;
   
   @FindBy(xpath="")
   private WebElement ;*/
   
   private void selectValue(WebElement element, String value)
   {
	   Select select = new Select(element);
	   select.selectByVisibleText(value);
   }
   
   public void modifySubUser()
   {
	  selectValue(selectSubUser, "lco200000955.01");
	  
	  selectValue(selectType, "subuser");
	  
	  waitTillElementIsVisible(clickToUpdate);
	  clickToUpdate.click();
	  
	  if(sucessMsg.isDisplayed())
	  {
		  waitTillElementIsVisible(sucessMsg);
		  String string = sucessMsg.getText();
		  System.out.println(string);
	  }
	  else
	  {
		  waitTillElementIsVisible(errorMsg);
		  String string1 = errorMsg.getText();
		  System.out.println(string1);
	  }
   }
}
