Feature: Creating email

	 @smoke
  Scenario: Create an email
    Given I logged into EspoCRM
    And I clicked on create account
    When I provide accounts details
    And I save account
    Then I should see account details on Accounts page
    When I click on emails
    And I click on compose
    When I send email 
		Then the sent email should be displayed
    
    #When I click on Tasks
    #And Iccreate task
    #And Set Name as "Meeting"
    #And Set Status as "Started"
    #And Set Priority as "Urgent"
    #And Set Date Start as today
    #And Set Date Due as tomorrow
    #And Set description as "Meeting was moved to 5:00 pm"
 	  #And I click on Save
    #When I click on Tasks
    #Then "Meeting" should be displayed
    #Then I logout from application
