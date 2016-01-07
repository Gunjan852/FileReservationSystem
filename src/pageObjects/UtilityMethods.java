package pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UtilityMethods {

static WebDriver driver = BrainofFramework.getinstance();

public static void implicitWait(){
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
	
public static boolean isElementPresent(By by){
	try{
	driver.findElement(by);
	
	
		return true;
	}
	
	catch(NoSuchElementException e){
		
		return false;
	}
	
	
	
	
}

public static void closeAlerts(){
	
	driver.switchTo().alert().dismiss();
	
}
public static List<WebElement> selectDropDown(WebElement element){
	
	System.out.println("In Select DropDown Function");
	
	Select select=new Select(element);
	
	List<WebElement> list=select.getOptions();
	
	System.out.println(list.size());
	
	for(WebElement w:list){
		 
		  System.out.println(w.getText());
		  
		String country=w.getText();
		  
		  }
	
	
	
	return list;
}

public static void search(WebElement element,String place){
	
	Select dropdown=new Select(element);
	
	dropdown.selectByValue(place);
	
	
	
}

public static void validateSortedPriceList(List <WebElement> element){
	
	
	List<WebElement> listofPriceWebElements=element;
	
	List<String> displayedPrice=new ArrayList<String>();
	
	List<String> sortedPrice=new ArrayList<String>();
	
	
	for(WebElement priceElement:listofPriceWebElements){
	
		String price=priceElement.getText().substring(priceElement.getText().lastIndexOf("$")+1);
		
		System.out.println(price);
		
		displayedPrice.add(price);
		
		sortedPrice.add(price);
	}

Collections.sort(sortedPrice);

for(int i=0;i<sortedPrice.size();i++){
	


System.out.println(sortedPrice.get(i));

}
if(!displayedPrice.equals(sortedPrice)){
	
	
Assert.assertTrue(false);	
	
	
}
	
	
}

public static void backgroundColorCheck(List<WebElement> element,String colorcode){
	
boolean flag=false;	
	
List<WebElement> bgColor=element;	

for(WebElement color:bgColor){
	
	if(color.getAttribute("bgcolor").equals(colorcode)){
		
		flag=true;
		
		System.out.println("Background colour is Blue");
		
	}
	
	Assert.assertTrue(flag);
}

	
	
}

}
