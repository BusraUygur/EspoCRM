Feature: Creating task

	 @smoke1
  Scenario: Create a task
    Given I logged into EspoCRM
    And I click on Tasks
    And I click on Create Task
    And Set name as "Final Presentation Phase 3"
    And Set status as "Started"
    And Date Start is todays date
    And Date Due is 5 days after todays date
    And Set "High" priority
    And Set description as "Presentation Phase 3"
    And I save task
    Then I should see task's details on Task page
    And Data should match with created task data