Feature: Creating an event

	 @f&f
  Scenario: Create an event
    Given I logged into EspoCRM
    And I click on Calendar
    And I click on current date
    When I provide meeting details
    And I save meeting
    When I click on Meetings
    Then I should see meeting details on Meetings page