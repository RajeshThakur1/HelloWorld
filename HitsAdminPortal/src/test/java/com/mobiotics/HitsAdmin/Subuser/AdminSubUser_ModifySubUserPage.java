package com.mobiotics.HitsAdmin.Subuser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminSubUser_ModifySubUserPage extends BasePage
{
	public AdminSubUser_ModifySubUserPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="subuser")
	private WebElement selectSubUser;
	
	@FindBy(id="adminname")
	private WebElement adminName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement setPermission;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement updateButton;
	
	@FindBy(className="text-success")
	private WebElement successMsg;
	
	@FindBy(className="text-error")
	private WebElement errorMsg;
	
//	@FindBy(xpath = "(//button[@type='button'])[2]")
//	private WebElement clickPremissionButton;
//	
	private String string1 = "//ul[@class='multiselect-container dropdown-menu']//li//label//input[@value='";

	private String string2 = "']";
	
	
	public void adminSubUser_ModifySubUser() throws InterruptedException{
		Select select = new Select(selectSubUser);	
		select.selectByVisibleText("123");
		Thread.sleep(3000);
		waitTillElementIsVisible(passWord);
		passWord.sendKeys("test123");
		Thread.sleep(3000);
		
		if (setPermission.isEnabled())
		{
			log.info("button is enabled");
		setPermission.click();
		selectPermission("lco");
		selectPermission("product");
		Thread.sleep(3000);
		
		setPermission.click();
		waitTillElementIsVisible(updateButton);
		updateButton.click();
		Thread.sleep(3000);	
		
		if (successMsg.isDisplayed()) {
			String msg = successMsg.getText();
			System.out.println(msg);
		} else if (errorMsg.isDisplayed()) {
			String msg2 = errorMsg.getText();
			System.out.println(msg2);
			}
		}
		Thread.sleep(3000);
	 }
	


public void selectPermission(String string) {
	if(driver.findElement(By.xpath(string1 + string + string2)).isSelected()){
		System.out.println("SubUser has this premission");		
	}else{
		driver.findElement(By.xpath(string1 + string + string2)).click();
	}
	}
}