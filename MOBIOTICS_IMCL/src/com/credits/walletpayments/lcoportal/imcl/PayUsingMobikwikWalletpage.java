package com.credits.walletpayments.lcoportal.imcl;



    import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.credits.cardpayments.lcoportal.imcl.Credits_AddCreditsFromCards;
	import com.lcoportal.pages.BasePage;

	public class PayUsingMobikwikWalletpage extends BasePage
	{
	    public PayUsingMobikwikWalletpage() {
			PageFactory.initElements(driver, this);
		}	


	    @FindBy(xpath=".//*[@id='signinlyr']/div/div[1]/div[3]/p/label/i")
	    private WebElement clickForOTP;

	    @FindBy(xpath="//input[@id='signinFrm']")
	    private WebElement clickOnSubmitButton;
	    
	    @FindBy(xpath="//input[@id='verifyotpid']")
	    private WebElement clickToVerfyOTP;
	    
	    @FindBy(xpath="//input[@class='btn btn-primary big dpBlk']")
	    private WebElement clickOnConfirmationButton;
	    
	    @FindBy(xpath="//input[@id='d954841a591abe72b9537a34be87e78efdb09bbbf52e4ce1f6be63227d1dfc32cvv']")
	    private WebElement enterCVV;
	    
	    @FindBy(xpath="//input[@id='paymentdivbutton']")
	    private WebElement clickOnPayNow;
	    
	    @FindBy(xpath="//div[@class='alert alert-danger']//span")
	    private WebElement getErrorText;


	  
	  public CardConfirmationPage MobikiwkPaymentGateWayPage() throws InterruptedException 
	   {
		  
		  log.info("did i clicked here");
		  waitTillElementIsVisible(clickForOTP);
		 clickForOTP.click();
		 
		 //Thread.sleep(10000);
		 waitTillElementIsVisible(clickOnSubmitButton);
		 clickOnSubmitButton.click();
		 
		 
		 Thread.sleep(20000);
		 waitTillElementIsVisible(clickToVerfyOTP);
		 clickToVerfyOTP.click();
		 
		 waitTillElementIsVisible(clickOnConfirmationButton);
		 clickOnConfirmationButton.click();
		 
		 return new CardConfirmationPage();
		 
		/* driver.findElement(By.xpath("//input[@id='d954841a591abe72b9537a34be87e78efdb09bbbf52e4ce1f6be63227d1dfc32cvv']")).sendKeys("568");
		 //waitTillElementIsVisible(enterCVV);
		 //enterCVV.sendKeys("568");
		 
		 clickOnPayNow.click();
		 
		 if(getErrorText.isDisplayed())
		 {
		 
		 String getText = getErrorText.getText();		 
		 System.out.println(getText);
		 }
		 else{
	   
	   WebElement getThisMsg = driver.findElement(By.xpath("//div[@class='container-fluid plan-container plan-box']//h2"));
		System.out.println(getThisMsg.getText());
		driver.findElement(By.linkText("View Balance")).click();
		//return new Credits_AddCreditsFromCards();
	    }*/
	  }
	}


