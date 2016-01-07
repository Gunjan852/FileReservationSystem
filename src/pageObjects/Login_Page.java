package pageObjects;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page /*extends BrainofFramework*/{
	
	static WebElement element;
	static WebDriver driver = BrainofFramework.getinstance();
	public Login_Page(WebDriver driver) {
		//super(driver);
		
	}

	public static WebElement userName()
	{
		WebDriver driver = BrainofFramework.getinstance();
		element=driver.findElement(By.xpath("//input[@name='userName']"));
		
		return element;
		
	}
	
	public static WebElement password()
	{
		WebDriver driver = BrainofFramework.getinstance();
		element=driver.findElement(By.xpath("//input[@name='password']"));
		
		return element;
		
	}
	
	public static WebElement  date()
	{
		By currentdate=By.xpath("//form[@name='home']/table//font[@face='Arial, Helvetica, sans-serif, Verdana']/b");
		
		element=driver.findElement(currentdate);
		
		return element;
		
	}
	
	public static By imageAruba()
	{
		By image =By.xpath("//img[@alt='Featured Destination: Aruba']");
		element=driver.findElement(By.xpath("//img[@alt='Featured Destination: Aruba']"));
		
		return image;
		
	}
	
	public static WebElement signIn()
	{
		
		element=driver.findElement(By.xpath("//input[@name='login']"));
		
		return element;
		
	}

}
