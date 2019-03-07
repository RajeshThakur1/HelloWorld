package com.mobiotics.hits.renew_BeforeExpiry;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class BeforeExpiryPage extends BasePage {
	public BeforeExpiryPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "customerid")
	private WebElement enterCustomerIdToSearch;

	@FindBy(id = "customerName")
	private WebElement custName;

	@FindBy(xpath = "//button[@data-target='#confirmRemoveModal']")
	private List<WebElement> doNotRenewbuttons;

	@FindBy(xpath = "(//div[@class='modal-content'])[3]")
	private WebElement popUp;

	@FindBy(className = "confirmMessage")
	private WebElement confirmMsg;

	@FindBy(id = "confirm_btn")
	private WebElement popUpConfirmButton;

	@FindBy(xpath = "((//div[@class='modal-content'])[2]//p)[1]")
	private WebElement popUpErrorMsg;

	@FindBy(xpath = "//p[.='Removed Successfully.']")
	private WebElement popUpSuccessMsg;

	@FindBy(id = "confirm_close")
	private WebElement popUpClosebutton;

	@FindBy(id = "customerid")
	private WebElement clickToSearchCustomer;

	@FindBy(id = "confirm-subscribe")
	private WebElement clickOnRenewAll;

	@FindBy(id = "bulkdonotrenewmodal")
	private WebElement bulkDoNotRenewButton;

	@FindBy(id = "bulk_donot_renew_file")
	private WebElement fileUpload;

	@FindBy(id = "upload-donotrenew")
	private WebElement uploadButton;

	@FindBy(xpath = "//table[@class='table cart']//tbody//td[1]")
	private WebElement productName;

	@FindBy(xpath = "//table[@class='table cart']//tbody//td[4]")
	private WebElement expiryDate;

	@FindBy(xpath = "//table[@class='table']//td[1]")
	private WebElement totalAmount;

	@FindBy(xpath = "//table[@class='table']//td[2]")
	private WebElement rupees;

	@FindBy(id = "confirmcart")
	private WebElement confirmButton;

	@FindBy(xpath = "(//tbody[@class='plan-list'])[2]//td[1]")
	private WebElement productId;

	@FindBy(xpath = "(//tbody[@class='plan-list'])[2]//td[2]")
	private WebElement productName1;

	@FindBy(xpath = "(//tbody[@class='plan-list'])[2]//td[3]")
	private WebElement status;

	@FindBy(xpath = "(//tbody[@class='plan-list'])[2]//td[4]")
	private WebElement error;

	@FindBy(xpath = "(//tbody[@class='plan-list'])[2]//td[5]")
	private WebElement errorCode;

	@FindBy(id="bulkrenewmodal")
	private WebElement clickonbullkbutton;
		
	@FindBy(id="bulk_renew_file")
	private WebElement singltBulkBtn;
	
	@FindBy(id="upload")
	private WebElement singleUpLoadBtn;
	
	@FindBy(xpath="//label[.='Upload success']")
	private WebElement singleSuccessMsg; 
	
	@FindBy(id="renew_error")
	private WebElement singleFinalErrorMsg; 
	
	@FindBy(id="donotrenew_success")
	private WebElement finalDoNotRenewSuccessMsg;
	
	@FindBy(id="donotrenew_error")
	private WebElement finalDoNotRenewErrorMsg;
	
	@FindBy(id="submit")
	private WebElement singleSubmitBtn;
	
	@FindBy(id="renew_success")
	private WebElement singleFinalSuccessMsg;
	
	@FindBy(id="renew_close_btn")
	private WebElement finalCloseBtn;
	
	@FindBy(id="bulkdonotrenewmodal")
	private WebElement bulkDonNotRenew;
	
	@FindBy(id="close")
	private WebElement closeDoNotRenew;

	
	private String Datapath = "C://users//sande//Desktop//Copy of Hits_Data_sheet.xlsx";
	private int rowCount = Excel.getRowCount(Datapath, "Sheet1");
	private String bulkRenewFile = "C:\\Users\\sande\\Desktop\\AutoITforHITS\\singleBeforeExpiryRenew.exe";
	private String bulkDoNotRenewFile = "C:\\Users\\sande\\Desktop\\AutoITforHITS\\BeforeExpiryDoNotRenew.exe";
	
	
	public void renewBeforeExpiry() throws InterruptedException, IOException {
		waitTillElementIsVisible(clickonbullkbutton);
		clickonbullkbutton.click();
		Thread.sleep(5000);
		singltBulkBtn.click();
		Thread.sleep(5000);
		log.info("I have uploaded the bulk file");
		Thread.sleep(5000);
		Runtime.getRuntime().exec(bulkRenewFile);
		Thread.sleep(5000);
		waitTillElementIsVisible(singleUpLoadBtn);
		singleUpLoadBtn.click();
		log.info("about to click on the submit button");
		waitTillElementIsVisible(singleSuccessMsg);

		if (singleSuccessMsg.getText().contentEquals("Upload success")) {
			System.out.println(singleSuccessMsg.getText());
			waitTillElementIsVisible(singleSubmitBtn);
			Thread.sleep(5000);
			singleSubmitBtn.click();
			log.info("clicked on submit button");
			Thread.sleep(5000);
			if (singleFinalErrorMsg.isDisplayed()) {
				Thread.sleep(2000);
				log.info("second If");
				waitTillElementIsVisible(singleFinalErrorMsg);
				System.out.println(singleFinalErrorMsg.getText());
			} else if (singleFinalSuccessMsg.isDisplayed()) {
				Thread.sleep(2000);
				log.info("Success Msg");
				waitTillElementIsVisible(singleFinalSuccessMsg);
				System.out.println(singleFinalSuccessMsg.getText());
			}
		}
		waitTillElementIsVisible(finalCloseBtn);
		finalCloseBtn.click();
		Thread.sleep(5000);
//------------------------Bulk DONot Renew-----------------------------------
		waitTillElementIsVisible(bulkDoNotRenewButton);
		bulkDoNotRenewButton.click();
		Thread.sleep(5000);
		fileUpload.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec(bulkDoNotRenewFile);
		Thread.sleep(5000);
		waitTillElementIsVisible(uploadButton);
		uploadButton.click();
		waitTillElementIsVisible(singleSuccessMsg);

		if (singleSuccessMsg.getText().contentEquals("Upload success")) {
			System.out.println(singleSuccessMsg.getText());
			
			Thread.sleep(5000);
			if (finalDoNotRenewErrorMsg.isDisplayed()) {
				Thread.sleep(2000);
				log.info("second If");
				waitTillElementIsVisible(finalDoNotRenewErrorMsg);
				System.out.println(finalDoNotRenewErrorMsg.getText());
			} else if (finalDoNotRenewSuccessMsg.isDisplayed()) {
				Thread.sleep(2000);
				log.info("Success Msg");
				waitTillElementIsVisible(finalDoNotRenewSuccessMsg);
				System.out.println(finalDoNotRenewSuccessMsg.getText());
			}
		}
		waitTillElementIsVisible(closeDoNotRenew);
		closeDoNotRenew.click();
		Thread.sleep(2000);
//------------------single Before expiry renew--------------------------------------

		for (int i = 1; i <= rowCount; i++) {

			log.info("clicked again");
			waitTillElementIsVisible(enterCustomerIdToSearch);
			enterCustomerIdToSearch.clear();

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
			Thread.sleep(10000);
			waitTillElementIsVisible(custName);
			List<WebElement> list = doNotRenewbuttons;
			int total = list.size();
			System.out.println(total);
			if (total == 0) {
				continue;
			}
			int z = 0;
			while (total > 1) {
				System.out.println("Total value is " + total);
				System.out.println(list.size());				
				Thread.sleep(5000);
				if (list.get(z).isEnabled()) {

					System.out.println("is enabled");
					list.get(z).click();

					Thread.sleep(5000);
					if (popUp.isDisplayed()) {
						log.info("pop up is displayed");

						waitTillElementIsVisible(confirmMsg);
						System.out.println(confirmMsg.getText());
						waitTillElementIsVisible(popUpConfirmButton);

						popUpConfirmButton.click();
						
					if (popUpSuccessMsg.isDisplayed()) {
							waitTillElementIsVisible(popUpSuccessMsg);
							System.out.println(popUpSuccessMsg.getText());

						} else {
							waitTillElementIsVisible(popUpErrorMsg);
							System.out.println(popUpErrorMsg.getText());
						}
						waitTillElementIsVisible(popUpClosebutton);
						popUpClosebutton.click();
					} else {
						log.info("4th");
						System.out.println("No Proper Data Provided");
						popUpClosebutton.click();
						Thread.sleep(5000);
					}
				} else {
					System.out.println("element is not enable");
				}
				total--;

			}
			System.out.println("size is lesser than one");
			Thread.sleep(3000);
			waitTillElementIsVisible(clickOnRenewAll);
			clickOnRenewAll.click();
			Thread.sleep(3000);
			waitTillElementIsVisible(productName);
			waitTillElementIsVisible(expiryDate);
			waitTillElementIsVisible(totalAmount);
			String id = productName.getText();
			String expiry = expiryDate.getText();
			String amount = totalAmount.getText();
			String money = rupees.getText();

			System.out.println(
					"ProductName is " + id + " Expiry Date " + expiry + " Total Amount is " + amount + " " + money);
			Thread.sleep(3000);
			confirmButton.click();
			Thread.sleep(3000);
			waitTillElementIsVisible(productId);
			waitTillElementIsVisible(productName1);
			waitTillElementIsVisible(status);
			waitTillElementIsVisible(errorCode);
			Thread.sleep(5000);
			System.out.println("ProductId is " + productId.getText() + " Product Name is " + productName1.getText() + " Status of Plan is " + status.getText()
					+ " ErrorMessage is " + error.getText() + " and the Error Code is " + errorCode.getText());
			Thread.sleep(5000);
			break;
		}
	}

}
