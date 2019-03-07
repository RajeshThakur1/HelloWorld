package com.porfilemenu.lcoportal.imcl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.HomePage;

public class ProfileMenu_ChangeCustomerDetails extends HomePage
{
  public ProfileMenu_ChangeCustomerDetails() 
  {
	 PageFactory.initElements(driver, this);
  }
  
  
  @FindBy(xpath="//input[@class='form-control' and @name='email']")
  private WebElement enterEmailIdToChange;
  
  @FindBy(xpath="//input[@class='form-control' and @name='mobileno']")
  private WebElement enterPhoneNum;
  
  @FindBy(linkText="Change password")
  private WebElement clickToChangePassword;
  
  @FindBy(xpath="//input[@id='oldpassword']")
  private WebElement enterOldPassword;
  
  @FindBy(xpath="//input[@id='newpassword']")
  private WebElement enterNewPassword;
  
  @FindBy(xpath="//input[@class='btn btn-lg btn-danger']")
  private WebElement clickOnSubmitButton;
  
  @FindBy(linkText="Cancel")
  private WebElement clickOnCancelButton;
  
  @FindBy(xpath="//div[@class='alert alert-success top-success text-center fixed-top']")
  private WebElement successMsg;
  
  @FindBy(xpath="//div[@class='alert alert-danger top-error text-center fixed-top']")
  private WebElement errorMsg;
  
    
  public void ChangeProfileDetails()
  {
	  enterEmailIdToChange.clear();
	  
	  enterEmailIdToChange.sendKeys("zakaria.km@mobiotics.com");
	  
	  enterPhoneNum.clear();
	  
	  enterPhoneNum.sendKeys("9886658566");
	  
	  clickOnSubmitButton.click();
	  
	  WebElement pass=successMsg;
	 // WebElement fail=errorMsg;
	  
	try {
		if(pass.isDisplayed())
		  {
			  List<WebElement> list = driver.findElements(By.xpath
					  ("//div[@class='alert alert-success top-success text-center fixed-top']"));
			   for(WebElement ele : list)
			   {
				  
				  System.out.println(ele.getText());
			   }
		  }
		  else{
			  List<WebElement> list1 = driver.findElements(By.xpath
					  ("html/body/div[6]"));
			   for(WebElement ele2:list1)
			   {
				   System.out.println(ele2.getText());
			   }
		  }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
