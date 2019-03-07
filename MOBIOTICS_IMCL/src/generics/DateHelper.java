package generics;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lcoportal.pages.BasePage;

public class DateHelper extends BasePage{
	
	private String date1 = "//div[(contains(@class,'bfh-datepicker startdate open'))]//td[text()='";
	private String date2 = "']";
 
	private String month1="//div[(contains(@class,'bfh-datepicker startdate open'))]//table//tr[(contains(@class,'months-header'))]"
			               + "//span[contains(text(),'";
    private String month2 = "')]";
	
    private String previousMonth = "//div[(contains(@class,'bfh-datepicker startdate open'))]//table//th[(contains(@class,'month'))]"
    		+ "/a[contains(@class,'previous')]";
    
	public void selectDate(String date)
	{
		
		driver.findElement(By.xpath(date1 + date + date2)).click();
	}

	
	private boolean isElementPresent(String month)
	{
		try {
			return driver.findElement(By.xpath(month1 + month + month2)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public void selectMonth(String month)
	{
		 new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated
				   (By.xpath("//span[@class='input-group-addon']")));
		driver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
		
		if(isElementPresent(month)){
			driver.findElement(By.xpath(month1 + month + month2)).click();
		}
		else
		{
			for (int i = 1; i <= 12; i++) 
			{
				driver.findElement(By.xpath(previousMonth)).click();
				if(isElementPresent(month)){
					driver.findElement(By.xpath(month1 + month + month2)).click();
					break;
				}				
			}
		}		
	}
	
	
}
