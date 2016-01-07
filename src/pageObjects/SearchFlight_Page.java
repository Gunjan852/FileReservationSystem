package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchFlight_Page {

	static WebDriver driver = BrainofFramework.getinstance();


	static WebElement element;
	
	
	public static String searchFlightTitle()
	{
		//element=driver.findElement(By.xpath("//title"));
		
		//String searchflight=element.getText();
		
		String searchflight=driver.getTitle();
		
		//System.out.println(searchflight);
		
		return searchflight;
		
	}
	
	public static WebElement deperatureFrom()
	{
		element=driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		return element;
		
	}
	public static WebElement arrivingIn()
	{
		element=driver.findElement(By.xpath("//select[@name='toPort']"));
		
		return element;
		
	}
	
	public static WebElement serviceClass()
	{
		element=driver.findElement(By.xpath("//input[@type='radio' and @value='Business']"));
		
		return element;
		
	}
	
	public static WebElement searchFlight()
	{
		element=driver.findElement(By.xpath("//input[@name='findFlights']"));
		
		return element;
		
	}
	
	
	
}
