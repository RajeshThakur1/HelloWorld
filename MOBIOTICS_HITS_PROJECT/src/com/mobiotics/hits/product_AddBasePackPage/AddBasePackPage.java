package com.mobiotics.hits.product_AddBasePackPage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.hits.commompages.BasePage;

import generics.Excel;

public class AddBasePackPage extends BasePage
{
  public AddBasePackPage() 
  {
	PageFactory.initElements(driver, this);
  }
  
  
  @FindBy(xpath="//input[@name='customerid']")
  private WebElement enterCustomerIdToSearch;
  
  @FindBy(xpath="//button[@id='customerid']")
  private WebElement clickToSearchCustomer;
  
  @FindBy(xpath="//div[@class='productsubscription table-responsive']//tbody//tr//td[6]")
  private List<WebElement> radioButtonToActivateBasePack;
  
  @FindBy(xpath="//button[@id='confirm-subscribe']")
  private WebElement clickOnConfirmButtonToActivateBasePack;
  
  @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//tr[1]//td[1]")
  private WebElement productName;
  
  @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//tr[1]//td[2]")
  private WebElement priceOfThePlan;
  
  @FindBy(xpath="//div[@class='col-lg-12 col-sm-12 col-xs-12 col-md-12']//tbody//tr[1]//td[3]")
  private WebElement expiryDateOfThePlan;
  
  @FindBy(xpath="//button[@id='confirmcart']")
  private WebElement clickToSubscribeBasePack;
  
  @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//tr//td[1]")
  private WebElement productIdAfterClickingTheConfirm;
  
  @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//tr//td[3]")
  private WebElement statusOfThePlan;
  
  @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//tr//td[4]")
  private WebElement errorMsg;
  
  @FindBy(xpath="//div[@class='productreport table-responsive']//tbody//tr//td[5]")
  private WebElement errorCodeForTheFailure;
  
  @FindBy(xpath="//div[@class='productsubscription table-responsive']//td")
  private WebElement errorMessage;
  
  @FindBy(xpath=".//*[@id='mypopmessage']/div/div/div/div[2]/p")
  private WebElement basePackError;
  
  @FindBy(xpath=".//*[@id='click-confirm']") 
  private WebElement closeButton;
  
  @FindBy(xpath="//div[@id='mypopmessage']/div/div/div/div[1]/h4")
  private WebElement errorPop;
  
  @FindBy(id="customerName")
  private WebElement custName;
  
  @FindBy(id="bulkaddbasepackmodal")
  private WebElement bulkbtn;
    
  @FindBy(xpath="//input[@type='file']")
  private WebElement fileupload;

  @FindBy(id="upload")
  private WebElement upload;
  
  @FindBy(xpath="//div[@id='bulkbasepack']//label[2]")
  private WebElement uploadmsg;
  
  @FindBy(id="submit")
  private WebElement bulksubmitbtn;
  
  @FindBy(xpath="//div[@id='bulkbasepack']//p[1]")
  private WebElement otherError;
  
  @FindBy(xpath="//div[@id='bulkbasepack']//p[2]")
  private WebElement afterbulkupload;
  
  @FindBy(id="close")
  private WebElement clickclosebtn;
    
private String Datapath = "C:\\users\\sande\\Desktop\\Copy of Hits_Data_sheet.xlsx";
private int rowCount = Excel.getRowCount(Datapath, "Sheet1");
private String bulkfile = "C:\\Users\\sande\\Desktop\\AutoITForHITS\\addbasepack.exe";


