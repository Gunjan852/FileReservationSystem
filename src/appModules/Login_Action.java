package appModules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;





import pageObjects.Login_Page;
import pageObjects.UtilityMethods;
import utility.ReadFile;

public class Login_Action {

	public static void execute(){
		
		Date cur_dt= new Date();
		DateFormat dateFormat = new SimpleDateFormat("MMM d, YYYY");
		String strTodaysDate = dateFormat.format(cur_dt);
		System.out.println(strTodaysDate);
		
		try{
			
		if(strTodaysDate.equals(Login_Page.date().getText()))
		{
			
		System.out.println("Current date is displayed");
		
		}
		
		
		}
		catch(NoSuchElementException e){
			
			
			System.out.println("Current date is not displayed");
			
		}
		
		//Assert.assertEquals(strTodaysDate,Login_Page.date().getText());
		
		try{
		if(UtilityMethods.isElementPresent(Login_Page.imageAruba())){
			
			System.out.println("Image is displayed");
			
		}
	
		}
		catch(NoSuchElementException e){
			
			System.out.println("Image is not displayed");
		}
		
		
		
		
		
		
		
		
		
		
	}
	

	/*public static void login(String username,String password){
			
		Login_Page.userName().sendKeys(username);
		
		Login_Page.password().sendKeys(password);
		
		Login_Page.signIn().click();
		
		
		
		}*/
		
		
	}
	
	

