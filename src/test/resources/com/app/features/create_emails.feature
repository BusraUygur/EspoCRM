Feature: Creating email

	 @smoke
  Scenario: Create an email
    Given I logged into espoCRM
    When I click on Accounts
    And I click on create account
    And Set Name as "CyborgTeam"
    And Set Email as "cyborgteam@gmail.com"
 	  And I click on Save
    When I click on Accounts
    Then "CyborgTeam" should be displayed
    When I click on emails
    And I click on compose 
    And Set To as "CyborgTeam@gmail.com"
    And Set Subject as "Agenda for the meeting on Sunday regarding phase 3"
    And Set Body as "Meeting will start at 5:30 pm"
    And I click on Send
    When I click on Sent
    Then the sent email should be displayed
    When I click on Tasks
    And I click on create task
    And Set Name as "Meeting"
    And Set Status as "Started"
    And Set Priority as "Urgent"
    And Set Date Start as today
    And Set Date Due as tomorrow
    And Set description as "Meeting was moved to 5:00 pm"
 	  And I click on Save
    When I click on Tasks
    Then "Meeting" should be displayed
    Then I logout from application
