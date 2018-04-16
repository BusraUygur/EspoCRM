Feature: Creating opportunities

  @opportunity1
  Scenario: Create an opportunity
  Given I logged into espoCRM
  When I click on Opportunities
  And I create a new Opportunity
  And I write a comment on Stream
  Then I should see the comment in the page
  
  
  @opportunity2
  Scenario: Create opportunities
    Given I logged into espoCRM
    When I click on Opportunities
    And I create a new Opportunity
    Then I should see the Opportunity information for new Opportunity
