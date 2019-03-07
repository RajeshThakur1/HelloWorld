package generics;

import org.openqa.selenium.By;

import com.mobiotics.HitsAdmin.commonpages.BasePage;



public class DatePicker extends BasePage{
	
	private String date1 = "//div[(contains(@id,'startdatepicker'))]//td[text()='";
	
	private String date2 = "']";
 
	private String month1="//div[(contains(@id,'startdatepicker'))]//table//tr[(contains(@class,'months-header'))]"
			               + "//span[contains(text(),'";
	
    private String month2 = "')]";
    
    private String year1 = "//div[(contains(@id,'startdatepicker'))]//table//tr[(contains(@class,'months-header'))]"
    		                + "//span[contains(text(),'";
    
    private String year2 = "')]";
	
    private String previousMonth = "//div[(contains(@id,'startdatepicker'))]//table//th[(contains(@class,'month'))]"
    		+ "/a[contains(@class,'previous')]";
    
    private String previousYear ="//div[(contains(@id,'startdatepicker'))]//table//th[(contains(@class,'year'))]"
    	+ "//a[contains(@class,'previous')]";
    
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
	
	private boolean isYearElementPresent(String year)
	{
		try{
			return driver.findElement(By.xpath(year1 + year + year2)).isDisplayed();
		}catch(Exception e){
			return false;
		}
	}
	
	public void selectMonth(String month)
	{
		driver.findElement(By.xpath("(//span[@class='input-group-addon'])[1]")).click();
		driver.findElement(By.xpath("(//div[@id='startdatepicker']//span)[1]")).click();
		
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
	
	
	public void selectYear(String year) 
	{
		driver.findElement(By.xpath("(//span[@class='input-group-addon'])[1]")).click();
		if (isYearElementPresent(year)) 
		{
			System.out.println(driver.findElement(By.xpath(year1 + year + year2)).getText());
			System.out.println("Year is present here 1");
		} 
		else 
		{
			for (int i = 1/* 2020 */; i < 10/* 2010 */; i++) 
			{
				driver.findElement(By.xpath(previousYear)).click();
				if (isYearElementPresent(year)) 
				{
					System.out.println(driver.findElement(By.xpath(year1 + year + year2)).getText());
					System.out.println("Year is present here 2");
					break;
				}
			}
		}
	}
}