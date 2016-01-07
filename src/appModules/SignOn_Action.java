package appModules;


import org.testng.Assert;

import pageObjects.SignOn_Page;

public class SignOn_Action {

	public static void action(){
		
		try{
			if(SignOn_Page.signOnTitle().equals("Sign-on: Mercury Tours")){
		
			Assert.assertEquals(SignOn_Page.signOnTitle(),"Sign-on: Mercury Tours" );
			
			
			System.out.println("SignOn page is displayed");
			}	
			else if(SignOn_Page.signOnTitle().contains("404")){
				
				//assertTrue(SignOn_Page.signOnTitle().contains("404"));
				
				Assert.assertTrue(SignOn_Page.signOnTitle().contains("404"));
				
				System.out.println("Application is down");
				
			}
		}
		catch(Exception e){
			
			System.out.println("SignOn page is not displayed");
			
		}
		
		
		
		
	}
	public static void navigate(){
		
		SignOn_Page.navigateBack().back();
		
	}
	
	
}
