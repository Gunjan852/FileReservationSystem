package appModules;

import org.testng.Assert;

import pageObjects.SearchFlight_Page;
import pageObjects.SelectFlight_Page;
import pageObjects.UtilityMethods;

public class SearchFlight_Action {

	public static void validateTitle(){
		
		String searchtitle=SearchFlight_Page.searchFlightTitle();
		try{
		
		Assert.assertEquals(searchtitle,"Find a Flight: Mercury Tours:");
		
		
		System.out.println("Search Flight page is displayed");
		
		//UtilityMethods.closeAlerts();
		
		}
		catch(Exception e){
			
			System.out.println("Search Flight page is not displayed");	
			
			
		}
		
	}
	
	
	public static void validateSearch(String fromPlace,String toPlace){
		
		UtilityMethods.search(SearchFlight_Page.deperatureFrom(), fromPlace);
		
		UtilityMethods.search(SearchFlight_Page.arrivingIn(),toPlace);
		
		//UtilityMethods.search(SearchFlight_Page.serviceClass(), "Business class");
		
		SearchFlight_Page.serviceClass().click();
		
		SearchFlight_Page.searchFlight().click();
		
		//SelectFlight_Action.validateSearchText(fromPlace, toPlace);
		
		
	}
	

	
}
