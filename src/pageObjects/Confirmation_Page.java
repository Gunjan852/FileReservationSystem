package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Confirmation_Page {
	
	static WebDriver driver = BrainofFramework.getinstance();
	static WebElement element;

	public static WebElement confirmationTitle()
	{
		element=driver.findElement(By.xpath("//title[text()='Flight Confirmation: Mercury Tours']"));
		
		return element;
		
	}
	public static WebElement confirmationNumber()
	{
		element=driver.findElement(By.xpath("//*[@class='frame_header_info']/table//font[contains(text(),'Flight')]"));
		
		return element;
		
	}
	
	public static WebElement bookedFlightDetails()
	{
		element=driver.findElement(By.xpath("//*[@class='frame_header_info']//*[contains(text(),'FlightConfirmation')]"));
		
		return element;
		
	}
	public static WebElement signOff()
	{
		element=driver.findElement(By.xpath("//*[@class='mouseOut']/a[@href='mercurysignoff.php']"));
		
		return element;
		
	}
	
}
