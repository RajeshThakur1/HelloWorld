package com.subscriber.list.lcoprotal.imcl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lcoportal.pages.Navigation_Menu;

public class ActivateAddOnPage extends Navigation_Menu
{
  public ActivateAddOnPage()
  {
	  PageFactory.initElements(driver, this);
  }
  
   
  
  @FindBy(xpath="//input[@placeholder='Enter CAN/STB/SMC']")
  private WebElement enterCanForAddingAlaCarte;
  
  @FindBy(xpath="//button[@id='subscriberid']")
  private WebElement clickOnSearchByCanNumButton;
  
  @FindBy(xpath="//input[@placeholder='Search By Plan Name']")
  private WebElement searchByPlanName;
  
  @FindBy(xpath="//button[@type='submit' and contains(text(), 'Search')]")
  private WebElement clickOnSearchByPlanButton;
  
  @FindBy(xpath="//select")
  private WebElement selectPlanPeriod;
  
  @FindBy(xpath="//input[@id='MUM00236PP']")
  private WebElement selectTheCheckBoxButton; 
  
  @FindBy(xpath="//button[@id='confirm-subscribe']")
  private WebElement clickOnConfirmSelectButton; 
  
  @FindBy(xpath="//tbody[@class='cart-table']//td[1]")
  private WebElement planName;
  
  @FindBy(xpath="//tbody[@class='cart-table']//td[2]")
  private WebElement priceForThePlan;
  
  @FindBy(xpath="//tbody[@class='cart-table']//td[3]")
  private WebElement expireData;
  
  @FindBy(xpath="//label[@id='amount1']")
  private WebElement totalPrice;
  
  @FindBy(xpath="//button[@id='confirmcart']")
  private WebElement clickOnForSubScribing;
  
  @FindBy(xpath="//button[@class='btn btn-lg btn-danger back']")
  private WebElement clickOnBackButton;
  
  @FindBy(xpath="//tbody[@id='individual-progress']//td[1]")
  private WebElement accountNumber;
  
  @FindBy(xpath="//tbody[@id='individual-progress']//td[2]")
  private WebElement planNameAfterSubscribingThePlan;
  
  @FindBy(xpath="//tbody[@id='individual-progress']//td[4]")
  private WebElement statusOfThePlan;
  
  @FindBy(xpath="//tbody[@id='individual-progress']//td[5]")
  private WebElement reasonForTheStatusOfThePlan;
  
  @FindBy(xpath="//div[@id='error-modal']/div/div/div[2]/p")
  private WebElement errorModelMsg;
  
  @FindBy(xpath="//div[@id='error-modal']/div/div/div[3]/button")
  private WebElement closeErrorModelMsg;
  
  
private void SelectValue(WebElement element, String value) 
  {
	Select select = new Select(element);
	select.selectByVisibleText(value);
   }
  
  
 

public void EnterDataForAddingAlaCarte() throws Exception 
   {
	
		waitTillElementIsVisible(enterCanForAddingAlaCarte);
		
		enterCanForAddingAlaCarte.sendKeys("can20227054");
		
		waitTillElementIsVisible(clickOnSearchByCanNumButton);
				
		clickOnSearchByCanNumButton.click();
		
		
		searchByPlanName.clear();
		searchByPlanName.sendKeys("&PICTURES");
		
		waitTillElementIsVisible(clickOnSearchByPlanButton);
		clickOnSearchByPlanButton.click();
		
	//waitTillElementIsVisible(selectTheCheckBoxButton);
		if (selectTheCheckBoxButton.isDisplayed()) 
		
		{
		    List<WebElement> list = driver.findElements(By.xpath("//input[@name='planlist']"));
		    outerloop:
			for(WebElement element:list)
			{
				if(element.isEnabled())
				{			
			   //Thread.sleep(2000);
			    
			   //selectTheCheckBoxButton.click();
					element.click();
				SelectValue(selectPlanPeriod, "Monthly");
				
				clickOnConfirmSelectButton.click();
				
				waitTillElementIsVisible(planName);
				String planNmaeIs = planName.getText();
				
				waitTillElementIsVisible(priceForThePlan);
				String price= priceForThePlan.getText();
				
				waitTillElementIsVisible(expireData);
				String expiryDate = expireData.getText();
				
				waitTillElementIsVisible(totalPrice);
				String totalPriceOfThePlan=totalPrice.getText();
				
				System.out.println("Plan Name is "+ planNmaeIs + ", price of the plan is "+price+
						", expiry date for the plan is "+expiryDate+ " and the Total Price Of the Plan is "+totalPriceOfThePlan);
				
								
				clickOnForSubScribing.click();
				
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
			   }		
				else
				{
					System.out.println("Plan Is Already Subscribed");
				}
				break outerloop;
			}
		}
			
			else 
			    {
				   List<WebElement> list = driver.findElements(By.xpath("//div[@class='alert alert-danger top-error text-center']"));
				   
				   for(WebElement ele : list)
				   {
					   Thread.sleep(2000);
					  System.out.println(ele.getText());
				   }
			
		         }
		
    }
  
  
 
}
