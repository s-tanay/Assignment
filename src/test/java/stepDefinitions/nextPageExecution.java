package stepDefinitions;

import org.junit.Assert;

import Pages.nextTutorialPage;
import Pages.homePage;
import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class nextPageExecution {

	private nextTutorialPage Page = new nextTutorialPage(DriverFactory.getDriver());
	private homePage hPage = new homePage(DriverFactory.getDriver());
	
	String actualHomePageTitle ="Tutorials List - Javatpoint";
	String actualFeatureTitle ="Selenium Features - javatpoint" ;
	
	@Given("User is on Selenium Features Page")
	public void user_is_SeleniumFeaturesPage() {
		DriverFactory.getDriver().get("https://www.javatpoint.com/selenium-features");
		actualFeatureTitle= Page.seleFeature();
		Assert.assertEquals(actualFeatureTitle,"Selenium Features - javatpoint");
	}
	
	@When("User Navigates to javatpoint.com HomePage")
	public void user_gets_the_title_of_the_page(){
		Page.jpHomeclick();
		actualHomePageTitle = hPage.getHomePageTitle();
		Assert.assertEquals("Tutorials List - Javatpoint","Tutorials List - Javatpoint");
	}	
		
	
	
}
