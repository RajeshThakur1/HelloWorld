package com.mobiotics.hits.renew_AfterExpiry;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class AfterExpiryPage extends BasePage {
	public AfterExpiryPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "customerid")
	private WebElement enterCustomerIdToSearch;

	@FindBy(id = "customerid")
	private WebElement clickToSearchCustomer;

	@FindBy(id = "confirm-subscribe")
	private WebElement clickOnRenewAll;

	@FindBy(xpath = "//button[@class='btn btn-warning removeButton']")
	private List<WebElement> clickOnDoNotRenewButton;

	@FindBy(xpath = "//table[@class='table cart']//tbody//td[1]")
	private WebElement productName;

	@FindBy(xpath = "//table[@class='table cart']//tbody//td[4]")
	private WebElement expiryDate;

	@FindBy(xpath = "//table[@class='table']//td[1]")
	private WebElement totalAmount;

	@FindBy(xpath = "//table[@class='table']//td[2]")
	private WebElement rupees;

	@FindBy(xpath = "//button[@id='confirmcart']")
	private WebElement confirmButton;

	@FindBy(xpath = "//div[@class='productreport table-responsive']//td[1]")
	private WebElement productId;

	@FindBy(xpath = "//div[@class='productreport table-responsive']//td[2]")
	private WebElement productName1;

	@FindBy(xpath = "//div[@class='productreport table-responsive']//td[3]")
	private WebElement status;

	@FindBy(xpath = "//div[@class='productreport table-responsive']//td[4]")
	private WebElement error;

	@FindBy(xpath = "//div[@class='productreport table-responsive']//td[5]")
	private WebElement errorCode;

	@FindBy(xpath = ".//*[@id='149']/td[8]/button")
	private WebElement doNotRenew;

	@FindBy(xpath = "(//div[@class='modal-content'])[2]")
	private WebElement popUp;

	@FindBy(xpath = "//button[@class='btn btn-warning confirm']")
	private WebElement confirmButton1;

@FindBy(xpath = "(//Strong[@class='confirmMessage'])")
private WebElement confirmMsg;

	@FindBy(xpath = ".//*[@id='confirmRemoveModal']/div/div/div[3]/button[1]")
	private WebElement closeThePopUp;

	@FindBy(id = "donotrenew")
	private WebElement popUpConfirmButton;

	@FindBy(id = "bulkrenewmodal")
	private WebElement clickonbullkbutton;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement choosefiletoUpload;

	@FindBy(id = "upload")
	private WebElement uploadButton;

	@FindBy(className = "upload-status")
	private WebElement uploadsuccess;

	@FindBy(id = "close")
	private WebElement closeButton;

	@FindBy(id = "submit")
	private WebElement submitButton;

	@FindBy(xpath = "//div[@id='bulkrenew']//p[1]")
	private WebElement otherError;

	@FindBy(xpath = "//div[@id='bulkrenew']//p[2]")
	private WebElement successErrorfinal;

	@FindBy(xpath = "//tbody[@class='plan-list']//button")
	private List<WebElement> doNotRenewbuttons;

	@FindBy(id = "customerName")
	private WebElement custName;

	@FindBy(id = "donotrenew_close")
	private WebElement popUpClosebutton;

	@FindBy(xpath = "((//div[@class='modal-content'])[2]//p)[2]")
	private WebElement popUpSuccessMsg;

	@FindBy(xpath = "((//div[@class='modal-content'])[2]//p)[1]")
	private WebElement popUpErrorMsg;

	private String Datapath = "C://users//sande//Desktop//Copy of Hits_Data_sheet.xlsx";
	private int rowCount = Excel.getRowCount(Datapath, "Sheet1");
	private String addonFile = "C:\\Users\\sande\\Desktop\\AutoITforHITS\\bulkAfterExpiry.exe";

	public void renewExpiryReport() throws InterruptedException, IOException {
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

		// ------------------single after expiry
		// renew--------------------------------------

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
			Thread.sleep(10000);
			waitTillElementIsVisible(custName);

			List<WebElement> list = doNotRenewbuttons;

			int total = list.size();

			System.out.println(total);

			if (total > 1) {

				System.out.println("total is greater than 1");

				for (WebElement ele : list) {
					Thread.sleep(15000);
					if (ele.isEnabled()) {

						log.info("button is enabled");
						ele.click();

						Thread.sleep(10000);
						if (popUp.isDisplayed()) {
							log.info("pop up is displayed");

							waitTillElementIsVisible(confirmMsg);
							Thread.sleep(10000);
							System.out.println(confirmMsg.getText());
							waitTillElementIsVisible(popUpConfirmButton);

							popUpConfirmButton.click();
							Thread.sleep(25000);

							if (popUpSuccessMsg.isDisplayed()) {
								Thread.sleep(15000);
								// waitTillElementIsVisible(popUpSuccessMsg);
								System.out.println(popUpSuccessMsg.getText());

							} else {
								// waitTillElementIsVisible(popUpErrorMsg);
								Thread.sleep(15000);
								System.out.println(popUpErrorMsg.getText());
							}
							Thread.sleep(25000);

							popUpClosebutton.click();
							break;
						} else

						{
							log.info("4th");
							System.out.println("No Proper Data Provided");
							popUpClosebutton.click();
						}
					}
				}
			} else {
				System.out.println("size is lesser than one");
				clickOnRenewAll.click();
				String id = productName.getText();
				String expiry = expiryDate.getText();
				String amount = totalAmount.getText();
				String money = rupees.getText();

				System.out.println(
						"ProductName is " + id + " Expiry Date " + expiry + " Total Amount is " + amount + " " + money);

				confirmButton.click();

				String id1 = productId.getText();
				String name = productName1.getText();
				String statusPlan = status.getText();
				String errorMsg = error.getText();
				String errorMsgCode = errorCode.getText();

				System.out.println("ProductId is " + id1 + " Product Name is " + name + " Status of Plan is "
						+ statusPlan + " ErrorMessage is " + errorMsg + " and the Error Code is " + errorMsgCode);
			}
		}
		
	}

}
