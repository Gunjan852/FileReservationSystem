package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookFlight_Page  {

	static WebDriver driver = BrainofFramework.getinstance();
	
	static WebElement element;
	
	static List<WebElement> elements;
	
	public static WebElement bookFlightTitle()
	{
		element=driver.findElement(By.xpath("//title[text()='Book a Flight: Mercury Tours']"));
		
		return element;
		
	}
	
	
	public static List<WebElement> bookingDetails()
	{
		elements=driver.findElements(By.xpath("//*[@class='frame_header_info']/font[@face='Arial, Helvetica, sans-serif, Verdana']"));
		
		
		return elements;
		
	}
	
	
	//*[@class='frame_header_info']/font[@face='Arial, Helvetica, sans-serif, Verdana']
	
	public static List<WebElement> flightName()
	{
		elements=driver.findElements(By.xpath("//font[@face='ARIAL']/b"));
		
		
		return elements;
		
	}
	
	public static List<WebElement> flightPrice()
	{
		elements=driver.findElements(By.xpath("//*[@class='data_center']/font[@face='ARIAL' and @size='-1']"));
		
		
		return elements;
		
	}
	
	
	public static List<WebElement> sourceToDestination()
	{
		elements=driver.findElements(By.xpath("//tbody//td/b/font[contains(text(),'to')]"));
		
		
		return elements;
		
	}
	
	public static WebElement firstName()
	{
		
		element=driver.findElement(By.xpath("//input[@name='passFirst0']"));
		
		return element;
		
	}
	
	public static WebElement lastName()
	{
		
		element=driver.findElement(By.xpath("//input[@name='passLast0']"));
		
		return element;
		
	}
	
	public static WebElement number()
	{
		
		element=driver.findElement(By.xpath("//input[@name='creditnumber']"));
		
		return element;
		
	}
	public static WebElement purchase()
	{
		
		element=driver.findElement(By.xpath("//input[@name='buyFlights']"));
		
		return element;
		
	}
}
