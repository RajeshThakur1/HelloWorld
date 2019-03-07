package com.mobiotics.HitsAdmin.Subuser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminSubuser_AddSubUserPage extends BasePage {
	public AdminSubuser_AddSubUserPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(xpath = "//input[@name='adminid']")
	private WebElement enterAdminID;

	@FindBy(xpath = "//input[@name='adminname']")
	private WebElement enterAdminName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement enterPassword;

	@FindBy(xpath = "//input[@name='passphrase']")
	private WebElement enterPassPhrase;

	@FindBy(id = "type")
	private WebElement selectType;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement clickPremissionButton;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBoxes;

	@FindBy(xpath = "//button[.='Create']")
	private WebElement createSubUserButton;

	@FindBy(xpath = "//form[@id='addsubuser']/p[2]")
	private WebElement errorMsg;

	@FindBy(xpath = "//form[@id='addsubuser']/p[1]")
	private WebElement successMsg;

	// @FindBy(xpath = "//input[@value='")
	// private WebElement string1;
	//
	// @FindBy(xpath = "']")
	// private WebElement string2;

	private String string1 = "//ul[@class='multiselect-container dropdown-menu']//li//label//input[@value='";

	private String string2 = "']";

	public void adminSubUser_AddSubUser() throws InterruptedException {
		waitTillElementIsVisible(enterAdminID);
		enterAdminID.sendKeys("1111");

		waitTillElementIsVisible(enterAdminName);
		enterAdminName.sendKeys("Santhu");

		waitTillElementIsVisible(enterPassword);
		enterPassword.sendKeys("test");

		waitTillElementIsVisible(enterPassPhrase);
		enterPassPhrase.sendKeys("test");

		Select select = new Select(selectType);
		Thread.sleep(5000);
		List<WebElement> list = select.getOptions();
		int size = list.size();
		System.out.println(size);
		Thread.sleep(5000);
		for (int i = 2; i < size; i++) {
			select.selectByIndex(i);
			Thread.sleep(3000);
			String tagName = clickPremissionButton.getTagName();
			System.out.println(tagName);
			if (clickPremissionButton.isEnabled()) {

				System.out.println("element is visible");
				clickPremissionButton.click();
				Thread.sleep(3000);
				selectPermission("product");
				clickPremissionButton.click();
				Thread.sleep(3000);
			}
			Thread.sleep(3000);
			waitTillElementIsVisible(createSubUserButton);
			createSubUserButton.click();
			Thread.sleep(3000);
			if (successMsg.isDisplayed()) {
				String msg = successMsg.getText();
				System.out.println(msg);
			} else if (errorMsg.isDisplayed()) {
				String msg2 = errorMsg.getText();
				System.out.println(msg2);
				Thread.sleep(5000);
			}
			Thread.sleep(3000);
		}
	}

	public void selectPermission(String string) {
		driver.findElement(By.xpath(string1 + string + string2)).click();
		
	}
}
