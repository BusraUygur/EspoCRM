Feature: Creating email

	 @smoke
  Scenario: Create an email
    Given I logged into EspoCRM
    When I click on emails
    And I click on compose
    When I send email 
		Then the sent email should be displayed

