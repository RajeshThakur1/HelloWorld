package com.mobiotics.HitsAdmin.Banks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminBanks_ListBanksPage extends BasePage {
	public AdminBanks_ListBanksPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(id = "status")
	private WebElement selectStatus;

	@FindBy(xpath = "//button[.='Add Bank']")
	private WebElement addBank;

	@FindBy(xpath = "//form[@id='banknamesearch']/input")
	private WebElement searchByBank;

	@FindBy(xpath = "//form[@id='banknamesearch']/button")
	private WebElement searchButton;

	@FindBy(id = "bankid")
	private WebElement enterBankId;

	@FindBy(id = "bankname")
	private WebElement enterBankName;

	@FindBy(id = "bankstatus")
	private WebElement selectBankStatus;

	@FindBy(id = "create")
	private WebElement createButton;

	@FindBy(id = "close")
	private WebElement closeButton;

	@FindBy(xpath = "(//div[@class='row'])[2]/p[2]")
	private WebElement successMsg;

	@FindBy(xpath = "(//div[@class='row'])[2]/p[1]")
	private WebElement errorMsg;

	@FindBy(xpath = "//div[@class='modal-content']")
	private WebElement popUp;

	@FindBy(xpath = "//tr[@class='11']//td[4]")
	private WebElement status;

	public void adminBanks_ListBankPage() throws InterruptedException {
		Select select = new Select(selectStatus);
		
		for (int i = 1; i <= 2; i++) {
			select.selectByIndex(i);
			Thread.sleep(5000);
			List<WebElement> list = driver.findElements(By.xpath("//table[@class='table table-striped']//tbody//td[2]"));
			int size = list.size();
			if (size > 0) {
				for (WebElement ele : list) {
					String str = ele.getText();
					Thread.sleep(3000);
					System.out.println(str);
				}
			} else {
				System.out.println("there are no Bank Listing");
				 
			}select.selectByVisibleText("ALL");
		}
		waitTillElementIsVisible(searchByBank);
		searchByBank.sendKeys("Aib");
		Thread.sleep(3000);
		waitTillElementIsVisible(searchButton);
		searchButton.click();
		Thread.sleep(3000);
		String string = status.getText();
		Thread.sleep(7000);
		if (string.contains("ACTIVE")) {
			status.click();
			Thread.sleep(2000);			
		} else {
			status.click();
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
		 searchByBank.clear();
		waitTillElementIsVisible(addBank);
		addBank.click();
		Thread.sleep(7000);
		if (popUp.isDisplayed()) {
			waitTillElementIsVisible(enterBankId);
			enterBankId.sendKeys("13");

			waitTillElementIsVisible(enterBankName);
			enterBankName.sendKeys("san");

			Select sel = new Select(selectBankStatus);
			sel.selectByVisibleText("ACTIVE");

			Thread.sleep(7000);
			waitTillElementIsVisible(createButton);
			createButton.click();
			Thread.sleep(7000);
			if (successMsg.isDisplayed()){
				System.out.println(successMsg.getText());
		} else {
			System.out.println(errorMsg.getText());
		}
		}
		Thread.sleep(3000);
		waitTillElementIsVisible(closeButton);
		Thread.sleep(3000);
		closeButton.click();
		Thread.sleep(3000);
		
	}
}
