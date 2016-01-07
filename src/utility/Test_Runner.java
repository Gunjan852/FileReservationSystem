	package utility;
	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	 
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "Feature"
			,glue={"stepDefination"}
			,monochrome = true
			)

	public class Test_Runner {
	
	
}
