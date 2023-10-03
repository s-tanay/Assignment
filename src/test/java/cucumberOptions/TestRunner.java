package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features"},
		
		glue = {"stepDefinitions"},monochrome=true,dryRun = false,
		
		plugin = {"pretty","html:target/HtmlReports" ,
				"json:target/JSONReports/report.json",
		        "junit:target/JUnitReports/report.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"} 	
		)

public class TestRunner {    

}
