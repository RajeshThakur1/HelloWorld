package com.registermenu.lcoportal.imcl;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lcoportal.pages.BasePage;

public class Register_RegisterLcoPage extends BasePage
{
  public Register_RegisterLcoPage() 
  {
	PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//input[@name='pincode']")
  private WebElement enterPinCode;
  
  @FindBy(xpath="//input[@name='frcode']")
  private WebElement enterFRCode;
  
  @FindBy(xpath="//input[@name='email']")
  private WebElement enterEmail;
  
  @FindBy(xpath="//input[@id='password']")
  private WebElement enterPassword;
  
  @FindBy(xpath="//input[@name='contactno']")
  private WebElement enterPhoneNum;
  
  @FindBy(xpath="//input[@id='confirmpassword']")
  private WebElement confirmPassword;
  
  @FindBy(xpath="//input[@name='lcocompany']")
  private WebElement enterCompanyName;
  
  @FindBy(xpath="//input[@id='terms']")
  private WebElement selectTerms;
  
  @FindBy(xpath="//input[@id='aggrement']")
  private WebElement selectAgreement;
  
  @FindBy(xpath="//button[@class='btn btn-lg btn-info']")
  private WebElement clickToSingUp;
  
  @FindBy(xpath="//div[@id='permission']//input")
  private List<WebElement> radioButton;
  
  /*@FindBy(xpath="")
  private WebElement ;
  
  @FindBy(xpath="")
  private WebElement ;
  
  @FindBy(xpath="")
  private WebElement ;
  
  @FindBy(xpath="")
  private WebElement ;
  
  @FindBy(xpath="")
  private WebElement ;*/
}
