package testcase;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import appModules.BookFlight_Action;
import appModules.Login_Action;
import appModules.SearchFlight_Action;
import appModules.SelectFlight_Action;
import appModules.SignOn_Action;
import pageObjects.BaseClass;
import pageObjects.BrainofFramework;
import pageObjects.Login_Page;
import pageObjects.SearchFlight_Page;
import pageObjects.SelectFlight_Page;
import pageObjects.UtilityMethods;

public class FlightReservation {

WebDriver driver;
	

@BeforeClass
public  void beforetest(){
	
	
	
	 driver = BrainofFramework.getinstance();
	
	//BaseClass.openConnection();
	
	BaseClass.openFlightReservationSystem();
	
	UtilityMethods.implicitWait();
	
	long id = Thread.currentThread().getId();
    System.out.println("Before test id is: " + id);
	
}
	
@DataProvider(name="login")
public Object[][] getDataFromDataProvider(){
	
	return new Object[][]{
			
			{"gunjan","sapient123"},
			{"vikrant","sapient123"},
			
			
	};
	
}


	
@Test(dataProvider="login")

public void test(String username,String password){
	
	Login_Action.execute();
	Login_Page.userName().sendKeys(username);
	
	Login_Page.password().sendKeys(password);
	
	Login_Page.signIn().click();
	
	UtilityMethods.implicitWait();
	
	
	
	if(username.equals("gunjan")){
	SignOn_Action.action();
	
	SignOn_Action.navigate();
	
	}
	else{
		
		SearchFlight_Action.validateTitle();
	}
	
	long id = Thread.currentThread().getId();
    System.out.println("In test id is: " + id);
	
	
	
	/*Login_Action.login(ReadFile.propread().getProperty("username1"), ReadFile.propread().getProperty("password1"));
	
	UtilityMethods.implicitWait();
	
	SignOn_Action.action();
	
	SignOn_Action.navigate();
	
	Login_Action.login(ReadFile.propread().getProperty("username"), ReadFile.propread().getProperty("password"));
	
	UtilityMethods.implicitWait();
	
	SearchFlight_Action.execute();*/
	
}


@SuppressWarnings("deprecation")
@Test(dependsOnMethods = { "test" })

public void searchFlightTest(){
	
	
	System.out.println("In Search flight Test");
	
	List<WebElement> list=UtilityMethods.selectDropDown(SearchFlight_Page.deperatureFrom());
	
	System.out.println(list.size());
	
	/*for(WebElement w:list){
	 
	  System.out.println(w.getText());
	  
	 country=w.getText();
	  
	  }*/
  try{
	  boolean flag=false;
	  for(int i=0;i<list.size();i++){
		  
		  if(list.get(i).getText().equalsIgnoreCase("India")){
			  flag=true;
		  }
	  }
	  Assert.assertFalse(flag);	  
	  
	  System.out.println("Country India is present");
	 
  }

  catch(Exception e){
	  
	  System.out.println("Country India is not present");  
  }
	
}

@DataProvider(name="searchDestination")
public Object[][] dataforSearch(){
	
	return new Object[][]{
			
			{"Paris","Portland"},	
			
	};
	
}


@Test(dependsOnMethods={"searchFlightTest"},dataProvider="searchDestination")


public void  searchForFlightReservation(String fromPlace,String toPlace){
	
	boolean flag;
	
	SearchFlight_Action.validateSearch(fromPlace,toPlace);
	
//	SelectFlight_Action.validateSearchText(fromPlace, toPlace);
	
	UtilityMethods.implicitWait();
	
	List<WebElement> listofText=SelectFlight_Page.searchValidationText();
		
	for(WebElement text:listofText){
		
		flag=false;
		
		System.out.println(text.getText());
		if(text.getText().contains(fromPlace) && text.getText().contains(toPlace)){
			
			flag=true;
			
			
		}
	
		Assert.assertTrue(flag);
	}
	
	
	
}
	

@Test(dependsOnMethods={"searchForFlightReservation"})

public void sortedPrice(){
	
	
SelectFlight_Action.validateFlightDataonPrice();


	
}

@Test(dependsOnMethods={"sortedPrice"})

public void validateSelectedFlight(){
	
	
SelectFlight_Action.selectedFlight();



	
}

@Test(dependsOnMethods={"validateSelectedFlight"})

public void bookFlight(){
	
	
BookFlight_Action.enterBookingDetails();

UtilityMethods.implicitWait();

BookFlight_Action.validateBooking();


	
}


@AfterClass	
public void aftertest(){
	
//BaseClass.closeConnection();
	
long id = Thread.currentThread().getId();
System.out.println("After test id is: " + id);
}
	


}





