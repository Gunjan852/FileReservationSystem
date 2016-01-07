package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;

public class SignOn_Page {

	static WebDriver driver = BrainofFramework.getinstance();


	static WebElement element;
	
	static Navigation navigation;
	
	public static String signOnTitle()
	{
		//element=driver.findElement(By.xpath("//title[text()='Sign-on: Mercury Tours']"));
		
		String signOnTitle=driver.getTitle();
		
		return signOnTitle;
		
	}
	

	public static WebElement userName()
	{
		
		element=driver.findElement(By.xpath("//input[@name='userName']"));
		
		return element;
		
	}
	
	public static WebElement password()
	{
		
		element=driver.findElement(By.xpath("//input[@name='password']"));
		
		return element;
		
	}
	
	public static WebElement signOn()
	{
		
		element=driver.findElement(By.xpath("//input[@name='login']"));
		
		return element;
		
		
		
	}
	
	
	public static Navigation navigateBack(){
		
		navigation=driver.navigate();
	
		return navigation;
	}
	
}
