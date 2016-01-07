package appModules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.BookFlight_Page;
import pageObjects.SelectFlight_Page;
import pageObjects.UtilityMethods;
import testcase.FlightReservation;

public class SelectFlight_Action {

	static List<FlightDetails> details = new ArrayList<FlightDetails>();
	
	
	public static void validateSearchText(String fromPlace,String toPlace){
		
		boolean flag=false;
		
	List<WebElement> listofText=SelectFlight_Page.searchValidationText();
		
	for(WebElement text:listofText){
		
		if(text.getText().contains("fromPlace")&&text.getText().contains("toPlace")){
			
			flag=true;
			
			
		}
		Assert.assertTrue(flag);
		
	}
		
	}
	
	
	
	public static void validateFlightDataonPrice(){
		
		UtilityMethods.validateSortedPriceList(SelectFlight_Page.departPrice());	

		UtilityMethods.validateSortedPriceList(SelectFlight_Page.returnPrice());

		UtilityMethods.backgroundColorCheck(SelectFlight_Page.backgroundColourCheck(),"#003399");
		
			
	}		
		

	public static void selectedFlight(){
		
		List<WebElement> listOfSelectedFlights=SelectFlight_Page.selectedFlight();
		
		for(int i=0;i<listOfSelectedFlights.size();i++){
		
		String flightDetails=listOfSelectedFlights.get(i).getAttribute("value");
		
		String[] flightDetailsArray=flightDetails.split("\\$");
		
		for(int j=0;j<flightDetailsArray.length;j++){
			
			System.out.println(flightDetailsArray[j]);
		}
		
		//String[] flightPrice=flightDetailsArray[2].split("$"); 
		FlightDetails details1 = new FlightDetails();
		details1.setFlightname(flightDetailsArray[0].concat(" ").concat(flightDetailsArray[1]));
		
		//System.out.println(flightName);
		
		details1.setFlightPrice(flightDetailsArray[2]);
		
		//System.out.println(flightPrice);
		
		String flightTime=flightDetailsArray[3];
		
		System.out.println(flightTime);
		details.add(details1);
		
		}
		
		SelectFlight_Page.Continue().click();
		
		
		List<WebElement> flightNames=BookFlight_Page.flightName();
		
		boolean flag=false;
		
		boolean flag1=false;
		
		int i =0;
		int j=0;
		
		for(WebElement flight:flightNames){
		
		
		if(details.get(i++).getFlightname().equals(flight.getText())){
			
			flag=true;
			System.out.println(flight.getText());
		}
		else{
			
			flag=false;
		}
		
		
		}
		
		Assert.assertTrue(flag);
		
		List<WebElement> flightPrices=BookFlight_Page.flightPrice();
		
		for(WebElement price:flightPrices){
		
		
		if(details.get(j++).getFlightPrice().equals(price.getText())){
			
			flag1=true;
			
			System.out.println(price.getText());
			
		}
		else{
			
			flag=false;
		}
		
		
		}
		
		
		Assert.assertTrue(flag1);
		
		
		
		
	}
	
}

class FlightDetails  {
	private String flightname;
	private String flightPrice;
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(String flightPrice) {
		this.flightPrice = flightPrice;
	}
	
	
	
}