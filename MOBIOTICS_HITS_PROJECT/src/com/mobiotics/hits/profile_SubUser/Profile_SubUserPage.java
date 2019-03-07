package com.mobiotics.hits.profile_SubUser;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.hits.commompages.BasePage;

public class Profile_SubUserPage extends BasePage
{
   public Profile_SubUserPage() 
   {
	 PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath="//input[@class='form-control']")
   private WebElement enterUserName;
   
   @FindBy(xpath="//select[@id='type']")
   private WebElement selectType;
   
   @FindBy(xpath="//label[@class='checkbox']//input")
   private List<WebElement> checkBoxes;
   
   @FindBy(xpath="//button[@class='multiselect dropdown-toggle btn btn-default']")
   private WebElement clickOnIt;
   
   @FindBy(xpath="//button[@class='btn btn-lg btn-info']")
   private WebElement clickOnCreateButton;
   
   @FindBy(xpath="//form[@id='addsubuser']//p[2]")
   private WebElement errorMsg;
   
   @FindBy(xpath="//form[@id='addsubuser']//p[1]")
   private WebElement sucessMsg;
   
   
   
   public void addingSubUser()
   {
	   enterUserName.clear();
	   enterUserName.sendKeys("santhosh");
	   
	   Select select = new Select(selectType);
	   
	   select.selectByVisibleText("Subuser");
	   
	   waitTillElementIsVisible(clickOnIt);
	   clickOnIt.click();
	   
	   for(WebElement list : checkBoxes)
	   {
		   list.click();
		   if(list.isSelected())
		   {
			   clickOnIt.click();
			   
			   waitTillElementIsVisible(clickOnCreateButton);
			   clickOnCreateButton.click();
			   
			   if(sucessMsg.isDisplayed())
			   {
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
		   else
			   {
			     String string2 = errorMsg.getText();
			     System.out.println(string2);
			   }break;
	   }
   }
}
