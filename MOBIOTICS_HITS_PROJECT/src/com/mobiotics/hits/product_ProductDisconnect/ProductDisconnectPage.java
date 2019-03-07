package com.mobiotics.hits.product_ProductDisconnect;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class ProductDisconnectPage extends BasePage
{
  public ProductDisconnectPage() 
  {
	PageFactory.initElements(driver, this);
   }
  
  @FindBy(xpath="//input[@name='customerid']")
  private WebElement enterCustomerSerialNumber;
  
  @FindBy(xpath="//button [@id='customerid']")
  private WebElement clickToSearchCustomer;
  
  @FindBy(xpath="//div[@class='productsubscription table-responsive']//tbody//td[5]")
  private WebElement checkBox;
  
  @FindBy(xpath="//button[@id='confirm-subscribe']")
  private WebElement clickToConfirmSelect;
  
  @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//td[1]")
  private WebElement packageName;
  
  @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//td[2]")
  private WebElement contractId;
  
  @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//td[3]")
  private WebElement expiryDate;
  
  @FindBy(xpath="//button[@id='confirmcart']")
  private WebElement clickToDisconnectThePlan;
  
  @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//td[1]")
  private WebElement ProductId;
  
  @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//td[2]")
  private WebElement productName;
  
  @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//td[3]")
  private WebElement statusOfPlan;
  
  @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//td[4]")
  private WebElement error;
  
  @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//td[5]")
  private WebElement errorCode;
  
  @FindBy(id="click-confirm")
  private WebElement invalidCust;
  
  @FindBy(xpath="//div[@id='mypopmessageid']//p")
  private WebElement errorMessage;
  
  @FindBy(id="customerName")
  private WebElement custName;
  
  @FindBy(id="bulkdisconnectmodal")
  private WebElement bulkbtn;
  
  @FindBy(xpath="//input[@type='file']")
  private WebElement fileupload;
  
  @FindBy(id="upload")
  private WebElement upload;
  
  @FindBy(xpath="//div[@id='bulkdisconnect']//label[2]")
  private WebElement uploadmsg;
  
  @FindBy(id="close")
  private WebElement clickclosebtn;
  
  @FindBy(xpath="//div[@id='bulkdisconnect']//p[1]")
  private WebElement otherError;
  
  @FindBy(xpath="//div[@id='bulkdisconnect']//p[2]")
  private WebElement afterbulkupload;
  
  @FindBy(xpath="//button[@class='btn btn-default' and contains(text(),'Close')]")
  private WebElement finalClosebutton;
  
  
  private String Datapath = "C://users//sande//Desktop//Copy of Hits_Data_sheet.xlsx";
  private int rowCount = Excel.getRowCount(Datapath, "Sheet1");
  private String bulkfile = "C:\\Users\\sande\\Desktop\\AutoITForHITS\\bulkDisconnect.exe";
  
 
//	private boolean existsElement(String id) {
//		try {
//			driver.findElement(By.id(id));
//		} catch (Exception e) {
//			System.out.println("id is not present ");
//			return false;
//		}
//		return true;
//	}

	public void disconnectPlan() throws InterruptedException, IOException {

		waitTillElementIsVisible(bulkbtn);
		bulkbtn.click();
		log.info("click on download button");
		Thread.sleep(5000);
		log.info("Actions class");
		Actions action = new Actions(driver);
		action.moveToElement(fileupload);
		action.click().build().perform();
		log.info("clicked on upload btn");
		Thread.sleep(5000);
		log.info("String stored");
		Runtime.getRuntime().exec(bulkfile);
		log.info("executed exe file");
		Thread.sleep(5000);
		waitTillElementIsVisible(upload);
		upload.click();
		log.info("clicked on upload button");
		waitTillElementIsVisible(uploadmsg);
		Thread.sleep(10000);
		
		if (uploadmsg.getText().contentEquals("Upload success")){
			log.info("other error text is displayed");

			if (otherError.isDisplayed()){
				waitTillElementIsVisible(otherError);
				System.out.println(otherError.getText());
			} else {
				log.info("inside 1st else loop if upload success");
				waitTillElementIsVisible(uploadmsg);
				System.out.println(uploadmsg.getText());
				log.info("got the error text");
				Thread.sleep(5000);
				waitTillElementIsVisible(afterbulkupload);
				System.out.println(afterbulkupload.getText());
				log.info("got the success text");
			}
		} else {
			waitTillElementIsVisible(uploadmsg);
			System.out.println("There is something wrong in the Excel" + uploadmsg.getText());
		}

		Thread.sleep(5000);
		waitTillElementIsVisible(finalClosebutton);
		finalClosebutton.click();
		log.info("click on close button");
		Thread.sleep(5000);
		
//---------------------single disconnect plan starts from here--------------------------	
		
		for (int i = 1; i <= rowCount; i++) {
			
			System.out.println("row count is "+rowCount);
			waitTillElementIsVisible(enterCustomerSerialNumber);
			String data = Excel.getCellValue(Datapath, "Sheet1", i, 0);
			System.out.println(data);
			String custId = data;

			if (custId.contains(".")) {
				System.out.println("contains decimal points->true");
				String s = data;
				long convert = Double.valueOf(s).longValue();
				String num = Long.toString(convert);
				System.out.println(num);
				enterCustomerSerialNumber.sendKeys(num);
			} else {
				System.out.println("contains decimal points ->False");
				enterCustomerSerialNumber.sendKeys(data);
			}
			System.out.println("clicking on search button");
			waitTillElementIsVisible(clickToSearchCustomer);
			
			clickToSearchCustomer.click();
			System.out.println("before if");
			Thread.sleep(20000);

			if (invalidCust.isDisplayed()) {
				log.info("inside 1st IF");
				waitTillElementIsVisible(errorMessage);
				System.out.println(errorMessage.getText());
				invalidCust.click();
				enterCustomerSerialNumber.clear();
				Thread.sleep(5000);
				continue;
			} else if (custName.isDisplayed()){
				log.info("Ïnside else");
				System.out.println(custName.getText());
				if (checkBox.isEnabled()){
					checkBox.click();
					clickToConfirmSelect.click();
					waitTillElementIsVisible(packageName);
					System.out.println(
							"Selected Package Summary's ProductName is " + packageName.getText() + " Contract Id is "
									+ contractId.getText() + " and Expiry Date is On " + expiryDate.getText());

					clickToDisconnectThePlan.click();

					if (ProductId.isDisplayed()) {
						waitTillElementIsVisible(ProductId);

						System.out.println("Product Id is " + ProductId.getText() + " ProductName is "
								+ productName.getText() + " Status Of The Plan is " + statusOfPlan.getText()
								+ " ErrorMsg is " + error.getText() + " ErrorCode is " + errorCode.getText());
					} else {
						WebElement element = driver.findElement(
								By.xpath("//div[@class='alert alert-danger top-error text-center fixed-top']"));
						waitTillElementIsVisible(element);
						System.out.println(element.getText());
					}
				}
			}
			break;
		}
	}
}