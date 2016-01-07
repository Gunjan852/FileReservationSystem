package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrainofFramework {

	private static WebDriver driver;
	
	public static WebDriver getinstance(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gunjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		if(driver==null){
			/*synchronized (BrainofFramework.class) {
				if(driver==null){
			*/		driver =new ChromeDriver();
				}
			/*}
		}*/
		return driver;
	}
	
	
	private  BrainofFramework(WebDriver driver) {
	
		BrainofFramework.driver=driver;
	}
		
		
	
	
	
	
}
