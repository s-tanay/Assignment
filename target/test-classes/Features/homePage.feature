

Feature: To Search topics using www.javatpoint.com
  I want to search selenium on www.javatpoint.com, so that I can learn new things.

 Scenario: Search the Selenium
 Given user is on Home page
 When user gets the title of the page
 Then page title should be Tutorials List - Javatpoint
 And user clicks on Selenium link 
 Then user navigates to Selenium Features Page
  