Feature: Creating opportunities

  Background: Given I logged into espoCRM

  @opportunity1
  Scenario Outline: Create an opportunity
    When I click on Opportunities
    And I create a new Opportunity
      | name   | amount   | closeDate   |
      | <name> | <amount> | <closeDate> |
    And I write a comment on Stream
    Then I should see the comment in the page

    Examples: 
      | name        | amount | closeDate  |
      | Admiral H   | 300000 | 10/10/2019 |
      | Admiral Huu | 100000 | 10/10/2019 |

  @opportunity2
  Scenario Outline: Create opportunities
    When I click on Opportunities
    And I create a new Opportunity
      | name   | amount   | closeDate   |
      | <name> | <amount> | <closeDate> |
    And I click on Opportunities
    Then I should see the Opportunity information for"<name>"

    Examples: 
      | name        | amount | closeDate  |
      | Admiral H   | 400000 | 10/10/2019 |
      | Admiral Hee | 100000 | 10/10/2019 |
