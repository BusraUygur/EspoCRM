Feature: Create Contacts

  @tag1
  Scenario: Creating Contact
    Given I logged into EspoCRM
    And I click on Contacts and Create Contacts
    When I provide contact details
    And I click on Save
    Then I should see contact details on Contacts page
