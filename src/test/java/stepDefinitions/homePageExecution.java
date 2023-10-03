package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.homePage;


public class homePageExecution{

	private homePage Page = new homePage(DriverFactory.getDriver());
	String actualHomePageTitle = "Tutorials List - Javatpoint";
	String actualSeleniumTutTitle = "Selenium Tutorial - javatpoint"; 
	String actualFeatureTitle = "Selenium Features - javatpoint";
	
	@Given("user is on Home page")
	public void user_is_on_Home_page() {
		DriverFactory.getDriver().get("https://www.javatpoint.com/");
	}
	
	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page(){
		actualHomePageTitle = Page.getHomePageTitle();
	}	
		
	@Then("page title should be Tutorials List - Javatpoint")
	public void page_title_javatpoint() {
	   Assert.assertEquals(actualHomePageTitle,"Tutorials List - Javatpoint");
	}
	
	 @And("user clicks on Selenium link")
	 public void navigateToSelenium() {
		 Page.seleTutoClick();
		 Page.Seletutorial();
		Assert.assertEquals(actualSeleniumTutTitle,"Selenium Tutorial - javatpoint");
		    
		}
	 
	 @Then("user navigates to Selenium Features Page")
	 public void navigateToSeleniumFeature() {
		  Page.seleFeatureClick();
		  Page.SeleFeatures();		   
		  Assert.assertEquals(actualFeatureTitle,"Selenium Features - javatpoint");
		}
}