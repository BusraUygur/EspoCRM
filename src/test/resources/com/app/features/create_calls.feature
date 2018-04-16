
Feature: Creating contacts
  
  
  @Calls
  Scenario: Create Call contact in Call module
    Given I logged in into suiteCRM SecondTime
    Then I open the Call module page and create Call contact
    And I enter the full name "Zach Chrahmer"
    And I check the status and make it planned
    And I write Date start contacts
    When I write duration of the call time 
    Then I write the purpose of Call
    #When I write Remind me before 30 minutes
    When I write diraction inbound
    When I shoose 3 users contact

    And click on the Save button of Call
    #Then I should see contact infromation of "Zach Chrahmer"
    
    