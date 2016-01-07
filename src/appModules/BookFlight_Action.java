package appModules;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.commands.GetText;

import pageObjects.BookFlight_Page;

public class BookFlight_Action {
	
	static List<FlightDetails> details = new ArrayList<FlightDetails>();
	
	//static FlightDetails detail=new FlightDetails();
	
	static SelectFlight_Action selectFlight=new SelectFlight_Action();
	
	
	public static void enterBookingDetails(){
		
		BookFlight_Page.firstName().sendKeys("Gunjan");
		
		BookFlight_Page.lastName().sendKeys("Gupta");
		
		BookFlight_Page.number().sendKeys("882");
		
		List<WebElement> flightNames=BookFlight_Page.flightName();
		for(WebElement flight:flightNames){
			 FlightDetails detail=new FlightDetails();
			detail.setFlightname(flight.getText());
			
			System.out.println(flight.getText());
			
			details.add(detail);
		
		
		
		
			
		}
		
		BookFlight_Page.purchase().click();
	}
	
	public static void validateBooking(){
		
		boolean flag=false;
		int i=0;
		
	List<WebElement> bookingDetails =BookFlight_Page.bookingDetails();
	
	for(WebElement book:bookingDetails){
		
		
		String[] flightdetails=book.getText().split("\n");
		
		System.out.println(flightdetails.length);
		
		System.out.println(flightdetails[1].substring(flightdetails[1].indexOf("w/")+3));
		
	
		
		//System.out.println(flightdetails.substring(book.getText().indexOf("w/"),book.getText().indexOf("/n")));
		
		if(flightdetails[1].substring(flightdetails[1].indexOf("w/")+3).equals(details.get(i++).getFlightname())){
		
		
			flag=true;
			
			
		}
		else{
			
			flag=false;
		}
		
		Assert.assertTrue(flag);
		
	}
		
		
	}	
	
	
	
}
