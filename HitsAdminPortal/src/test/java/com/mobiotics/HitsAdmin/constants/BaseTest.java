package com.mobiotics.HitsAdmin.constants;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mobiotics.HitsAdmin.commonpages.HomePage;
import com.mobiotics.HitsAdmin.commonpages.LoginPage;

import generics.Property;

@Listeners(CustomListener.class)
public class BaseTest implements AutomationConstants {
	public Logger log;
	public static WebDriver driver;

	public static String url;
	public static String un;
	public static String pw;
	public static String psphrs;
	public static String homePageURL;
	public static String loginPageURL;
	public static long timeout;

	public static boolean loginRequired = true;
	public static boolean logoutRequired = true;

	ExtentReports extent;
	ExtentTest logger;
	// WebDriver driver;

	public BaseTest() {
		log = LogManager.getLogger(this.getClass());
		LogManager.getRootLogger().isEnabled(Level.INFO);
	}

	public void initFrameWork() {
		log.info("initializing FrameWork");

		url = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "URL");
		un = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "1111");
		pw = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "test");
		psphrs = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "indigital123");
		homePageURL = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "HOME");
		loginPageURL = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
				"http://35.154.3.219/hits_sant/adminui/adminlogin.php");
		timeout = Long.parseLong(Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "IMPLICIT"));
	}

	@Parameters({ "browser" })
	@BeforeSuite
	public void initApplication(@Optional("chrome") String browser) throws Exception {
		initFrameWork();

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/Admin_TestResults.html");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		logger = extent.createTest("LoginTest");

		log.info("Browser:" + browser);
		if (browser.equals("chrome")) {
			System.setProperty(CHROME_KEY, DRIVER_PATH + CHROME_FILE);

			log.info("inside if");
			String downloadFilepath = "./Downloads/";

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

			ChromeDriverService service = new ChromeDriverService.Builder()
					.usingDriverExecutable(new File(DRIVER_PATH + CHROME_FILE)).build();
			driver = new ChromeDriver(service, options);

		} else {
			System.setProperty(GECKO_KEY, DRIVER_PATH + GECKO_FILE);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		log.info("TimeOut:" + timeout);
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		preCondition();
	}

	public void cleanApplication() {
		log.info("'cleaning the application");
		driver.quit();
	}

	public void waitTillElementIsVisible(WebElement element) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
	}

	public void preCondition() throws Exception {

		if (loginRequired) {
			log.info("implicit login");
			LoginPage loginPage = new LoginPage();
			loginPage.setUserName(un);
			loginPage.setPassword(pw);
			loginPage.setPassphrase(psphrs);

			loginPage.clickToProceed();
			Thread.sleep(25000);
			String title = driver.getTitle();

			System.out.println(title);
			if (title.contains("Dashboard")) {
				log.info(" in 1st if ");
				System.out.println("Dashboard");
			}

			else {
				// log.info("I'm reseting the password");
				//
				// driver.findElement(By.xpath("//div[@class='well
				// loginform']//a[1]")).click();
				// Thread.sleep(2000);
				//
				// driver.findElement(By.xpath("//input[@placeholder='Enter
				// Username']")).sendKeys("LCO200000955.01");
				// Thread.sleep(2000);
				//
				//
				// driver.findElement(By.xpath("//button[@class='btn
				// btn-danger']")).click();
				// Thread.sleep(5000);
				//
				// driver.findElement(By.xpath("//input[@placeholder='User
				// Name']")).sendKeys("LCO200000955.01");
				// Thread.sleep(40000);
				//
				// driver.findElement(By.xpath("//button[@class='btn btn-lg
				// btn-info']")).click();
				// Thread.sleep(5000);
				//
				// driver.findElement(By.xpath("//input[@id='newpassword']")).sendKeys("Grant@123");
				// Thread.sleep(2000);
				//
				// driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Grant@123");
				// Thread.sleep(2000);
				//
				// driver.findElement(By.xpath("//button[@class='btn btn-lg
				// btn-info']")).click();
				// Thread.sleep(2000);
				//
				//
				// String string =
				// driver.findElement(By.xpath("//form[@id='changepassword']//p")).getText();
				// System.out.println(string);
				// Thread.sleep(2000);
			}
		} else {
			log.warn("explicit login required");
		}
		loginRequired = true;
	}

	@AfterSuite(alwaysRun = true)
	public void closeFrameWork(ITestResult result) throws IOException {

		if (logoutRequired) {
			log.info("implicit logout");
			HomePage homePage = new HomePage();

			log.info("I'm clicking on logout button");
			homePage.clickLogout();

			log.info("Driver is quiting the browser");
//			if (result.getStatus() == ITestResult.FAILURE) {
//				String temp = Utility.getScreenshot(driver);
//				logger.fail(result.getThrowable().getMessage(),
//						MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
//			}
			extent.flush();
			driver.quit();
		}
		logoutRequired = true;

	}
}