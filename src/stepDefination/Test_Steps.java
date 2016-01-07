package stepDefination;

import org.openqa.selenium.WebDriver;

import appModules.Confirmation_Action;
import appModules.Login_Action;
import appModules.SearchFlight_Action;
import appModules.SignOn_Action;
import pageObjects.BaseClass;
import pageObjects.BrainofFramework;
import pageObjects.UtilityMethods;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {

	WebDriver driver = BrainofFramework.getinstance();
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    
		//BaseClass.openconnection();	
		
		BaseClass.openFlightReservationSystem();
		
		UtilityMethods.implicitWait();

	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		
		Login_Action.execute();

	  
	}

	
	@Then("^User successfully logged in and FlightFinder page is displayed$")
	public void user_successfully_logged_in_and_FlightFinder_page_is_displayed() throws Throwable {
		
		UtilityMethods.implicitWait();
		
		SearchFlight_Action.validateTitle();
		
		System.out.println("Login successfully");
	   
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	   
		Confirmation_Action.execute();
		
		UtilityMethods.implicitWait();
		
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	   
		SignOn_Action.action();
		
		System.out.println("Logout Successfully");
	   
	}
	
	
	
}
