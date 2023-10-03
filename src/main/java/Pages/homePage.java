package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

	private WebDriver driver;
	String title;
	// 1. By Locators: OR
		private By seleniumTutorial = By.linkText("Selenium");
		private By seleniumFeatures= By.linkText("Selenium Features");
			
		// 2. Constructor of the page class:
		public homePage(WebDriver driver) {
			this.driver = driver;
		}
		
		public String getHomePageTitle() {
			return driver.getTitle();
		}
		
        public void seleTutoClick() {
        	driver.findElement(seleniumTutorial).click();
		}

		public String Seletutorial() {
			return driver.getTitle();
		}
				
		public void seleFeatureClick() {
			driver.findElement(seleniumFeatures).click();
		}
		
		public String SeleFeatures() {
			return driver.getTitle();
			
		}
			
			
}