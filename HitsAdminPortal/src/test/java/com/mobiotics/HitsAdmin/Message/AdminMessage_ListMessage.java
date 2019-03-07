package com.mobiotics.HitsAdmin.Message;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HitsAdmin.commonpages.BasePage;
import com.mobiotics.HitsAdmin.constants.BaseTest;

public class AdminMessage_ListMessage extends BasePage {
	public AdminMessage_ListMessage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(id = "createMessage_btn")
	private WebElement createAlertMsgbtn;

	@FindBy(xpath = "(//div[@class='modal-content'])[2]")
	private WebElement popUpModal;

	@FindBy(id = "priority")
	private WebElement selectPriority;

	@FindBy(id = "alerttype")
	private WebElement selectAlertType;

	@FindBy(id = "description")
	private WebElement typeDescription;

	@FindBy(id = "deleteMessageButton")
	private WebElement deletebutton;

	@FindBy(xpath = "(//div[@class='modal-content'])[1]")
	private WebElement deletePopUp;

	@FindBy(id="success")
	private WebElement successMsg;

	@FindBy(id="error")
	private WebElement failureMsg;

	@FindBy(id = "close")
	private WebElement closeButton1;

	@FindBy(id = "close_btn")
	private WebElement closebutton;

	@FindBy(id = "create_btn")
	private WebElement creatButton;

	@FindBy(id = "entitytype")
	private WebElement entityType;

	@FindBy(id = "lcousername")
	private WebElement lcoUserName;

	@FindBy(id = "msousername")
	private WebElement msoUserName;

	@FindBy(id = "description")
	private WebElement enterText;

	public void adminListMsgTest() throws InterruptedException {
		Thread.sleep(3000);
		waitTillElementIsVisible(createAlertMsgbtn);
		if (createAlertMsgbtn.isEnabled()) {
			createAlertMsgbtn.click();
			Thread.sleep(3000);

			if (popUpModal.isDisplayed()) {
				waitTillElementIsVisible(selectPriority);
				Select select = new Select(selectPriority);
				select.selectByVisibleText("5");
				Thread.sleep(3000);
				Select select1 = new Select(selectAlertType);
				select1.selectByVisibleText("CUSTOMER");
				Thread.sleep(3000);

				if (entityType.isDisplayed()) {
					Select select2 = new Select(entityType);
					select2.selectByVisibleText("LCO");
					Thread.sleep(3000);
					if (lcoUserName.isDisplayed()) {
						waitTillElementIsVisible(lcoUserName);
						lcoUserName.sendKeys("LCO200000955.01");
						Thread.sleep(3000);
					}	else {
						System.out.println("this is not an LCO nor MSO");
					  Thread.sleep(3000);
				}
				waitTillElementIsVisible(enterText);
				enterText.sendKeys("This is test");
				Thread.sleep(3000);
				waitTillElementIsVisible(creatButton);
				creatButton.click();
				Thread.sleep(3000);
				
				if (successMsg.isDisplayed()) {
					System.out.println("Success msg is printing");
					System.out.println(successMsg.getText());
				} else {
					System.out.println(failureMsg.getText());
				}
			} else {
				System.out.println("PopUp did not appear");
			}

		} else {
			System.out.println("Set Priority is not enabled");
		}
		Thread.sleep(3000);
	}
}
	}
