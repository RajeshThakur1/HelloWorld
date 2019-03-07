package com.subscriber.list.lcoprotal.imcl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import com.lcoportal.pages.HomePage;

public class ActivateAddBasePackPage extends HomePage
{
  public ActivateAddBasePackPage() 
  {
	PageFactory.initElements(driver, this);
  }
  
    
  @FindBy(xpath="//input[@placeholder='Enter CAN/STB/SMC']")
  private WebElement enterCAN;
  
  @FindBy(xpath="//button[@id='subscriberid']")
  private WebElement clickOnGoButton;
  
  @FindBy(xpath=".//*[@id='bulkmodalsubscribe']")
  private WebElement bulkActivate_Button;

  @FindBy(id="confirm-subscribe")
  private WebElement confirmSelect;
  
  @FindBy(xpath="//input[@class='form-control search']")
  private WebElement searchByPlanName;
  
  @FindBy(xpath="//button[@class='btn btn-default' and @type='submit']")
  private WebElement clickOnSearchButton;
  
  @FindBy(xpath="//tbody[@class='plan-list']")
  private WebElement tableList;
  
  @FindBy(xpath="//select[@id='MUM00178PP']")
  private WebElement selectPlanPeriod;
  
  @FindBy(xpath="//button[@id='confirm-subscribe']")
  private WebElement clickOnConfirmSelectButton;
  
  @FindBy(xpath="//tbody[@class='cart-table']//td[1]")
  private WebElement planName;
  
  @FindBy(xpath="//tbody[@class='cart-table']//td[2]")
  private WebElement priceOfTheSelectedPack;
  
  @FindBy(xpath="//tbody[@class='cart-table']//td[3]")
  private WebElement expiryDateOfThePackage;
  
  @FindBy(xpath="//label[@id='amount1']")
  private WebElement totalAmountForThePlan;
  
  @FindBy(xpath="//button[@class='btn btn-lg btn-danger back']")
  private WebElement clcikOnBackButton;

  @FindBy(xpath="//button[@id='confirmcart']")
  private WebElement clickOnSubscribeButton;
  
  @FindBy(xpath="//h1[@class='pull-left' and contains(text(), 'Selected')]")
  private WebElement headingOfThePage;
  
  @FindBy(xpath="//tbody[@id='individual-progress']//td[1]")
  private WebElement accountNumber;
  
  @FindBy(xpath="//tbody[@id='individual-progress']//td[2]")
  private WebElement planNameAfterSubscribingThePlan;
  
  @FindBy(xpath="//tbody[@id='individual-progress']//td[4]")
  private WebElement statusOfThePlan;
  
  @FindBy(xpath="//tbody[@id='individual-progress']//td[5]")
  private WebElement reasonForTheStatusOfThePlan;
  
  @FindBy(xpath="//tbody[@class='plan-list']//tr//td[1]")
  private WebElement planList;
  
  @FindBy(xpath="//input[@id='MUM00178PP']")
  private WebElement radioButton;
  
  @FindBy(xpath="//div[@class='row']//div//p[@class='text-danger subscribers']")
  private WebElement unknownError;
  
  private void SelectValue(WebElement element, String value) 
  {
	Select select = new Select(element);
	select.selectByVisibleText(value);
   }
  
  
 

public void EnterDataForAddingTheBasePack() throws Exception 
   {
	
		waitTillElementIsVisible(enterCAN);
		
		enterCAN.sendKeys("can20227054");
		
		waitTillElementIsVisible(clickOnGoButton);
		
		clickOnGoButton.click();
		
		waitTillElementIsVisible(searchByPlanName);
		searchByPlanName.clear();
		searchByPlanName.sendKeys("PreBase IN Manoranjan");
		
		clickOnSearchButton.click();
		
		
		if (radioButton.isEnabled()) 
		
		{
			
			   Thread.sleep(2000);
			    
			    radioButton.click();
				SelectValue(selectPlanPeriod, "Monthly");
				
				clickOnConfirmSelectButton.click();
				
				waitTillElementIsVisible(planName);
				String planNmaeIs = planName.getText();
				
				waitTillElementIsVisible(priceOfTheSelectedPack);
				String price= priceOfTheSelectedPack.getText();
				
				waitTillElementIsVisible(expiryDateOfThePackage);
				String expiryDate = expiryDateOfThePackage.getText();
				
				waitTillElementIsVisible(totalAmountForThePlan);
				String totalPriceOfThePlan=totalAmountForThePlan.getText();
				
				System.out.println("Plan Name is "+ planNmaeIs + ", price of the plan is "+price+
						", expiry date for the plan is "+expiryDate+ " and the Total Price Of the Plan is "+totalPriceOfThePlan);
				
				waitTillElementIsVisible(clickOnSubscribeButton);			
				clickOnSubscribeButton.click();
				
				Thread.sleep(2000);
				
				try {
					if(statusOfThePlan.isDisplayed())			
					{
					waitTillElementIsVisible(statusOfThePlan);
					String status = statusOfThePlan.getText();
					
					waitTillElementIsVisible(reasonForTheStatusOfThePlan);
					String reason = reasonForTheStatusOfThePlan.getText();
					
					waitTillElementIsVisible(planNameAfterSubscribingThePlan);
					String nameOfThePlan = planNameAfterSubscribingThePlan.getText();
					
					waitTillElementIsVisible(accountNumber);
					String canNum = accountNumber.getText();
					
					System.out.println("Can Number is "+canNum+ " for the plan "+nameOfThePlan+ 
							" and the status of the plan is "+status+ " because of the following reason "+reason);
					Thread.sleep(3000);
					}			   	
      else
					  {
					    waitTillElementIsVisible(unknownError);
					    String string=unknownError.getText();
					    System.out.println(string);
					   }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		       }
			
			else 
			    {
				   List<WebElement> list = driver.findElements(By.xpath("//div[@class='alert alert-danger top-error text-center']"));
				   
				   for(WebElement ele : list)
				   {
					   Thread.sleep(2000);
					  System.out.println(ele.getText());
					  Thread.sleep(3000);
				   }
			
		         }Thread.sleep(3000);
		
    }

}