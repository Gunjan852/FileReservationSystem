package pageObjects;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFlight_Page  {
	
	
	static WebDriver driver = BrainofFramework.getinstance();

	static WebElement element;
	
	static List<WebElement> elements;

	public static WebElement selectFlightTitle()
	{
		element=driver.findElement(By.xpath("//title[text()='Select a Flight: Mercury Tours']"));
		
		return element;
		
	}
	
	public static List<WebElement> departPrice()
	{
		elements=driver.findElements(By.xpath("//form/table[1]/tbody//*[@class='data_verb_xcols']//b"));
		
		return elements;
		
	}
	public static List<WebElement> returnPrice()
	{
		elements=driver.findElements(By.xpath("//form/table[2]/tbody//*[@class='data_verb_xcols']//b"));
		
		return elements;
		
	}
	
	public static List<WebElement> searchValidationText(){
		
		elements = driver.findElements(By.xpath("//*[@class='title' and @align='LEFT']/b/font"));
		
		return elements;
		
	}
	
	public static List<WebElement> backgroundColourCheck(){
		
		elements = driver.findElements(By.xpath("//*[@class='frame_header_info']"));
		
		return elements;
		
	}
	
	public static WebElement Continue()
	{
		element=driver.findElement(By.xpath("//*[@name='reserveFlights']"));
		
		return element;
		
	}
	
	public static List<WebElement> selectedFlight()
	{
		
		elements = driver.findElements(By.xpath("//*[@type='radio' and @checked='']"));
		
		return elements;
		
	}
	
	
}
