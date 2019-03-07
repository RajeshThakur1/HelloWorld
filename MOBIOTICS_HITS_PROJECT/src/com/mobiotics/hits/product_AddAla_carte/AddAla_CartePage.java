package com.mobiotics.hits.product_AddAla_carte;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;
import generics.Utility;

public class AddAla_CartePage extends BasePage {
	public AddAla_CartePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "customerid")
	private WebElement enterCustomerIdToSearch;

	@FindBy(id = "customerid")
	private WebElement clickToSearchCustomer;

	@FindBy(name = "productlist")
	private List<WebElement> checkBoxesToAddaddOnsPack;

	@FindBy(id = "confirm-subscribe")
	private WebElement clickOnConfirmButtonToAddaddOnsPack;

	@FindBy(xpath = "//tbody[@class='cart-table']//td[1]")
	private WebElement productName;

	@FindBy(xpath = "//tbody[@class='cart-table']//td[2]")
	private WebElement priceOfThePlan;

	@FindBy(xpath = "//tbody[@class='cart-table']//td[3]")
	private WebElement expiryDateOfThePlan;

	@FindBy(id = "confirmcart")
	private WebElement clickToAddaddOnsPack;

	@FindBy(xpath = "//tbody[@id='plan_status']//td[1]")
	private WebElement productId;

	@FindBy(xpath = "//tbody[@id='plan_status']//td[2]")
	private WebElement nameOfProduct;

	@FindBy(xpath = "//tbody[@id='plan_status']//td[3]")
	private WebElement statusOfThePlan;

	@FindBy(xpath = "//tbody[@id='plan_status']//td[4]")
	private WebElement errorMsg;

	@FindBy(xpath = "//tbody[@id='plan_status']//td[5]")
	private WebElement errorCodeForTheFailure;

	@FindBy(xpath = "//div[@id='mypopmessage']//p")
	private WebElement errorPopUp;

	@FindBy(id = "bulkaddonsmodal")
	private WebElement clickonbullkbutton;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement choosefiletoUpload;

	@FindBy(id = "upload")
	private WebElement uploadButton;

	@FindBy(xpath = "//div[@id='bulkaddons']//label[2]")
	private WebElement uploadsuccess;

	@FindBy(xpath = "//div[@id='bulkaddons']//p[1]")
	private WebElement otherError;

	@FindBy(xpath = "//div[@id='bulkaddons']//p[2]")
	private WebElement successErrorfinal;

	@FindBy(id = "submit")
	private WebElement submitButton;

	@FindBy(id = "close")
	private WebElement closeButton;

	@FindBy(xpath = "(//*[@class='modal-content'])[1]")
	private WebElement clickOnOkButton;

	@FindBy(id = "customerName")
	private WebElement custName;

	@FindBy(xpath = "//td[@colspan='5']")
	private WebElement wallet;

	// -----------to take random xp----------------------

	private String xp1 = "(//input[@name='productlist'])[";

	private String xp2 = "]";

	public void ranXpath(int num) {
		driver.findElement(By.xpath(xp1 + num + xp2)).click();
	}

	private String Datapath = "C://users//sande//Desktop//Copy of Hits_Data_sheet.xlsx";
	private int rowCount = Excel.getRowCount(Datapath, "Sheet1");
	private String addonFile = "C:\\Users\\sande\\Desktop\\AutoITforHITS\\newHitsbulkAddon.exe";

	public void Add_AlaCartePage() throws InterruptedException, IOException {

		waitTillElementIsVisible(clickonbullkbutton);
		clickonbullkbutton.click();
		log.info("I have clicked on the bulk button");

		Thread.sleep(5000);
		log.info("Actions class");
		Actions action = new Actions(driver);
		action.moveToElement(choosefiletoUpload);
		action.click().build().perform();
		log.info("clicked on upload btn");
		Thread.sleep(5000);

		log.info("I have uploaded the bulk file");
		Thread.sleep(5000);
		Runtime.getRuntime().exec(addonFile);
		Thread.sleep(10000);

		waitTillElementIsVisible(uploadButton);
		uploadButton.click();

		Thread.sleep(5000);

		log.info("about to click on the submit button");
		waitTillElementIsVisible(uploadsuccess);

		System.out.println(uploadsuccess.getText());

		Thread.sleep(15000);

		if (uploadsuccess.getText().contentEquals("Upload success")) {

			log.info("other error text is displayed");
			System.out.println(uploadsuccess.getText());
			waitTillElementIsVisible(submitButton);
			Thread.sleep(5000);
			submitButton.click();

			log.info("clicked on submit button");

			Thread.sleep(2000);
			if (otherError.isDisplayed()) {
				log.info("second If");
				waitTillElementIsVisible(otherError);
				System.out.println(otherError.getText());
			} else if (successErrorfinal.isDisplayed()) {
				log.info("Success Msg");
				waitTillElementIsVisible(successErrorfinal);
				System.out.println(successErrorfinal.getText());
			}
		}
		waitTillElementIsVisible(closeButton);
		closeButton.click();

// ---------------------single add addon's starts from here-----------------------

		for (int i = 1; i <= rowCount; i++) {

			log.info("clicked again");
			waitTillElementIsVisible(enterCustomerIdToSearch);

			String data = Excel.getCellValue(Datapath, "Sheet1", i, 0);
			System.out.println(data);
			String custId = data;

			if (custId.contains(".")) {
				System.out.println("contains decimal points->true");
				String s = data;
				long convert = Double.valueOf(s).longValue();
				String num = Long.toString(convert);
				System.out.println(num);
				enterCustomerIdToSearch.sendKeys(num);
			} else {
				System.out.println("doesn't contains decimal points ->False");
				enterCustomerIdToSearch.sendKeys(data);
			}
			waitTillElementIsVisible(clickToSearchCustomer);
			clickToSearchCustomer.click();

			Thread.sleep(30000);

			if (clickOnOkButton.isDisplayed()) {

				log.info("inside if new");
				waitTillElementIsVisible(errorPopUp);
				System.out.println(errorPopUp.getText());

				waitTillElementIsVisible(clickOnOkButton);
				clickOnOkButton.click();
				enterCustomerIdToSearch.clear();
				continue;
			}

			else {
				log.info("indside else if");
				waitTillElementIsVisible(custName);
				System.out.println(custName.getText());

				System.out.println(custName.getText());
				WebElement cust = custName;
				waitTillElementIsVisible(cust);

				List<WebElement> list1 = checkBoxesToAddaddOnsPack;

				int size = list1.size();
				System.out.println(size);
				System.out.println(Utility.getRandomNumber(1, size));
				ranXpath(Utility.getRandomNumber(1, size));

				Thread.sleep(5000);
				clickOnConfirmButtonToAddaddOnsPack.click();

				waitTillElementIsVisible(productName);

				System.out.println(" Product Name is " + productName.getText() + " Price Of The Plan "
						+ priceOfThePlan.getText() + " Expiry Date Is On " + expiryDateOfThePlan.getText());

				clickToAddaddOnsPack.click();
				Thread.sleep(10000);
				if (wallet.isDisplayed()) {
					System.out.println(wallet.getText());
				} else {

					log.info("last else part");

					waitTillElementIsVisible(statusOfThePlan);
					System.out.println("Product Id is " + productId.getText() + " Status Of The Plan is "
							+ statusOfThePlan.getText() + " Reason is " + errorMsg.getText() + " Code is "
							+ errorCodeForTheFailure.getText());

				}
				break;
			}
		}
	}
}
