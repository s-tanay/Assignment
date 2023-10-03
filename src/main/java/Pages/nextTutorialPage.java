package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nextTutorialPage {

	private WebDriver driver;

	// 1. By Locators: OR
		private By jpHome= By.linkText("home");
			
		// 2. Constructor of the page class:
		public nextTutorialPage(WebDriver driver) {
			this.driver = driver;
		}
						
		public void jpHomeclick() {
			driver.navigate().to("https://www.javatpoint.com/");
		}
		
		public String seleFeature() {
			return driver.getTitle();
		}
		
 }
		
		
	
