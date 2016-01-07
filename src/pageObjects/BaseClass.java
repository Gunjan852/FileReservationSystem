package pageObjects;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ReadFile;


public class BaseClass {

	static WebDriver driver = BrainofFramework.getinstance();
	
	/*public static void openconnection(){
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gunjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	 driver =new ChromeDriver();
	
	//driver.get("http://newtours.demoaut.com/");
	
	}*/
	
	public static void openFlightReservationSystem(){
		
		BrainofFramework.getinstance().get(ReadFile.propread().getProperty("url"));
		
	}
	public static void closeConnection(){
		
		BrainofFramework.getinstance().quit();
		
		}
		

	
}
