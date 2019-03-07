package com.constant.lcoportal.imcl;



import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.lcoportal.pages.HomePage;
import com.lcoportal.pages.LoginPage;

import generics.Property;

@Listeners(CustomListener.class)
public class BaseTest implements AutomationConstants{
	public Logger log;
	public static WebDriver driver;
	
	
	public static String url;
	public static String un;
	public static String pw;
	public static String homePageURL;
	public static String loginPageURL;
	public static long timeout;
	
	public static boolean loginRequired=true;
	public static boolean logoutRequired=true;
	
	public BaseTest()
	{
		log=Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
	}
	
	/*@BeforeSuite
	public void initFrameWork()
	{
		log.info("initializing FrameWork");
		
		url=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "URL");
		un=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "UN");
		pw=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "PW");
		homePageURL=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "HOME");
		loginPageURL=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "LOGIN");
		timeout=Long.parseLong(Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "IMPLICIT"));
	}*/
	
	@AfterSuite(alwaysRun=true)
	public void closeFrameWork()
	{
				postCondition();
		log.info("Closing FrameWork");
		
	}
		
	
	
	@Parameters({"browser"})
	
	@BeforeSuite
	public void initApplication(@Optional("chrome") String  browser) throws Exception
	{
		log.info("I'm here");
		//initFrameWork();
		
		url=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "URL");
		un=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "UN");
		pw=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "PW");
		homePageURL=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "HOME");
		loginPageURL=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "LOGIN");
		timeout=Long.parseLong(Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "IMPLICIT"));
		
		
		log.info("Browser:"+browser);
		if(browser.equals("chrome")){
			System.setProperty(CHROME_KEY,DRIVER_PATH+CHROME_FILE);
			
			
			
			String downloadFilepath = "D:\\IMCL_REPORTS";
			
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 2);
			chromePrefs.put("download.default_directory", downloadFilepath);
			ChromeOptions options = new ChromeOptions();
			
			HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
			options.setExperimentalOption("prefs", chromePrefs);
			options.addArguments("--test-type");
			options.addArguments("--disable-extensions");
			
			
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			//WebDriver driver = new ChromeDriver(cap);
			
			
			driver=new ChromeDriver(cap);
						
		}
		else
		{
			System.setProperty(GECKO_KEY,DRIVER_PATH+GECKO_FILE);
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		log.info("TimeOut:"+timeout);
		driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
		
		
		preCondition();

				
	}
	
	

	//@AfterClass
	public void cleanApplication()
	{
		
		log.info("'cleaning the application");
		driver.quit();
	}
	
	//@BeforeMethod
	public void preCondition() throws Exception
	{
		
		if(loginRequired){
			log.info("implicit login");
			driver.navigate().to(url);
			LoginPage loginPage=new LoginPage();
			loginPage.setUserName(un);
			loginPage.setPassword(pw);
			
			loginPage.clickToProceed();
			Thread.sleep(2000);
			
			if(driver.getTitle().contains("LCO Alert"))
			{
				System.out.println("Procced further!");
			}
			
		//if(driver.findElement(By.xpath("//form[@id='login']//p[@class='error']")).isDisplayed())
				
			else
	     	{
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='login-form well']//a")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Enter FRCODE']")).sendKeys("fr4627");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
			
			Thread.sleep(30000);
			driver.findElement(By.xpath("//button[@class='btn btn-lg btn-info']")).click();
			//driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("");
			
			Thread.sleep(30000);
			//driver.findElement(By.xpath("//input[@id='oldpassword']")).sendKeys("ow9qr346");
			
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='newpassword']")).sendKeys("test@123");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("test@123");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-lg btn-info']")).click();
			
			Thread.sleep(2000);
			
			String string = driver.findElement(By.xpath("//form[@id='changepassword']//p")).getText();
			
			System.out.println(string);
			Thread.sleep(2000);
		    }
		}
		    
		
		 else{
			log.warn("explicit login required");
		}
		loginRequired=true;
	}
	
	//@AfterMethod
	public void postCondition()
	{
		if(logoutRequired)
		{
			log.info("implicit logout");
			HomePage homePage=new HomePage();
			
			log.info("I'm clicking on logout button");
			homePage.clickLogout();
			
			log.info("Driver is quiting the browser");
			driver.quit();
			
			//homePage.verifyURLhas(loginPageURL);
		}
		
		logoutRequired=true;
		
	}
}