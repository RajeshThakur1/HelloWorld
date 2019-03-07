package trainingPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TrainingClass {
	
	//public static String driverpath = "C:\\seleniumProjects\\NewSeleniumWorkSpace\\MOBIOTICS_HITS_PROJECT\\Drivers\\";

	public static void main(String[] args) throws InterruptedException 
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sande\\Desktop\\DriversOnDesk\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("http://facebook.com");
		Thread.sleep(2000);
		
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
				
		driver.findElement(By.id("u_0_f")).sendKeys("Santhosh");
		driver.findElement(By.id("u_0_h")).sendKeys("Shivashankarappa");
		driver.findElement(By.name("reg_email__")).sendKeys("9880198001");
		driver.findElement(By.id("u_0_r")).sendKeys("mobiotics@321");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
        Select select = new Select(day);
        Select select2 = new Select(month);
        Select select3 = new Select(year);
        
        select.selectByValue("21");

        select2.selectByIndex(6);
        
        select3.selectByValue("1988");
        
       WebElement click = driver.findElement(By.id("u_0_7"));
        
        if(click.isSelected())
        {
        	System.out.println("is already clicked");
        }
        else {
        	click.click();
		}        
        
       /* String imageUrl = driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).getAttribute("scr");
        System.out.println("Image source path : \n"+ imageUrl);
        
        URL url = new URL(imageUrl);
        Image image = ImageIO.read(url);
        String s = new OCR().recognizeCharacters((RenderedImage) image);
        System.out.println("Text From Image : \n"+ s);
        System.out.println("Length of total text : \n"+ s.length());
        driver.quit();*/
        
        
		Thread.sleep(5000);
		driver.quit();
	}

}
