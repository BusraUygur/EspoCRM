
Feature: Creating contacts
  
  @meeting
  Scenario: Create schedule in meeting modules
    Given I logged in into suiteCRM
    And I open the meeting module page
    And I enter the full name "Steven Spielberg"
    And I check the status and make it planned
    And I write meeting Date start
    When I write duration of the meeting
    Then I write the description of the meeting
    When I open parent field and choose Lead option
    When I write Date End of the meeting
    When I write Remind me before 30 minutes
    And click on the save button
    Then I should see contact infromation for "Steven Spielberg"
    


 
   