	public void addBasePack() throws InterruptedException, IOException {
		
		waitTillElementIsVisible(bulkbtn);
    	bulkbtn.click();
    	log.info("click on download button"); 
    	Thread.sleep(5000);
    	log.info("Actions class");
    	Actions action = new Actions(driver);
    	action.moveToElement(fileupload);
    	action.click().build().perform();
    	log.info("clicked on upload btn");
    	Thread.sleep(10000);
    	
    	log.info("String stored");
    	Runtime.getRuntime().exec(bulkfile);
    	log.info("executed exe file");
    	
    	Thread.sleep(10000);
    	waitTillElementIsVisible(upload);
    	upload.click();
    	log.info("clicked on upload button");
    	
    	
    	waitTillElementIsVisible(uploadmsg);

    	Thread.sleep(15000);
    	if(uploadmsg.getText().contentEquals("Upload success")){
    		
    		log.info("other error text is displayed");
    		
    		if(otherError.isDisplayed()){
    			
    			waitTillElementIsVisible(otherError);
    			System.out.println(otherError.getText());
       		}
    		else{
    	    	log.info("inside 1st else loop if upload success");
    	waitTillElementIsVisible(uploadmsg);
    	System.out.println(uploadmsg.getText());
    	log.info("got the error text");
    	
    	Thread.sleep(15000);
    	waitTillElementIsVisible(bulksubmitbtn);
    	bulksubmitbtn.click();
    	log.info("clicked on the submit button");
    	
    	Thread.sleep(5000); 
    	waitTillElementIsVisible(afterbulkupload);
    	System.out.println(afterbulkupload.getText());
    	log.info("got the success text");
    	}
    	}
    	else{
    		waitTillElementIsVisible(uploadmsg);
    		System.out.println("There is something wrong in the Excel"+ uploadmsg.getText());
    	}
    	
    	Thread.sleep(5000);
    	waitTillElementIsVisible(clickclosebtn);
    	clickclosebtn.click();
    	log.info("click on close button");    	
    	Thread.sleep(5000);

//---------------------single add basepack starts from here---------------------------
		
		for (int i = 1; i <= rowCount; i++) {
			waitTillElementIsVisible(enterCustomerIdToSearch);
			String data = Excel.getCellValue(Datapath, "Sheet1", i, 0);
			
			String custId = data;

			  if (custId.contains(".")) {
					System.out.println("contains decimal points->true");
					String s = data;
					long convert = Double.valueOf(s).longValue();
					String num = Long.toString(convert);
					System.out.println(num);
					enterCustomerIdToSearch.sendKeys(num);
				} else {
					System.out.println("False");
					enterCustomerIdToSearch.sendKeys(data);
				}
		  waitTillElementIsVisible(clickToSearchCustomer);
		  clickToSearchCustomer.click();
			
			
			
//			enterCustomerIdToSearch.sendKeys(data);
//			waitTillElementIsVisible(clickToSearchCustomer);
//			clickToSearchCustomer.click();
//			log.info("Inside for and before IF");
			
			Thread.sleep(20000);

			if (closeButton.isDisplayed()) {
				log.info("I'm hear");
				waitTillElementIsVisible(basePackError);
				System.out.println(basePackError.getText());
				closeButton.click();
				enterCustomerIdToSearch.clear();
				Thread.sleep(10000);
				continue;
			} else {
				
				log.info("ïnside else");
				WebElement customer = driver.findElement(By.xpath("//span[@id='customerName']"));
				waitTillElementIsVisible(customer);
				log.info("Else part");
				List<WebElement> list = driver.findElements(By.xpath("//input[@name='productlist']"));
				list.size();
				if (list.size() > 0) {
					log.info("im here 1st");
					List<WebElement> list1 = radioButtonToActivateBasePack;
					for (WebElement element : list1) {
						if (element.isEnabled()) {
							element.click();
							clickOnConfirmButtonToActivateBasePack.click();
							waitTillElementIsVisible(productName);
							System.out.println(" Product Name is : " + productName.getText() + " Price Of The Plan : "
									+ priceOfThePlan.getText() + " Expiry Date Is On : "
									+ expiryDateOfThePlan.getText());
							waitTillElementIsVisible(clickToSubscribeBasePack);
							clickToSubscribeBasePack.click();
							waitTillElementIsVisible(productIdAfterClickingTheConfirm);
							waitTillElementIsVisible(statusOfThePlan);
							waitTillElementIsVisible(errorMsg);
							waitTillElementIsVisible(errorCodeForTheFailure);
							System.out.println("Product Id is : " + productIdAfterClickingTheConfirm.getText()
									+ " Status Of The Plan : " + statusOfThePlan.getText() + " Reason is : "
									+ errorMsg.getText() + " Code is : " + errorCodeForTheFailure.getText());
						}
						break;
					}
				}
			}break;
		}
	}
}